//import EventType
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonPrimitive

class Event(
    val eventType: EventType,
    callback: (Event) -> Unit,
) {
    init {
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

        callback(this)
        lastPosition++
        currentScope.scope.removeLast()
    }
    fun cancelEvent() {
        if (!eventType.cancellable) {
            errorPrint("Событие ${eventType.name} не является отменяемым")
            throw RuntimeException()
        }
        worldCancelEvent()
    }
}