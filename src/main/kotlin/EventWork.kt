import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonPrimitive

open class EventWorker {
    fun cancel() { worldCancelEvent() }
}

@Suppress("FunctionName")
fun Event(
    eventType: EventType,
    call: EventWorker.() -> Unit,
) {
    if (currentScope.scope.isNotEmpty()) {
        errorPrint("Невозможно инициализировать событие.")
        throw Exception()
    }
    debugPrint("Инициализация: EVENT:$eventType : $lastPosition")
    currentScope.scope.add(lastPosition)
    data.add(
        hashMapOf(
            "type" to JsonPrimitive("event"),
            "event" to JsonPrimitive(eventType.name.lowercase()),
            "position" to JsonPrimitive(lastPosition),
            "operations" to JsonArray(listOf())
        )
    )
    call(EventWorker())
    lastPosition++
    currentScope.scope.removeLast()

}