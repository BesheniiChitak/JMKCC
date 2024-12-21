import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonPrimitive

@Suppress("FunctionName")
fun Function(
    name: String,
    call: () -> Unit,
) {
    if (currentScope.scope.isNotEmpty()) {
        errorPrint("Невозможно инициализировать функцию.")
        throw Exception()
    }
    debugPrint("Инициализация: FUN:$name : $lastPosition")
    currentScope.scope.add(lastPosition)
    data.add(
        hashMapOf(
            "type" to JsonPrimitive("function"),
            "name" to JsonPrimitive(name),
            "position" to JsonPrimitive(lastPosition),
            "operations" to JsonArray(listOf())
        )
    )
    call()
    lastPosition++
    currentScope.scope.removeLast()

}

fun textConvert(functionName: String, argName: String, value: Any): JString {
    return when (value) {
        is String -> JString(value)
        is JString -> value
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value.javaClass.kotlin.simpleName}, ожидалось: String или JString")
            throw Exception()
        }
    }
}

fun numberConvert(functionName: String, argName: String, value: Any): JNumber {
    return when (value) {
        is Number -> JNumber(value)
        is JNumber -> value
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value.javaClass.kotlin.simpleName}, ожидалось: Number или JNumber")
            throw Exception()
        }
    }
}

fun enumCheck(functionName: String?, argName: String, enum: Any?, values: List<String>) {
    if (enum !in values) {
        errorPrint("${currentScope.scope}: В энуме $functionName:$argName получено значение $enum, ожидалось одно из: ${values.joinToString(", ") }}")
        throw Exception()
    }
}

inline fun <reified T : Any> typeCheck(value: Any): T {
    if (value !is T) {
        errorPrint("Получено значение \"$value\" типа $value, ожидалось ${T::class.simpleName}")
        throw RuntimeException()
    }
    return value
}

fun handleFun(name: String, body: List<JsonArray>) {

}
