import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

//@Suppress("FunctionName")
//fun Function(
//    name: String,
//    call: () -> Unit,
//) {
//    if (currentScope.scope.isNotEmpty()) {
//        errorPrint("Невозможно инициализировать функцию.")
//        throw Exception()
//    }
//    debugPrint("Инициализация: FUN:$name : $lastPosition")
//    currentScope.scope.add(lastPosition)
//    data.add(
//        hashMapOf(
//            "type" to JsonPrimitive("function"),
//            "name" to JsonPrimitive(name),
//            "position" to JsonPrimitive(lastPosition),
//            "operations" to JsonArray(listOf())
//        )
//    )
//    call()
//    lastPosition++
//    currentScope.scope.removeLast()
//
//}

open class JMKCCFunctions()

fun textConvert(functionName: String, argName: String, value: Any): JString {
    return when (value) {
        is String -> JString(value)
        is JString -> value
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: String или JString")
            throw Exception()
        }
    }
}

fun textConvertPlural(functionName: String, argName: String, value: Any): List<JString> {
    return when (value) {
        is List<*> -> value.map { textConvert(functionName, argName, it ?: "null") }
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: String или JString")
            throw Exception()
        }
    }
}

fun numberConvert(functionName: String, argName: String, value: Any): JNumber {
    return when (value) {
        is Number -> JNumber(value)
        is JNumber -> value
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: Number или JNumber")
            throw Exception()
        }
    }
}

fun numberConvertPlural(functionName: String, argName: String, value: Any): List<JNumber> {
    return when (value) {
        is List<*> -> value.map { numberConvert(functionName, argName, it ?: 0) }
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: Number или JNumber")
            throw Exception()
        }
    }
}

fun enumCheck(functionName: String?, argName: String, enum: Any?, values: List<String>) {
    if (enum != null && enum !in values) {
        errorPrint("${currentScope.scope}: В энуме $functionName:$argName получено значение $enum, ожидалось одно из: ${values.joinToString(", ") }}")
        throw Exception()
    }
}

inline fun <reified T : Any> typeCheck(value: Any): T {
    if (value is List<*>) {
        if (value.any {it !is T}) {
            errorPrint("Получен список \"$value\" со значением типа ${value::class.simpleName}, ожидалось ${T::class.simpleName}")
            throw RuntimeException()
        }
    }
    if (value !is T) {
        errorPrint("Получено значение \"$value\" типа ${value::class.simpleName}, ожидалось ${T::class.simpleName}")
        throw RuntimeException()
    }
    return value
}

fun handleFun(name: String, body: List<Map<String, JsonElement>>) {
    if (currentScope.scope.isEmpty()) {
        errorPrint("Действия не могут быть вызваны не функции/процесса/события")
        throw RuntimeException()
    }
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive(name),
        "values" to JsonArray(body.map { JsonObject(it) })
    ))
    currentScope.addOperationToScope(op)
}

fun funValue(name: String, value: JsonElement): Map<String, JsonElement> = mapOf("name" to JsonPrimitive(name), "value" to value)



