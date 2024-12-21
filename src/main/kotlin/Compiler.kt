import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import java.io.File
import kotlin.reflect.full.*

val data = mutableListOf<HashMap<String, JsonElement>>()

var varNumber = 0

var currentScope = Scope()
var lastPosition = 0

val vars = hashMapOf<String, JVariable>()

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

enum class ArgumentType {
    String, Number, Location, Vector
}

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class JMKCCFunction(
    val name: String,
    val description: String = "",
    val arguments: Array<ArgumentType> = []
)

fun compile(fileName: String, functionClass: JMKCCFunctions? = null) {
    if (functionClass != null) {
        val methods = (functionClass::class.companionObject ?: throw RuntimeException("Класс с функциями не имеет компаньон-объекта."))
            .memberFunctions.filter { it.hasAnnotation<JMKCCFunction>() }
        for (method in methods) {
            println((method.annotations[0] as JMKCCFunction).name)
        }
    }
    val path = "src/main/resources/results/$fileName.json"
    val file = File(path)
    file.createNewFile()
    file.writeText(json.encodeToString(hashMapOf("handlers" to data)))
    println("\u001b[96m[ОКОНЧАНИЕ] Компиляция завершена и сохранена в файл по пути `$path` \u001b[0m")
}