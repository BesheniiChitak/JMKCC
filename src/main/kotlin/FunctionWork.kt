import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

open class JMKCCFunctions()

fun textConvert(functionName: String, argName: String, value: Any): TextValue {
    return when (value) {
        is JGameValue -> {
            val type = value.id.type
            if (type != "text") {
                errorPrint("Ошибка преобразования игрового значения $functionName:$argName - \"$type\" ($value) не может быть преобразовано в текст")
                throw RuntimeException()
            }
            return value
        }
        is String -> JString(value)
        is JString -> value
        is TextValue -> value
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: String или JString")
            throw Exception()
        }
    }
}

fun textConvertPlural(functionName: String, argName: String, value: Any): List<TextValue> {
    return when (value) {
        is JGameValue -> {
            val type = value.id.type
            if (type != "text") {
                if (type == "array") {
                    warningPrint("Опасное преобразование игрового значения $functionName:$argName - List<Any> ($value) в List<JString>, может быть ошибкой")
                    return listOf(value)
                }
                errorPrint("Ошибка преобразования игрового значения $functionName:$argName - \"$type\" ($value) не может быть преобразовано в текст")
                throw RuntimeException()
            }
            return listOf(value)
        }
        is String, is JString -> listOf(textConvert(functionName, argName, value))
        is List<*> -> value.map { textConvert(functionName, argName, it ?: "null") }
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: String или JString")
            throw Exception()
        }
    }
}

fun numberConvert(functionName: String, argName: String, value: Any): NumberValue {
    return when (value) {
        is JGameValue -> {
            val type = value.id.type
            if (type != "number") {
                errorPrint("Ошибка преобразования игрового значения $functionName:$argName - \"$type\" ($value) не может быть преобразовано в число")
                throw RuntimeException()
            }
            return value
        }
        is Number -> JNumber(value)
        is JNumber -> value
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: Number или JNumber")
            throw Exception()
        }
    }
}

fun numberConvertPlural(functionName: String, argName: String, value: Any): List<NumberValue> {
    return when (value) {
        is JGameValue -> {
            val type = value.id.type
            if (type != "number") {
                if (type == "array") {
                    warningPrint("Опасное преобразование игрового значения $functionName:$argName - List<Any> ($value) в List<JNumber>, может быть ошибкой")
                    return listOf(value)
                }
                errorPrint("Ошибка преобразования игрового значения $functionName:$argName - \"$type\" ($value) не может быть преобразовано в число")
                throw RuntimeException()
            }
            return listOf(value)
        }
        is Number, is JNumber -> listOf(numberConvert(functionName, argName, value))
        is List<*> -> value.map { numberConvert(functionName, argName, it ?: 0) }
        else -> {
            errorPrint("${currentScope.scope}: В $functionName:$argName получен тип ${value::class.simpleName}, ожидалось: Number или JNumber")
            throw Exception()
        }
    }
}


fun enumCheck(functionName: String?, argName: String, enum: Any?, values: List<String>) : JValue? {
    if (enum != null) {
        if (enum is JVariable) return enum
        val filtered = values.filter { it.lowercase().startsWith(enum as? String ?: if (enum is JString) enum.value else throw errorPrint2("я не знаю что ты пихнул в энум но пожалуйста так не делай ^_^ ($enum ; ${enum::class})")) }
        if (filtered.size != 1)
            throw errorPrint2("${currentScope.scope}: В энуме $functionName:$argName получено значение $enum, ожидалось одно из: ${values.joinToString(", ") }}")
        else return JString(filtered.first())
    }
    return null
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

fun variableSetValue(variable:JVariable,value:JValue) {
    handleFun("set_variable_value", listOf(funValue("variable",variable),funValue("value",value)))
}

fun handleFun(name: String, body: List<Map<String, JsonElement>?>) {
    if (currentScope.scope.isEmpty()) {
        errorPrint("$name: Действия не могут быть вызваны вне функции/процесса/события")
        throw RuntimeException()
    }
    val opList = JsonArray(body.mapNotNull { it?.let { JsonObject(it) } })
    val op = hashMapOf(
        "action" to JsonPrimitive(name),
        "values" to opList
    )
    if (currentSelector != null) {
        if (currentSelector is PlayerSelector && !name.startsWith("player")) {
            warningPrint("$name: Только действия над игроком могут быть вызваны с селектором игрока. Селектор проигнорирован."
                    + if (name == "set_variable_value") "\n\t\t^^^ Может быть вызвано работой плейсхолдеров (Игровых значений)" else "")
        }
        if (currentSelector is EntitySelector && !name.startsWith("entity")) {
            warningPrint("$name: Только действия над сущностью могут быть вызваны с селектором сущности. Селектор проигнорирован."
                    + if (name == "set_variable_value") "\n\t\t^^^ Может быть вызвано работой плейсхолдеров (Игровых значений)" else "")
        }
        op["selection"] = JsonObject(hashMapOf(
            "type" to JsonPrimitive((currentSelector as PlayerSelector).name.lowercase())
        ))
    }
    currentScope.addOperationToScope(JsonObject(op))
}

fun funValue(name: String, value: JValue?): Map<String, JsonElement>?
    { return mapOf("name" to JsonPrimitive(name), "value" to (value ?: return null).parse()) }

fun funValue(name: String, value: List<JValue>): Map<String, JsonElement>?
{ return mapOf("name" to JsonPrimitive(name), "value" to value.parse()) }

fun fV(name: String, value: JValue?): Map<String, JsonElement>? = funValue(name, value)
fun fV(name: String, value: List<JValue>): Map<String, JsonElement>? = funValue(name, value)

fun tC(functionName: String, argName: String, value: Any): TextValue = textConvert(functionName, argName, value)
fun tCP(functionName: String, argName: String, value: Any): List<TextValue> = textConvertPlural(functionName, argName, value)

fun nC(functionName: String, argName: String, value: Any): NumberValue = numberConvert(functionName, argName, value)
fun nCP(functionName: String, argName: String, value: Any): List<NumberValue> = numberConvertPlural(functionName, argName, value)

fun eC(functionName: String?, argName: String, enum: Any?, values: List<String>): JValue? = enumCheck(functionName, argName, enum, values)

inline fun <reified T : Any> tCk(value: Any): T = typeCheck(value)

fun hF(name: String, body: List<Map<String, JsonElement>?>) = handleFun(name, body)




