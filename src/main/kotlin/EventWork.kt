import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonPrimitive

open class EventWorker {
    fun cancel() {
    }
}

class Event(
    eventType: EventType,
    call: EventWorker.() -> Unit
) {
    init {
        debugPrint("Инициализация: $eventType : $lastPosition")
        currentScope.scope.add(lastPosition)
        data.add(
            hashMapOf(
                "type" to JsonPrimitive("event"),  // Преобразуем значение в JsonPrimitive
                "event" to JsonPrimitive(eventType.name.lowercase()),  // Преобразуем eventType в строку
                "position" to JsonPrimitive(lastPosition),  // Преобразуем position в число
                "operations" to JsonArray(listOf())  // Пример JsonObject, замените на реальные данные
            )
        )
        call(EventWorker())
        lastPosition++
        currentScope.scope.removeLast()
    }
}