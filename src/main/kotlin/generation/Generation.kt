package generation

import org.json.JSONArray
import org.json.JSONObject
import java.io.File

val primitives = hashSetOf("text", "number")
const val functionNameArgument = "fN"

fun main() {
    generateEventType("src/main/resources/events.json", "src/main/kotlin/generation/EventType.kt")
    generateMaterial("src/main/resources/items.json", "src/main/kotlin/generation/Material.kt")
    generateGameValues("src/main/resources/values.json", "src/main/kotlin/generation/GameValues.kt")
    //generateCodeEnums("src/main/resources/actions.json", "src/main/kotlin/generation/Enums.kt")
    generateFunctions("src/main/resources/actions.json", "src/main/kotlin/generation")
}

fun generateEventType(inputFilePath: String, outputFilePath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val enumContent = buildString {
        appendLine("// ЭТОТ ФАЙЛ ГЕНЕРИРУЕТСЯ АВТОМАТИЧЕСКИ И НЕ ПРЕДНАЗНАЧЕН ДЛЯ ИЗМЕНЕНИЯ")
        appendLine("@file:Suppress(\"unused\", \"SpellCheckingInspection\", \"PackageDirectoryMismatch\")")
        appendLine("enum class EventType(val cancellable: Boolean) {")
        jsonArray.filterIsInstance<JSONObject>()
            .filter { !it.getString("id").contains("DUMMY", ignoreCase = true) }
            .forEachIndexed { index, json ->
                append("\t${json.getString("id").uppercase()}(${json.getBoolean("cancellable")})")
                if (index < jsonArray.length() - 1) append(",\n") else appendLine()
            }
        appendLine("}")
    }

    File(outputFilePath).writeText(enumContent)
    println("Типы событий успешно сгенерированы!")
}

fun generateGameValues(inputFilePath: String, outputFilePath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val enumContent = buildString {
        appendLine("// ЭТОТ ФАЙЛ ГЕНЕРИРУЕТСЯ АВТОМАТИЧЕСКИ И НЕ ПРЕДНАЗНАЧЕН ДЛЯ ИЗМЕНЕНИЯ")
        append("""
            @file:Suppress("unused","SpellCheckingInspection","PackageDirectoryMismatch")
            import kotlinx.serialization.json.JsonObject
            import kotlinx.serialization.json.JsonPrimitive${"\n"}
        """.trimIndent())
        appendLine("enum class GameValues(val type: String) : JValue {")
        jsonArray.filterIsInstance<JSONObject>()
            .forEachIndexed { index, json ->
                append("\t${json.getString("id").uppercase()}(\"${json.getString("type")}\")")
                if (index < jsonArray.length() - 1) append(",\n") else appendLine(";")
            }
        appendLine("""
    override fun parse(): JsonObject {
		return parse(GameValueSelector.CURRENT)
	}

	fun parse(selector: GameValueSelector): JsonObject {
		return JsonObject(hashMapOf(
				"type" to JsonPrimitive("game_value"),
				"game_value" to JsonPrimitive(name.lowercase()),
				"selection" to JsonPrimitive("{\"type\":\"${"$"}{selector.id}\"}")
			)
		)
	}
	override fun toString(): String {
        return createVar(this)
    }""")
        appendLine("}")
    }

    File(outputFilePath).writeText(enumContent)
    println("Типы игровых значений успешно сгенерированы!")
}

fun generateMaterial(inputFilePath: String, outputFilePath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val enumContent = buildString {
        appendLine("// ЭТОТ ФАЙЛ ГЕНЕРИРУЕТСЯ АВТОМАТИЧЕСКИ И НЕ ПРЕДНАЗНАЧЕН ДЛЯ ИЗМЕНЕНИЯ")
        appendLine("@file:Suppress(\"unused\", \"SpellCheckingInspection\", \"PackageDirectoryMismatch\")")
        appendLine("enum class Material {")
        jsonArray.filterIsInstance<String>().forEachIndexed { index, material ->
                append("\t${material.uppercase()}")
                if (index < jsonArray.length() - 1) append(",\n") else appendLine()
            }
        appendLine("}")
    }

    File(outputFilePath).writeText(enumContent)
    println("Типы предметов успешно сгенерированы!")
}

