import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

interface Value

open class JAny(open val value: Any): Value {
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
open class JString(override val value: String, val type: StringType = StringType.LEGACY): Value, JAny(value) {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("text"),
            "text" to JsonPrimitive(value),
            "parsing" to JsonPrimitive(type.name.lowercase())
        ))
    }
    fun jsonValue() = JsonPrimitive(value)
}
open class JNumber(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
    fun jsonValue() = JsonPrimitive(value)
}
open class JVector(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JLocation(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JSound(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JParticle(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JBlock(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JItem(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JPotion(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JArray(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}
open class JMap(override val value: Number): Value, JAny(value) {
    override fun parse(): JsonElement {
        TODO()
    }
}

open class Var(name: String, scope: VarScope = VarScope.LOCAL): JAny(0) {
    override fun parse(): JsonElement {
        TODO()
    }
}

fun Var(name: JString, scope: VarScope = VarScope.LOCAL): Var {
    return Var(name.value, scope)
}