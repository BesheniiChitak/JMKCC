import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

interface Value

open class JAny: Value {
    open fun parse(): JsonElement {
        TODO()
    }
}
fun List<JAny>.parse(): JsonObject {
    return JsonObject(hashMapOf(
        "type" to JsonPrimitive("array"),
        "values" to JsonArray(this.map { it.parse() })
    ))
}
open class JString(val value: String, val type: StringType = StringType.LEGACY): Value, JAny() {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("text"),
            "text" to JsonPrimitive(value),
            "parsing" to JsonPrimitive(type.name.lowercase())
        ))
    }
    fun jsonValue() = JsonPrimitive(value)
}
open class JNumber(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("number"),
            "number" to JsonPrimitive(value),
        ))
    }
    fun jsonValue() = JsonPrimitive(value)
}
open class JVector(val x: Number = 0, val y: Number = 0, val z: Number): Value, JAny() {
    override fun parse(): JsonElement {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("number"),
            "x" to JsonPrimitive(x),
            "y" to JsonPrimitive(y),
            "z" to JsonPrimitive(z),
        ))
    }
}
open class JLocation(val x: Number = 0, val y: Number = 0, val z: Number): Value, JAny() {
    override fun parse(): JsonElement {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("number"),
            "x" to JsonPrimitive(x),
            "y" to JsonPrimitive(y),
            "z" to JsonPrimitive(z),
        ))
    }
}
open class JSound(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JParticle(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JBlock(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JItem(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JPotion(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JArray(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JMap(val value: Number): Value, JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}

open class Var(name: String, scope: VarScope = VarScope.LOCAL): JAny() {
    override fun parse(): JsonElement {
        TODO()
    }
}

fun Var(name: JString, scope: VarScope = VarScope.LOCAL): Var {
    return Var(name.value, scope)
}