package generation

import org.json.JSONArray
import org.json.JSONObject
import java.io.File

val primitives = hashSetOf("text", "number")
const val functionNameArgument = "funName"

fun main() {
    generateEventType("src/main/resources/events.json", "src/main/kotlin/generation/EventType.kt")
    generateFunctions("src/main/resources/actions.json", "src/main/kotlin/generation")
}

fun generateEventType(inputFilePath: String, outputFilePath: String) {
    val jsonContent = File(inputFilePath).readText()
    val jsonArray = JSONArray(jsonContent)

    val enumContent = buildString {
        appendLine("@Suppress(\"unused\", \"SpellCheckingInspection\", \"PackageDirectoryMismatch\")")
        appendLine("enum class EventType(val cancellable: Boolean) {")
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

    appendLine("fun $functionName(${generateFunctionArguments(argsArray)}) {")
    append(generateArgumentHandling(argsArray, functionName))
    appendLine("\thandleFun(\"$action\", ${generateFunValues(argsArray, functionName)})")
    appendLine("}")
    namePlaced = false
}

private fun generateFunctionArguments(argsArray: JSONArray): String {
    return argsArray.joinToString(", ") { arg ->
        val argObj = arg as JSONObject
        val argType = mapType(argObj.getString("type"))
        val camelCaseId = toCamelCase(argObj.getString("id"))
        if (argType == "JString?") "$camelCaseId: Any? = null"
        else "$camelCaseId: Any"
    }
}

var namePlaced = false

fun StringBuilder.functionName(functionName: String): String {
    if (!namePlaced) {
        namePlaced = true
        appendLine("\tval $functionNameArgument = \"$functionName\"")
    }
    return functionNameArgument
}

private fun StringBuilder.generateArgumentHandling(argsArray: JSONArray, functionName: String): String {
    return argsArray.joinToString("") { arg ->
        val argObj = arg as JSONObject
        val isPlural = argObj.has("array")
        val argId = toCamelCase(argObj.getString("id"))
        val argType = argObj.getString("type")
            val expectedType = if (argType in listOf("text", "number")) argType else null

            if (expectedType != null) {
               "\tval ${argId}ARG=${expectedType}Convert${if (isPlural) "Plural" else ""}(${functionName(functionName)},\"$argId\",$argId)\n"
            } else if (argType != "enum") "\tval ${argId}ARG=typeCheck<${mapType(argType)}>($argId)\n" else ""
        }
}

private fun StringBuilder.generateFunValues(argsArray: JSONArray, functionName: String): String {
    return "listOf(" + argsArray.joinToString("") { arg ->
        val argObj = arg as JSONObject
        val argId = toCamelCase(argObj.getString("id"))
        val argType = argObj.getString("type")
        val argName = argObj.getString("id")

        if (argType == "enum") {
            val enumValues = argObj.getJSONArray("values")
            appendLine("\tenumCheck(${functionName(functionName)},\"$argId\",$argId,listOf(${enumValues.joinToString(",") {"\"$it\""} }))")
            ""
        } else {
            "funValue(\"$argName\",${argId}ARG.parse()),"
        }
    }.removeSuffix("\n").removeSuffix(",") + ")"
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
