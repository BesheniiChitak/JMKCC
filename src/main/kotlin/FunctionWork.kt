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