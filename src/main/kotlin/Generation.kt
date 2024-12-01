import org.json.JSONArray
import org.json.JSONObject
import java.io.File

val primitives = hashMapOf("String" to "JString", "Number" to "JNumber")

fun main() {
    generateEventType("src/main/resources/events.json", "src/main/kotlin/EventType.kt")
    generateFunctions("src/main/resources/actions.json", "src/main/kotlin/functions")
}

fun generateEventType(inputFilePath: String, outputFilePath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val enumContent = buildString {
        appendLine("enum class EventType(cancellable: Boolean) {")
        jsonArray.filterIsInstance<JSONObject>()
            .filter { !it.getString("id").contains("DUMMY", ignoreCase = true) }
            .forEachIndexed { index, json ->
                append("    ${json.getString("id").uppercase()}(${json.getBoolean("cancellable")})")
                if (index < jsonArray.length() - 1) append(",\n") else appendLine()
            }
        appendLine("}")
    }

    File(outputFilePath).writeText(enumContent)
    println("Типы событий успешно сгенерированы!")
}

fun generateFunctions(inputFilePath: String, outputDirPath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val functionContent = buildString {
        appendImports()
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

    val outputFilePath = "$outputDirPath/Functions1.kt"
    File(outputFilePath).writeText(functionContent)
    println("Функции успешно сгенерированы!")
}

private fun StringBuilder.appendGeneratedFunction(json: JSONObject) {
    val functionName = toCamelCase("${json.getString("object")}_${json.getString("name")}")
    val action = json.getString("id")
    val argsArray = json.optJSONArray("args") ?: JSONArray()

    appendLine("fun $functionName(${generateFunctionArguments(argsArray)}) {")
    appendLine(generateArgumentHandling(argsArray, functionName))
    appendLine("    val funValues = mutableListOf<JsonObject>()")
    appendLine(generateFunValues(argsArray, functionName))
    appendLine("    val op = JsonObject(hashMapOf(")
    appendLine("        \"action\" to JsonPrimitive(\"$action\"),")
    appendLine("        \"values\" to JsonArray(funValues)")
    appendLine("    ))")
    appendLine("    currentScope.addOperationToScope(op)")
    appendLine("}\n")
}

private fun generateFunctionArguments(argsArray: JSONArray): String {
    return argsArray.joinToString(", ") { arg ->
        val argObj = arg as JSONObject
        val argType = mapType(argObj.getString("type"))
        val camelCaseId = toCamelCase(argObj.getString("id"))
        if (argType == "JString?") "$camelCaseId: $argType = null"
        else "$camelCaseId: Any"
    }
}

private fun generateArgumentHandling(argsArray: JSONArray, functionName: String): String {
    return argsArray.joinToString("\n") { arg ->
        val argObj = arg as JSONObject
        val argId = toCamelCase(argObj.getString("id"))
        val argType = argObj.getString("type")
        if (argType == "enum") {
            ""
        } else {
            val expectedTypes = when (mapType(argType)) {
                "JString", "JString?" -> listOf("String", "JString")
                "JNumber" -> listOf("Number", "JNumber")
                else -> listOf(mapType(argType))
            }

            if (expectedTypes.isNotEmpty()) {
                """
            val ${argId}ARG: ${mapType(argType)} = when ($argId) {
                ${expectedTypes.joinToString("\n") { "is $it -> ${if (it in primitives) "${primitives[it]}($argId)" else argId}" }}
                else -> {
                    errorPrint("${'$'}{currentScope.scope}: В $functionName:$argId получен тип ${'$'}{$argId.javaClass.kotlin.simpleName}, ожидалось: ${
                    expectedTypes.joinToString(
                        ", "
                    )
                }")
                    throw Exception()
                }
            }
            """.trimIndent()
            } else ""
        }
    }
}

private fun generateFunValues(argsArray: JSONArray, funName: String): String {
    return argsArray.joinToString("\n") { arg ->
        val argObj = arg as JSONObject
        val argId = toCamelCase(argObj.getString("id"))
        val argType = argObj.getString("type")
        val argName = argObj.getString("id")

        if (argType == "enum") {
            val enumValues = argObj.getJSONArray("values")
            val enumValuesSeparated = enumValues.joinToString(", ") { "\"$it\"" }
            val enumValuesErrorText = enumValues.joinToString(", ") { "\\\"$it\\\"" }
            """
            if ($argId != null) {
                if ($argId.value !in setOf($enumValuesSeparated)) {
                    errorPrint("${'$'}{currentScope.scope}: В $funName:$argName получено \"${'$'}{$argId.value}\", ожидалось одно из: $enumValuesErrorText")
                    throw Exception()
                }
                funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("$argName"),"value" to JsonObject(hashMapOf("type" to JsonPrimitive("enum"),"enum" to $argId.jsonValue())))))
            }
            """.trimIndent()
        } else {
            """
            funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("$argName"),"value" to ${argId}ARG.parse())))
            """.trimIndent()
        }
    }
}

private fun StringBuilder.appendImports() {
    appendLine("import kotlinx.serialization.json.JsonArray")
    appendLine("import kotlinx.serialization.json.JsonObject")
    appendLine("import kotlinx.serialization.json.JsonPrimitive")
    appendLine()
}

private fun toCamelCase(input: String): String {
    return input.split("_").joinToString("") { it.lowercase().replaceFirstChar { it.uppercase() } }
        .replaceFirstChar { it.lowercase() }
}

private fun mapType(type: String): String {
    return when (type) {
        "text" -> "JString"
        "enum" -> "JString?"
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
        "variable" -> "Var"
        "any" -> "JAny"
        else -> throw Exception("Нет обработки типа $type")
    }
}