private fun toPascalCase(input: String): String {
    return input.split("_").joinToString("") { it.lowercase().replaceFirstChar { it.uppercase() } }
}

fun generateFunctions(inputFilePath: String, outputDirPath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val functionContent = buildString {
        appendLine("// ЭТОТ ФАЙЛ ГЕНЕРИРУЕТСЯ АВТОМАТИЧЕСКИ И НЕ ПРЕДНАЗНАЧЕН ДЛЯ ИЗМЕНЕНИЯ")
        appendLine("@file:Suppress(\"SpellCheckingInspection\", \"PackageDirectoryMismatch\", \"unused\")")
        jsonArray.filterIsInstance<JSONObject>()
            .filter { !it.getString("name").contains("dummy", ignoreCase = true) }
            .forEach { json ->
                appendGeneratedFunction(json)
            }
    }
    val outputDir = File(outputDirPath)
    if (!outputDir.exists()) {
        outputDir.mkdirs()
    }

    val outputFilePath = "$outputDirPath/Functions.kt"
    File(outputFilePath).writeText(functionContent)
    println("Функции успешно сгенерированы!")
}

private fun StringBuilder.appendGeneratedFunction(json: JSONObject) {
    val functionName = toCamelCase("${json.getString("object")}_${json.getString("name")}")
    val action = json.getString("id")
    val argsArray = json.optJSONArray("args") ?: JSONArray()

    append("\nfun $functionName(${generateFunctionArguments(argsArray)}){")
    append(generateArgumentHandling(argsArray, functionName))
    append("hF(\"$action\", ${generateFunValues(argsArray)})}")
    namePlaced = false
}

private fun generateFunctionArguments(argsArray: JSONArray): String {
    return argsArray.joinToString(",") { arg ->
        val argObj = arg as JSONObject
        val argType = argObj.getString("type")
        val id = argObj.getString("id")
        val camelCase = toCamelCase(id)
        if (argType == "enum") "$camelCase:Any?=null"
        else "$camelCase:${if (argType in primitives) "Any" else mapType(argType)}"
    }
}

var namePlaced = false

fun StringBuilder.functionName(functionName: String): String {
    if (!namePlaced) {
        namePlaced = true
        append("val $functionNameArgument=\"$functionName\";")
    }
    return functionNameArgument
}

private fun StringBuilder.generateArgumentHandling(argsArray: JSONArray, functionName: String): String {
    return argsArray.joinToString("") { arg ->
        val argObj = arg as JSONObject
        val isPlural = argObj.has("array")
        val argId = toCamelCase(argObj.getString("id"))
        val argType = argObj.getString("type")

        when (argType) {
            in primitives -> {
                "val ${argId}A=${argType.first()}C${if (isPlural) "P" else ""}(${functionName(functionName)},\"$argId\",$argId);"
            }
            "enum" -> {
                val values = argObj.getJSONArray("values")
                "val ${argId}A=eC(${functionName(functionName)},\"$argId\",$argId,listOf(${values.join(",")}));"
            }
            else -> ""
        }
    }
}

private fun generateFunValues(argsArray: JSONArray): String {
    return "listOf(" + argsArray.joinToString("") { arg ->
        val argObj = arg as JSONObject
        val argId = toCamelCase(argObj.getString("id"))
        val argType = argObj.getString("type")
        val argName = argObj.getString("id")

        "fV(\"$argName\",${argId}${if (argType in primitives || argType == "enum") "A" else ""}),"
    }.removeSuffix("\n").removeSuffix(",") + ")"
}

private fun toCamelCase(input: String): String {
    return input.split("_").joinToString("") { it.lowercase().replaceFirstChar { it.uppercase() } }
        .replaceFirstChar { it.lowercase() }
}

private fun mapType(type: String): String {
    return when (type) {
        "text" -> "JString"
        "enum" -> "String?"
        "number" -> "JNumber"
        "location" -> "JLocation"
        "vector" -> "JVector"
        "particle" -> "JParticle"
        "sound" -> "JSound"
        "block" -> "JBlock"
        "item" -> "JItem"
        "potion" -> "JPotion"
        "array" -> "JArray"
        "map" -> "JMap"
        "variable" -> "JVariable"
        "any" -> "JAny"
        else -> throw Exception("Нет обработки типа $type")
    }
}
