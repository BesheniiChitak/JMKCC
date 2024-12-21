//import EventType
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonPrimitive

open class EventWorker {
}

open class CancellableEventWorker : EventWorker() {
    fun cancel() {}
}

@Suppress("FunctionName")
fun Event(
    eventType: EventType,
    call: (EventWorker) -> Unit,
) {
    if (currentScope.scope.isNotEmpty()) {
        errorPrint("Невозможно инициализировать событие.")
        throw Exception()
    }
    debugPrint("Инициализация: EVENT:$eventType : $lastPosition")

    val worker = if (eventType.cancellable) CancellableEventWorker() else EventWorker()

    currentScope.scope.add(lastPosition)
    data.add(
        hashMapOf(
            "type" to JsonPrimitive("event"),
            "event" to JsonPrimitive(eventType.name.lowercase()),
            "position" to JsonPrimitive(lastPosition),
            "operations" to JsonArray(listOf())
        )
    )

    call(worker)
    lastPosition++
    currentScope.scope.removeLast()
}
