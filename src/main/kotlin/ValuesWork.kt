@file:Suppress("FunctionName")

import kotlinx.serialization.json.*

interface Value {
    fun parse(): JsonObject
}
interface NumberValue: Value
interface TextValue: Value

abstract class JAny: Value

fun List<Value>.parse(): JsonObject {
    return JsonObject(hashMapOf(
        "type" to JsonPrimitive("array"),
        "values" to JsonArray(this.map { it.parse() })
    ))
}
open class JString(var value: String, var type: StringType = StringType.LEGACY): Value, TextValue, JAny() {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("text"),
            "text" to JsonPrimitive(value),
            "parsing" to JsonPrimitive(type.name.lowercase())
        ))
    }
    fun jsonValue() = JsonPrimitive(value)
}
open class JNumber(var value: Number): Value, JAny(), NumberValue {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("number"),
            "number" to JsonPrimitive(value),
        ))
    }
    fun jsonValue() = JsonPrimitive(value)
}
open class JVector(var x: Number = 0, var y: Number = 0, var z: Number): Value, JAny() {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("vector"),
            "x" to JsonPrimitive(x),
            "y" to JsonPrimitive(y),
            "z" to JsonPrimitive(z),
        ))
    }
}
open class JLocation(var x: Number = 0, var y: Number = 0, var z: Number, var yaw: Number = 0, var pitch: Number = 0): Value, JAny() {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("location"),
            "x" to JsonPrimitive(x),
            "y" to JsonPrimitive(y),
            "z" to JsonPrimitive(z),
            "yaw" to JsonPrimitive(yaw),
            "pitch" to JsonPrimitive(pitch),
        ))
    }
}
open class JSound(val value: Number): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}
open class JParticle(val value: Number): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}
open class JBlock(val value: Number): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}
open class JItem(val value: Material): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}
open class JPotion(val value: Number): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}
open class JArray(val value: Number): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}
open class JMap(val value: Number): Value, JAny() {
    override fun parse(): JsonObject {
        TODO()
    }
}

private fun createVar(value: Any): String {
    val name = "jmkcc.${varNumber}"
    varNumber++
    variableSetValue(Var(name, VarScope.LOCAL), value)
    return "%var_local($name)"
}

open class JGameValue(var id: GameValues, var selector: GameValueSelector = GameValueSelector.CURRENT): Value, NumberValue, TextValue, JAny() {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("game_value"),
            "game_value" to JsonPrimitive(id.name.lowercase()),
            "selection" to JsonPrimitive("{\"type\":\"${selector.id}\"}")
        ))
    }

    override fun toString(): String {
        return createVar(this)
    }
}

fun Value(id: GameValues, selector: GameValueSelector = GameValueSelector.CURRENT): JGameValue {
    return JGameValue(id, selector)
}

open class JVariable(val name: String, val  scope: VarScope = VarScope.LOCAL): JAny(), NumberValue, TextValue {
    override fun parse(): JsonObject {
        return JsonObject(hashMapOf(
            "type" to JsonPrimitive("variable"),
            "variable" to JsonPrimitive(name),
            "scope" to JsonPrimitive(scope.name.lowercase())
        ))
    }
}

fun Var(name: JString, scope: VarScope = VarScope.LOCAL): JVariable {
    return JVariable(name.value, scope)
}
fun Var(name: String, scope: VarScope = VarScope.LOCAL): JVariable {
    return JVariable(name, scope)
}