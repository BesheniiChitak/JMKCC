import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import java.io.File

val data = mutableListOf<HashMap<String, JsonElement>>()

var currentScope = Scope()
var lastPosition = 0

val vars = hashMapOf<String, Var>()

class Scope(
    val scope: MutableList<Any> = mutableListOf()
) {
    fun addOperationToScope(operation: JsonObject) {
        var currentData: Any = data // Начинаем с корневой структуры данных

        for (indexOrKey in scope) {
            when (currentData) {
                is MutableList<*> -> {
                    if (indexOrKey is Int && indexOrKey in currentData.indices) {
                        currentData = currentData[indexOrKey]!!
                    } else {
                        return // Ошибка: индекс выходит за границы списка
                    }
                }
                is MutableMap<*, *> -> {
                    if (indexOrKey is String && currentData.containsKey(indexOrKey)) {
                        currentData = currentData[indexOrKey]!!
                    } else {
                        return // Ошибка: ключ не найден
                    }
                }
                else -> return // Ошибка: невалидный тип данных
            }
        }

        // Если текущие данные — это карта, содержащая "operations", добавляем операцию
        if (currentData is MutableMap<*, *> && currentData.containsKey("operations")) {
            val operations = currentData["operations"]
            when (operations) {
                is JsonArray -> {
                    val mutableOps = operations.toMutableList()
                    mutableOps.add(operation)
                    (currentData as MutableMap<String, JsonElement>)["operations"] = JsonArray(mutableOps)
                }
                is MutableList<*> -> {
                    (operations as MutableList<JsonElement>).add(operation)
                }
                else -> {
                    // Если "operations" еще не существует, создаем новый список
                    (currentData as MutableMap<String, JsonElement>)["operations"] = JsonArray(listOf(operation))
                }
            }
        } else if (currentData is MutableMap<*, *>) {
            // Создаем "operations", если их еще нет
            (currentData as MutableMap<String, JsonElement>)["operations"] = JsonArray(listOf(operation))
        }
    }
}

val json = Json {
    prettyPrint = true
}

fun compile() {
    val file = File("src/main/resources/results/compiled.json")
    file.createNewFile()
    file.writeText(json.encodeToString(hashMapOf("handlers" to data)))
}