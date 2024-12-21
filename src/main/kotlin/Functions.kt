import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

fun codeCallFunction(functionName: Any) {
	val functionNameARG =  textConvert("codeCallFunction", "functionName", functionName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("function_name"),"value" to functionNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("call_function"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeCallException(id: Any, message: Any, type: Any? = null) {
	val idARG =  textConvert("codeCallException", "id", id)
	val messageARG =  textConvert("codeCallException", "message", message)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("message"),"value" to messageARG.parse())))
enumCheck("codeCallException", "type", type, listOf("ERROR", "FATAL", "WARNING"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("control_call_exception"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeBreak() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("control_end_thread"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeReturnFunction() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("control_return_function"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeSkipIteration() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("control_skip_iteration"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeStopRepeat() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("control_stop_repeat"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeWait(duration: Any, timeUnit: Any? = null) {
	val durationARG =  numberConvert("codeWait", "duration", duration)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("duration"),"value" to durationARG.parse())))
enumCheck("codeWait", "timeUnit", timeUnit, listOf("MINUTES", "SECONDS", "TICKS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("control_wait"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun controllerAsyncRun() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("controller_async_run"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun controllerCatchException(variable: Any, exceptionType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
enumCheck("controllerCatchException", "exceptionType", exceptionType, listOf("ALL", "ERROR", "WARNING"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("controller_exception"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun controllerMeasureTime(variable: Any, duration: Any? = null) {
	val variableARG = typeCheck<Var>(variable)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
enumCheck("controllerMeasureTime", "duration", duration, listOf("MICROSECONDS", "MILLISECONDS", "NANOSECONDS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("controller_measure_time"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeElse() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("else"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityAttachLead(nameOrUuid: Any, location: Any) {
	val nameOrUuidARG =  textConvert("entityAttachLead", "nameOrUuid", nameOrUuid)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_attach_lead"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityClearPotionEffects() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_celar_potion_effects"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityClearMerchantRecipes() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_clear_merchant_recipes"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityDamage(damage: Any, source: Any) {
	val damageARG =  numberConvert("entityDamage", "damage", damage)
	val sourceARG =  textConvert("entityDamage", "source", source)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("damage"),"value" to damageARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("source"),"value" to sourceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_damage"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityDisguiseAsBlock(block: Any) {
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_disguise_as_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityDisguiseAsEntity(entityType: Any) {
	val entityTypeARG = typeCheck<JItem>(entityType)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity_type"),"value" to entityTypeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_disguise_as_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityDisguiseAsItem(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_disguise_as_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityDisguiseAsPlayer(nameOrUuid: Any, displayName: Any, serverType: Any? = null) {
	val nameOrUuidARG =  textConvert("entityDisguiseAsPlayer", "nameOrUuid", nameOrUuid)
	val displayNameARG =  textConvert("entityDisguiseAsPlayer", "displayName", displayName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("display_name"),"value" to displayNameARG.parse())))
enumCheck("entityDisguiseAsPlayer", "serverType", serverType, listOf("MOJANG", "SERVER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_disguise_as_player"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityEatGrass() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_eat_grass"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityEatTarget(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("entityEatTarget", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_eat_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityExplode() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_explode"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityFaceLocation(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_face_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityGetCustomTag(variable: Any, name: Any, default: Any) {
	val variableARG = typeCheck<Var>(variable)
	val nameARG =  textConvert("entityGetCustomTag", "name", name)
	val defaultARG = typeCheck<JAny>(default)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default"),"value" to defaultARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_get_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityGivePotionEffects(potions: Any, overwrite: Any? = null, showIcon: Any? = null, particleMode: Any? = null) {
	val potionsARG = typeCheck<JPotion>(potions)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potions"),"value" to potionsARG.parse())))
enumCheck("entityGivePotionEffects", "overwrite", overwrite, listOf("FALSE", "TRUE"))

enumCheck("entityGivePotionEffects", "showIcon", showIcon, listOf("FALSE", "TRUE"))

enumCheck("entityGivePotionEffects", "particleMode", particleMode, listOf("AMBIENT", "NONE", "REGULAR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_give_potion_effects"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityHeal(heal: Any) {
	val healARG =  numberConvert("entityHeal", "heal", heal)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("heal"),"value" to healARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_heal"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIgniteCreeper() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_ignite_creeper"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityJump() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_jump"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityLaunchForward(power: Any, increment: Any? = null, launchAxis: Any? = null) {
	val powerARG =  numberConvert("entityLaunchForward", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
enumCheck("entityLaunchForward", "increment", increment, listOf("FALSE", "TRUE"))

enumCheck("entityLaunchForward", "launchAxis", launchAxis, listOf("YAW", "YAW_AND_PITCH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_launch_forward"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityLaunchProjectile(projectile: Any, location: Any, name: Any, speed: Any, inaccuracy: Any, trail: Any) {
	val projectileARG = typeCheck<JItem>(projectile)
	val locationARG = typeCheck<JLocation>(location)
	val nameARG =  textConvert("entityLaunchProjectile", "name", name)
	val speedARG =  numberConvert("entityLaunchProjectile", "speed", speed)
	val inaccuracyARG =  numberConvert("entityLaunchProjectile", "inaccuracy", inaccuracy)
	val trailARG = typeCheck<JParticle>(trail)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("projectile"),"value" to projectileARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("speed"),"value" to speedARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("inaccuracy"),"value" to inaccuracyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("trail"),"value" to trailARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_launch_projectile"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityLaunchToLocation(location: Any, power: Any, increment: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val powerARG =  numberConvert("entityLaunchToLocation", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
enumCheck("entityLaunchToLocation", "increment", increment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_launch_to_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityLaunchUp(power: Any, increment: Any? = null) {
	val powerARG =  numberConvert("entityLaunchUp", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
enumCheck("entityLaunchUp", "increment", increment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_launch_up"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityLeaveVehicle() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_leave_vehicle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityModifyPiglinBarterMaterials(materials: Any, modificationMode: Any? = null) {
	val materialsARG = typeCheck<JItem>(materials)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("materials"),"value" to materialsARG.parse())))
enumCheck("entityModifyPiglinBarterMaterials", "modificationMode", modificationMode, listOf("ADD", "REMOVE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_modify_piglin_barter_materials"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityModifyPiglinInterestedMaterials(materials: Any, modificationMode: Any? = null) {
	val materialsARG = typeCheck<JItem>(materials)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("materials"),"value" to materialsARG.parse())))
enumCheck("entityModifyPiglinInterestedMaterials", "modificationMode", modificationMode, listOf("ADD", "REMOVE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_modify_piglin_interested_materials"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityMoveToLocation(location: Any, speed: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val speedARG =  numberConvert("entityMoveToLocation", "speed", speed)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("speed"),"value" to speedARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_move_to_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityMoveToLocationStop() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_move_to_location_stop"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityPlayDamageAnimation(damageType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entityPlayDamageAnimation", "damageType", damageType, listOf("CRITICAL_DAMAGE", "DAMAGE", "MAGICAL_DAMAGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_play_damage_animation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityPlayHurtAnimation(yaw: Any) {
	val yawARG =  numberConvert("entityPlayHurtAnimation", "yaw", yaw)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_play_hurt_animation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRamTarget(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("entityRamTarget", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_ram_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRemove() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_remove"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRemoveCustomTag(name: Any) {
	val nameARG =  textConvert("entityRemoveCustomTag", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_remove_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRemoveDisguise() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_remove_disguise"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRemoveMerchantRecipe(recipeIndex: Any) {
	val recipeIndexARG =  numberConvert("entityRemoveMerchantRecipe", "recipeIndex", recipeIndex)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("recipe_index"),"value" to recipeIndexARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_remove_merchant_recipe"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRemovePotionEffect(effects: Any) {
	val effectsARG = typeCheck<JPotion>(effects)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("effects"),"value" to effectsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_remove_potion_effect"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityResetDisplayBrightness() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_reset_display_brightness"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityResetDisplayGlowColor() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_reset_display_glow_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityResetTextDisplayBackground() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_reset_text_display_background"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityRideEntity(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("entityRideEntity", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_ride_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAbsorptionHealth(health: Any) {
	val healthARG =  numberConvert("entitySetAbsorptionHealth", "health", health)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("health"),"value" to healthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_absorption_health"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAi(ai: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetAi", "ai", ai, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_ai"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAllayDancing(dance: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetAllayDancing", "dance", dance, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_allay_dancing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAngry(target: Any, angry: Any? = null) {
	val targetARG =  textConvert("entitySetAngry", "target", target)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("target"),"value" to targetARG.parse())))
enumCheck("entitySetAngry", "angry", angry, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_angry"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAnimalAge(age: Any, lock: Any? = null) {
	val ageARG =  numberConvert("entitySetAnimalAge", "age", age)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("age"),"value" to ageARG.parse())))
enumCheck("entitySetAnimalAge", "lock", lock, listOf("DISABLE", "DONT_CHANGE", "ENABLE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_animal_age"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetArmorItems(helmet: Any, chestplate: Any, leggings: Any, boots: Any) {
	val helmetARG = typeCheck<JItem>(helmet)
	val chestplateARG = typeCheck<JItem>(chestplate)
	val leggingsARG = typeCheck<JItem>(leggings)
	val bootsARG = typeCheck<JItem>(boots)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("helmet"),"value" to helmetARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("chestplate"),"value" to chestplateARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("leggings"),"value" to leggingsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("boots"),"value" to bootsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_armor_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetArmorStandParts(arms: Any? = null, basePlate: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetArmorStandParts", "arms", arms, listOf("DISABLE", "DONT_CHANGE", "ENABLE"))

enumCheck("entitySetArmorStandParts", "basePlate", basePlate, listOf("DISABLE", "DONT_CHANGE", "ENABLE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_armor_stand_parts"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetArmorStandPose(xRotation: Any, yRotation: Any, zRotation: Any, bodyPart: Any? = null) {
	val xRotationARG =  numberConvert("entitySetArmorStandPose", "xRotation", xRotation)
	val yRotationARG =  numberConvert("entitySetArmorStandPose", "yRotation", yRotation)
	val zRotationARG =  numberConvert("entitySetArmorStandPose", "zRotation", zRotation)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("x_rotation"),"value" to xRotationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("y_rotation"),"value" to yRotationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("z_rotation"),"value" to zRotationARG.parse())))
enumCheck("entitySetArmorStandPose", "bodyPart", bodyPart, listOf("BODY", "HEAD", "LEFT_ARM", "LEFT_LEG", "RIGHT_ARM", "RIGHT_LEG"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_armor_stand_pose"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetArrowHitSound(sound: Any) {
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_arrow_hit_sound"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetArrowPierce(pierce: Any) {
	val pierceARG =  numberConvert("entitySetArrowPierce", "pierce", pierce)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pierce"),"value" to pierceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_arrow_pierce"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAttribute(value: Any, attributeType: Any? = null) {
	val valueARG =  numberConvert("entitySetAttribute", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("entitySetAttribute", "attributeType", attributeType, listOf("GENERIC_ARMOR", "GENERIC_ARMOR_TOUGHNESS", "GENERIC_ATTACK_DAMAGE", "GENERIC_ATTACK_KNOCKBACK", "GENERIC_ATTACK_SPEED", "GENERIC_BURNING_TIME", "GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE", "GENERIC_FALL_DAMAGE_MULTIPLIER", "GENERIC_FLYING_SPEED", "GENERIC_FOLLOW_RANGE", "GENERIC_GRAVITY", "GENERIC_JUMP_STRENGTH", "GENERIC_KNOCKBACK_RESISTANCE", "GENERIC_LUCK", "GENERIC_MAX_ABSORPTION", "GENERIC_MAX_HEALTH", "GENERIC_MOVEMENT_EFFICIENCY", "GENERIC_MOVEMENT_SPEED", "GENERIC_OXYGEN_BONUS", "GENERIC_SAFE_FALL_DISTANCE", "GENERIC_SCALE", "GENERIC_STEP_HEIGHT", "GENERIC_WATER_MOVEMENT_EFFICIENCY", "PLAYER_BLOCK_BREAK_SPEED", "PLAYER_BLOCK_INTERACTION_RANGE", "PLAYER_ENTITY_INTERACTION_RANGE", "PLAYER_MINING_EFFICIENCY", "PLAYER_SNEAKING_SPEED", "PLAYER_SUBMERGED_MINING_SPEED", "PLAYER_SWEEPING_DAMAGE_RATIO", "ZOMBIE_SPAWN_REINFORCEMENTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_attribute"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAware(aware: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetAware", "aware", aware, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_aware"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetAxolotlType(axolotlType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetAxolotlType", "axolotlType", axolotlType, listOf("BLUE", "CYAN", "GOLD", "LUCY", "WILD"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_axolotl_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetBaby(baby: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetBaby", "baby", baby, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_baby"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetBaseArrowDamage(damage: Any) {
	val damageARG =  numberConvert("entitySetBaseArrowDamage", "damage", damage)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("damage"),"value" to damageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_base_arrow_damage"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetBeeHasStinger(stinger: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetBeeHasStinger", "stinger", stinger, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_bee_has_stinger"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetBeeNectar(nectar: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetBeeNectar", "nectar", nectar, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_bee_nectar"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetBlockDisplayBlock(displayedBlock: Any) {
	val displayedBlockARG = typeCheck<JBlock>(displayedBlock)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("displayed_block"),"value" to displayedBlockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_block_display_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCamelDashing(dashing: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCamelDashing", "dashing", dashing, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_camel_dashing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCarryingChest(carrying: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCarryingChest", "carrying", carrying, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_carrying_chest"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCatLyingDown(lyingDown: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCatLyingDown", "lyingDown", lyingDown, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_cat_lying_down"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCatType(catType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCatType", "catType", catType, listOf("ALL_BLACK", "BLACK", "BRITISH_SHORTHAIR", "CALICO", "JELLIE", "PERSIAN", "RAGDOLL", "RED", "SIAMESE", "TABBY", "WHITE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_cat_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCelebrating(celebrating: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCelebrating", "celebrating", celebrating, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_celebrating"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCollidable(collidable: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCollidable", "collidable", collidable, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_collidable"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCreeperCharge(charged: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCreeperCharge", "charged", charged, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_creeper_charge"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCreeperFuse(fuseTicks: Any) {
	val fuseTicksARG =  numberConvert("entitySetCreeperFuse", "fuseTicks", fuseTicks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("fuse_ticks"),"value" to fuseTicksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_creeper_fuse"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCurrentHealth(health: Any) {
	val healthARG =  numberConvert("entitySetCurrentHealth", "health", health)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("health"),"value" to healthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_current_health"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCustomName(customName: Any) {
	val customNameARG =  textConvert("entitySetCustomName", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_custom_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCustomNameVisibility(visibility: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetCustomNameVisibility", "visibility", visibility, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_custom_name_visibility"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetCustomTag(name: Any, value: Any) {
	val nameARG =  textConvert("entitySetCustomTag", "name", name)
	val valueARG =  textConvert("entitySetCustomTag", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDeathDrops(drops: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetDeathDrops", "drops", drops, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_death_drops"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDeathTime(deathTime: Any) {
	val deathTimeARG =  numberConvert("entitySetDeathTime", "deathTime", deathTime)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("death_time"),"value" to deathTimeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_death_time"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDefaultVisible(defaultVisible: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetDefaultVisible", "defaultVisible", defaultVisible, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_default_visible"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDespawning(despawning: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetDespawning", "despawning", despawning, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_despawning"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayBillboard(billboardType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetDisplayBillboard", "billboardType", billboardType, listOf("CENTER", "FIXED", "HORIZONTAL", "VERTICAL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_billboard"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayBrightness(blockLightLevel: Any, skyLightLevel: Any) {
	val blockLightLevelARG =  numberConvert("entitySetDisplayBrightness", "blockLightLevel", blockLightLevel)
	val skyLightLevelARG =  numberConvert("entitySetDisplayBrightness", "skyLightLevel", skyLightLevel)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block_light_level"),"value" to blockLightLevelARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sky_light_level"),"value" to skyLightLevelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_brightness"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayCullingSize(width: Any, height: Any) {
	val widthARG =  numberConvert("entitySetDisplayCullingSize", "width", width)
	val heightARG =  numberConvert("entitySetDisplayCullingSize", "height", height)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("width"),"value" to widthARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("height"),"value" to heightARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_culling_suze"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayGlowColor(colorHexadecimal: Any) {
	val colorHexadecimalARG =  textConvert("entitySetDisplayGlowColor", "colorHexadecimal", colorHexadecimal)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("color_hexadecimal"),"value" to colorHexadecimalARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_glow_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayInterpolation(interpolationDuration: Any, interpolationDelay: Any) {
	val interpolationDurationARG =  numberConvert("entitySetDisplayInterpolation", "interpolationDuration", interpolationDuration)
	val interpolationDelayARG =  numberConvert("entitySetDisplayInterpolation", "interpolationDelay", interpolationDelay)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("interpolation_duration"),"value" to interpolationDurationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("interpolation_delay"),"value" to interpolationDelayARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_interpolation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayRotationFromAxisAngle(axisVector: Any, angle: Any, mode: Any? = null, input: Any? = null, rotation: Any? = null) {
	val axisVectorARG = typeCheck<JVector>(axisVector)
	val angleARG =  numberConvert("entitySetDisplayRotationFromAxisAngle", "angle", angle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("axis_vector"),"value" to axisVectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("angle"),"value" to angleARG.parse())))
enumCheck("entitySetDisplayRotationFromAxisAngle", "mode", mode, listOf("ADD", "SET"))

enumCheck("entitySetDisplayRotationFromAxisAngle", "input", input, listOf("DEGREES", "RADIANS"))

enumCheck("entitySetDisplayRotationFromAxisAngle", "rotation", rotation, listOf("LEFT_ROTATION", "RIGHT_ROTATION"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_rotation_from_axis_angle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayRotationFromEulerAngles(pitch: Any, yaw: Any, roll: Any, mode: Any? = null, input: Any? = null, rotation: Any? = null) {
	val pitchARG =  numberConvert("entitySetDisplayRotationFromEulerAngles", "pitch", pitch)
	val yawARG =  numberConvert("entitySetDisplayRotationFromEulerAngles", "yaw", yaw)
	val rollARG =  numberConvert("entitySetDisplayRotationFromEulerAngles", "roll", roll)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("roll"),"value" to rollARG.parse())))
enumCheck("entitySetDisplayRotationFromEulerAngles", "mode", mode, listOf("ADD", "SET"))

enumCheck("entitySetDisplayRotationFromEulerAngles", "input", input, listOf("DEGREES", "RADIANS"))

enumCheck("entitySetDisplayRotationFromEulerAngles", "rotation", rotation, listOf("LEFT_ROTATION", "RIGHT_ROTATION"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_rotation_from_euler_angles"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayScale(scaleVector: Any, mode: Any? = null) {
	val scaleVectorARG = typeCheck<JVector>(scaleVector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("scale_vector"),"value" to scaleVectorARG.parse())))
enumCheck("entitySetDisplayScale", "mode", mode, listOf("ADD", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_scale"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayShadow(shadowRadius: Any, shadowOpacityPercentage: Any) {
	val shadowRadiusARG =  numberConvert("entitySetDisplayShadow", "shadowRadius", shadowRadius)
	val shadowOpacityPercentageARG =  numberConvert("entitySetDisplayShadow", "shadowOpacityPercentage", shadowOpacityPercentage)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("shadow_radius"),"value" to shadowRadiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("shadow_opacity_percentage"),"value" to shadowOpacityPercentageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_shadow"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayTeleportDuration(duration: Any) {
	val durationARG =  numberConvert("entitySetDisplayTeleportDuration", "duration", duration)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("duration"),"value" to durationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_teleport_duration"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayTransformationMatrix(rowMajorMatrix: Any) {
	val rowMajorMatrixARG =  numberConvert("entitySetDisplayTransformationMatrix", "rowMajorMatrix", rowMajorMatrix)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("row_major_matrix"),"value" to rowMajorMatrixARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_transformation_matrix"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayTranslation(translationVector: Any, mode: Any? = null) {
	val translationVectorARG = typeCheck<JVector>(translationVector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("translation_vector"),"value" to translationVectorARG.parse())))
enumCheck("entitySetDisplayTranslation", "mode", mode, listOf("ADD", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_translation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDisplayViewRange(viewRange: Any) {
	val viewRangeARG =  numberConvert("entitySetDisplayViewRange", "viewRange", viewRange)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("view_range"),"value" to viewRangeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_display_view_range"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDragonPhase(phase: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetDragonPhase", "phase", phase, listOf("BREATH_ATTACK", "CHARGE_PLAYER", "CIRCLING", "DYING", "FLY_TO_PORTAL", "HOVER", "LAND_ON_PORTAL", "LEAVE_PORTAL", "ROAR_BEFORE_ATTACK", "SEARCH_FOR_BREATH_ATTACK_TARGET", "STRAFING"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_dragon_phase"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetDyeColor(color: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetDyeColor", "color", color, listOf("BLACK", "BLUE", "BROWN", "CYAN", "GRAY", "GREEN", "LIGHT_BLUE", "LIGHT_GRAY", "LIME", "MAGENTA", "ORANGE", "PINK", "PURPLE", "RED", "WHITE", "YELLOW"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_dye_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetEndCrystalBeam(beam: Any) {
	val beamARG = typeCheck<JLocation>(beam)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("beam"),"value" to beamARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_end_crystal_beam"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetEndermanBlock(block: Any) {
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_enderman_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetEquipmentItem(item: Any, slot: Any? = null) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("entitySetEquipmentItem", "slot", slot, listOf("CHEST", "FEET", "HAND", "HEAD", "LEGS", "OFF_HAND"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_equipment_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetExplosivePower(power: Any) {
	val powerARG =  numberConvert("entitySetExplosivePower", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_explosive_power"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFallDistance(fallDistance: Any) {
	val fallDistanceARG =  numberConvert("entitySetFallDistance", "fallDistance", fallDistance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("fall_distance"),"value" to fallDistanceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_fall_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFallingBlockType(block: Any) {
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_falling_block_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFireTicks(ticks: Any) {
	val ticksARG =  numberConvert("entitySetFireTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_fire_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFishingWait(time: Any) {
	val timeARG =  numberConvert("entitySetFishingWait", "time", time)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("time"),"value" to timeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_fishing_wait"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFoxLeaping(leaping: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetFoxLeaping", "leaping", leaping, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_fox_leaping"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFoxType(foxType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetFoxType", "foxType", foxType, listOf("RED", "SNOW"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_fox_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFreezeTicks(ticks: Any, tickingLocked: Any? = null) {
	val ticksARG =  numberConvert("entitySetFreezeTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
enumCheck("entitySetFreezeTicks", "tickingLocked", tickingLocked, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_freeze_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFriction(friction: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetFriction", "friction", friction, listOf("NOT_SET", "TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_friction"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetFrogType(frogVariant: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetFrogType", "frogVariant", frogVariant, listOf("COLD", "TEMPERATE", "WARM"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_frog_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetGliding(isGliding: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetGliding", "isGliding", isGliding, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_gliding"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetGlowSquidDark(darkTicks: Any) {
	val darkTicksARG =  numberConvert("entitySetGlowSquidDark", "darkTicks", darkTicks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("dark_ticks"),"value" to darkTicksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_glow_squid_dark"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetGlowing(glowing: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetGlowing", "glowing", glowing, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_glowing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetGoatScreaming(screams: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetGoatScreaming", "screams", screams, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_goat_screaming"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetGravity(gravity: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetGravity", "gravity", gravity, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_gravity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetHorseJump(power: Any) {
	val powerARG =  numberConvert("entitySetHorseJump", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_horse_jump"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetHorsePattern(horseColor: Any? = null, horseStyle: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetHorsePattern", "horseColor", horseColor, listOf("BLACK", "BROWN", "CHESTNUT", "CREAMY", "DARK_BROWN", "DO_NOT_CHANGE", "GRAY", "WHITE"))

enumCheck("entitySetHorsePattern", "horseStyle", horseStyle, listOf("BLACK_DOTS", "DO_NOT_CHANGE", "NONE", "WHITE", "WHITEFIELD", "WHITE_DOTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_horse_pattern"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetImmuneToZombification(isImmune: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetImmuneToZombification", "isImmune", isImmune, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_immune_to_zombification"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetInteractionResponsive(responsive: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetInteractionResponsive", "responsive", responsive, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_interaction_responsive"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetInteractionSize(width: Any, height: Any) {
	val widthARG =  numberConvert("entitySetInteractionSize", "width", width)
	val heightARG =  numberConvert("entitySetInteractionSize", "height", height)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("width"),"value" to widthARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("height"),"value" to heightARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_interaction_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetInvisible(invisible: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetInvisible", "invisible", invisible, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_invisible"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetInvulnerabilityTicks(ticks: Any) {
	val ticksARG =  numberConvert("entitySetInvulnerabilityTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_invulnerability_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetInvulnerable(invulnerable: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetInvulnerable", "invulnerable", invulnerable, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_invulnerable"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetItem(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetItemDisplayItem(displayedItem: Any) {
	val displayedItemARG = typeCheck<JItem>(displayedItem)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("displayed_item"),"value" to displayedItemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_item_display_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetItemDisplayModelType(displayModelType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetItemDisplayModelType", "displayModelType", displayModelType, listOf("FIRSTPERSON_LEFTHAND", "FIRSTPERSON_RIGHTHAND", "FIXED", "GROUND", "GUI", "HEAD", "NONE", "THIRDPERSON_LEFTHAND", "THIRDPERSON_RIGHTHAND"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_item_display_model_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetItemInFrame(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_item_in_frame"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetLlamaType(type: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetLlamaType", "type", type, listOf("BROWN", "CREAMY", "GRAY", "WHITE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_llama_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetLocation(velocity: Any, increment: Any? = null) {
	val velocityARG = typeCheck<JVector>(velocity)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("velocity"),"value" to velocityARG.parse())))
enumCheck("entitySetLocation", "increment", increment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetMarker(marker: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetMarker", "marker", marker, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_marker"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetMaxHealth(maxHealth: Any, healToMax: Any? = null) {
	val maxHealthARG =  numberConvert("entitySetMaxHealth", "maxHealth", maxHealth)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max_health"),"value" to maxHealthARG.parse())))
enumCheck("entitySetMaxHealth", "healToMax", healToMax, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_max_health"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetMerchantRecipe(result: Any, ingredientOne: Any, ingredientTwo: Any, uses: Any, maxUses: Any, index: Any, villagerExperience: Any, priceMultiplifier: Any, demand: Any, specialPrice: Any, mode: Any? = null, experienceReward: Any? = null, ignoreDiscounts: Any? = null) {
	val resultARG = typeCheck<JItem>(result)
	val ingredientOneARG = typeCheck<JItem>(ingredientOne)
	val ingredientTwoARG = typeCheck<JItem>(ingredientTwo)
	val usesARG =  numberConvert("entitySetMerchantRecipe", "uses", uses)
	val maxUsesARG =  numberConvert("entitySetMerchantRecipe", "maxUses", maxUses)
	val indexARG =  numberConvert("entitySetMerchantRecipe", "index", index)
	val villagerExperienceARG =  numberConvert("entitySetMerchantRecipe", "villagerExperience", villagerExperience)
	val priceMultiplifierARG =  numberConvert("entitySetMerchantRecipe", "priceMultiplifier", priceMultiplifier)
	val demandARG =  numberConvert("entitySetMerchantRecipe", "demand", demand)
	val specialPriceARG =  numberConvert("entitySetMerchantRecipe", "specialPrice", specialPrice)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("result"),"value" to resultARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ingredient_one"),"value" to ingredientOneARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ingredient_two"),"value" to ingredientTwoARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("uses"),"value" to usesARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max_uses"),"value" to maxUsesARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index"),"value" to indexARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("villager_experience"),"value" to villagerExperienceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("price_multiplifier"),"value" to priceMultiplifierARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("demand"),"value" to demandARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("special_price"),"value" to specialPriceARG.parse())))
enumCheck("entitySetMerchantRecipe", "mode", mode, listOf("APPEND", "MERGE"))

enumCheck("entitySetMerchantRecipe", "experienceReward", experienceReward, listOf("FALSE", "TRUE"))

enumCheck("entitySetMerchantRecipe", "ignoreDiscounts", ignoreDiscounts, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_merchant_recipe"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetMinecartBlock(block: Any, blockOffset: Any) {
	val blockARG = typeCheck<JBlock>(block)
	val blockOffsetARG =  numberConvert("entitySetMinecartBlock", "blockOffset", blockOffset)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block_offset"),"value" to blockOffsetARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_minecart_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetMobAggressive(aggressive: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetMobAggressive", "aggressive", aggressive, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_mob_aggressive"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetMushroomCowType(cowType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetMushroomCowType", "cowType", cowType, listOf("BROWN", "RED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_mushroom_cow_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityNoPhysics(noPhysics: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entityNoPhysics", "noPhysics", noPhysics, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_no_physics"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPandaGene(gene: Any? = null, geneType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPandaGene", "gene", gene, listOf("BOTH", "HIDDEN", "MAIN"))

enumCheck("entitySetPandaGene", "geneType", geneType, listOf("AGGRESSIVE", "BROWN", "LAZY", "NORMAL", "PLAYFUL", "WEAK", "WORRIED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_panda_gene"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPandaOnBack(onBack: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPandaOnBack", "onBack", onBack, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_panda_on_back"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPandaRolling(rolling: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPandaRolling", "rolling", rolling, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_panda_rolling"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPandaSadTicks(sadTicks: Any) {
	val sadTicksARG =  numberConvert("entitySetPandaSadTicks", "sadTicks", sadTicks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sad_ticks"),"value" to sadTicksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_panda_sad_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetParrotType(parrotType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetParrotType", "parrotType", parrotType, listOf("BLUE", "CYAN", "GRAY", "GREEN", "RED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_parrot_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPersistence(persistence: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPersistence", "persistence", persistence, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_persistence"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPickup(canMobPickup: Any? = null, canPlayerPickup: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPickup", "canMobPickup", canMobPickup, listOf("TRUE", "FALSE"))

enumCheck("entitySetPickup", "canPlayerPickup", canPlayerPickup, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_pickup"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPickupDelay(delay: Any) {
	val delayARG =  numberConvert("entitySetPickupDelay", "delay", delay)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("delay"),"value" to delayARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_pickup_delay"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPiglinAbleToHunt(able: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPiglinAbleToHunt", "able", able, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_piglin_able_to_hunt"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPiglinChargingCrossbow(charging: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPiglinChargingCrossbow", "charging", charging, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_piglin_charging_crossbow"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPiglinDancing(dancingTime: Any) {
	val dancingTimeARG =  numberConvert("entitySetPiglinDancing", "dancingTime", dancingTime)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("dancing_time"),"value" to dancingTimeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_piglin_dancing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPose(pose: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetPose", "pose", pose, listOf("CROAKING", "CROUCHING", "DIGGING", "DYING", "EMERGING", "FALL_FLYING", "LONG_JUMPING", "ROARING", "SITTING", "SLEEPING", "SNEAKING", "SNIFFING", "SPIN_ATTACK", "STANDING", "SWIMMING", "USING_TONGUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_pose"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPotionCloudRadius(radius: Any, shrinkingSpeed: Any) {
	val radiusARG =  numberConvert("entitySetPotionCloudRadius", "radius", radius)
	val shrinkingSpeedARG =  numberConvert("entitySetPotionCloudRadius", "shrinkingSpeed", shrinkingSpeed)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("shrinking_speed"),"value" to shrinkingSpeedARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_potion_cloud_radius"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetPrimedTntBlock(block: Any) {
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_primed_tnt_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetProjectileDisplayItem(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_projectile_display_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetProjectilePower(power: Any) {
	val powerARG = typeCheck<JVector>(power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_projectile_power"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetProjectileShooter(uuid: Any) {
	val uuidARG =  textConvert("entitySetProjectileShooter", "uuid", uuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("uuid"),"value" to uuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_projectile_shooter"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetRabbitType(rabbitType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetRabbitType", "rabbitType", rabbitType, listOf("BLACK", "BLACK_AND_WHITE", "BROWN", "GOLD", "SALT_AND_PEPPER", "THE_KILLER_BUNNY", "WHITE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_rabbit_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetRearing(rearing: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetRearing", "rearing", rearing, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_rearing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetRiptiding(riptiding: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetRiptiding", "riptiding", riptiding, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_riptiding"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetRotation(yaw: Any, pitch: Any) {
	val yawARG =  numberConvert("entitySetRotation", "yaw", yaw)
	val pitchARG =  numberConvert("entitySetRotation", "pitch", pitch)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_rotation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetRotationByVector(vector: Any) {
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_rotation_by_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetSheepSheared(sheared: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetSheepSheared", "sheared", sheared, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_sheep_sheared"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetShulkerBulletTarget(target: Any) {
	val targetARG =  textConvert("entitySetShulkerBulletTarget", "target", target)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("target"),"value" to targetARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_shulker_bullet_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetShulkerPeek(rolling: Any, silent: Any? = null) {
	val rollingARG =  numberConvert("entitySetShulkerPeek", "rolling", rolling)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("rolling"),"value" to rollingARG.parse())))
enumCheck("entitySetShulkerPeek", "silent", silent, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_shulker_peek"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetSilenced(silenced: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetSilenced", "silenced", silenced, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_silenced"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetSitting(sitting: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetSitting", "sitting", sitting, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_sitting"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetSize(size: Any) {
	val sizeARG =  numberConvert("entitySetSize", "size", size)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetSnifferState(state: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetSnifferState", "state", state, listOf("DIGGING", "FEELING_HAPPY", "IDLING", "RISING", "SCENTING", "SEARCHING", "SNIFFING"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_sniffer_state"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetSnowmanPumpkin(pumpkin: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetSnowmanPumpkin", "pumpkin", pumpkin, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_snowman_pumpkin"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTame(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("entitySetTame", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_tame"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTarget(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("entitySetTarget", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplayAlignment(textAlignment: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetTextDisplayAlignment", "textAlignment", textAlignment, listOf("CENTER", "LEFT", "RIGHT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_alignment"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplayBackground(colorHexadecimal: Any, opacity: Any) {
	val colorHexadecimalARG =  textConvert("entitySetTextDisplayBackground", "colorHexadecimal", colorHexadecimal)
	val opacityARG =  numberConvert("entitySetTextDisplayBackground", "opacity", opacity)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("color_hexadecimal"),"value" to colorHexadecimalARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("opacity"),"value" to opacityARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_background"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplayLineWidth(lineWidth: Any) {
	val lineWidthARG =  numberConvert("entitySetTextDisplayLineWidth", "lineWidth", lineWidth)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line_width"),"value" to lineWidthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_line_width"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplayOpacity(textOpacity: Any) {
	val textOpacityARG =  numberConvert("entitySetTextDisplayOpacity", "textOpacity", textOpacity)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text_opacity"),"value" to textOpacityARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_opacity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplaySeeThrough(enableSeeThrough: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetTextDisplaySeeThrough", "enableSeeThrough", enableSeeThrough, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_see_through"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplayText(displayedText: Any, mergingMode: Any? = null) {
	val displayedTextARG =  textConvert("entitySetTextDisplayText", "displayedText", displayedText)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("displayed_text"),"value" to displayedTextARG.parse())))
enumCheck("entitySetTextDisplayText", "mergingMode", mergingMode, listOf("CONCATENATION", "SEPARATE_LINES", "SPACES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTextDisplayTextShadow(enableTextShadow: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetTextDisplayTextShadow", "enableTextShadow", enableTextShadow, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_text_display_text_shadow"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetTropicalFishPattern(patternColor: Any? = null, bodyColor: Any? = null, pattern: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetTropicalFishPattern", "patternColor", patternColor, listOf("BLACK", "BLUE", "BROWN", "CYAN", "DO_NOT_CHANGE", "GRAY", "GREEN", "LIGHT_BLUE", "LIGHT_GRAY", "LIME", "MAGENTA", "ORANGE", "PINK", "PURPLE", "RED", "WHITE", "YELLOW"))

enumCheck("entitySetTropicalFishPattern", "bodyColor", bodyColor, listOf("BLACK", "BLUE", "BROWN", "CYAN", "DO_NOT_CHANGE", "GRAY", "GREEN", "LIGHT_BLUE", "LIGHT_GRAY", "LIME", "MAGENTA", "ORANGE", "PINK", "PURPLE", "RED", "WHITE", "YELLOW"))

enumCheck("entitySetTropicalFishPattern", "pattern", pattern, listOf("BETTY", "BLOCKFISH", "BRINELY", "CLAYFISH", "DASHER", "DO_NOT_CHANGE", "FLOPPER", "GLITTER", "KOB", "SNOOPER", "SPOTTY", "STRIPEY", "SUNSTREAK"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_tropical_fish_pattern"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetVexCharging(charging: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetVexCharging", "charging", charging, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_vex_charging"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetVexLimitedLifetimeTicks(lifetime: Any) {
	val lifetimeARG =  numberConvert("entitySetVexLimitedLifetimeTicks", "lifetime", lifetime)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("lifetime"),"value" to lifetimeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_vex_limited_lifetime_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetVillagerBiome(biome: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetVillagerBiome", "biome", biome, listOf("DESERT", "JUNGLE", "PLAINS", "SAVANNA", "SNOW", "SWAMP", "TAIGA"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_villager_biome"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetVillagerExperience(experience: Any) {
	val experienceARG =  numberConvert("entitySetVillagerExperience", "experience", experience)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("experience"),"value" to experienceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_villager_experience"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetVillagerProfession(profession: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetVillagerProfession", "profession", profession, listOf("ARMORER", "BUTCHER", "CARTOGRAPHER", "CLERIC", "FARMER", "FISHERMAN", "FLETCHER", "LEATHERWORKER", "LIBRARIAN", "MASON", "NITWIT", "NONE", "SHEPHERD", "TOOLSMITH", "WEAPONSMITH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_villager_profession"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetVisualFire(visualFire: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetVisualFire", "visualFire", visualFire, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_visual_fire"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetWardenAngerLevel(nameOrUuid: Any, anger: Any) {
	val nameOrUuidARG =  textConvert("entitySetWardenAngerLevel", "nameOrUuid", nameOrUuid)
	val angerARG =  numberConvert("entitySetWardenAngerLevel", "anger", anger)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("anger"),"value" to angerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_warden_anger_level"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetWardenDigging(digging: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetWardenDigging", "digging", digging, listOf("DIG_DOWN", "EMERGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_warden_digging"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetWearingSaddle(wearing: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetWearingSaddle", "wearing", wearing, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_wearing_saddle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetWitherInvulnerabilityTicks(ticks: Any) {
	val ticksARG =  numberConvert("entitySetWitherInvulnerabilityTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_wither_invulnerability_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetWolfType(wolfType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetWolfType", "wolfType", wolfType, listOf("ASHEN", "SNOWY", "RUSTY", "BLACK", "CHESTNUT", "SPOTTED", "STRIPED", "PALE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_wolf_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySetZombieArmsRaised(armsRaised: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySetZombieArmsRaised", "armsRaised", armsRaised, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_set_zombie_arms_raised"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityShear() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_shear"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityShearSheep() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_shear_sheep"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySleep(sleep: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySleep", "sleep", sleep, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_sleep"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySwingHand(handType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySwingHand", "handType", handType, listOf("MAIN", "OFF"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_swing_hand"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityTeleport(location: Any, keepRotation: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("entityTeleport", "keepRotation", keepRotation, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_teleport"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityUseItem(hand: Any? = null, enable: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entityUseItem", "hand", hand, listOf("MAIN_HAND", "OFF_HAND"))

enumCheck("entityUseItem", "enable", enable, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("entity_use_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldBlockGrowth(location: Any, growthStage: Any, growthType: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val growthStageARG =  numberConvert("worldBlockGrowth", "growthStage", growthStage)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("growth_stage"),"value" to growthStageARG.parse())))
enumCheck("worldBlockGrowth", "growthType", growthType, listOf("PERCENTAGE", "STAGE_NUMBER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_block_growth"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldBloomSkulkCatalyst(location: Any, bloomLocation: Any, charge: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val bloomLocationARG = typeCheck<JLocation>(bloomLocation)
	val chargeARG =  numberConvert("worldBloomSkulkCatalyst", "charge", charge)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("bloom_location"),"value" to bloomLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("charge"),"value" to chargeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_bloom_skulk_catalyst"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldBoneMealBlock(location: Any, count: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val countARG =  numberConvert("worldBoneMealBlock", "count", count)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("count"),"value" to countARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_bone_meal_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldBreakBlock(locations: Any, tool: Any, dropExp: Any? = null) {
	val locationsARG = typeCheck<JLocation>(locations)
	val toolARG = typeCheck<JItem>(tool)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tool"),"value" to toolARG.parse())))
enumCheck("worldBreakBlock", "dropExp", dropExp, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_break_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldCancelEvent() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_cancel_event"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldClearContainer(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_clear_container"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldClearContainerItems(items: Any, location: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_clear_container_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldClearExplodedBlocks(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_clear_exploded_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldClearRegion(pos1: Any, pos2: Any) {
	val pos1ARG = typeCheck<JLocation>(pos1)
	val pos2ARG = typeCheck<JLocation>(pos2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_1"),"value" to pos1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_2"),"value" to pos2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_clear_region"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldClearScoreboardScores(id: Any) {
	val idARG =  textConvert("worldClearScoreboardScores", "id", id)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_clear_scoreboard_scores"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldCloneRegion(pos1: Any, pos2: Any, targetPos: Any, pastePos: Any, ignoreAir: Any? = null, copyEntity: Any? = null) {
	val pos1ARG = typeCheck<JLocation>(pos1)
	val pos2ARG = typeCheck<JLocation>(pos2)
	val targetPosARG = typeCheck<JLocation>(targetPos)
	val pastePosARG = typeCheck<JLocation>(pastePos)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_1"),"value" to pos1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_2"),"value" to pos2ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("target_pos"),"value" to targetPosARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("paste_pos"),"value" to pastePosARG.parse())))
enumCheck("worldCloneRegion", "ignoreAir", ignoreAir, listOf("FALSE", "TRUE"))

enumCheck("worldCloneRegion", "copyEntity", copyEntity, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_clone_region"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldCreateExplosion(location: Any, power: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val powerARG =  numberConvert("worldCreateExplosion", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_create_explosion"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldCreateScoreboard(id: Any, displayName: Any) {
	val idARG =  textConvert("worldCreateScoreboard", "id", id)
	val displayNameARG =  textConvert("worldCreateScoreboard", "displayName", displayName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("display_name"),"value" to displayNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_create_scoreboard"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldFillContainer(items: Any, location: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_fill_container"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldGenerateTree(location: Any, treeType: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldGenerateTree", "treeType", treeType, listOf("ACACIA", "AZALEA", "BIG_TREE", "BIRCH", "BROWN_MUSHROOM", "CHERRY", "CHORUS_PLANT", "COCOA_TREE", "CRIMSON_FUNGUS", "DARK_OAK", "JUNGLE", "JUNGLE_BUSH", "MANGROVE", "MEGA_REDWOOD", "REDWOOD", "RED_MUSHROOM", "SMALL_JUNGLE", "SWAMP", "TALL_BIRCH", "TALL_MANGROVE", "TALL_REDWOOD", "TREE", "WARPED_FUNGUS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_generate_tree"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldHideEventMessage(hide: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldHideEventMessage", "hide", hide, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_hide_event_message"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldLaunchFirework(firework: Any, location: Any, movement: Any? = null, instant: Any? = null) {
	val fireworkARG = typeCheck<JItem>(firework)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("firework"),"value" to fireworkARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldLaunchFirework", "movement", movement, listOf("DIRECTIONAL", "UPWARDS"))

enumCheck("worldLaunchFirework", "instant", instant, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_launch_firework"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldLaunchProjectile(projectile: Any, location: Any, speed: Any, inaccuracy: Any, customName: Any, trail: Any) {
	val projectileARG = typeCheck<JItem>(projectile)
	val locationARG = typeCheck<JLocation>(location)
	val speedARG =  numberConvert("worldLaunchProjectile", "speed", speed)
	val inaccuracyARG =  numberConvert("worldLaunchProjectile", "inaccuracy", inaccuracy)
	val customNameARG =  textConvert("worldLaunchProjectile", "customName", customName)
	val trailARG = typeCheck<JParticle>(trail)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("projectile"),"value" to projectileARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("speed"),"value" to speedARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("inaccuracy"),"value" to inaccuracyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("trail"),"value" to trailARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_launch_projectile"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldRandomTickBlock(location: Any, times: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val timesARG =  numberConvert("worldRandomTickBlock", "times", times)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("times"),"value" to timesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_random_tick_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldRemoveContainerItems(items: Any, location: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_remove_container_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldRemoveScoreboard(id: Any) {
	val idARG =  textConvert("worldRemoveScoreboard", "id", id)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_remove_scoreboard"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldRemoveScoreboardScoreByName(id: Any, text: Any) {
	val idARG =  textConvert("worldRemoveScoreboardScoreByName", "id", id)
	val textARG =  textConvert("worldRemoveScoreboardScoreByName", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_remove_scoreboard_score_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldRemoveScoreboardScoreByScore(id: Any, score: Any) {
	val idARG =  textConvert("worldRemoveScoreboardScoreByScore", "id", id)
	val scoreARG =  numberConvert("worldRemoveScoreboardScoreByScore", "score", score)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("score"),"value" to scoreARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_remove_scoreboard_score_by_score"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldReplaceBlocksInRegion(oldBlock: Any, pos1: Any, pos2: Any, newBlock: Any) {
	val oldBlockARG = typeCheck<JBlock>(oldBlock)
	val pos1ARG = typeCheck<JLocation>(pos1)
	val pos2ARG = typeCheck<JLocation>(pos2)
	val newBlockARG = typeCheck<JBlock>(newBlock)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("old_block"),"value" to oldBlockARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_1"),"value" to pos1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_2"),"value" to pos2ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("new_block"),"value" to newBlockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_replace_blocks_in_region"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldReplaceContainerItems(items: Any, location: Any, replace: Any, count: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)
	val replaceARG = typeCheck<JItem>(replace)
	val countARG =  numberConvert("worldReplaceContainerItems", "count", count)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("replace"),"value" to replaceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("count"),"value" to countARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_replace_container_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSendWebRequest(url: Any, contentBody: Any, requestType: Any? = null, contentType: Any? = null) {
	val urlARG =  textConvert("worldSendWebRequest", "url", url)
	val contentBodyARG =  textConvert("worldSendWebRequest", "contentBody", contentBody)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("url"),"value" to urlARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("content_body"),"value" to contentBodyARG.parse())))
enumCheck("worldSendWebRequest", "requestType", requestType, listOf("DELETE", "GET", "POST", "PUT"))

enumCheck("worldSendWebRequest", "contentType", contentType, listOf("APPLICATION_JSON", "TEXT_PLAIN"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_send_web_request"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetAge(location: Any, tick: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val tickARG =  numberConvert("worldSetAge", "tick", tick)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tick"),"value" to tickARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_age"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlock(locations: Any, block: Any, updateBlocks: Any? = null) {
	val locationsARG = typeCheck<JLocation>(locations)
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
enumCheck("worldSetBlock", "updateBlocks", updateBlocks, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlockAnaloguePower(location: Any, powerLevel: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val powerLevelARG =  numberConvert("worldSetBlockAnaloguePower", "powerLevel", powerLevel)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power_level"),"value" to powerLevelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block_analogue_power"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlockCustomTag(location: Any, tagName: Any, tagValue: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val tagNameARG =  textConvert("worldSetBlockCustomTag", "tagName", tagName)
	val tagValueARG =  textConvert("worldSetBlockCustomTag", "tagValue", tagValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_name"),"value" to tagNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_value"),"value" to tagValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlockData(location: Any, blockData: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val blockDataARG =  textConvert("worldSetBlockData", "blockData", blockData)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block_data"),"value" to blockDataARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlockDropsEnabled(enable: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldSetBlockDropsEnabled", "enable", enable, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block_drops_enabled"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlockPowered(location: Any, powered: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldSetBlockPowered", "powered", powered, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block_powered"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBlockSingleData(location: Any, data: Any, value: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val dataARG =  textConvert("worldSetBlockSingleData", "data", data)
	val valueARG =  textConvert("worldSetBlockSingleData", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("data"),"value" to dataARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_block_single_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetBrushableBlockItem(location: Any, item: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_brushable_block_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetCampfireItem(location: Any, item: Any, cookingTime: Any, slot: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val itemARG = typeCheck<JItem>(item)
	val cookingTimeARG =  numberConvert("worldSetCampfireItem", "cookingTime", cookingTime)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("cooking_time"),"value" to cookingTimeARG.parse())))
enumCheck("worldSetCampfireItem", "slot", slot, listOf("FIRST", "FOURTH", "SECOND", "THIRD"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_campfire_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetContainer(items: Any, location: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_container"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetContainerLock(location: Any, containerKey: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val containerKeyARG =  textConvert("worldSetContainerLock", "containerKey", containerKey)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("container_key"),"value" to containerKeyARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_container_lock"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetContainerName(location: Any, name: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val nameARG =  textConvert("worldSetContainerName", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_container_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetDecoratePotSherd(location: Any, item: Any, side: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("worldSetDecoratePotSherd", "side", side, listOf("BACK", "FRONT", "LEFT", "RIGHT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_decorate_pot_sherd"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventDamage(damage: Any) {
	val damageARG =  numberConvert("worldSetEventDamage", "damage", damage)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("damage"),"value" to damageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_damage"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventExhaustion(exhaustion: Any) {
	val exhaustionARG =  numberConvert("worldSetEventExhaustion", "exhaustion", exhaustion)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("exhaustion"),"value" to exhaustionARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_exhaustion"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventExperience(experience: Any) {
	val experienceARG =  numberConvert("worldSetEventExperience", "experience", experience)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("experience"),"value" to experienceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_experience"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventHeal(heal: Any) {
	val healARG =  numberConvert("worldSetEventHeal", "heal", heal)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("heal"),"value" to healARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_heal"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventItem(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventItems(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventMoveAllowed(allowed: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldSetEventMoveAllowed", "allowed", allowed, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_move_allowed"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventProjectile(projectile: Any, name: Any) {
	val projectileARG = typeCheck<JItem>(projectile)
	val nameARG =  textConvert("worldSetEventProjectile", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("projectile"),"value" to projectileARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_projectile"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventSound(sound: Any) {
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_sound"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventSourceSlot(sourceSlot: Any) {
	val sourceSlotARG =  numberConvert("worldSetEventSourceSlot", "sourceSlot", sourceSlot)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("source_slot"),"value" to sourceSlotARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_source_slot"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventTargetSlot(target: Any) {
	val targetARG =  numberConvert("worldSetEventTargetSlot", "target", target)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("target"),"value" to targetARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_target_slot"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetEventUeryInfo(information: Any) {
	val informationARG =  textConvert("worldSetEventUeryInfo", "information", information)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("information"),"value" to informationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_event_uery_info"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetFurnaceCookTime(location: Any, time: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val timeARG =  numberConvert("worldSetFurnaceCookTime", "time", time)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("time"),"value" to timeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_furnace_cook_time"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetItemInContainerSlot(location: Any, item: Any, slot: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val itemARG = typeCheck<JItem>(item)
	val slotARG =  numberConvert("worldSetItemInContainerSlot", "slot", slot)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slot"),"value" to slotARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_item_in_container_slot"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetLecternBook(location: Any, item: Any, page: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val itemARG = typeCheck<JItem>(item)
	val pageARG =  numberConvert("worldSetLecternBook", "page", page)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("page"),"value" to pageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_lectern_book"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetPlayerHead(location: Any, nameOrUuid: Any, receiveType: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val nameOrUuidARG =  textConvert("worldSetPlayerHead", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("worldSetPlayerHead", "receiveType", receiveType, listOf("NAME_OR_UUID", "VALUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_player_head"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetRegion(block: Any, pos1: Any, pos2: Any) {
	val blockARG = typeCheck<JBlock>(block)
	val pos1ARG = typeCheck<JLocation>(pos1)
	val pos2ARG = typeCheck<JLocation>(pos2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_1"),"value" to pos1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_2"),"value" to pos2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_region"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetScoreboardLine(id: Any, line: Any, display: Any, score: Any, formatContent: Any, format: Any? = null) {
	val idARG =  textConvert("worldSetScoreboardLine", "id", id)
	val lineARG =  textConvert("worldSetScoreboardLine", "line", line)
	val displayARG =  textConvert("worldSetScoreboardLine", "display", display)
	val scoreARG =  numberConvert("worldSetScoreboardLine", "score", score)
	val formatContentARG =  textConvert("worldSetScoreboardLine", "formatContent", formatContent)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("display"),"value" to displayARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("score"),"value" to scoreARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("format_content"),"value" to formatContentARG.parse())))
enumCheck("worldSetScoreboardLine", "format", format, listOf("BLANK", "FIXED", "RESET", "STYLED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_scoreboard_line"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetScoreboardLineDisplay(id: Any, line: Any, display: Any) {
	val idARG =  textConvert("worldSetScoreboardLineDisplay", "id", id)
	val lineARG =  textConvert("worldSetScoreboardLineDisplay", "line", line)
	val displayARG =  textConvert("worldSetScoreboardLineDisplay", "display", display)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("display"),"value" to displayARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_scoreboard_line_display"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetScoreboardLineFormat(id: Any, line: Any, formatContent: Any, format: Any? = null) {
	val idARG =  textConvert("worldSetScoreboardLineFormat", "id", id)
	val lineARG =  textConvert("worldSetScoreboardLineFormat", "line", line)
	val formatContentARG =  textConvert("worldSetScoreboardLineFormat", "formatContent", formatContent)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("format_content"),"value" to formatContentARG.parse())))
enumCheck("worldSetScoreboardLineFormat", "format", format, listOf("BLANK", "FIXED", "RESET", "STYLED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_scoreboard_line_format"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetScoreboardNumberFormat(id: Any, formatContent: Any, format: Any? = null) {
	val idARG =  textConvert("worldSetScoreboardNumberFormat", "id", id)
	val formatContentARG =  textConvert("worldSetScoreboardNumberFormat", "formatContent", formatContent)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("format_content"),"value" to formatContentARG.parse())))
enumCheck("worldSetScoreboardNumberFormat", "format", format, listOf("BLANK", "FIXED", "RESET", "STYLED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_scoreboard_number_format"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetScoreboardScore(id: Any, text: Any, score: Any) {
	val idARG =  textConvert("worldSetScoreboardScore", "id", id)
	val textARG =  textConvert("worldSetScoreboardScore", "text", text)
	val scoreARG =  numberConvert("worldSetScoreboardScore", "score", score)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("score"),"value" to scoreARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_scoreboard_score"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetScoreboardTitle(id: Any, title: Any) {
	val idARG =  textConvert("worldSetScoreboardTitle", "id", id)
	val titleARG =  textConvert("worldSetScoreboardTitle", "title", title)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("title"),"value" to titleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_scoreboard_title"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSculkShriekerCanSummon(location: Any, canSummon: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldSetSculkShriekerCanSummon", "canSummon", canSummon, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_sculk_shrieker_can_summon"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSculkShriekerShrieking(location: Any, shrieking: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldSetSculkShriekerShrieking", "shrieking", shrieking, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_sculk_shrieker_shrieking"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSculkShriekerWarningLevel(location: Any, warningLevel: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val warningLevelARG =  numberConvert("worldSetSculkShriekerWarningLevel", "warningLevel", warningLevel)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("warning_level"),"value" to warningLevelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_sculk_shrieker_warning_level"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSignText(location: Any, text: Any, line: Any, side: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val textARG =  textConvert("worldSetSignText", "text", text)
	val lineARG =  numberConvert("worldSetSignText", "line", line)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
enumCheck("worldSetSignText", "side", side, listOf("ALL", "BACK", "FRONT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_sign_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSignTextColor(location: Any, side: Any? = null, signTextColor: Any? = null, glowing: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldSetSignTextColor", "side", side, listOf("ALL", "BACK", "FRONT"))

enumCheck("worldSetSignTextColor", "signTextColor", signTextColor, listOf("BLACK", "BLUE", "BROWN", "CYAN", "GRAY", "GREEN", "LIGHT_BLUE", "LIGHT_GRAY", "LIME", "MAGENTA", "ORANGE", "PINK", "PURPLE", "RED", "WHITE", "YELLOW"))

enumCheck("worldSetSignTextColor", "glowing", glowing, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_sign_text_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSignWaxed(location: Any, waxed: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldSetSignWaxed", "waxed", waxed, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_sign_waxed"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetSpawnerEntity(location: Any, entity: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val entityARG = typeCheck<JItem>(entity)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity"),"value" to entityARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_spawner_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetWorldDifficulty(difficulty: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldSetWorldDifficulty", "difficulty", difficulty, listOf("EASY", "HARD", "NORMAL", "PEACEFUL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_world_difficulty"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetWorldSimulationDistance(distance: Any) {
	val distanceARG =  numberConvert("worldSetWorldSimulationDistance", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_world_simulation_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetWorldTime(time: Any) {
	val timeARG =  numberConvert("worldSetWorldTime", "time", time)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("time"),"value" to timeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_world_time"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSetWorldWeather(weatherDuration: Any, weatherType: Any? = null) {
	val weatherDurationARG =  numberConvert("worldSetWorldWeather", "weatherDuration", weatherDuration)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("weather_duration"),"value" to weatherDurationARG.parse())))
enumCheck("worldSetWorldWeather", "weatherType", weatherType, listOf("CLEAR", "RAINING", "THUNDER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_set_world_weather"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnArmorStand(helmet: Any, chestplate: Any, boots: Any, leggings: Any, rightHand: Any, leftHand: Any, location: Any, customName: Any, gravity: Any? = null, marker: Any? = null, small: Any? = null, showArms: Any? = null, basePlate: Any? = null, invisible: Any? = null) {
	val helmetARG = typeCheck<JItem>(helmet)
	val chestplateARG = typeCheck<JItem>(chestplate)
	val bootsARG = typeCheck<JItem>(boots)
	val leggingsARG = typeCheck<JItem>(leggings)
	val rightHandARG = typeCheck<JItem>(rightHand)
	val leftHandARG = typeCheck<JItem>(leftHand)
	val locationARG = typeCheck<JLocation>(location)
	val customNameARG =  textConvert("worldSpawnArmorStand", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("helmet"),"value" to helmetARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("chestplate"),"value" to chestplateARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("boots"),"value" to bootsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("leggings"),"value" to leggingsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("right_hand"),"value" to rightHandARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("left_hand"),"value" to leftHandARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
enumCheck("worldSpawnArmorStand", "gravity", gravity, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnArmorStand", "marker", marker, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnArmorStand", "small", small, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnArmorStand", "showArms", showArms, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnArmorStand", "basePlate", basePlate, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnArmorStand", "invisible", invisible, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_armor_stand"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnBlockDisplay(spawnLocation: Any, customName: Any, block: Any) {
	val spawnLocationARG = typeCheck<JLocation>(spawnLocation)
	val customNameARG =  textConvert("worldSpawnBlockDisplay", "customName", customName)
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("spawn_location"),"value" to spawnLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_block_display"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnEffectCloud(location: Any, duration: Any, radius: Any, effects: Any, particle: Any, customName: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val durationARG =  numberConvert("worldSpawnEffectCloud", "duration", duration)
	val radiusARG =  numberConvert("worldSpawnEffectCloud", "radius", radius)
	val effectsARG = typeCheck<JPotion>(effects)
	val particleARG = typeCheck<JParticle>(particle)
	val customNameARG =  textConvert("worldSpawnEffectCloud", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("duration"),"value" to durationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("effects"),"value" to effectsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_effect_cloud"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnEndCrystal(location: Any, customName: Any, showBottom: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val customNameARG =  textConvert("worldSpawnEndCrystal", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
enumCheck("worldSpawnEndCrystal", "showBottom", showBottom, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_end_crystal"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnEvokerFangs(location: Any, customName: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val customNameARG =  textConvert("worldSpawnEvokerFangs", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_evoker_fangs"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnExperienceOrb(location: Any, experienceAmount: Any, customName: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val experienceAmountARG =  numberConvert("worldSpawnExperienceOrb", "experienceAmount", experienceAmount)
	val customNameARG =  textConvert("worldSpawnExperienceOrb", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("experience_amount"),"value" to experienceAmountARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_experience_orb"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnEyeOfEnder(location: Any, destination: Any, lifespan: Any, customName: Any, endOfLifespan: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val destinationARG = typeCheck<JLocation>(destination)
	val lifespanARG =  numberConvert("worldSpawnEyeOfEnder", "lifespan", lifespan)
	val customNameARG =  textConvert("worldSpawnEyeOfEnder", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("destination"),"value" to destinationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("lifespan"),"value" to lifespanARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
enumCheck("worldSpawnEyeOfEnder", "endOfLifespan", endOfLifespan, listOf("DROP", "RANDOM", "SHATTER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_eye_of_ender"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnFallingBlock(block: Any, location: Any, name: Any, shouldExpire: Any? = null) {
	val blockARG = typeCheck<JBlock>(block)
	val locationARG = typeCheck<JLocation>(location)
	val nameARG =  textConvert("worldSpawnFallingBlock", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
enumCheck("worldSpawnFallingBlock", "shouldExpire", shouldExpire, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_falling_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnInteractionEntity(location: Any, customName: Any, width: Any, height: Any, responsive: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val customNameARG =  textConvert("worldSpawnInteractionEntity", "customName", customName)
	val widthARG =  numberConvert("worldSpawnInteractionEntity", "width", width)
	val heightARG =  numberConvert("worldSpawnInteractionEntity", "height", height)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("width"),"value" to widthARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("height"),"value" to heightARG.parse())))
enumCheck("worldSpawnInteractionEntity", "responsive", responsive, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_interaction_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnItem(location: Any, item: Any, customName: Any, canMobPickup: Any? = null, canPlayerPickup: Any? = null, applyMotion: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val itemARG = typeCheck<JItem>(item)
	val customNameARG =  textConvert("worldSpawnItem", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
enumCheck("worldSpawnItem", "canMobPickup", canMobPickup, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnItem", "canPlayerPickup", canPlayerPickup, listOf("FALSE", "TRUE"))

enumCheck("worldSpawnItem", "applyMotion", applyMotion, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnItemDisplay(spawnLocation: Any, customName: Any, displayedItem: Any) {
	val spawnLocationARG = typeCheck<JLocation>(spawnLocation)
	val customNameARG =  textConvert("worldSpawnItemDisplay", "customName", customName)
	val displayedItemARG = typeCheck<JItem>(displayedItem)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("spawn_location"),"value" to spawnLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("displayed_item"),"value" to displayedItemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_item_display"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnLightningBolt(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_lightning_bolt"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnMob(mob: Any, location: Any, health: Any, potionEffects: Any, customName: Any, mainHand: Any, helmet: Any, chestplate: Any, leggings: Any, boots: Any, offHand: Any, naturalEquipment: Any? = null) {
	val mobARG = typeCheck<JItem>(mob)
	val locationARG = typeCheck<JLocation>(location)
	val healthARG =  numberConvert("worldSpawnMob", "health", health)
	val potionEffectsARG = typeCheck<JPotion>(potionEffects)
	val customNameARG =  textConvert("worldSpawnMob", "customName", customName)
	val mainHandARG = typeCheck<JItem>(mainHand)
	val helmetARG = typeCheck<JItem>(helmet)
	val chestplateARG = typeCheck<JItem>(chestplate)
	val leggingsARG = typeCheck<JItem>(leggings)
	val bootsARG = typeCheck<JItem>(boots)
	val offHandARG = typeCheck<JItem>(offHand)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("mob"),"value" to mobARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("health"),"value" to healthARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion_effects"),"value" to potionEffectsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("main_hand"),"value" to mainHandARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("helmet"),"value" to helmetARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("chestplate"),"value" to chestplateARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("leggings"),"value" to leggingsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("boots"),"value" to bootsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("off_hand"),"value" to offHandARG.parse())))
enumCheck("worldSpawnMob", "naturalEquipment", naturalEquipment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_mob"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnPrimedTnt(location: Any, tntPower: Any, fuseDuration: Any, customName: Any, block: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val tntPowerARG =  numberConvert("worldSpawnPrimedTnt", "tntPower", tntPower)
	val fuseDurationARG =  numberConvert("worldSpawnPrimedTnt", "fuseDuration", fuseDuration)
	val customNameARG =  textConvert("worldSpawnPrimedTnt", "customName", customName)
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tnt_power"),"value" to tntPowerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("fuse_duration"),"value" to fuseDurationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_primed_tnt"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnShulkerBullet(location: Any, customName: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val customNameARG =  textConvert("worldSpawnShulkerBullet", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_shulker_bullet"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnTextDisplay(spawnLocation: Any, displayedText: Any, customName: Any, mergingMode: Any? = null) {
	val spawnLocationARG = typeCheck<JLocation>(spawnLocation)
	val displayedTextARG =  textConvert("worldSpawnTextDisplay", "displayedText", displayedText)
	val customNameARG =  textConvert("worldSpawnTextDisplay", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("spawn_location"),"value" to spawnLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("displayed_text"),"value" to displayedTextARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
enumCheck("worldSpawnTextDisplay", "mergingMode", mergingMode, listOf("CONCATENATION", "SEPARATE_LINES", "SPACES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_text_display"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSpawnVehicle(vehicle: Any, location: Any, customName: Any) {
	val vehicleARG = typeCheck<JItem>(vehicle)
	val locationARG = typeCheck<JLocation>(location)
	val customNameARG =  textConvert("worldSpawnVehicle", "customName", customName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vehicle"),"value" to vehicleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("custom_name"),"value" to customNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_spawn_vehicle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldUncancelEvent() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_uncancel_event"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldUpdateBlock(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("game_update_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityCollidesAtLocation(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_collides_at_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityCollidesUsingHitbox(min: Any, max: Any) {
	val minARG = typeCheck<JLocation>(min)
	val maxARG = typeCheck<JLocation>(max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_collides_using_hitbox"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityCollidesWithEntity(nameOrUuid: Any, checkType: Any? = null) {
	val nameOrUuidARG =  textConvert("entityCollidesWithEntity", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("entityCollidesWithEntity", "checkType", checkType, listOf("CONTAINS", "OVERLAPS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_collides_with_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityExists() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_exists"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityHasCustomTag(tag: Any, tagValue: Any, compareType: Any? = null) {
	val tagARG =  textConvert("entityHasCustomTag", "tag", tag)
	val tagValueARG =  textConvert("entityHasCustomTag", "tagValue", tagValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag"),"value" to tagARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_value"),"value" to tagValueARG.parse())))
enumCheck("entityHasCustomTag", "compareType", compareType, listOf("CONTAINS", "ENDS_WITH", "EQUALS", "STARTS_WITH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_has_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityHasPotionEffect(potions: Any, checkMode: Any? = null) {
	val potionsARG = typeCheck<JPotion>(potions)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potions"),"value" to potionsARG.parse())))
enumCheck("entityHasPotionEffect", "checkMode", checkMode, listOf("ALL", "ANY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_has_potion_effect"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityInArea(location1: Any, location2: Any, ignoreYAxis: Any? = null, intersectType: Any? = null, checkType: Any? = null) {
	val location1ARG = typeCheck<JLocation>(location1)
	val location2ARG = typeCheck<JLocation>(location2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_1"),"value" to location1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_2"),"value" to location2ARG.parse())))
enumCheck("entityInArea", "ignoreYAxis", ignoreYAxis, listOf("FALSE", "TRUE"))

enumCheck("entityInArea", "intersectType", intersectType, listOf("HITBOX", "POINT"))

enumCheck("entityInArea", "checkType", checkType, listOf("CONTAINS", "OVERLAPS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_in_area"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsDisguised() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_disguised"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsGrounded() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_grounded"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsItem() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsMob() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_mob"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsNearLocation(range: Any, location: Any, ignoreYAxis: Any? = null) {
	val rangeARG =  numberConvert("entityIsNearLocation", "range", range)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("range"),"value" to rangeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("entityIsNearLocation", "ignoreYAxis", ignoreYAxis, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_near_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsProjectile() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_projectile"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsRidingEntity(entityIds: Any, compareMode: Any? = null) {
	val entityIdsARG =  textConvert("entityIsRidingEntity", "entityIds", entityIds)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity_ids"),"value" to entityIdsARG.parse())))
enumCheck("entityIsRidingEntity", "compareMode", compareMode, listOf("FARTHEST", "NAME_OR_UUID", "NEAREST", "TYPE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_riding_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsStandingOnBlock(blocks: Any, locations: Any, onlySolid: Any? = null) {
	val blocksARG = typeCheck<JBlock>(blocks)
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blocks"),"value" to blocksARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
enumCheck("entityIsStandingOnBlock", "onlySolid", onlySolid, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_standing_on_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsType(entityTypes: Any) {
	val entityTypesARG = typeCheck<JItem>(entityTypes)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity_types"),"value" to entityTypesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityIsVehicle() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_is_vehicle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entityNameEquals(namesOrUuids: Any) {
	val namesOrUuidsARG =  textConvert("entityNameEquals", "namesOrUuids", namesOrUuids)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("names_or_uuids"),"value" to namesOrUuidsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_name_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun entitySpawnReasonEquals(reason: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("entitySpawnReasonEquals", "reason", reason, listOf("BEEHIVE", "BREEDING", "BUILD_IRONGOLEM", "BUILD_SNOWMAN", "BUILD_WITHER", "COMMAND", "CURED", "CUSTOM", "DEFAULT", "DISPENSE_EGG", "DROWNED", "EGG", "ENDER_PEARL", "EXPLOSION", "FROZEN", "INFECTION", "JOCKEY", "LIGHTNING", "MOUNT", "NATURAL", "NETHER_PORTAL", "OCELOT_BABY", "PATROL", "PIGLIN_ZOMBIFIED", "RAID", "REINFORCEMENTS", "SHEARED", "SHOULDER_ENTITY", "SILVERFISH_BLOCK", "SLIME_SPLIT", "SPAWNER", "SPAWNER_EGG", "TRAP", "VILLAGER_DEFENSE", "VILLAGE_INVASION"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_entity_spawn_reason_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldBlockEquals(blocks: Any, location: Any) {
	val blocksARG = typeCheck<JBlock>(blocks)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blocks"),"value" to blocksARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_block_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldBlockPowered(locations: Any, powerMode: Any? = null) {
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
enumCheck("worldBlockPowered", "powerMode", powerMode, listOf("DIRECT", "INDIRECT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_block_powered"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldChunkIsLoaded(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_chunk_is_loaded"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldContainerHas(items: Any, location: Any, checkMode: Any? = null, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldContainerHas", "checkMode", checkMode, listOf("ALL", "ANY"))

enumCheck("worldContainerHas", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_container_has"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldContainerHasRoomForItem(items: Any, location: Any, checkMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("worldContainerHasRoomForItem", "checkMode", checkMode, listOf("ALL", "ANY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_container_has_room_for_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldDamageCauseEquals(cause: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldDamageCauseEquals", "cause", cause, listOf("BLOCK_EXPLOSION", "CONTACT", "CRAMMING", "CUSTOM", "DRAGON_BREATH", "DROWNING", "DRYOUT", "ENTITY_ATTACK", "ENTITY_EXPLOSION", "ENTITY_SWEEP_ATTACK", "FALL", "FALLING_BLOCK", "FIRE", "FIRE_TICK", "FLY_INTO_WALL", "FREEZE", "HOT_FLOOR", "KILL", "LAVA", "LIGHTNING", "MAGIC", "MELTING", "POISON", "PROJECTILE", "SONIC_BOOM", "STARVATION", "SUFFOCATION", "SUICIDE", "THORNS", "VOID", "WITHER", "WORLD_BORDER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_damage_cause_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldEventAttackIsCritical() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_event_attack_is_critical"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldEventBlockEquals(blocks: Any, locations: Any) {
	val blocksARG = typeCheck<JBlock>(blocks)
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blocks"),"value" to blocksARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_event_block_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldEventIsCanceled() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_event_is_canceled"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldEventItemEquals(items: Any, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("worldEventItemEquals", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_event_item_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldHasPlayer(namesOrUuids: Any) {
	val namesOrUuidsARG =  textConvert("worldHasPlayer", "namesOrUuids", namesOrUuids)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("names_or_uuids"),"value" to namesOrUuidsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_has_player"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldHealCauseEquals(healCause: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldHealCauseEquals", "healCause", healCause, listOf("CUSTOM", "EATING", "ENDER_CRYSTAL", "MAGIC", "MAGIC_REGEN", "REGEN", "SATIATED", "WITHER", "WITHER_SPAWN"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_heal_cause_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldIgniteCauseEquals(cause: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldIgniteCauseEquals", "cause", cause, listOf("ARROW", "ENDER_CRYSTAL", "EXPLOSION", "FALL", "FIREBALL", "FLINT_AND_STEEL", "LAVA", "LIGHTNING", "SPREAD", "SUFFOCATION"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_ignite_cause_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldInstrumentEquals(instrument: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("worldInstrumentEquals", "instrument", instrument, listOf("BANJO", "BASS_DRUM", "BASS_GUITAR", "BELL", "BIT", "CHIME", "COW_BELL", "CREEPER", "CUSTOM_HEAD", "DIDGERIDOO", "DRAGON", "FLUTE", "GUITAR", "IRON_XYLOPHONE", "PIANO", "PIGLIN", "PLING", "SKELETON", "SNARE_DRUM", "STICKS", "WITHER_SKELETON", "XYLOPHONE", "ZOMBIE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_instrument_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun worldSignContains(location: Any, texts: Any, checkSide: Any? = null, checkMode: Any? = null, lines: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val textsARG =  textConvert("worldSignContains", "texts", texts)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("texts"),"value" to textsARG.parse())))
enumCheck("worldSignContains", "checkSide", checkSide, listOf("ANY", "BACK", "FRONT"))

enumCheck("worldSignContains", "checkMode", checkMode, listOf("ALL", "ANY", "CONTAINS", "EQUALS"))

enumCheck("worldSignContains", "lines", lines, listOf("ALL", "ANY", "FIRST", "FOURTH", "SECOND", "THIRD"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_game_sign_contains"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerChatColorsEnabled() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_chat_colors_enabled"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerChatMessageEquals(chatMessages: Any) {
	val chatMessagesARG =  textConvert("playerChatMessageEquals", "chatMessages", chatMessages)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("chat_messages"),"value" to chatMessagesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_chat_message_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerCollidesAtLocation(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_collides_at_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerCollidesUsingHitbox(min: Any, max: Any) {
	val minARG = typeCheck<JLocation>(min)
	val maxARG = typeCheck<JLocation>(max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_collides_using_hitbox"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerCollidesWithEntity(nameOrUuid: Any, checkType: Any? = null) {
	val nameOrUuidARG =  textConvert("playerCollidesWithEntity", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("playerCollidesWithEntity", "checkType", checkType, listOf("CONTAINS", "OVERLAPS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_collides_with_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerCursorItemEquals(items: Any, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerCursorItemEquals", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_cursor_item_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerGamemodeEquals(gamemode: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerGamemodeEquals", "gamemode", gamemode, listOf("ADVENTURE", "CREATIVE", "SPECTATOR", "SURVIVAL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_gamemode_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHasItem(items: Any, checkMode: Any? = null, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerHasItem", "checkMode", checkMode, listOf("ALL", "ANY"))

enumCheck("playerHasItem", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_has_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHasItemAtLeast(item: Any, count: Any, comparisonMode: Any? = null) {
	val itemARG = typeCheck<JItem>(item)
	val countARG =  numberConvert("playerHasItemAtLeast", "count", count)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("count"),"value" to countARG.parse())))
enumCheck("playerHasItemAtLeast", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_has_item_at_least"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHasItemInSlot(slots: Any, items: Any, comparisonMode: Any? = null) {
	val slotsARG =  numberConvert("playerHasItemInSlot", "slots", slots)
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slots"),"value" to slotsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerHasItemInSlot", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_has_item_in_slot"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHasPotionEffect(potions: Any, checkMode: Any? = null) {
	val potionsARG = typeCheck<JPotion>(potions)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potions"),"value" to potionsARG.parse())))
enumCheck("playerHasPotionEffect", "checkMode", checkMode, listOf("ALL", "ANY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_has_potion_effect"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHasPrivilege(privilege: Any? = null, exact: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerHasPrivilege", "privilege", privilege, listOf("BUILDER", "BUILDER_AND_DEVELOPER", "DEVELOPER", "OWNER", "WHITELISTED"))

enumCheck("playerHasPrivilege", "exact", exact, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_has_privilege"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHasRoomForItem(items: Any, checkedSlots: Any? = null, checkMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerHasRoomForItem", "checkedSlots", checkedSlots, listOf("ARMOR", "ENTIRE_INVENTORY", "HOTBAR", "MAIN_INVENTORY", "UPPER_INVENTORY"))

enumCheck("playerHasRoomForItem", "checkMode", checkMode, listOf("ALL", "ANY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_has_room_for_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHotbarSlotEquals(slot: Any) {
	val slotARG =  numberConvert("playerHotbarSlotEquals", "slot", slot)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slot"),"value" to slotARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_hotbar_slot_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerInArea(location1: Any, location2: Any, ignoreYAxis: Any? = null, intersectType: Any? = null, checkType: Any? = null) {
	val location1ARG = typeCheck<JLocation>(location1)
	val location2ARG = typeCheck<JLocation>(location2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_1"),"value" to location1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_2"),"value" to location2ARG.parse())))
enumCheck("playerInArea", "ignoreYAxis", ignoreYAxis, listOf("FALSE", "TRUE"))

enumCheck("playerInArea", "intersectType", intersectType, listOf("HITBOX", "POINT"))

enumCheck("playerInArea", "checkType", checkType, listOf("CONTAINS", "OVERLAPS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_in_area"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerInventoryMenuSlotEquals(slots: Any, items: Any, comparisonMode: Any? = null) {
	val slotsARG =  numberConvert("playerInventoryMenuSlotEquals", "slots", slots)
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slots"),"value" to slotsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerInventoryMenuSlotEquals", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_inventory_menu_slot_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerInventoryTypeOpen(inventoryType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerInventoryTypeOpen", "inventoryType", inventoryType, listOf("ANVIL", "BARREL", "BEACON", "BLAST_FURNACE", "BREWING", "CARTOGRAPHY", "CHEST", "CHISELED_BOOKSHELF", "COMPOSTER", "CRAFTER", "CRAFTING", "CREATIVE", "DECORATED_POT", "DISPENSER", "DROPPER", "ENCHANTING", "ENDER_CHEST", "FURNACE", "GRINDSTONE", "HOPPER", "JUKEBOX", "LECTERN", "LOOM", "MERCHANT", "PLAYER", "SHULKER_BOX", "SMITHING", "SMITHING_NEW", "SMOKER", "STONECUTTER", "WORKBENCH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_inventory_type_open"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsAllowServerListing() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_allow_server_listing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsBlocking() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_blocking"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsDisguised() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_disguised"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsFlying() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_flying"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsGliding() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_gliding"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHolding(items: Any, handSlot: Any? = null, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerHolding", "handSlot", handSlot, listOf("EITHER_HAND", "MAIN_HAND", "OFF_HAND"))

enumCheck("playerHolding", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_holding"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsLookingAtBlock(blocks: Any, locations: Any, distance: Any, fluidMode: Any? = null) {
	val blocksARG = typeCheck<JBlock>(blocks)
	val locationsARG = typeCheck<JLocation>(locations)
	val distanceARG =  numberConvert("playerIsLookingAtBlock", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blocks"),"value" to blocksARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
enumCheck("playerIsLookingAtBlock", "fluidMode", fluidMode, listOf("ALWAYS", "NEVER", "SOURCE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_looking_at_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsNear(range: Any, location: Any, ignoreYAxis: Any? = null) {
	val rangeARG =  numberConvert("playerIsNear", "range", range)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("range"),"value" to rangeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("playerIsNear", "ignoreYAxis", ignoreYAxis, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_near"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsOnGround() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_on_ground"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsOnlineMode() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_online_mode"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsRidingEntity(entityIds: Any, compareMode: Any? = null) {
	val entityIdsARG =  textConvert("playerIsRidingEntity", "entityIds", entityIds)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity_ids"),"value" to entityIdsARG.parse())))
enumCheck("playerIsRidingEntity", "compareMode", compareMode, listOf("FARTHEST", "NAME_OR_UUID", "NEAREST", "TYPE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_riding_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsSelfDisguised() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_self_disguised"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsSleeping() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_sleeping"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsSneaking() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_sneaking"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsSprinting() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_sprinting"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsStandingOnBlock(blocks: Any, locations: Any, onlySolid: Any? = null) {
	val blocksARG = typeCheck<JBlock>(blocks)
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blocks"),"value" to blocksARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
enumCheck("playerIsStandingOnBlock", "onlySolid", onlySolid, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_standing_on_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsSwimming() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_swimming"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsUsingItem(items: Any, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerIsUsingItem", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_using_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerIsWearingItem(items: Any, checkMode: Any? = null, comparisonMode: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerIsWearingItem", "checkMode", checkMode, listOf("ALL", "ANY"))

enumCheck("playerIsWearingItem", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_is_wearing_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerItemIsNotOnCooldown(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_item_is_not_on_cooldown"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerNameEquals(namesOrUuids: Any) {
	val namesOrUuidsARG =  textConvert("playerNameEquals", "namesOrUuids", namesOrUuids)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("names_or_uuids"),"value" to namesOrUuidsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_name_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerTextFilteringEnabled() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_player_text_filtering_enabled"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableEquals(value: Any, compare: Any) {
	val valueARG = typeCheck<JAny>(value)
	val compareARG = typeCheck<JAny>(compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableExists(variable: Any) {
	val variableARG = typeCheck<Var>(variable)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_exists"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGreater(value: Any, compare: Any) {
	val valueARG =  numberConvert("variableGreater", "value", value)
	val compareARG =  numberConvert("variableGreater", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_greater"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGreaterOrEquals(value: Any, compare: Any) {
	val valueARG =  numberConvert("variableGreaterOrEquals", "value", value)
	val compareARG =  numberConvert("variableGreaterOrEquals", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_greater_or_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableInRange(value: Any, min: Any, max: Any) {
	val valueARG = typeCheck<JAny>(value)
	val minARG = typeCheck<JAny>(min)
	val maxARG = typeCheck<JAny>(max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_in_range"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableIsType(value: Any, variableType: Any? = null) {
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableIsType", "variableType", variableType, listOf("ARRAY", "ITEM", "LOCATION", "MAP", "NUMBER", "PARTICLE", "POTION", "SOUND", "TEXT", "VECTOR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_is_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableItemEquals(value: Any, compare: Any, comparisonMode: Any? = null) {
	val valueARG = typeCheck<JItem>(value)
	val compareARG = typeCheck<JItem>(compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
enumCheck("variableItemEquals", "comparisonMode", comparisonMode, listOf("EXACTLY", "IGNORE_DURABILITY_AND_STACK_SIZE", "IGNORE_STACK_SIZE", "TYPE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_item_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableItemHasEnchantment(item: Any, enchant: Any, level: Any) {
	val itemARG = typeCheck<JItem>(item)
	val enchantARG =  textConvert("variableItemHasEnchantment", "enchant", enchant)
	val levelARG =  numberConvert("variableItemHasEnchantment", "level", level)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("enchant"),"value" to enchantARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("level"),"value" to levelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_item_has_enchantment"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableItemHasTag(item: Any, tag: Any, value: Any, compareType: Any? = null) {
	val itemARG = typeCheck<JItem>(item)
	val tagARG =  textConvert("variableItemHasTag", "tag", tag)
	val valueARG =  textConvert("variableItemHasTag", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag"),"value" to tagARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableItemHasTag", "compareType", compareType, listOf("CONTAINS", "ENDS_WITH", "EQUALS", "STARTS_WITH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_item_has_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLess(value: Any, compare: Any) {
	val valueARG =  numberConvert("variableLess", "value", value)
	val compareARG =  numberConvert("variableLess", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_less"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLessOrEquals(value: Any, compare: Any) {
	val valueARG =  numberConvert("variableLessOrEquals", "value", value)
	val compareARG =  numberConvert("variableLessOrEquals", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_less_or_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableListContainsValue(list: Any, values: Any, checkMode: Any? = null) {
	val listARG = typeCheck<JArray>(list)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
enumCheck("variableListContainsValue", "checkMode", checkMode, listOf("ALL", "ANY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_list_contains_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableListIsEmpty(list: Any) {
	val listARG = typeCheck<JAny>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_list_is_empty"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableListValueEquals(list: Any, index: Any, values: Any) {
	val listARG = typeCheck<JArray>(list)
	val indexARG =  numberConvert("variableListValueEquals", "index", index)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index"),"value" to indexARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_list_value_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLocationInRange(value: Any, min: Any, max: Any, borderHandling: Any? = null) {
	val valueARG = typeCheck<JLocation>(value)
	val minARG = typeCheck<JLocation>(min)
	val maxARG = typeCheck<JLocation>(max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
enumCheck("variableLocationInRange", "borderHandling", borderHandling, listOf("BLOCK", "EXACT", "FULL_BLOCK_RANGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_location_in_range"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLocationIsNear(location: Any, radius: Any, check: Any, shape: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val radiusARG =  numberConvert("variableLocationIsNear", "radius", radius)
	val checkARG = typeCheck<JLocation>(check)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("check"),"value" to checkARG.parse())))
enumCheck("variableLocationIsNear", "shape", shape, listOf("CIRCLE", "CUBE", "SPHERE", "SQUARE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_location_is_near"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMapHasKey(map: Any, key: Any) {
	val mapARG = typeCheck<JMap>(map)
	val keyARG = typeCheck<JAny>(key)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_map_has_key"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMapValueEquals(map: Any, key: Any, values: Any) {
	val mapARG = typeCheck<JMap>(map)
	val keyARG = typeCheck<JAny>(key)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_map_value_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableNotEquals(value: Any, compare: Any) {
	val valueARG = typeCheck<JAny>(value)
	val compareARG = typeCheck<JAny>(compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_not_equals"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRangeIntersectsRange(min1: Any, max1: Any, min2: Any, max2: Any, checkType: Any? = null) {
	val min1ARG = typeCheck<JLocation>(min1)
	val max1ARG = typeCheck<JLocation>(max1)
	val min2ARG = typeCheck<JLocation>(min2)
	val max2ARG = typeCheck<JLocation>(max2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min1"),"value" to min1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max1"),"value" to max1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min2"),"value" to min2ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max2"),"value" to max2ARG.parse())))
enumCheck("variableRangeIntersectsRange", "checkType", checkType, listOf("CONTAINS", "OVERLAPS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_range_intersects_range"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTextContains(value: Any, compare: Any, ignoreCase: Any? = null) {
	val valueARG =  textConvert("variableTextContains", "value", value)
	val compareARG =  textConvert("variableTextContains", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
enumCheck("variableTextContains", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_text_contains"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTextEndsWith(value: Any, compare: Any, ignoreCase: Any? = null) {
	val valueARG =  textConvert("variableTextEndsWith", "value", value)
	val compareARG =  textConvert("variableTextEndsWith", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
enumCheck("variableTextEndsWith", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_text_ends_with"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTextMatches(match: Any, values: Any, regularExpressions: Any? = null, ignoreCase: Any? = null) {
	val matchARG =  textConvert("variableTextMatches", "match", match)
	val valuesARG =  textConvert("variableTextMatches", "values", values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("match"),"value" to matchARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
enumCheck("variableTextMatches", "regularExpressions", regularExpressions, listOf("FALSE", "TRUE"))

enumCheck("variableTextMatches", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_text_matches"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTextStartsWith(value: Any, compare: Any, ignoreCase: Any? = null) {
	val valueARG =  textConvert("variableTextStartsWith", "value", value)
	val compareARG =  textConvert("variableTextStartsWith", "compare", compare)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("compare"),"value" to compareARG.parse())))
enumCheck("variableTextStartsWith", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("if_variable_text_starts_with"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerAddInventoryMenuRow(items: Any, position: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
enumCheck("playerAddInventoryMenuRow", "position", position, listOf("BUTTON", "TOP"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_add_inventory_menu_row"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerAllowPlacingBreakingBlocks(blocks: Any, allow: Any? = null) {
	val blocksARG = typeCheck<JBlock>(blocks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blocks"),"value" to blocksARG.parse())))
enumCheck("playerAllowPlacingBreakingBlocks", "allow", allow, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_allow_placing_breaking_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerBoostElytra(firework: Any) {
	val fireworkARG = typeCheck<JItem>(firework)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("firework"),"value" to fireworkARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_boost_elytra"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerClearChat() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_clear_chat"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerClearDebugMarkers() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_clear_debug_markers"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerClearEnderChestContents() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_clear_ender_chest_contents"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerClearInventory(clearMode: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerClearInventory", "clearMode", clearMode, listOf("ARMOR", "ENTIRE", "HOTBAR", "MAIN", "UPPER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_clear_inventory"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerClearItems(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_clear_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerClearPotionEffects() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_clear_potion_effects"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerCloseInventory() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_close_inventory"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDamage(damage: Any, source: Any) {
	val damageARG =  numberConvert("playerDamage", "damage", damage)
	val sourceARG =  textConvert("playerDamage", "source", source)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("damage"),"value" to damageARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("source"),"value" to sourceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_damage"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisguiseAsBlock(block: Any, visibleToSelf: Any? = null) {
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
enumCheck("playerDisguiseAsBlock", "visibleToSelf", visibleToSelf, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_disguise_as_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisguiseAsEntity(entityType: Any, visibleToSelf: Any? = null) {
	val entityTypeARG = typeCheck<JItem>(entityType)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity_type"),"value" to entityTypeARG.parse())))
enumCheck("playerDisguiseAsEntity", "visibleToSelf", visibleToSelf, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_disguise_as_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisguiseAsItem(item: Any, visibleToSelf: Any? = null) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("playerDisguiseAsItem", "visibleToSelf", visibleToSelf, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_disguise_as_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayBellRing(location: Any, direction: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("playerDisplayBellRing", "direction", direction, listOf("DOWN", "EAST", "NORTH", "SOUTH", "WEST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_bell_ring"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayBlock(location: Any, block: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayEndGatewayBeam(location: Any, color: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("playerDisplayEndGatewayBeam", "color", color, listOf("DARK_PURPLE", "LIGHT_PURPLE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_end_gateway_beam"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayHologram(location: Any, text: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val textARG =  textConvert("playerDisplayHologram", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_hologram"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayLightning(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_lightning"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticle(particle: Any, location: Any) {
	val particleARG = typeCheck<JParticle>(particle)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticleCircle(particle: Any, center: Any, radius: Any, points: Any, startAngle: Any, perpendicular: Any, angleUnit: Any? = null) {
	val particleARG = typeCheck<JParticle>(particle)
	val centerARG = typeCheck<JLocation>(center)
	val radiusARG =  numberConvert("playerDisplayParticleCircle", "radius", radius)
	val pointsARG =  numberConvert("playerDisplayParticleCircle", "points", points)
	val startAngleARG =  numberConvert("playerDisplayParticleCircle", "startAngle", startAngle)
	val perpendicularARG = typeCheck<JVector>(perpendicular)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("center"),"value" to centerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("points"),"value" to pointsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start_angle"),"value" to startAngleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("perpendicular"),"value" to perpendicularARG.parse())))
enumCheck("playerDisplayParticleCircle", "angleUnit", angleUnit, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle_circle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticleCube(particle: Any, firstCorner: Any, secondCorner: Any, spacing: Any, type: Any? = null) {
	val particleARG = typeCheck<JParticle>(particle)
	val firstCornerARG = typeCheck<JLocation>(firstCorner)
	val secondCornerARG = typeCheck<JLocation>(secondCorner)
	val spacingARG =  numberConvert("playerDisplayParticleCube", "spacing", spacing)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("first_corner"),"value" to firstCornerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("second_corner"),"value" to secondCornerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("spacing"),"value" to spacingARG.parse())))
enumCheck("playerDisplayParticleCube", "type", type, listOf("HOLLOW", "SOLID", "WIREFRAME"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle_cube"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticleLine(particle: Any, start: Any, end: Any, divider: Any, unitOfMeasurement: Any? = null) {
	val particleARG = typeCheck<JParticle>(particle)
	val startARG = typeCheck<JLocation>(start)
	val endARG = typeCheck<JLocation>(end)
	val dividerARG =  numberConvert("playerDisplayParticleLine", "divider", divider)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("end"),"value" to endARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("divider"),"value" to dividerARG.parse())))
enumCheck("playerDisplayParticleLine", "unitOfMeasurement", unitOfMeasurement, listOf("DISTANCE", "POINTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle_line"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticleRay(particle: Any, start: Any, ray: Any, divider: Any, unitOfMeasurement: Any? = null) {
	val particleARG = typeCheck<JParticle>(particle)
	val startARG = typeCheck<JLocation>(start)
	val rayARG = typeCheck<JVector>(ray)
	val dividerARG =  numberConvert("playerDisplayParticleRay", "divider", divider)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ray"),"value" to rayARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("divider"),"value" to dividerARG.parse())))
enumCheck("playerDisplayParticleRay", "unitOfMeasurement", unitOfMeasurement, listOf("DISTANCE", "POINTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle_ray"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticleSphere(particle: Any, center: Any, radius: Any, points: Any) {
	val particleARG = typeCheck<JParticle>(particle)
	val centerARG = typeCheck<JLocation>(center)
	val radiusARG =  numberConvert("playerDisplayParticleSphere", "radius", radius)
	val pointsARG =  numberConvert("playerDisplayParticleSphere", "points", points)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("center"),"value" to centerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("points"),"value" to pointsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle_sphere"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayParticleSpiral(particle: Any, center: Any, distance: Any, radius: Any, points: Any, rotations: Any, startAngle: Any, angleUnit: Any? = null) {
	val particleARG = typeCheck<JParticle>(particle)
	val centerARG = typeCheck<JLocation>(center)
	val distanceARG =  numberConvert("playerDisplayParticleSpiral", "distance", distance)
	val radiusARG =  numberConvert("playerDisplayParticleSpiral", "radius", radius)
	val pointsARG =  numberConvert("playerDisplayParticleSpiral", "points", points)
	val rotationsARG =  numberConvert("playerDisplayParticleSpiral", "rotations", rotations)
	val startAngleARG =  numberConvert("playerDisplayParticleSpiral", "startAngle", startAngle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("center"),"value" to centerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("points"),"value" to pointsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("rotations"),"value" to rotationsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start_angle"),"value" to startAngleARG.parse())))
enumCheck("playerDisplayParticleSpiral", "angleUnit", angleUnit, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_particle_spiral"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayPickUpAnimation(collectedNameOrUuid: Any, collectorNameOrUuid: Any, amount: Any) {
	val collectedNameOrUuidARG =  textConvert("playerDisplayPickUpAnimation", "collectedNameOrUuid", collectedNameOrUuid)
	val collectorNameOrUuidARG =  textConvert("playerDisplayPickUpAnimation", "collectorNameOrUuid", collectorNameOrUuid)
	val amountARG =  numberConvert("playerDisplayPickUpAnimation", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("collected_name_or_uuid"),"value" to collectedNameOrUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("collector_name_or_uuid"),"value" to collectorNameOrUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_pick_up_animation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplaySignText(location: Any, line1: Any, line2: Any, line3: Any, line4: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val line1ARG =  textConvert("playerDisplaySignText", "line1", line1)
	val line2ARG =  textConvert("playerDisplaySignText", "line2", line2)
	val line3ARG =  textConvert("playerDisplaySignText", "line3", line3)
	val line4ARG =  textConvert("playerDisplaySignText", "line4", line4)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line_1"),"value" to line1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line_2"),"value" to line2ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line_3"),"value" to line3ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line_4"),"value" to line4ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_sign_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerDisplayVibration(from: Any, to: Any, destinationTime: Any) {
	val fromARG = typeCheck<JLocation>(from)
	val toARG = typeCheck<JLocation>(to)
	val destinationTimeARG =  numberConvert("playerDisplayVibration", "destinationTime", destinationTime)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("from"),"value" to fromARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("to"),"value" to toARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("destination_time"),"value" to destinationTimeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_display_vibration"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerExpandInventoryMenu(items: Any, size: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val sizeARG =  numberConvert("playerExpandInventoryMenu", "size", size)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_expand_inventory_menu"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerFaceLocation(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_face_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerForceFlightMode(isFlying: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerForceFlightMode", "isFlying", isFlying, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_force_flight_mode"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerGiveExperience(experience: Any, mode: Any? = null) {
	val experienceARG =  numberConvert("playerGiveExperience", "experience", experience)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("experience"),"value" to experienceARG.parse())))
enumCheck("playerGiveExperience", "mode", mode, listOf("LEVEL", "LEVEL_PERCENTAGE", "POINTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_give_experience"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerGiveItems(items: Any, amount: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val amountARG =  numberConvert("playerGiveItems", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_give_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerGivePotionEffect(potions: Any, showIcon: Any? = null, overwrite: Any? = null, particleMode: Any? = null) {
	val potionsARG = typeCheck<JPotion>(potions)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potions"),"value" to potionsARG.parse())))
enumCheck("playerGivePotionEffect", "showIcon", showIcon, listOf("FALSE", "TRUE"))

enumCheck("playerGivePotionEffect", "overwrite", overwrite, listOf("FALSE", "TRUE"))

enumCheck("playerGivePotionEffect", "particleMode", particleMode, listOf("AMBIENT", "NONE", "REGULAR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_give_potion_effect"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerGiveRandomItem(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_give_random_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHeal(heal: Any) {
	val healARG =  numberConvert("playerHeal", "heal", heal)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("heal"),"value" to healARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_heal"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHideEntity(nameOrUuid: Any, hide: Any? = null) {
	val nameOrUuidARG =  textConvert("playerHideEntity", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("playerHideEntity", "hide", hide, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_hide_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerHideScoreboard() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_hide_scoreboard"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerKick() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_kick"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerLaunchForward(power: Any, increment: Any? = null, launchAxis: Any? = null) {
	val powerARG =  numberConvert("playerLaunchForward", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
enumCheck("playerLaunchForward", "increment", increment, listOf("FALSE", "TRUE"))

enumCheck("playerLaunchForward", "launchAxis", launchAxis, listOf("YAW", "YAW_AND_PITCH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_launch_forward"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerLaunchProjectile(projectile: Any, location: Any, name: Any, speed: Any, inaccuracy: Any, trail: Any) {
	val projectileARG = typeCheck<JItem>(projectile)
	val locationARG = typeCheck<JLocation>(location)
	val nameARG =  textConvert("playerLaunchProjectile", "name", name)
	val speedARG =  numberConvert("playerLaunchProjectile", "speed", speed)
	val inaccuracyARG =  numberConvert("playerLaunchProjectile", "inaccuracy", inaccuracy)
	val trailARG = typeCheck<JParticle>(trail)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("projectile"),"value" to projectileARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("speed"),"value" to speedARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("inaccuracy"),"value" to inaccuracyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("trail"),"value" to trailARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_launch_projectile"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerLaunchToLocation(location: Any, power: Any, increment: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val powerARG =  numberConvert("playerLaunchToLocation", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
enumCheck("playerLaunchToLocation", "increment", increment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_launch_to_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerLaunchUp(power: Any, increment: Any? = null) {
	val powerARG =  numberConvert("playerLaunchUp", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
enumCheck("playerLaunchUp", "increment", increment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_launch_up"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerLeaveVehicle() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_leave_vehicle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerLoadInventory() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_load_inventory"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerOpenBook(book: Any) {
	val bookARG = typeCheck<JItem>(book)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("book"),"value" to bookARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_open_book"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerOpenContainerInventory(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_open_container_inventory"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerPlayAnimationAction(animation: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerPlayAnimationAction", "animation", animation, listOf("DAMAGE", "JUMPSCARE", "TOTEM", "WAKE_UP"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_play_animation_action"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerPlayHurtAnimation(yaw: Any) {
	val yawARG =  numberConvert("playerPlayHurtAnimation", "yaw", yaw)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_play_hurt_animation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerPlaySound(sound: Any, location: Any) {
	val soundARG = typeCheck<JSound>(sound)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_play_sound"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerPlaySoundFromEntity(nameOrUuid: Any, sounds: Any) {
	val nameOrUuidARG =  textConvert("playerPlaySoundFromEntity", "nameOrUuid", nameOrUuid)
	val soundsARG = typeCheck<JSound>(sounds)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sounds"),"value" to soundsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_play_sound_from_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerPlaySoundSequence(sounds: Any, location: Any, delay: Any) {
	val soundsARG = typeCheck<JSound>(sounds)
	val locationARG = typeCheck<JLocation>(location)
	val delayARG =  numberConvert("playerPlaySoundSequence", "delay", delay)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sounds"),"value" to soundsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("delay"),"value" to delayARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_play_sound_sequence"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRandomizedTeleport(locations: Any, keepRotation: Any? = null, keepVelocity: Any? = null, dismount: Any? = null) {
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
enumCheck("playerRandomizedTeleport", "keepRotation", keepRotation, listOf("FALSE", "TRUE"))

enumCheck("playerRandomizedTeleport", "keepVelocity", keepVelocity, listOf("FALSE", "TRUE"))

enumCheck("playerRandomizedTeleport", "dismount", dismount, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_randomized_teleport"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRedirectWorld(worldId: Any) {
	val worldIdARG =  textConvert("playerRedirectWorld", "worldId", worldId)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("world_id"),"value" to worldIdARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_redirect_world"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveBossBar(id: Any) {
	val idARG =  textConvert("playerRemoveBossBar", "id", id)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_boss_bar"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveDisguise() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_disguise"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveDisplayBlocks(pos1: Any, pos2: Any) {
	val pos1ARG = typeCheck<JLocation>(pos1)
	val pos2ARG = typeCheck<JLocation>(pos2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_1"),"value" to pos1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pos_2"),"value" to pos2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_display_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveInventoryMenuRow(size: Any, position: Any? = null) {
	val sizeARG =  numberConvert("playerRemoveInventoryMenuRow", "size", size)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
enumCheck("playerRemoveInventoryMenuRow", "position", position, listOf("BUTTON", "TOP"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_inventory_menu_row"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveItems(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemovePose() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_pose"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemovePotionEffect(potions: Any) {
	val potionsARG = typeCheck<JPotion>(potions)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potions"),"value" to potionsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_potion_effect"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveSelfDisguise() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_self_disguise"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveSkin() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_skin"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRemoveWorldBorder() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_remove_world_border"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerReplaceItems(items: Any, replace: Any, count: Any) {
	val itemsARG = typeCheck<JItem>(items)
	val replaceARG = typeCheck<JItem>(replace)
	val countARG =  numberConvert("playerReplaceItems", "count", count)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("replace"),"value" to replaceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("count"),"value" to countARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_replace_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerResetWeather() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_reset_weather"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerRideEntity(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("playerRideEntity", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_ride_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSaveInventory() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_save_inventory"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSelfDisguiseAsBlock(block: Any) {
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_self_disguise_as_block"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSelfDisguiseAsEntity(entityType: Any) {
	val entityTypeARG = typeCheck<JItem>(entityType)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entity_type"),"value" to entityTypeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_self_disguise_as_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSelfDisguiseAsItem(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_self_disguise_as_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendActionBar(messages: Any, merging: Any? = null) {
	val messagesARG =  textConvert("playerSendActionBar", "messages", messages)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("messages"),"value" to messagesARG.parse())))
enumCheck("playerSendActionBar", "merging", merging, listOf("CONCATENATION", "SPACES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_action_bar"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendAdvancement(icon: Any, name: Any, frame: Any? = null) {
	val iconARG = typeCheck<JItem>(icon)
	val nameARG =  textConvert("playerSendAdvancement", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("icon"),"value" to iconARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
enumCheck("playerSendAdvancement", "frame", frame, listOf("CHALLENGE", "GOAL", "TASK"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_advancement"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendBreakAnimation(locations: Any, stage: Any) {
	val locationsARG = typeCheck<JLocation>(locations)
	val stageARG =  numberConvert("playerSendBreakAnimation", "stage", stage)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("stage"),"value" to stageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_break_animation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendDialogue(messages: Any, delay: Any) {
	val messagesARG =  textConvert("playerSendDialogue", "messages", messages)
	val delayARG =  numberConvert("playerSendDialogue", "delay", delay)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("messages"),"value" to messagesARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("delay"),"value" to delayARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_dialogue"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendHover(message: Any, hover: Any) {
	val messageARG =  textConvert("playerSendHover", "message", message)
	val hoverARG =  textConvert("playerSendHover", "hover", hover)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("message"),"value" to messageARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("hover"),"value" to hoverARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_hover"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerMessage(messages: Any, merging: Any? = null) {
	val messagesARG =  textConvert("playerMessage", "messages", messages)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("messages"),"value" to messagesARG.parse())))
enumCheck("playerMessage", "merging", merging, listOf("CONCATENATION", "SEPARATE_LINES", "SPACES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_message"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendMinimessage(minimessage: Any) {
	val minimessageARG =  textConvert("playerSendMinimessage", "minimessage", minimessage)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("minimessage"),"value" to minimessageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_minimessage"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSendTitle(title: Any, subtitle: Any, fadeIn: Any, stay: Any, fadeOut: Any) {
	val titleARG =  textConvert("playerSendTitle", "title", title)
	val subtitleARG =  textConvert("playerSendTitle", "subtitle", subtitle)
	val fadeInARG =  numberConvert("playerSendTitle", "fadeIn", fadeIn)
	val stayARG =  numberConvert("playerSendTitle", "stay", stay)
	val fadeOutARG =  numberConvert("playerSendTitle", "fadeOut", fadeOut)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("title"),"value" to titleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("subtitle"),"value" to subtitleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("fade_in"),"value" to fadeInARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("stay"),"value" to stayARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("fade_out"),"value" to fadeOutARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_send_title"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetAbsorptionHealth(health: Any) {
	val healthARG =  numberConvert("playerSetAbsorptionHealth", "health", health)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("health"),"value" to healthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_absorption_health"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetAirTicks(ticks: Any) {
	val ticksARG =  numberConvert("playerSetAirTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_air_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetAllowFlying(allowFlying: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetAllowFlying", "allowFlying", allowFlying, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_allow_flying"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetArmor(helmet: Any, chestplate: Any, leggings: Any, boots: Any) {
	val helmetARG = typeCheck<JItem>(helmet)
	val chestplateARG = typeCheck<JItem>(chestplate)
	val leggingsARG = typeCheck<JItem>(leggings)
	val bootsARG = typeCheck<JItem>(boots)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("helmet"),"value" to helmetARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("chestplate"),"value" to chestplateARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("leggings"),"value" to leggingsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("boots"),"value" to bootsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_armor"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetArrowsInBody(amount: Any) {
	val amountARG =  numberConvert("playerSetArrowsInBody", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_arrows_in_body"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetAttackSpeed(speed: Any) {
	val speedARG =  numberConvert("playerSetAttackSpeed", "speed", speed)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("speed"),"value" to speedARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_attack_speed"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetAttribute(value: Any, attributeType: Any? = null) {
	val valueARG =  numberConvert("playerSetAttribute", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("playerSetAttribute", "attributeType", attributeType, listOf("GENERIC_ARMOR", "GENERIC_ARMOR_TOUGHNESS", "GENERIC_ATTACK_DAMAGE", "GENERIC_ATTACK_KNOCKBACK", "GENERIC_ATTACK_SPEED", "GENERIC_BURNING_TIME", "GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE", "GENERIC_FALL_DAMAGE_MULTIPLIER", "GENERIC_FLYING_SPEED", "GENERIC_FOLLOW_RANGE", "GENERIC_GRAVITY", "GENERIC_JUMP_STRENGTH", "GENERIC_KNOCKBACK_RESISTANCE", "GENERIC_LUCK", "GENERIC_MAX_ABSORPTION", "GENERIC_MAX_HEALTH", "GENERIC_MOVEMENT_EFFICIENCY", "GENERIC_MOVEMENT_SPEED", "GENERIC_OXYGEN_BONUS", "GENERIC_SAFE_FALL_DISTANCE", "GENERIC_SCALE", "GENERIC_STEP_HEIGHT", "GENERIC_WATER_MOVEMENT_EFFICIENCY", "PLAYER_BLOCK_BREAK_SPEED", "PLAYER_BLOCK_INTERACTION_RANGE", "PLAYER_ENTITY_INTERACTION_RANGE", "PLAYER_MINING_EFFICIENCY", "PLAYER_SNEAKING_SPEED", "PLAYER_SUBMERGED_MINING_SPEED", "PLAYER_SWEEPING_DAMAGE_RATIO", "ZOMBIE_SPAWN_REINFORCEMENTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_attribute"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetBeeStingersInBody(amount: Any) {
	val amountARG =  numberConvert("playerSetBeeStingersInBody", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_bee_stingers_in_body"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetBlockOpenedState(location: Any, isOpened: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("playerSetBlockOpenedState", "isOpened", isOpened, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_block_opened_state"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetBossBar(id: Any, title: Any, progress: Any, skyEffect: Any? = null, style: Any? = null, color: Any? = null) {
	val idARG =  textConvert("playerSetBossBar", "id", id)
	val titleARG =  textConvert("playerSetBossBar", "title", title)
	val progressARG =  numberConvert("playerSetBossBar", "progress", progress)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("title"),"value" to titleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("progress"),"value" to progressARG.parse())))
enumCheck("playerSetBossBar", "skyEffect", skyEffect, listOf("DARK_SKY", "FOG", "FOG_AND_DARK_SKY", "NONE"))

enumCheck("playerSetBossBar", "style", style, listOf("NOTCHED_10", "NOTCHED_12", "NOTCHED_20", "NOTCHED_6", "PROGRESS"))

enumCheck("playerSetBossBar", "color", color, listOf("BLUE", "GREEN", "PINK", "PURPLE", "RED", "WHITE", "YELLOW"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_boss_bar"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetChatCompletions(completions: Any, settingMode: Any? = null) {
	val completionsARG =  textConvert("playerSetChatCompletions", "completions", completions)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("completions"),"value" to completionsARG.parse())))
enumCheck("playerSetChatCompletions", "settingMode", settingMode, listOf("ADD", "REMOVE", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_chat_completions"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetCollidable(collidable: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetCollidable", "collidable", collidable, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_collidable"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetCompassTarget(location: Any) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_compass_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetCursorItem(item: Any) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_cursor_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetDeathDrops(deathDrops: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetDeathDrops", "deathDrops", deathDrops, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_death_drops"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetDefaultVisible(defaultVisible: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetDefaultVisible", "defaultVisible", defaultVisible, listOf("TRUE", "FALSE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_default_visible"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetEnderChestContents(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_ender_chest_contents"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetEntityGlowing(nameOrUuid: Any, color: Any? = null, glow: Any? = null) {
	val nameOrUuidARG =  textConvert("playerSetEntityGlowing", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("playerSetEntityGlowing", "color", color, listOf("AQUA", "BLACK", "BLUE", "DARK_AQUA", "DARK_BLUE", "DARK_GRAY", "DARK_GREEN", "DARK_PURPLE", "DARK_RED", "GOLD", "GRAY", "GREEN", "PURPLE", "RED", "WHITE", "YELLOW"))

enumCheck("playerSetEntityGlowing", "glow", glow, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_entity_glowing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetEquipment(item: Any, slot: Any? = null) {
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("playerSetEquipment", "slot", slot, listOf("CHEST", "FEET", "HAND", "HEAD", "LEGS", "OFF_HAND"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_equipment"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetExhaustion(exhaustion: Any, mode: Any? = null) {
	val exhaustionARG =  numberConvert("playerSetExhaustion", "exhaustion", exhaustion)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("exhaustion"),"value" to exhaustionARG.parse())))
enumCheck("playerSetExhaustion", "mode", mode, listOf("ADD", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_exhaustion"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetExperience(experience: Any, mode: Any? = null) {
	val experienceARG =  numberConvert("playerSetExperience", "experience", experience)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("experience"),"value" to experienceARG.parse())))
enumCheck("playerSetExperience", "mode", mode, listOf("LEVEL", "LEVEL_PERCENTAGE", "POINTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_experience"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetFallDistance(distance: Any) {
	val distanceARG =  numberConvert("playerSetFallDistance", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_fall_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetFireTicks(ticks: Any) {
	val ticksARG =  numberConvert("playerSetFireTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_fire_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetFlying(isFlying: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetFlying", "isFlying", isFlying, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_flying"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetFogDistance(distance: Any) {
	val distanceARG =  numberConvert("playerSetFogDistance", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_fog_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetFood(food: Any, mode: Any? = null) {
	val foodARG =  numberConvert("playerSetFood", "food", food)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("food"),"value" to foodARG.parse())))
enumCheck("playerSetFood", "mode", mode, listOf("ADD", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_food"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetFreezeTicks(ticks: Any, tickingLocked: Any? = null) {
	val ticksARG =  numberConvert("playerSetFreezeTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
enumCheck("playerSetFreezeTicks", "tickingLocked", tickingLocked, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_freeze_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetGamemode(gamemode: Any? = null, flightMode: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetGamemode", "gamemode", gamemode, listOf("ADVENTURE", "CREATIVE", "SPECTATOR", "SURVIVAL"))

enumCheck("playerSetGamemode", "flightMode", flightMode, listOf("KEEP_ORIGINAL", "RESPECT_GAMEMODE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_gamemode"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetGliding(isGliding: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetGliding", "isGliding", isGliding, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_gliding"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetHealth(health: Any) {
	val healthARG =  numberConvert("playerSetHealth", "health", health)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("health"),"value" to healthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_health"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetHotbarSlot(slot: Any) {
	val slotARG =  numberConvert("playerSetHotbarSlot", "slot", slot)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slot"),"value" to slotARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_hotbar_slot"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetInstantRespawn(instantRespawn: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetInstantRespawn", "instantRespawn", instantRespawn, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_instant_respawn"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetInventoryKept(kept: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetInventoryKept", "kept", kept, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_inventory_kept"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetInventoryMenuItem(item: Any, slot: Any) {
	val itemARG = typeCheck<JItem>(item)
	val slotARG =  numberConvert("playerSetInventoryMenuItem", "slot", slot)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slot"),"value" to slotARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_inventory_menu_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetInventoryMenuName(text: Any) {
	val textARG =  textConvert("playerSetInventoryMenuName", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_inventory_menu_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetInvulnerabilityTicks(ticks: Any) {
	val ticksARG =  numberConvert("playerSetInvulnerabilityTicks", "ticks", ticks)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ticks"),"value" to ticksARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_invulnerability_ticks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetItemCooldown(cooldown: Any, item: Any, sound: Any) {
	val cooldownARG =  numberConvert("playerSetItemCooldown", "cooldown", cooldown)
	val itemARG = typeCheck<JItem>(item)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("cooldown"),"value" to cooldownARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_item_cooldown"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetItems(items: Any) {
	val itemsARG = typeCheck<JItem>(items)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetMaxHealth(health: Any, heal: Any? = null) {
	val healthARG =  numberConvert("playerSetMaxHealth", "health", health)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("health"),"value" to healthARG.parse())))
enumCheck("playerSetMaxHealth", "heal", heal, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_max_health"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetMovementSpeed(distance: Any, movementType: Any? = null) {
	val distanceARG =  numberConvert("playerSetMovementSpeed", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
enumCheck("playerSetMovementSpeed", "movementType", movementType, listOf("FLY", "WALK"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_movement_speed"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetNametagVisible(visible: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetNametagVisible", "visible", visible, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_nametag_visible"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetPlayerListInfo(text: Any, merging: Any? = null, position: Any? = null) {
	val textARG =  textConvert("playerSetPlayerListInfo", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("playerSetPlayerListInfo", "merging", merging, listOf("CONCATENATION", "SEPARATE_LINES", "SPACES"))

enumCheck("playerSetPlayerListInfo", "position", position, listOf("FOOTER", "HEADER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_player_list_info"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetPose(pose: Any? = null, locked: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetPose", "pose", pose, listOf("CROAKING", "CROUCHING", "DIGGING", "DYING", "EMERGING", "FALL_FLYING", "LONG_JUMPING", "ROARING", "SITTING", "SLEEPING", "SNEAKING", "SNIFFING", "SPIN_ATTACK", "STANDING", "SWIMMING", "USING_TONGUE"))

enumCheck("playerSetPose", "locked", locked, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_pose"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetPvp(pvp: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetPvp", "pvp", pvp, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_pvp"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetRainLevel(rainLevel: Any) {
	val rainLevelARG =  numberConvert("playerSetRainLevel", "rainLevel", rainLevel)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("rain_level"),"value" to rainLevelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_rain_level"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetRotation(yaw: Any, pitch: Any) {
	val yawARG =  numberConvert("playerSetRotation", "yaw", yaw)
	val pitchARG =  numberConvert("playerSetRotation", "pitch", pitch)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_rotation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetRotationByVector(vector: Any) {
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_rotation_by_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetSaturation(saturation: Any, mode: Any? = null) {
	val saturationARG =  numberConvert("playerSetSaturation", "saturation", saturation)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("saturation"),"value" to saturationARG.parse())))
enumCheck("playerSetSaturation", "mode", mode, listOf("ADD", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_saturation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetSimulationDistance(distance: Any) {
	val distanceARG =  numberConvert("playerSetSimulationDistance", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_simulation_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetSkin(nameOrUuid: Any, serverType: Any? = null) {
	val nameOrUuidARG =  textConvert("playerSetSkin", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("playerSetSkin", "serverType", serverType, listOf("MOJANG", "SERVER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_skin"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetSlotItem(item: Any, slot: Any) {
	val itemARG = typeCheck<JItem>(item)
	val slotARG =  numberConvert("playerSetSlotItem", "slot", slot)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("slot"),"value" to slotARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_slot_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetSpawnPoint(spawnPoint: Any) {
	val spawnPointARG = typeCheck<JLocation>(spawnPoint)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("spawn_point"),"value" to spawnPointARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_spawn_point"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetThunderLevel(thunderLevel: Any) {
	val thunderLevelARG =  numberConvert("playerSetThunderLevel", "thunderLevel", thunderLevel)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("thunder_level"),"value" to thunderLevelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_thunder_level"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetTickRate(tickRate: Any) {
	val tickRateARG =  numberConvert("playerSetTickRate", "tickRate", tickRate)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tick_rate"),"value" to tickRateARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_tick_rate"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetTime(time: Any) {
	val timeARG =  numberConvert("playerSetTime", "time", time)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("time"),"value" to timeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_time"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetVelocity(velocity: Any, increment: Any? = null) {
	val velocityARG = typeCheck<JVector>(velocity)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("velocity"),"value" to velocityARG.parse())))
enumCheck("playerSetVelocity", "increment", increment, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_velocity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetVisualFire(visualFire: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetVisualFire", "visualFire", visualFire, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_visual_fire"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetWeather(weatherType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSetWeather", "weatherType", weatherType, listOf("CLEAR", "DOWNFALL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_weather"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSetWorldBorder(center: Any, size: Any, warning: Any) {
	val centerARG = typeCheck<JLocation>(center)
	val sizeARG =  numberConvert("playerSetWorldBorder", "size", size)
	val warningARG =  numberConvert("playerSetWorldBorder", "warning", warning)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("center"),"value" to centerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("warning"),"value" to warningARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_set_world_border"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerShiftWorldBorder(oldSize: Any, size: Any, time: Any) {
	val oldSizeARG =  numberConvert("playerShiftWorldBorder", "oldSize", oldSize)
	val sizeARG =  numberConvert("playerShiftWorldBorder", "size", size)
	val timeARG =  numberConvert("playerShiftWorldBorder", "time", time)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("old_size"),"value" to oldSizeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("time"),"value" to timeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_shift_world_border"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerShowDebugMarker(location: Any, name: Any, duration: Any, red: Any, green: Any, blue: Any, alpha: Any) {
	val locationARG = typeCheck<JLocation>(location)
	val nameARG =  textConvert("playerShowDebugMarker", "name", name)
	val durationARG =  numberConvert("playerShowDebugMarker", "duration", duration)
	val redARG =  numberConvert("playerShowDebugMarker", "red", red)
	val greenARG =  numberConvert("playerShowDebugMarker", "green", green)
	val blueARG =  numberConvert("playerShowDebugMarker", "blue", blue)
	val alphaARG =  numberConvert("playerShowDebugMarker", "alpha", alpha)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("duration"),"value" to durationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("red"),"value" to redARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("green"),"value" to greenARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blue"),"value" to blueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("alpha"),"value" to alphaARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_show_debug_marker"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerShowDemoScreen() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_show_demo_screen"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerShowInventoryMenu(items: Any, name: Any, inventoryType: Any? = null) {
	val itemsARG = typeCheck<JItem>(items)
	val nameARG =  textConvert("playerShowInventoryMenu", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
enumCheck("playerShowInventoryMenu", "inventoryType", inventoryType, listOf("ANVIL", "BARREL", "BEACON", "BLAST_FURNACE", "BREWING", "CARTOGRAPHY", "CHEST", "COMPOSTER", "CRAFTING", "CREATIVE", "DISPENSER", "DROPPER", "ENCHANTING", "ENDER_CHEST", "FURNACE", "GRINDSTONE", "HOPPER", "LECTERN", "LOOM", "MERCHANT", "PLAYER", "SHULKER_BOX", "SMITHING", "SMOKER", "STONECUTTER", "WORKBENCH"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_show_inventory_menu"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerShowScoreboard(id: Any) {
	val idARG =  textConvert("playerShowScoreboard", "id", id)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("id"),"value" to idARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_show_scoreboard"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerShowWinScreen() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_show_win_screen"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSpectateTarget(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("playerSpectateTarget", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_spectate_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerStopSound(sounds: Any) {
	val soundsARG = typeCheck<JSound>(sounds)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sounds"),"value" to soundsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_stop_sound"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerStopSoundsBySource(source: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerStopSoundsBySource", "source", source, listOf("AMBIENT", "BLOCK", "HOSTILE", "MASTER", "MUSIC", "NEUTRAL", "PLAYER", "RECORD", "VOICE", "WEATHER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_stop_sounds_by_source"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerSwingHand(handType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("playerSwingHand", "handType", handType, listOf("MAIN", "OFF"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_swing_hand"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerTeleport(location: Any, keepRotation: Any? = null, keepVelocity: Any? = null, dismount: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("playerTeleport", "keepRotation", keepRotation, listOf("FALSE", "TRUE"))

enumCheck("playerTeleport", "keepVelocity", keepVelocity, listOf("FALSE", "TRUE"))

enumCheck("playerTeleport", "dismount", dismount, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_teleport"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun playerTeleportSequence(locations: Any, delay: Any) {
	val locationsARG = typeCheck<JLocation>(locations)
	val delayARG =  numberConvert("playerTeleportSequence", "delay", delay)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("delay"),"value" to delayARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("player_teleport_sequence"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatAdjacently(variable: Any, origin: Any, changeRotation: Any? = null, includeSelf: Any? = null, pattern: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val originARG = typeCheck<JLocation>(origin)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("origin"),"value" to originARG.parse())))
enumCheck("repeatAdjacently", "changeRotation", changeRotation, listOf("FALSE", "TRUE"))

enumCheck("repeatAdjacently", "includeSelf", includeSelf, listOf("FALSE", "TRUE"))

enumCheck("repeatAdjacently", "pattern", pattern, listOf("ADJACENT", "CARDINAL", "CUBE", "SQUARE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_adjacently"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatForEachInList(indexVariable: Any, valueVariable: Any, list: Any) {
	val indexVariableARG = typeCheck<Var>(indexVariable)
	val valueVariableARG = typeCheck<Var>(valueVariable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index_variable"),"value" to indexVariableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value_variable"),"value" to valueVariableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_for_each_in_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatForEachMapEntry(keyVariable: Any, valueVariable: Any, map: Any) {
	val keyVariableARG = typeCheck<Var>(keyVariable)
	val valueVariableARG = typeCheck<Var>(valueVariable)
	val mapARG = typeCheck<JMap>(map)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key_variable"),"value" to keyVariableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value_variable"),"value" to valueVariableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_for_each_map_entry"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatForever() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_forever"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatMultiTimes(variable: Any, amount: Any) {
	val variableARG = typeCheck<Var>(variable)
	val amountARG =  numberConvert("repeatMultiTimes", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_multi_times"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatOnCircle(variable: Any, center: Any, radius: Any, circlePoints: Any, perpendicularToPlane: Any, startAngle: Any, angleUnit: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val centerARG = typeCheck<JLocation>(center)
	val radiusARG =  numberConvert("repeatOnCircle", "radius", radius)
	val circlePointsARG =  numberConvert("repeatOnCircle", "circlePoints", circlePoints)
	val perpendicularToPlaneARG = typeCheck<JVector>(perpendicularToPlane)
	val startAngleARG =  numberConvert("repeatOnCircle", "startAngle", startAngle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("center"),"value" to centerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("circle_points"),"value" to circlePointsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("perpendicular_to_plane"),"value" to perpendicularToPlaneARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start_angle"),"value" to startAngleARG.parse())))
enumCheck("repeatOnCircle", "angleUnit", angleUnit, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_on_circle"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatOnGrid(variable: Any, start: Any, end: Any) {
	val variableARG = typeCheck<Var>(variable)
	val startARG = typeCheck<JLocation>(start)
	val endARG = typeCheck<JLocation>(end)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("end"),"value" to endARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_on_grid"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatOnPath(variable: Any, step: Any, locations: Any, rotation: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val stepARG =  numberConvert("repeatOnPath", "step", step)
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("step"),"value" to stepARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
enumCheck("repeatOnPath", "rotation", rotation, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_on_path"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatOnRange(variable: Any, start: Any, end: Any, interval: Any) {
	val variableARG = typeCheck<Var>(variable)
	val startARG =  numberConvert("repeatOnRange", "start", start)
	val endARG =  numberConvert("repeatOnRange", "end", end)
	val intervalARG =  numberConvert("repeatOnRange", "interval", interval)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("end"),"value" to endARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("interval"),"value" to intervalARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_on_range"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatOnSphere(variable: Any, center: Any, radius: Any, points: Any, rotateLocation: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val centerARG = typeCheck<JLocation>(center)
	val radiusARG =  numberConvert("repeatOnSphere", "radius", radius)
	val pointsARG =  numberConvert("repeatOnSphere", "points", points)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("center"),"value" to centerARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radius"),"value" to radiusARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("points"),"value" to pointsARG.parse())))
enumCheck("repeatOnSphere", "rotateLocation", rotateLocation, listOf("INWARDS", "NO_CHANGES", "OUTWARDS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_on_sphere"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun repeatWhile() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("repeat_while"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddAllEntities() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_all_entities"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddAllMobs() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_all_mobs"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddAllPlayers() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_all_players"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddEntityByConditional() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_entity_by_conditional"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddEntityByName(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("selectAddEntityByName", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_entity_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddEventTarget(selectionType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("selectAddEventTarget", "selectionType", selectionType, listOf("DAMAGER", "DEFAULT", "KILLER", "PROJECTILE", "SHOOTER", "VICTIM"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_event_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddLastEntity() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_last_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddLastMob() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_last_mob"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddMobByName(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("selectAddMobByName", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_mob_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddPlayerByConditional() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_player_by_conditional"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddPlayerByName(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("selectAddPlayerByName", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_player_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddRandomEntity() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_random_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddRandomMob() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_random_mob"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAddRandomPlayer() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_add_random_player"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAllEntities() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_all_entities"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAllMobs() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_all_mobs"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectAllPlayers() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_all_players"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectEntityByConditional() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_entity_by_conditional"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectEntityByName(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("selectEntityByName", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_entity_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectEventTarget(selectionType: Any? = null) {

    val funValues = mutableListOf<JsonObject>()
enumCheck("selectEventTarget", "selectionType", selectionType, listOf("DAMAGER", "DEFAULT", "KILLER", "PROJECTILE", "SHOOTER", "VICTIM"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_event_target"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectFilterByConditional() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_filter_by_conditional"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectFilterByDistance(location: Any, selectionSize: Any, ignoreYAxis: Any? = null, compareMode: Any? = null) {
	val locationARG = typeCheck<JLocation>(location)
	val selectionSizeARG =  numberConvert("selectFilterByDistance", "selectionSize", selectionSize)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("selection_size"),"value" to selectionSizeARG.parse())))
enumCheck("selectFilterByDistance", "ignoreYAxis", ignoreYAxis, listOf("FALSE", "TRUE"))

enumCheck("selectFilterByDistance", "compareMode", compareMode, listOf("FARTHEST", "NEAREST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_filter_by_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectFilterByRaycast(variable: Any, origin: Any, maxDistance: Any, raySize: Any, selectionSize: Any, considerBlocks: Any? = null, ignorePassableBlocks: Any? = null, fluidCollisionMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val originARG = typeCheck<JLocation>(origin)
	val maxDistanceARG =  numberConvert("selectFilterByRaycast", "maxDistance", maxDistance)
	val raySizeARG =  numberConvert("selectFilterByRaycast", "raySize", raySize)
	val selectionSizeARG =  numberConvert("selectFilterByRaycast", "selectionSize", selectionSize)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("origin"),"value" to originARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max_distance"),"value" to maxDistanceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ray_size"),"value" to raySizeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("selection_size"),"value" to selectionSizeARG.parse())))
enumCheck("selectFilterByRaycast", "considerBlocks", considerBlocks, listOf("FALSE", "TRUE"))

enumCheck("selectFilterByRaycast", "ignorePassableBlocks", ignorePassableBlocks, listOf("FALSE", "TRUE"))

enumCheck("selectFilterByRaycast", "fluidCollisionMode", fluidCollisionMode, listOf("ALWAYS", "NEVER", "SOURCE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_filter_by_raycast"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectFilterRandomly(size: Any) {
	val sizeARG =  numberConvert("selectFilterRandomly", "size", size)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_filter_randomly"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectInvert() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_invert"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectLastEntity() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_last_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectLastMob() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_last_mob"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectMobByName(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("selectMobByName", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_mob_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectPlayerByConditional() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_player_by_conditional"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectPlayerByName(nameOrUuid: Any) {
	val nameOrUuidARG =  textConvert("selectPlayerByName", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_player_by_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectRandomEntity() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_random_entity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectRandomMob() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_random_mob"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectRandomPlayer() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_random_player"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun selectReset() {

    val funValues = mutableListOf<JsonObject>()

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("select_reset"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAbsolute(variable: Any, number: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableAbsolute", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_absolute"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAdd(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableAdd", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_add"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAddItemEnchantment(variable: Any, item: Any, enchantment: Any, level: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val enchantmentARG =  textConvert("variableAddItemEnchantment", "enchantment", enchantment)
	val levelARG =  numberConvert("variableAddItemEnchantment", "level", level)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("enchantment"),"value" to enchantmentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("level"),"value" to levelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_add_item_enchantment"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAddItemPotionEffects(variable: Any, potions: Any, item: Any, overwrite: Any? = null, showIcon: Any? = null, particleMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val potionsARG = typeCheck<JPotion>(potions)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potions"),"value" to potionsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("variableAddItemPotionEffects", "overwrite", overwrite, listOf("FALSE", "TRUE"))

enumCheck("variableAddItemPotionEffects", "showIcon", showIcon, listOf("FALSE", "TRUE"))

enumCheck("variableAddItemPotionEffects", "particleMode", particleMode, listOf("AMBIENT", "NONE", "REGULAR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_add_item_potion_effects"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAddVectors(variable: Any, vectors: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vectorsARG = typeCheck<JVector>(vectors)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vectors"),"value" to vectorsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_add_vectors"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAlignLocation(variable: Any, location: Any, rotationMode: Any? = null, coordinatesMode: Any? = null, alignMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableAlignLocation", "rotationMode", rotationMode, listOf("KEEP", "REMOVE"))

enumCheck("variableAlignLocation", "coordinatesMode", coordinatesMode, listOf("ALL", "X_Z", "Y"))

enumCheck("variableAlignLocation", "alignMode", alignMode, listOf("BLOCK_CENTER", "CORNER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_align_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAlignToAxisVector(variable: Any, vector: Any, normalize: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
enumCheck("variableAlignToAxisVector", "normalize", normalize, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_align_to_axis_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAppendComponent(variable: Any, components: Any, merging: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val componentsARG =  textConvert("variableAppendComponent", "components", components)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("components"),"value" to componentsARG.parse())))
enumCheck("variableAppendComponent", "merging", merging, listOf("CONCATENATION", "SEPARATE_LINES", "SPACES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_append_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAppendList(variable: Any, list1: Any, list2: Any) {
	val variableARG = typeCheck<Var>(variable)
	val list1ARG = typeCheck<JArray>(list1)
	val list2ARG = typeCheck<JArray>(list2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list_1"),"value" to list1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list_2"),"value" to list2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_append_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAppendMap(variable: Any, map: Any, otherMap: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val otherMapARG = typeCheck<JMap>(otherMap)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("other_map"),"value" to otherMapARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_append_map"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAppendValue(variable: Any, values: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_append_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableAverage(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableAverage", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_average"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableBitwiseOperation(variable: Any, operand1: Any, operand2: Any, operator: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val operand1ARG =  numberConvert("variableBitwiseOperation", "operand1", operand1)
	val operand2ARG =  numberConvert("variableBitwiseOperation", "operand2", operand2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("operand1"),"value" to operand1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("operand2"),"value" to operand2ARG.parse())))
enumCheck("variableBitwiseOperation", "operator", operator, listOf("AND", "LEFT_SHIFT", "NOT", "OR", "RIGHT_SHIFT", "UNSIGNED_RIGHT_SHIFT", "XOR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_bitwise_operation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCenterLocation(variable: Any, locations: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationsARG = typeCheck<JLocation>(locations)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locations"),"value" to locationsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_center_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableChangeComponentParsing(variable: Any, component: Any, parsing: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableChangeComponentParsing", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
enumCheck("variableChangeComponentParsing", "parsing", parsing, listOf("JSON", "LEGACY", "MINIMESSAGE", "PLAIN"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_change_component_parsing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCharToNumber(variable: Any, char: Any) {
	val variableARG = typeCheck<Var>(variable)
	val charARG =  textConvert("variableCharToNumber", "char", char)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("char"),"value" to charARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_char_to_number"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableClamp(variable: Any, number: Any, min: Any, max: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableClamp", "number", number)
	val minARG =  numberConvert("variableClamp", "min", min)
	val maxARG =  numberConvert("variableClamp", "max", max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_clamp"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableClearColorCodes(variable: Any, text: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableClearColorCodes", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_clear_color_codes"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableClearMap(map: Any) {
	val mapARG = typeCheck<Var>(map)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_clear_map"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCompactComponent(variable: Any, component: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableCompactComponent", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_compact_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableComponentOfChildren(variable: Any, components: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentsARG =  textConvert("variableComponentOfChildren", "components", components)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("components"),"value" to componentsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_component_of_children"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableConvertNumberToText(variable: Any, number: Any, radix: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableConvertNumberToText", "number", number)
	val radixARG =  numberConvert("variableConvertNumberToText", "radix", radix)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radix"),"value" to radixARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_convert_number_to_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableConvertTextToNumber(variable: Any, text: Any, radix: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableConvertTextToNumber", "text", text)
	val radixARG =  numberConvert("variableConvertTextToNumber", "radix", radix)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("radix"),"value" to radixARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_convert_text_to_number"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCosine(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableCosine", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
enumCheck("variableCosine", "variant", variant, listOf("ARCCOSINE", "COSINE", "HYPERBOLIC_COSINE"))

enumCheck("variableCosine", "input", input, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_cosine"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCotangent(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableCotangent", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
enumCheck("variableCotangent", "variant", variant, listOf("ARCCOTANGENT", "COTANGENT", "HYPERBOLIC_COTANGENT"))

enumCheck("variableCotangent", "input", input, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_cotangent"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCreateKeybindComponent(variable: Any, key: Any) {
	val variableARG = typeCheck<Var>(variable)
	val keyARG =  textConvert("variableCreateKeybindComponent", "key", key)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_create_keybind_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCreateList(variable: Any, values: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_create_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCreateMap(variable: Any, keys: Any, values: Any) {
	val variableARG = typeCheck<Var>(variable)
	val keysARG = typeCheck<JArray>(keys)
	val valuesARG = typeCheck<JArray>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("keys"),"value" to keysARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_create_map"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCreateMapFromValues(variable: Any, keys: Any, values: Any) {
	val variableARG = typeCheck<Var>(variable)
	val keysARG = typeCheck<JAny>(keys)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("keys"),"value" to keysARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_create_map_from_values"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableCreateTranslatableComponent(variable: Any, key: Any, args: Any) {
	val variableARG = typeCheck<Var>(variable)
	val keyARG =  textConvert("variableCreateTranslatableComponent", "key", key)
	val argsARG =  textConvert("variableCreateTranslatableComponent", "args", args)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("args"),"value" to argsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_create_translatable_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableDecrement(variable: Any, number: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableDecrement", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_decrement"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableDivide(variable: Any, value: Any, divisionMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableDivide", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableDivide", "divisionMode", divisionMode, listOf("CEIL", "DEFAULT", "FLOOR", "ROUND_TO_INT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_divide"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableDivideVector(variable: Any, vector: Any, divider: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)
	val dividerARG = typeCheck<JVector>(divider)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("divider"),"value" to dividerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_divide_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableFaceLocation(variable: Any, location: Any, target: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val targetARG = typeCheck<JLocation>(target)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("target"),"value" to targetARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_face_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableFlattenList(variable: Any, list: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_flatten_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableFormatTimestamp(variable: Any, time: Any, pattern: Any, zoneId: Any, locale: Any, format: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val timeARG =  numberConvert("variableFormatTimestamp", "time", time)
	val patternARG =  textConvert("variableFormatTimestamp", "pattern", pattern)
	val zoneIdARG =  textConvert("variableFormatTimestamp", "zoneId", zoneId)
	val localeARG =  textConvert("variableFormatTimestamp", "locale", locale)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("time"),"value" to timeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pattern"),"value" to patternARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("zone_id"),"value" to zoneIdARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("locale"),"value" to localeARG.parse())))
enumCheck("variableFormatTimestamp", "format", format, listOf("CUSTOM", "DD_MM_YYYY", "DD_MM_YYYY_HH_MM_S", "EEEE", "EEE_D_MMMM", "EEE_MMMM_D", "HH_MM_SS", "H_H_M_M_S_S", "H_MM_A", "S_S", "YYYY_MM_DD", "YYYY_MM_DD_HH_MM_S"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_format_timestamp"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGaussianDistribution(variable: Any, deviant: Any, mean: Any, distribution: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val deviantARG =  numberConvert("variableGaussianDistribution", "deviant", deviant)
	val meanARG =  numberConvert("variableGaussianDistribution", "mean", mean)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("deviant"),"value" to deviantARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("mean"),"value" to meanARG.parse())))
enumCheck("variableGaussianDistribution", "distribution", distribution, listOf("FOLDER_NORMAL", "NORMAL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_gaussian_distribution"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetAllBlockData(variable: Any, location: Any, hideUnspecified: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetAllBlockData", "hideUnspecified", hideUnspecified, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_all_block_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetAllCoordinates(x: Any, y: Any, z: Any, yaw: Any, pitch: Any, location: Any) {
	val xARG = typeCheck<Var>(x)
	val yARG = typeCheck<Var>(y)
	val zARG = typeCheck<Var>(z)
	val yawARG = typeCheck<Var>(yaw)
	val pitchARG = typeCheck<Var>(pitch)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("x"),"value" to xARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("y"),"value" to yARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("z"),"value" to zARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_all_coordinates"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetAngleBetweenVectors(variable: Any, vector1: Any, vector2: Any, angleUnits: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val vector1ARG = typeCheck<JVector>(vector1)
	val vector2ARG = typeCheck<JVector>(vector2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_1"),"value" to vector1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_2"),"value" to vector2ARG.parse())))
enumCheck("variableGetAngleBetweenVectors", "angleUnits", angleUnits, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_angle_between_vectors"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBlockCustomTag(variable: Any, location: Any, tagName: Any, tagValue: Any, defaultValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val tagNameARG =  textConvert("variableGetBlockCustomTag", "tagName", tagName)
	val tagValueARG =  textConvert("variableGetBlockCustomTag", "tagValue", tagValue)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_name"),"value" to tagNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_value"),"value" to tagValueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_block_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBlockData(variable: Any, location: Any, tagName: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val tagNameARG =  textConvert("variableGetBlockData", "tagName", tagName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_name"),"value" to tagNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_block_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBlockGrowth(variable: Any, location: Any, growthUnit: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetBlockGrowth", "growthUnit", growthUnit, listOf("GROWTH_PERCENTAGE", "GROWTH_STAGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_block_growth"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBlockMaterial(variable: Any, location: Any, valueType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetBlockMaterial", "valueType", valueType, listOf("ID", "ID_WITH_DATA", "ITEM", "NAME"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_block_material"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBlockMaterialProperty(variable: Any, block: Any, property: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val blockARG = typeCheck<JBlock>(block)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block"),"value" to blockARG.parse())))
enumCheck("variableGetBlockMaterialProperty", "property", property, listOf("BLAST_RESISTANCE", "HARDNESS", "SLIPPERINESS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_block_material_property"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBlockPower(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_block_power"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBookText(variable: Any, book: Any, page: Any) {
	val variableARG = typeCheck<Var>(variable)
	val bookARG = typeCheck<JItem>(book)
	val pageARG =  numberConvert("variableGetBookText", "page", page)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("book"),"value" to bookARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("page"),"value" to pageARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_book_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBrushableBlockItem(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_brushable_block_item"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetBundleItems(variable: Any, bundle: Any) {
	val variableARG = typeCheck<Var>(variable)
	val bundleARG = typeCheck<JItem>(bundle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("bundle"),"value" to bundleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_bundle_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetCharAt(variable: Any, text: Any, index: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableGetCharAt", "text", text)
	val indexARG =  numberConvert("variableGetCharAt", "index", index)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index"),"value" to indexARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_char_at"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetColorChannels(variable: Any, color: Any, colorChannels: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val colorARG =  textConvert("variableGetColorChannels", "color", color)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("color"),"value" to colorARG.parse())))
enumCheck("variableGetColorChannels", "colorChannels", colorChannels, listOf("HSB", "HSL", "RGB"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_color_channels"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetCompassLodestone(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_compass_lodestone"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetComponentChildren(variable: Any, component: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableGetComponentChildren", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_component_children"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetComponentDecorations(variable: Any, component: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableGetComponentDecorations", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_component_decorations"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetComponentHexColor(variable: Any, component: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableGetComponentHexColor", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_component_hex_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetComponentParsing(variable: Any, component: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableGetComponentParsing", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_component_parsing"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetContainerContents(variable: Any, location: Any, ignoreEmptySlots: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetContainerContents", "ignoreEmptySlots", ignoreEmptySlots, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_container_contents"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetContainerLock(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_container_lock"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetContainerName(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_container_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetCoordinate(variable: Any, location: Any, type: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetCoordinate", "type", type, listOf("PITCH", "X", "Y", "YAW", "Z"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_coordinate"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetDecoratePotSherd(variable: Any, location: Any, side: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetDecoratePotSherd", "side", side, listOf("BACK", "FRONT", "LEFT", "RIGHT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_decorate_pot_sherd"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetIndexOfSubtext(variable: Any, text: Any, subtext: Any, startIndex: Any, searchMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableGetIndexOfSubtext", "text", text)
	val subtextARG =  textConvert("variableGetIndexOfSubtext", "subtext", subtext)
	val startIndexARG =  numberConvert("variableGetIndexOfSubtext", "startIndex", startIndex)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("subtext"),"value" to subtextARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start_index"),"value" to startIndexARG.parse())))
enumCheck("variableGetIndexOfSubtext", "searchMode", searchMode, listOf("FIRST", "LAST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_index_of_subtext"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemAmount(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_amount"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemAttribute(variable: Any, item: Any, name: Any, attribute: Any? = null, slot: Any? = null, operation: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val nameARG =  textConvert("variableGetItemAttribute", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
enumCheck("variableGetItemAttribute", "attribute", attribute, listOf("ARMOR", "ARMOR_TOUGHNESS", "ATTACK_DAMAGE", "ATTACK_KNOCKBACK", "ATTACK_SPEED", "FLYING_SPEED", "FOLLOW_RANGE", "GENERIC_ARMOR", "GENERIC_ARMOR_TOUGHNESS", "GENERIC_ATTACK_DAMAGE", "GENERIC_ATTACK_KNOCKBACK", "GENERIC_ATTACK_SPEED", "GENERIC_BURNING_TIME", "GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE", "GENERIC_FALL_DAMAGE_MULTIPLIER", "GENERIC_FLYING_SPEED", "GENERIC_FOLLOW_RANGE", "GENERIC_GRAVITY", "GENERIC_JUMP_STRENGTH", "GENERIC_KNOCKBACK_RESISTANCE", "GENERIC_LUCK", "GENERIC_MAX_ABSORPTION", "GENERIC_MAX_HEALTH", "GENERIC_MOVEMENT_EFFICIENCY", "GENERIC_MOVEMENT_SPEED", "GENERIC_OXYGEN_BONUS", "GENERIC_SAFE_FALL_DISTANCE", "GENERIC_SCALE", "GENERIC_STEP_HEIGHT", "GENERIC_WATER_MOVEMENT_EFFICIENCY", "HORSE_JUMP_STRENGTH", "KNOCKBACK_RESISTANCE", "LUCK", "MAX_ABSORPTION", "MAX_HEALTH", "MOVEMENT_SPEED", "PLAYER_BLOCK_BREAK_SPEED", "PLAYER_BLOCK_INTERACTION_RANGE", "PLAYER_ENTITY_INTERACTION_RANGE", "PLAYER_MINING_EFFICIENCY", "PLAYER_SNEAKING_SPEED", "PLAYER_SUBMERGED_MINING_SPEED", "PLAYER_SWEEPING_DAMAGE_RATIO", "ZOMBIE_SPAWN_REINFORCEMENTS"))

enumCheck("variableGetItemAttribute", "slot", slot, listOf("ALL", "ARMOR", "BODY", "BOOTS", "CHEST", "HAND", "HEAD", "LEGGINGS", "MAIN_HAND", "OFF_HAND"))

enumCheck("variableGetItemAttribute", "operation", operation, listOf("ADD_NUMBER", "ADD_SCALAR", "MULTIPLY_SCALAR_1"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_attribute"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemColor(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemCustomModelData(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_custom_model_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemCustomTag(variable: Any, item: Any, tagName: Any, defaultValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val tagNameARG =  textConvert("variableGetItemCustomTag", "tagName", tagName)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_name"),"value" to tagNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemCustomTags(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_custom_tags"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemDestroyableBlocks(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_destroyable_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemDurability(variable: Any, item: Any, durabilityType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("variableGetItemDurability", "durabilityType", durabilityType, listOf("DAMAGE", "DAMAGE_PERCENTAGE", "MAXIMUM", "REMAINING", "REMAINING_PERCENTAGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_durability"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemEnchantments(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_enchantments"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemLore(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_lore"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemLoreLine(variable: Any, item: Any, line: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val lineARG =  numberConvert("variableGetItemLoreLine", "line", line)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_lore_line"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemMaxStackSize(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_max_stack_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemName(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemNbtTags(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_nbt_tags"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemPlaceableBlocks(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_placeable_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemPotionEffects(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_potion_effects"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemRarity(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_rarity"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetItemType(variable: Any, type: Any, value: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val typeARG = typeCheck<JItem>(type)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("type"),"value" to typeARG.parse())))
enumCheck("variableGetItemType", "value", value, listOf("ID", "ITEM", "NAME"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_item_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetLecternBook(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_lectern_book"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetLecternPage(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_lectern_page"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetLightLevel(variable: Any, location: Any, valueType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetLightLevel", "valueType", valueType, listOf("BLOCKS", "SKY", "TOTAL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_light_level"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetListIndexOfValue(variable: Any, list: Any, value: Any, searchMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableGetListIndexOfValue", "searchMode", searchMode, listOf("FIRST", "LAST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_list_index_of_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetListLength(variable: Any, list: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_list_length"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetListRandomValue(variable: Any, list: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_list_random_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetListValue(variable: Any, list: Any, number: Any, defaultValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val numberARG =  numberConvert("variableGetListValue", "number", number)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_list_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetListVariables(variable: Any, scope: Any? = null) {
	val variableARG = typeCheck<Var>(variable)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
enumCheck("variableGetListVariables", "scope", scope, listOf("GAME", "LOCAL", "SAVE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_list_variables"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetLocationDirection(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_location_direction"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapKeyByIndex(variable: Any, map: Any, index: Any, defaultValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val indexARG =  numberConvert("variableGetMapKeyByIndex", "index", index)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index"),"value" to indexARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_key_by_index"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapKeys(variable: Any, map: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_keys"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapKeysByValue(variable: Any, map: Any, value: Any, defaultValue: Any, findMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val valueARG = typeCheck<JAny>(value)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
enumCheck("variableGetMapKeysByValue", "findMode", findMode, listOf("ALL", "FIRST", "LAST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_keys_by_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapSize(variable: Any, map: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapValue(variable: Any, map: Any, key: Any, defaultValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val keyARG = typeCheck<JAny>(key)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapValueByIndex(variable: Any, map: Any, index: Any, defaultValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val indexARG =  numberConvert("variableGetMapValueByIndex", "index", index)
	val defaultValueARG = typeCheck<JAny>(defaultValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index"),"value" to indexARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("default_value"),"value" to defaultValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_value_by_index"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMapValues(variable: Any, map: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_map_values"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetMidpointBetweenVectors(variable: Any, vector1: Any, vector2: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vector1ARG = typeCheck<JVector>(vector1)
	val vector2ARG = typeCheck<JVector>(vector2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_1"),"value" to vector1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_2"),"value" to vector2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_midpoint_between_vectors"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleAmount(variable: Any, particle: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_amount"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleColor(variable: Any, particle: Any, colorType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
enumCheck("variableGetParticleColor", "colorType", colorType, listOf("COLOR", "TO_COLOR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleMaterial(variable: Any, particle: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_material"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleOffset(variable: Any, particle: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_offset"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleSize(variable: Any, particle: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleSpread(variable: Any, particle: Any, type: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
enumCheck("variableGetParticleSpread", "type", type, listOf("HORIZONTAL", "VERTICAL"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_spread"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetParticleType(variable: Any, particle: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_particle_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetPlayerHead(variable: Any, nameOrUuid: Any, receiveType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val nameOrUuidARG =  textConvert("variableGetPlayerHead", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("variableGetPlayerHead", "receiveType", receiveType, listOf("NAME_OR_UUID", "VALUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_player_head"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetPlayerHeadOwner(variable: Any, head: Any, returnValue: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val headARG = typeCheck<JItem>(head)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("head"),"value" to headARG.parse())))
enumCheck("variableGetPlayerHeadOwner", "returnValue", returnValue, listOf("NAME", "UUID", "VALUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_player_head_owner"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetPlayerHeadValue(variable: Any, location: Any, returnValue: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetPlayerHeadValue", "returnValue", returnValue, listOf("NAME", "UUID", "VALUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_player_head_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetPotionEffectAmplifier(variable: Any, potion: Any) {
	val variableARG = typeCheck<Var>(variable)
	val potionARG = typeCheck<JPotion>(potion)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion"),"value" to potionARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_potion_effect_amplifier"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetPotionEffectDuration(variable: Any, potion: Any) {
	val variableARG = typeCheck<Var>(variable)
	val potionARG = typeCheck<JPotion>(potion)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion"),"value" to potionARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_potion_effect_duration"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetPotionEffectType(variable: Any, potion: Any) {
	val variableARG = typeCheck<Var>(variable)
	val potionARG = typeCheck<JPotion>(potion)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion"),"value" to potionARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_potion_effect_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSculkShriekerWarningLevel(variable: Any, location: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sculk_shrieker_warning_level"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSignText(variable: Any, location: Any, checkSide: Any? = null, signLine: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableGetSignText", "checkSide", checkSide, listOf("ALL", "BACK", "FRONT"))

enumCheck("variableGetSignText", "signLine", signLine, listOf("ALL", "FIRST", "FOURTH", "SECOND", "THIRD"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sign_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSoundPitch(variable: Any, sound: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sound_pitch"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSoundSource(variable: Any, sound: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sound_source"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSoundType(variable: Any, sound: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sound_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSoundVariation(variable: Any, sound: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sound_variation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSoundVariations(variable: Any, sound: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sound_variations"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetSoundVolumeAction(variable: Any, sound: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_sound_volume_action"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetTemplateCode(variable: Any, template: Any, returnType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val templateARG = typeCheck<JItem>(template)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("template"),"value" to templateARG.parse())))
enumCheck("variableGetTemplateCode", "returnType", returnType, listOf("MAP", "TEXT"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_template_code"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetTextWidth(variable: Any, text: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableGetTextWidth", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_text_width"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetVectorAllComponents(x: Any, y: Any, z: Any, vector: Any) {
	val xARG = typeCheck<Var>(x)
	val yARG = typeCheck<Var>(y)
	val zARG = typeCheck<Var>(z)
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("x"),"value" to xARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("y"),"value" to yARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("z"),"value" to zARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_vector_all_components"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetVectorBetweenLocations(variable: Any, endLocation: Any, startLocation: Any) {
	val variableARG = typeCheck<Var>(variable)
	val endLocationARG = typeCheck<JLocation>(endLocation)
	val startLocationARG = typeCheck<JLocation>(startLocation)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("end_location"),"value" to endLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start_location"),"value" to startLocationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_vector_between_locations"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetVectorComponent(variable: Any, vector: Any, vectorComponent: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
enumCheck("variableGetVectorComponent", "vectorComponent", vectorComponent, listOf("X", "Y", "Z"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_vector_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetVectorFromBlockFace(variable: Any, blockFace: Any) {
	val variableARG = typeCheck<Var>(variable)
	val blockFaceARG =  textConvert("variableGetVectorFromBlockFace", "blockFace", blockFace)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("block_face"),"value" to blockFaceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_vector_from_block_face"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetVectorLength(variable: Any, vector: Any, lengthType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
enumCheck("variableGetVectorLength", "lengthType", lengthType, listOf("LENGTH", "LENGTH_SQUARED"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_get_vector_length"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetTextHash(variable: Any, text: Any, algorithm: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableGetTextHash", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("variableGetTextHash", "algorithm", algorithm, listOf("MD5", "SHA1", "SHA256"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_hash"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableIncrement(variable: Any, number: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableIncrement", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_increment"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableInsertListValue(variable: Any, list: Any, number: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val numberARG =  numberConvert("variableInsertListValue", "number", number)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_insert_list_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableJoinText(variable: Any, list: Any, separator: Any, prefix: Any, postfix: Any, limit: Any, truncated: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val separatorARG =  textConvert("variableJoinText", "separator", separator)
	val prefixARG =  textConvert("variableJoinText", "prefix", prefix)
	val postfixARG =  textConvert("variableJoinText", "postfix", postfix)
	val limitARG =  numberConvert("variableJoinText", "limit", limit)
	val truncatedARG =  textConvert("variableJoinText", "truncated", truncated)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("separator"),"value" to separatorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("prefix"),"value" to prefixARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("postfix"),"value" to postfixARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("limit"),"value" to limitARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("truncated"),"value" to truncatedARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_join_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLerpNumber(variable: Any, start: Any, stop: Any, amount: Any) {
	val variableARG = typeCheck<Var>(variable)
	val startARG =  numberConvert("variableLerpNumber", "start", start)
	val stopARG =  numberConvert("variableLerpNumber", "stop", stop)
	val amountARG =  numberConvert("variableLerpNumber", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("stop"),"value" to stopARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_lerp_number"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLocationRelative(variable: Any, location: Any, distance: Any, blockFace: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val distanceARG =  numberConvert("variableLocationRelative", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
enumCheck("variableLocationRelative", "blockFace", blockFace, listOf("DOWN", "EAST", "EAST_NORTH_EAST", "EAST_SOUTH_EAST", "NORTH", "NORTH_EAST", "NORTH_NORTH_EAST", "NORTH_NORTH_WEST", "NORTH_WEST", "SELF", "SOUTH", "SOUTH_EAST", "SOUTH_SOUTH_EAST", "SOUTH_SOUTH_WEST", "SOUTH_WEST", "UP", "WEST", "WEST_NORTH_WEST", "WEST_SOUTH_WEST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_location_relative"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLocationsDistance(variable: Any, location1: Any, location2: Any, type: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val location1ARG = typeCheck<JLocation>(location1)
	val location2ARG = typeCheck<JLocation>(location2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_1"),"value" to location1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_2"),"value" to location2ARG.parse())))
enumCheck("variableLocationsDistance", "type", type, listOf("ALTITUDE", "THREE_D", "TWO_D"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_locations_distance"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableLog(variable: Any, number: Any, base: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableLog", "number", number)
	val baseARG =  numberConvert("variableLog", "base", base)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("base"),"value" to baseARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_log"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMapRange(variable: Any, number: Any, fromStart: Any, fromStop: Any, toStart: Any, toStop: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableMapRange", "number", number)
	val fromStartARG =  numberConvert("variableMapRange", "fromStart", fromStart)
	val fromStopARG =  numberConvert("variableMapRange", "fromStop", fromStop)
	val toStartARG =  numberConvert("variableMapRange", "toStart", toStart)
	val toStopARG =  numberConvert("variableMapRange", "toStop", toStop)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("from_start"),"value" to fromStartARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("from_stop"),"value" to fromStopARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("to_start"),"value" to toStartARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("to_stop"),"value" to toStopARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_map_range"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMax(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableMax", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_max"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMin(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableMin", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_min"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMultiply(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableMultiply", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_multiply"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableMultiplyVector(variable: Any, vector: Any, multiplier: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)
	val multiplierARG =  numberConvert("variableMultiplyVector", "multiplier", multiplier)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("multiplier"),"value" to multiplierARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_multiply_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableParseJson(variable: Any, json: Any) {
	val variableARG = typeCheck<Var>(variable)
	val jsonARG =  textConvert("variableParseJson", "json", json)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("json"),"value" to jsonARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_parse_json"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableParseToComponent(variable: Any, text: Any, parsing: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableParseToComponent", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("variableParseToComponent", "parsing", parsing, listOf("JSON", "LEGACY", "MINIMESSAGE", "PLAIN"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_parse_to_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variablePerlinNoise3d(variable: Any, location: Any, seed: Any, locFrequency: Any, octaves: Any, frequency: Any, amplitude: Any, rangeMode: Any? = null, normalized: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val seedARG =  numberConvert("variablePerlinNoise3d", "seed", seed)
	val locFrequencyARG =  numberConvert("variablePerlinNoise3d", "locFrequency", locFrequency)
	val octavesARG =  numberConvert("variablePerlinNoise3d", "octaves", octaves)
	val frequencyARG =  numberConvert("variablePerlinNoise3d", "frequency", frequency)
	val amplitudeARG =  numberConvert("variablePerlinNoise3d", "amplitude", amplitude)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("seed"),"value" to seedARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("loc_frequency"),"value" to locFrequencyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("octaves"),"value" to octavesARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("frequency"),"value" to frequencyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amplitude"),"value" to amplitudeARG.parse())))
enumCheck("variablePerlinNoise3d", "rangeMode", rangeMode, listOf("FULL_RANGE", "ZERO_TO_ONE"))

enumCheck("variablePerlinNoise3d", "normalized", normalized, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_perlin_noise_3d"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variablePow(variable: Any, base: Any, power: Any) {
	val variableARG = typeCheck<Var>(variable)
	val baseARG =  numberConvert("variablePow", "base", base)
	val powerARG =  numberConvert("variablePow", "power", power)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("base"),"value" to baseARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("power"),"value" to powerARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_pow"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variablePurge(names: Any, scope: Any? = null, match: Any? = null, ignoreCase: Any? = null) {
	val namesARG =  textConvert("variablePurge", "names", names)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("names"),"value" to namesARG.parse())))
enumCheck("variablePurge", "scope", scope, listOf("GAME", "LOCAL", "SAVE"))

enumCheck("variablePurge", "match", match, listOf("EQUALS", "NAME_CONTAINS", "PART_CONTAINS"))

enumCheck("variablePurge", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_purge"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRandom(variable: Any, values: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valuesARG = typeCheck<JAny>(values)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_random"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRandomLocation(variable: Any, location1: Any, location2: Any, integer: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val location1ARG = typeCheck<JLocation>(location1)
	val location2ARG = typeCheck<JLocation>(location2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_1"),"value" to location1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_2"),"value" to location2ARG.parse())))
enumCheck("variableRandomLocation", "integer", integer, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_random_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRandomNumber(variable: Any, min: Any, max: Any, integer: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val minARG =  numberConvert("variableRandomNumber", "min", min)
	val maxARG =  numberConvert("variableRandomNumber", "max", max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
enumCheck("variableRandomNumber", "integer", integer, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_random_number"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRandomizeListOrder(variable: Any, list: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_randomize_list_order"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRayTraceResult(variableForHitLocation: Any, variableForHitBlockLocation: Any, variableForHitBlockFace: Any, variableForHitEntityUuid: Any, start: Any, raySize: Any, maxDistance: Any, entities: Any, rayCollisionMode: Any? = null, ignorePassableBlocks: Any? = null, fluidCollisionMode: Any? = null) {
	val variableForHitLocationARG = typeCheck<Var>(variableForHitLocation)
	val variableForHitBlockLocationARG = typeCheck<Var>(variableForHitBlockLocation)
	val variableForHitBlockFaceARG = typeCheck<Var>(variableForHitBlockFace)
	val variableForHitEntityUuidARG = typeCheck<Var>(variableForHitEntityUuid)
	val startARG = typeCheck<JLocation>(start)
	val raySizeARG =  numberConvert("variableRayTraceResult", "raySize", raySize)
	val maxDistanceARG =  numberConvert("variableRayTraceResult", "maxDistance", maxDistance)
	val entitiesARG = typeCheck<JArray>(entities)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable_for_hit_location"),"value" to variableForHitLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable_for_hit_block_location"),"value" to variableForHitBlockLocationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable_for_hit_block_face"),"value" to variableForHitBlockFaceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable_for_hit_entity_uuid"),"value" to variableForHitEntityUuidARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("ray_size"),"value" to raySizeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max_distance"),"value" to maxDistanceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("entities"),"value" to entitiesARG.parse())))
enumCheck("variableRayTraceResult", "rayCollisionMode", rayCollisionMode, listOf("BLOCKS_AND_ENTITIES", "ONLY_BLOCKS", "ONLY_ENTITIES"))

enumCheck("variableRayTraceResult", "ignorePassableBlocks", ignorePassableBlocks, listOf("FALSE", "TRUE"))

enumCheck("variableRayTraceResult", "fluidCollisionMode", fluidCollisionMode, listOf("ALWAYS", "NEVER", "SOURCE_ONLY"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_ray_trace_result"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableReflectVectorProduct(variable: Any, vector1: Any, vector2: Any, bounce: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vector1ARG = typeCheck<JVector>(vector1)
	val vector2ARG = typeCheck<JVector>(vector2)
	val bounceARG =  numberConvert("variableReflectVectorProduct", "bounce", bounce)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_1"),"value" to vector1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_2"),"value" to vector2ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("bounce"),"value" to bounceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_reflect_vector_product"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRegexReplaceText(variable: Any, text: Any, regex: Any, replacement: Any, first: Any? = null, ignoreCase: Any? = null, multiline: Any? = null, literal: Any? = null, unixLines: Any? = null, comments: Any? = null, dotMatchesAll: Any? = null, cannonEq: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableRegexReplaceText", "text", text)
	val regexARG =  textConvert("variableRegexReplaceText", "regex", regex)
	val replacementARG =  textConvert("variableRegexReplaceText", "replacement", replacement)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("regex"),"value" to regexARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("replacement"),"value" to replacementARG.parse())))
enumCheck("variableRegexReplaceText", "first", first, listOf("ANY", "FIRST"))

enumCheck("variableRegexReplaceText", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

enumCheck("variableRegexReplaceText", "multiline", multiline, listOf("FALSE", "TRUE"))

enumCheck("variableRegexReplaceText", "literal", literal, listOf("FALSE", "TRUE"))

enumCheck("variableRegexReplaceText", "unixLines", unixLines, listOf("FALSE", "TRUE"))

enumCheck("variableRegexReplaceText", "comments", comments, listOf("FALSE", "TRUE"))

enumCheck("variableRegexReplaceText", "dotMatchesAll", dotMatchesAll, listOf("FALSE", "TRUE"))

enumCheck("variableRegexReplaceText", "cannonEq", cannonEq, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_regex_replace_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemainder(variable: Any, dividend: Any, divisor: Any, remainderMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val dividendARG =  numberConvert("variableRemainder", "dividend", dividend)
	val divisorARG =  numberConvert("variableRemainder", "divisor", divisor)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("dividend"),"value" to dividendARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("divisor"),"value" to divisorARG.parse())))
enumCheck("variableRemainder", "remainderMode", remainderMode, listOf("MODULO", "REMAINDER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remainder"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveCompassLodestone(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_compass_lodestone"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveEnchantment(variable: Any, item: Any, enchantment: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val enchantmentARG =  textConvert("variableRemoveEnchantment", "enchantment", enchantment)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("enchantment"),"value" to enchantmentARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_enchantment"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveItemAttribute(variable: Any, item: Any, nameOrUuid: Any, attribute: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val nameOrUuidARG =  textConvert("variableRemoveItemAttribute", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
enumCheck("variableRemoveItemAttribute", "attribute", attribute, listOf("ARMOR", "ARMOR_TOUGHNESS", "ATTACK_DAMAGE", "ATTACK_KNOCKBACK", "ATTACK_SPEED", "FLYING_SPEED", "FOLLOW_RANGE", "GENERIC_ARMOR", "GENERIC_ARMOR_TOUGHNESS", "GENERIC_ATTACK_DAMAGE", "GENERIC_ATTACK_KNOCKBACK", "GENERIC_ATTACK_SPEED", "GENERIC_BURNING_TIME", "GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE", "GENERIC_FALL_DAMAGE_MULTIPLIER", "GENERIC_FLYING_SPEED", "GENERIC_FOLLOW_RANGE", "GENERIC_GRAVITY", "GENERIC_JUMP_STRENGTH", "GENERIC_KNOCKBACK_RESISTANCE", "GENERIC_LUCK", "GENERIC_MAX_ABSORPTION", "GENERIC_MAX_HEALTH", "GENERIC_MOVEMENT_EFFICIENCY", "GENERIC_MOVEMENT_SPEED", "GENERIC_OXYGEN_BONUS", "GENERIC_SAFE_FALL_DISTANCE", "GENERIC_SCALE", "GENERIC_STEP_HEIGHT", "GENERIC_WATER_MOVEMENT_EFFICIENCY", "HORSE_JUMP_STRENGTH", "KNOCKBACK_RESISTANCE", "LUCK", "MAX_ABSORPTION", "MAX_HEALTH", "MOVEMENT_SPEED", "PLAYER_BLOCK_BREAK_SPEED", "PLAYER_BLOCK_INTERACTION_RANGE", "PLAYER_ENTITY_INTERACTION_RANGE", "PLAYER_MINING_EFFICIENCY", "PLAYER_SNEAKING_SPEED", "PLAYER_SUBMERGED_MINING_SPEED", "PLAYER_SWEEPING_DAMAGE_RATIO", "ZOMBIE_SPAWN_REINFORCEMENTS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_item_attribute"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveItemCustomModelData(variable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_item_custom_model_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveItemCustomTag(variable: Any, item: Any, tagName: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val tagNameARG =  textConvert("variableRemoveItemCustomTag", "tagName", tagName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_name"),"value" to tagNameARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_item_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveItemLoreLine(variable: Any, item: Any, line: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val lineARG =  numberConvert("variableRemoveItemLoreLine", "line", line)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_item_lore_line"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveItemPotionEffects(variable: Any, effects: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val effectsARG = typeCheck<JPotion>(effects)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("effects"),"value" to effectsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_item_potion_effects"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveListDuplicates(variable: Any, list: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_list_duplicates"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveListValue(variable: Any, list: Any, value: Any, removeMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableRemoveListValue", "removeMode", removeMode, listOf("ALL", "FIRST", "LAST"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_list_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveListValueAtIndex(removedValue: Any, variable: Any, list: Any, index: Any) {
	val removedValueARG = typeCheck<Var>(removedValue)
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val indexARG =  numberConvert("variableRemoveListValueAtIndex", "index", index)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("removed_value"),"value" to removedValueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("index"),"value" to indexARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_list_value_at_index"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveMapEntry(removedValue: Any, variable: Any, map: Any, values: Any, key: Any) {
	val removedValueARG = typeCheck<Var>(removedValue)
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val valuesARG = typeCheck<JAny>(values)
	val keyARG = typeCheck<JAny>(key)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("removed_value"),"value" to removedValueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("values"),"value" to valuesARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_map_entry"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRemoveText(variable: Any, remove: Any, text: Any, regex: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val removeARG =  textConvert("variableRemoveText", "remove", remove)
	val textARG =  textConvert("variableRemoveText", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("remove"),"value" to removeARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("variableRemoveText", "regex", regex, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_remove_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRepeatText(variable: Any, text: Any, repeat: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableRepeatText", "text", text)
	val repeatARG =  numberConvert("variableRepeatText", "repeat", repeat)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("repeat"),"value" to repeatARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_repeat_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableReplaceText(variable: Any, text: Any, replace: Any, replacement: Any, first: Any? = null, ignoreCase: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableReplaceText", "text", text)
	val replaceARG =  textConvert("variableReplaceText", "replace", replace)
	val replacementARG =  textConvert("variableReplaceText", "replacement", replacement)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("replace"),"value" to replaceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("replacement"),"value" to replacementARG.parse())))
enumCheck("variableReplaceText", "first", first, listOf("ANY", "FIRST"))

enumCheck("variableReplaceText", "ignoreCase", ignoreCase, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_replace_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableReverseList(variable: Any, list: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_reverse_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRoot(variable: Any, base: Any, root: Any) {
	val variableARG = typeCheck<Var>(variable)
	val baseARG =  numberConvert("variableRoot", "base", base)
	val rootARG =  numberConvert("variableRoot", "root", root)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("base"),"value" to baseARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("root"),"value" to rootARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_root"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRotateVectorAroundAxis(variable: Any, vector: Any, angle: Any, axis: Any? = null, angleUnits: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)
	val angleARG =  numberConvert("variableRotateVectorAroundAxis", "angle", angle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("angle"),"value" to angleARG.parse())))
enumCheck("variableRotateVectorAroundAxis", "axis", axis, listOf("X", "Y", "Z"))

enumCheck("variableRotateVectorAroundAxis", "angleUnits", angleUnits, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_rotate_vector_around_axis"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRotateVectorAroundVector(variable: Any, rotatingVector: Any, axisVector: Any, angle: Any, angleUnits: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val rotatingVectorARG = typeCheck<JVector>(rotatingVector)
	val axisVectorARG = typeCheck<JVector>(axisVector)
	val angleARG =  numberConvert("variableRotateVectorAroundVector", "angle", angle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("rotating_vector"),"value" to rotatingVectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("axis_vector"),"value" to axisVectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("angle"),"value" to angleARG.parse())))
enumCheck("variableRotateVectorAroundVector", "angleUnits", angleUnits, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_rotate_vector_around_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableRound(variable: Any, number: Any, precision: Any, roundType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableRound", "number", number)
	val precisionARG =  numberConvert("variableRound", "precision", precision)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("precision"),"value" to precisionARG.parse())))
enumCheck("variableRound", "roundType", roundType, listOf("CEIL", "FLOOR", "ROUND"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_round"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetAllCoordinates(variable: Any, x: Any, y: Any, z: Any, yaw: Any, pitch: Any) {
	val variableARG = typeCheck<Var>(variable)
	val xARG =  numberConvert("variableSetAllCoordinates", "x", x)
	val yARG =  numberConvert("variableSetAllCoordinates", "y", y)
	val zARG =  numberConvert("variableSetAllCoordinates", "z", z)
	val yawARG =  numberConvert("variableSetAllCoordinates", "yaw", yaw)
	val pitchARG =  numberConvert("variableSetAllCoordinates", "pitch", pitch)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("x"),"value" to xARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("y"),"value" to yARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("z"),"value" to zARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_all_coordinates"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetArmorTrim(variable: Any, armor: Any, material: Any, pattern: Any) {
	val variableARG = typeCheck<Var>(variable)
	val armorARG = typeCheck<JItem>(armor)
	val materialARG = typeCheck<JItem>(material)
	val patternARG = typeCheck<JItem>(pattern)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("armor"),"value" to armorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("material"),"value" to materialARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pattern"),"value" to patternARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_armor_trim"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetBookPage(variable: Any, book: Any, text: Any, page: Any, mode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val bookARG = typeCheck<JItem>(book)
	val textARG =  textConvert("variableSetBookPage", "text", text)
	val pageARG =  numberConvert("variableSetBookPage", "page", page)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("book"),"value" to bookARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("page"),"value" to pageARG.parse())))
enumCheck("variableSetBookPage", "mode", mode, listOf("APPEND", "MERGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_book_page"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetBookPages(variable: Any, book: Any, text: Any) {
	val variableARG = typeCheck<Var>(variable)
	val bookARG = typeCheck<JItem>(book)
	val textARG =  textConvert("variableSetBookPages", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("book"),"value" to bookARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_book_pages"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetBundleItems(variable: Any, items: Any, bundle: Any, settingMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemsARG = typeCheck<JItem>(items)
	val bundleARG = typeCheck<JItem>(bundle)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("items"),"value" to itemsARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("bundle"),"value" to bundleARG.parse())))
enumCheck("variableSetBundleItems", "settingMode", settingMode, listOf("ADD", "REMOVE", "SET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_bundle_items"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetCompassLodestone(variable: Any, item: Any, location: Any, tracked: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val locationARG = typeCheck<JLocation>(location)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
enumCheck("variableSetCompassLodestone", "tracked", tracked, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_compass_lodestone"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentChildren(variable: Any, component: Any, children: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentChildren", "component", component)
	val childrenARG =  textConvert("variableSetComponentChildren", "children", children)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("children"),"value" to childrenARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_children"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentClick(variable: Any, component: Any, value: Any, clickAction: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentClick", "component", component)
	val valueARG =  textConvert("variableSetComponentClick", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableSetComponentClick", "clickAction", clickAction, listOf("CHANGE_PAGE", "COPY_TO_CLIPBOARD", "COPY_TO_CLIPBORD", "OPEN_URL", "SUGGEST_COMMAND"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_click"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentDecorations(variable: Any, component: Any, bold: Any? = null, italic: Any? = null, underlined: Any? = null, strikethrough: Any? = null, obfuscated: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentDecorations", "component", component)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
enumCheck("variableSetComponentDecorations", "bold", bold, listOf("FALSE", "NOT_SET", "TRUE"))

enumCheck("variableSetComponentDecorations", "italic", italic, listOf("FALSE", "NOT_SET", "TRUE"))

enumCheck("variableSetComponentDecorations", "underlined", underlined, listOf("FALSE", "NOT_SET", "TRUE"))

enumCheck("variableSetComponentDecorations", "strikethrough", strikethrough, listOf("FALSE", "NOT_SET", "TRUE"))

enumCheck("variableSetComponentDecorations", "obfuscated", obfuscated, listOf("FALSE", "NOT_SET", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_decorations"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentEntityHover(variable: Any, component: Any, nameOrUuid: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentEntityHover", "component", component)
	val nameOrUuidARG =  textConvert("variableSetComponentEntityHover", "nameOrUuid", nameOrUuid)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name_or_uuid"),"value" to nameOrUuidARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_entity_hover"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentFont(variable: Any, component: Any, namespace: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentFont", "component", component)
	val namespaceARG =  textConvert("variableSetComponentFont", "namespace", namespace)
	val valueARG =  textConvert("variableSetComponentFont", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("namespace"),"value" to namespaceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_font"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentHexColor(variable: Any, component: Any, color: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentHexColor", "component", component)
	val colorARG =  textConvert("variableSetComponentHexColor", "color", color)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("color"),"value" to colorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_hex_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentHover(variable: Any, component: Any, hover: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentHover", "component", component)
	val hoverARG =  textConvert("variableSetComponentHover", "hover", hover)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("hover"),"value" to hoverARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_hover"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentInsertion(variable: Any, component: Any, insertion: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentInsertion", "component", component)
	val insertionARG =  textConvert("variableSetComponentInsertion", "insertion", insertion)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("insertion"),"value" to insertionARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_insertion"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetComponentItemHover(variable: Any, component: Any, hover: Any) {
	val variableARG = typeCheck<Var>(variable)
	val componentARG =  textConvert("variableSetComponentItemHover", "component", component)
	val hoverARG = typeCheck<JItem>(hover)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("hover"),"value" to hoverARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_component_item_hover"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetCoordinate(variable: Any, location: Any, coordinate: Any, type: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val coordinateARG =  numberConvert("variableSetCoordinate", "coordinate", coordinate)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("coordinate"),"value" to coordinateARG.parse())))
enumCheck("variableSetCoordinate", "type", type, listOf("PITCH", "X", "Y", "YAW", "Z"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_coordinate"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemAmount(variable: Any, item: Any, amount: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val amountARG =  numberConvert("variableSetItemAmount", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_amount"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemAttribute(variable: Any, item: Any, amount: Any, name: Any, attribute: Any? = null, slot: Any? = null, operation: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val amountARG =  numberConvert("variableSetItemAttribute", "amount", amount)
	val nameARG =  textConvert("variableSetItemAttribute", "name", name)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("name"),"value" to nameARG.parse())))
enumCheck("variableSetItemAttribute", "attribute", attribute, listOf("ARMOR", "ARMOR_TOUGHNESS", "ATTACK_DAMAGE", "ATTACK_KNOCKBACK", "ATTACK_SPEED", "FLYING_SPEED", "FOLLOW_RANGE", "GENERIC_ARMOR", "GENERIC_ARMOR_TOUGHNESS", "GENERIC_ATTACK_DAMAGE", "GENERIC_ATTACK_KNOCKBACK", "GENERIC_ATTACK_SPEED", "GENERIC_BURNING_TIME", "GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE", "GENERIC_FALL_DAMAGE_MULTIPLIER", "GENERIC_FLYING_SPEED", "GENERIC_FOLLOW_RANGE", "GENERIC_GRAVITY", "GENERIC_JUMP_STRENGTH", "GENERIC_KNOCKBACK_RESISTANCE", "GENERIC_LUCK", "GENERIC_MAX_ABSORPTION", "GENERIC_MAX_HEALTH", "GENERIC_MOVEMENT_EFFICIENCY", "GENERIC_MOVEMENT_SPEED", "GENERIC_OXYGEN_BONUS", "GENERIC_SAFE_FALL_DISTANCE", "GENERIC_SCALE", "GENERIC_STEP_HEIGHT", "GENERIC_WATER_MOVEMENT_EFFICIENCY", "HORSE_JUMP_STRENGTH", "KNOCKBACK_RESISTANCE", "LUCK", "MAX_ABSORPTION", "MAX_HEALTH", "MOVEMENT_SPEED", "PLAYER_BLOCK_BREAK_SPEED", "PLAYER_BLOCK_INTERACTION_RANGE", "PLAYER_ENTITY_INTERACTION_RANGE", "PLAYER_MINING_EFFICIENCY", "PLAYER_SNEAKING_SPEED", "PLAYER_SUBMERGED_MINING_SPEED", "PLAYER_SWEEPING_DAMAGE_RATIO", "ZOMBIE_SPAWN_REINFORCEMENTS"))

enumCheck("variableSetItemAttribute", "slot", slot, listOf("ALL", "ARMOR", "BODY", "BOOTS", "CHEST", "HAND", "HEAD", "LEGGINGS", "MAIN_HAND", "OFF_HAND"))

enumCheck("variableSetItemAttribute", "operation", operation, listOf("ADD_NUMBER", "ADD_SCALAR", "MULTIPLY_SCALAR_1"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_attribute"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemColor(variable: Any, item: Any, color: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val colorARG =  textConvert("variableSetItemColor", "color", color)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("color"),"value" to colorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemComponent(variable: Any, item: Any, component: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val componentARG =  textConvert("variableSetItemComponent", "component", component)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("component"),"value" to componentARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemCustomModelData(variable: Any, item: Any, model: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val modelARG =  numberConvert("variableSetItemCustomModelData", "model", model)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("model"),"value" to modelARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_custom_model_data"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemCustomTag(variable: Any, item: Any, tagName: Any, tagValue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val tagNameARG =  textConvert("variableSetItemCustomTag", "tagName", tagName)
	val tagValueARG =  textConvert("variableSetItemCustomTag", "tagValue", tagValue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_name"),"value" to tagNameARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("tag_value"),"value" to tagValueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_custom_tag"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemDestroyableBlocks(variable: Any, destroyable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val destroyableARG = typeCheck<JItem>(destroyable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("destroyable"),"value" to destroyableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_destroyable_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemDurability(variable: Any, item: Any, durability: Any, durabilityType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val durabilityARG =  numberConvert("variableSetItemDurability", "durability", durability)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("durability"),"value" to durabilityARG.parse())))
enumCheck("variableSetItemDurability", "durabilityType", durabilityType, listOf("DAMAGE", "DAMAGE_PERCENTAGE", "MAXIMUM", "REMAINING", "REMAINING_PERCENTAGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_durability"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemEnchantments(variable: Any, item: Any, enchantments: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val enchantmentsARG = typeCheck<JMap>(enchantments)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("enchantments"),"value" to enchantmentsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_enchantments"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemLore(variable: Any, lore: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val loreARG =  textConvert("variableSetItemLore", "lore", lore)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("lore"),"value" to loreARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_lore"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemLoreLine(variable: Any, item: Any, text: Any, line: Any, mode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val textARG =  textConvert("variableSetItemLoreLine", "text", text)
	val lineARG =  numberConvert("variableSetItemLoreLine", "line", line)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("line"),"value" to lineARG.parse())))
enumCheck("variableSetItemLoreLine", "mode", mode, listOf("APPEND", "MERGE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_lore_line"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemMaxStackSize(variable: Any, item: Any, size: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val sizeARG =  numberConvert("variableSetItemMaxStackSize", "size", size)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_max_stack_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemName(variable: Any, item: Any, text: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val textARG =  textConvert("variableSetItemName", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemPlaceableBlocks(variable: Any, placeable: Any, item: Any) {
	val variableARG = typeCheck<Var>(variable)
	val placeableARG = typeCheck<JItem>(placeable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("placeable"),"value" to placeableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_placeable_blocks"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemType(variable: Any, item: Any, type: Any) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)
	val typeARG =  textConvert("variableSetItemType", "type", type)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("type"),"value" to typeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemUnbreakable(variable: Any, item: Any, unbreakable: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("variableSetItemUnbreakable", "unbreakable", unbreakable, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_unbreakable"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetItemVisibilityFlags(variable: Any, item: Any, hideDye: Any? = null, hideEnchantments: Any? = null, hideAttributes: Any? = null, hideUnbreakable: Any? = null, hidePlaceOn: Any? = null, hideDestroys: Any? = null, hidePotionEffects: Any? = null, hideArmorTrim: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val itemARG = typeCheck<JItem>(item)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("item"),"value" to itemARG.parse())))
enumCheck("variableSetItemVisibilityFlags", "hideDye", hideDye, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hideEnchantments", hideEnchantments, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hideAttributes", hideAttributes, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hideUnbreakable", hideUnbreakable, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hidePlaceOn", hidePlaceOn, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hideDestroys", hideDestroys, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hidePotionEffects", hidePotionEffects, listOf("NO_CHANGE", "OFF", "ON"))

enumCheck("variableSetItemVisibilityFlags", "hideArmorTrim", hideArmorTrim, listOf("NO_CHANGE", "OFF", "ON"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_item_visibility_flags"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetListValue(variable: Any, list: Any, number: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val numberARG =  numberConvert("variableSetListValue", "number", number)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_list_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetLocationDirection(variable: Any, location: Any, vector: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_location_direction"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetMapValue(variable: Any, map: Any, key: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)
	val keyARG = typeCheck<JAny>(key)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("key"),"value" to keyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_map_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleAmount(variable: Any, particle: Any, amount: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val amountARG =  numberConvert("variableSetParticleAmount", "amount", amount)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amount"),"value" to amountARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_amount"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleColor(variable: Any, particle: Any, hexColor: Any, colorType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val hexColorARG =  textConvert("variableSetParticleColor", "hexColor", hexColor)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("hex_color"),"value" to hexColorARG.parse())))
enumCheck("variableSetParticleColor", "colorType", colorType, listOf("COLOR", "TO_COLOR"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_color"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleMaterial(variable: Any, particle: Any, material: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val materialARG = typeCheck<JItem>(material)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("material"),"value" to materialARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_material"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleOffset(variable: Any, particle: Any, offset: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val offsetARG = typeCheck<JVector>(offset)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("offset"),"value" to offsetARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_offset"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleSize(variable: Any, particle: Any, size: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val sizeARG =  numberConvert("variableSetParticleSize", "size", size)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("size"),"value" to sizeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_size"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleSpread(variable: Any, particle: Any, horizontal: Any, vertical: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val horizontalARG =  numberConvert("variableSetParticleSpread", "horizontal", horizontal)
	val verticalARG =  numberConvert("variableSetParticleSpread", "vertical", vertical)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("horizontal"),"value" to horizontalARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vertical"),"value" to verticalARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_spread"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetParticleType(variable: Any, particle: Any, type: Any) {
	val variableARG = typeCheck<Var>(variable)
	val particleARG = typeCheck<JParticle>(particle)
	val typeARG =  textConvert("variableSetParticleType", "type", type)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("particle"),"value" to particleARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("type"),"value" to typeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_particle_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetPotionEffectAmplifier(variable: Any, potion: Any, amplifier: Any) {
	val variableARG = typeCheck<Var>(variable)
	val potionARG = typeCheck<JPotion>(potion)
	val amplifierARG =  numberConvert("variableSetPotionEffectAmplifier", "amplifier", amplifier)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion"),"value" to potionARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amplifier"),"value" to amplifierARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_potion_effect_amplifier"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetPotionEffectDuration(variable: Any, potion: Any, duration: Any) {
	val variableARG = typeCheck<Var>(variable)
	val potionARG = typeCheck<JPotion>(potion)
	val durationARG =  numberConvert("variableSetPotionEffectDuration", "duration", duration)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion"),"value" to potionARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("duration"),"value" to durationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_potion_effect_duration"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetPotionEffectType(variable: Any, potion: Any, effectType: Any) {
	val variableARG = typeCheck<Var>(variable)
	val potionARG = typeCheck<JPotion>(potion)
	val effectTypeARG =  textConvert("variableSetPotionEffectType", "effectType", effectType)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("potion"),"value" to potionARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("effect_type"),"value" to effectTypeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_potion_effect_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetSoundPitch(variable: Any, sound: Any, pitch: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)
	val pitchARG =  numberConvert("variableSetSoundPitch", "pitch", pitch)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_sound_pitch"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetSoundSource(variable: Any, sound: Any, source: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
enumCheck("variableSetSoundSource", "source", source, listOf("AMBIENT", "BLOCK", "HOSTILE", "MASTER", "MUSIC", "NEUTRAL", "PLAYER", "RECORD", "VOICE", "WEATHER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_sound_source"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetSoundType(variable: Any, sound: Any, namespace: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)
	val namespaceARG =  textConvert("variableSetSoundType", "namespace", namespace)
	val valueARG =  textConvert("variableSetSoundType", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("namespace"),"value" to namespaceARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_sound_type"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetSoundVariation(variable: Any, sound: Any, variation: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)
	val variationARG =  textConvert("variableSetSoundVariation", "variation", variation)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variation"),"value" to variationARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_sound_variation"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetSoundVolumeAction(variable: Any, sound: Any, volume: Any) {
	val variableARG = typeCheck<Var>(variable)
	val soundARG = typeCheck<JSound>(sound)
	val volumeARG =  numberConvert("variableSetSoundVolumeAction", "volume", volume)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("sound"),"value" to soundARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("volume"),"value" to volumeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_sound_volume_action"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetTemplateCode(variable: Any, template: Any, code: Any) {
	val variableARG = typeCheck<Var>(variable)
	val templateARG = typeCheck<JItem>(template)
	val codeARG = typeCheck<JAny>(code)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("template"),"value" to templateARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("code"),"value" to codeARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_template_code"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetTextureToMap(variable: Any, map: Any, url: Any) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JItem>(map)
	val urlARG =  textConvert("variableSetTextureToMap", "url", url)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("url"),"value" to urlARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_texture_to_map"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetVectorComponent(variable: Any, vector: Any, value: Any, vectorComponent: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)
	val valueARG =  numberConvert("variableSetVectorComponent", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableSetVectorComponent", "vectorComponent", vectorComponent, listOf("X", "Y", "Z"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_vector_component"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetVectorLength(variable: Any, vector: Any, length: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)
	val lengthARG =  numberConvert("variableSetVectorLength", "length", length)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("length"),"value" to lengthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_set_vector_length"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableShiftAllCoordinates(variable: Any, location: Any, x: Any, y: Any, z: Any, yaw: Any, pitch: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val xARG =  numberConvert("variableShiftAllCoordinates", "x", x)
	val yARG =  numberConvert("variableShiftAllCoordinates", "y", y)
	val zARG =  numberConvert("variableShiftAllCoordinates", "z", z)
	val yawARG =  numberConvert("variableShiftAllCoordinates", "yaw", yaw)
	val pitchARG =  numberConvert("variableShiftAllCoordinates", "pitch", pitch)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("x"),"value" to xARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("y"),"value" to yARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("z"),"value" to zARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("yaw"),"value" to yawARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("pitch"),"value" to pitchARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_shift_all_coordinates"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableShiftCoordinate(variable: Any, location: Any, distance: Any, type: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val distanceARG =  numberConvert("variableShiftCoordinate", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
enumCheck("variableShiftCoordinate", "type", type, listOf("PITCH", "X", "Y", "YAW", "Z"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_shift_coordinate"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableShiftLocationInDirection(variable: Any, location: Any, shift: Any, direction: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val shiftARG =  numberConvert("variableShiftLocationInDirection", "shift", shift)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("shift"),"value" to shiftARG.parse())))
enumCheck("variableShiftLocationInDirection", "direction", direction, listOf("FORWARD", "SIDEWAYS", "UPWARD"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_shift_location_in_direction"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableShiftLocationOnVector(variable: Any, location: Any, vector: Any, length: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val vectorARG = typeCheck<JVector>(vector)
	val lengthARG =  numberConvert("variableShiftLocationOnVector", "length", length)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("length"),"value" to lengthARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_shift_location_on_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableShiftLocationTowardsLocation(variable: Any, locationFrom: Any, locationTo: Any, distance: Any) {
	val variableARG = typeCheck<Var>(variable)
	val locationFromARG = typeCheck<JLocation>(locationFrom)
	val locationToARG = typeCheck<JLocation>(locationTo)
	val distanceARG =  numberConvert("variableShiftLocationTowardsLocation", "distance", distance)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_from"),"value" to locationFromARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location_to"),"value" to locationToARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("distance"),"value" to distanceARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_shift_location_towards_location"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSimplexNoise3d(variable: Any, location: Any, seed: Any, locFrequency: Any, octaves: Any, frequency: Any, amplitude: Any, rangeMode: Any? = null, normalized: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val seedARG =  numberConvert("variableSimplexNoise3d", "seed", seed)
	val locFrequencyARG =  numberConvert("variableSimplexNoise3d", "locFrequency", locFrequency)
	val octavesARG =  numberConvert("variableSimplexNoise3d", "octaves", octaves)
	val frequencyARG =  numberConvert("variableSimplexNoise3d", "frequency", frequency)
	val amplitudeARG =  numberConvert("variableSimplexNoise3d", "amplitude", amplitude)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("seed"),"value" to seedARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("loc_frequency"),"value" to locFrequencyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("octaves"),"value" to octavesARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("frequency"),"value" to frequencyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("amplitude"),"value" to amplitudeARG.parse())))
enumCheck("variableSimplexNoise3d", "rangeMode", rangeMode, listOf("FULL_RANGE", "ZERO_TO_ONE"))

enumCheck("variableSimplexNoise3d", "normalized", normalized, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_simplex_noise_3d"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSine(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableSine", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
enumCheck("variableSine", "variant", variant, listOf("ARCSINE", "HYPERBOLIC_SINE", "SINE"))

enumCheck("variableSine", "input", input, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_sine"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSortList(variable: Any, list: Any, sortMode: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
enumCheck("variableSortList", "sortMode", sortMode, listOf("ASCENDING", "DESCENDING"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_sort_any_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSortMap(variable: Any, map: Any, sortOrder: Any? = null, sortType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val mapARG = typeCheck<JMap>(map)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("map"),"value" to mapARG.parse())))
enumCheck("variableSortMap", "sortOrder", sortOrder, listOf("ASCENDING", "DESCENDING"))

enumCheck("variableSortMap", "sortType", sortType, listOf("KEYS", "VALUES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_sort_any_map"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSplitText(variable: Any, text: Any, delimiter: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableSplitText", "text", text)
	val delimiterARG =  textConvert("variableSplitText", "delimiter", delimiter)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("delimiter"),"value" to delimiterARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_split_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableStripText(variable: Any, text: Any, stripType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableStripText", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("variableStripText", "stripType", stripType, listOf("ALL", "END", "INDENT", "START"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_strip_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSubtract(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG =  numberConvert("variableSubtract", "value", value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_subtract"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSubtractVectors(variable: Any, vectors: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vectorsARG = typeCheck<JVector>(vectors)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vectors"),"value" to vectorsARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_subtract_vectors"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTangent(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableTangent", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
enumCheck("variableTangent", "variant", variant, listOf("ARCTANGENT", "HYPERBOLIC_TANGENT", "TANGENT"))

enumCheck("variableTangent", "input", input, listOf("DEGREES", "RADIANS"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_tangent"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetText(variable: Any, text: Any, merging: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableSetText", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("variableSetText", "merging", merging, listOf("CONCATENATION", "SEPARATE_LINES", "SPACES"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetTextCase(variable: Any, text: Any, caseType: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableSetTextCase", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
enumCheck("variableSetTextCase", "caseType", caseType, listOf("INVERT", "LOWER", "PROPER", "RANDOM", "UPPER"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_text_case"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableGetTextLength(variable: Any, text: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableGetTextLength", "text", text)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_text_length"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableToChar(variable: Any, number: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableToChar", "number", number)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_to_char"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableToHsb(variable: Any, hue: Any, saturation: Any, brightness: Any) {
	val variableARG = typeCheck<Var>(variable)
	val hueARG =  numberConvert("variableToHsb", "hue", hue)
	val saturationARG =  numberConvert("variableToHsb", "saturation", saturation)
	val brightnessARG =  numberConvert("variableToHsb", "brightness", brightness)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("hue"),"value" to hueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("saturation"),"value" to saturationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("brightness"),"value" to brightnessARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_to_hsb"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableToHsl(variable: Any, hue: Any, saturation: Any, lightness: Any) {
	val variableARG = typeCheck<Var>(variable)
	val hueARG =  numberConvert("variableToHsl", "hue", hue)
	val saturationARG =  numberConvert("variableToHsl", "saturation", saturation)
	val lightnessARG =  numberConvert("variableToHsl", "lightness", lightness)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("hue"),"value" to hueARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("saturation"),"value" to saturationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("lightness"),"value" to lightnessARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_to_hsl"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableToJson(variable: Any, value: Any, prettyPrint: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
enumCheck("variableToJson", "prettyPrint", prettyPrint, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_to_json"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableToRgb(variable: Any, red: Any, green: Any, blue: Any) {
	val variableARG = typeCheck<Var>(variable)
	val redARG =  numberConvert("variableToRgb", "red", red)
	val greenARG =  numberConvert("variableToRgb", "green", green)
	val blueARG =  numberConvert("variableToRgb", "blue", blue)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("red"),"value" to redARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("green"),"value" to greenARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("blue"),"value" to blueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_to_rgb"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTrimList(variable: Any, list: Any, start: Any, end: Any) {
	val variableARG = typeCheck<Var>(variable)
	val listARG = typeCheck<JArray>(list)
	val startARG =  numberConvert("variableTrimList", "start", start)
	val endARG =  numberConvert("variableTrimList", "end", end)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("list"),"value" to listARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("end"),"value" to endARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_trim_list"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableTrimText(variable: Any, text: Any, start: Any, end: Any) {
	val variableARG = typeCheck<Var>(variable)
	val textARG =  textConvert("variableTrimText", "text", text)
	val startARG =  numberConvert("variableTrimText", "start", start)
	val endARG =  numberConvert("variableTrimText", "end", end)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("text"),"value" to textARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("start"),"value" to startARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("end"),"value" to endARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_trim_text"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetValue(variable: Any, value: Any) {
	val variableARG = typeCheck<Var>(variable)
	val valueARG = typeCheck<JAny>(value)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("value"),"value" to valueARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_value"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableSetVector(variable: Any, x: Any, y: Any, z: Any) {
	val variableARG = typeCheck<Var>(variable)
	val xARG =  numberConvert("variableSetVector", "x", x)
	val yARG =  numberConvert("variableSetVector", "y", y)
	val zARG =  numberConvert("variableSetVector", "z", z)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("x"),"value" to xARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("y"),"value" to yARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("z"),"value" to zARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_vector"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableVectorCrossProduct(variable: Any, vector1: Any, vector2: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vector1ARG = typeCheck<JVector>(vector1)
	val vector2ARG = typeCheck<JVector>(vector2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_1"),"value" to vector1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_2"),"value" to vector2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_vector_cross_product"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableVectorDotProduct(variable: Any, vector1: Any, vector2: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vector1ARG = typeCheck<JVector>(vector1)
	val vector2ARG = typeCheck<JVector>(vector2)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_1"),"value" to vector1ARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector_2"),"value" to vector2ARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_vector_dot_product"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableVectorToDirectionName(variable: Any, vector: Any) {
	val variableARG = typeCheck<Var>(variable)
	val vectorARG = typeCheck<JVector>(vector)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("vector"),"value" to vectorARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_vector_to_direction_name"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableVoronoiNoise3d(variable: Any, location: Any, seed: Any, frequency: Any, displacement: Any, rangeMode: Any? = null, enableDistance: Any? = null) {
	val variableARG = typeCheck<Var>(variable)
	val locationARG = typeCheck<JLocation>(location)
	val seedARG =  numberConvert("variableVoronoiNoise3d", "seed", seed)
	val frequencyARG =  numberConvert("variableVoronoiNoise3d", "frequency", frequency)
	val displacementARG =  numberConvert("variableVoronoiNoise3d", "displacement", displacement)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("location"),"value" to locationARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("seed"),"value" to seedARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("frequency"),"value" to frequencyARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("displacement"),"value" to displacementARG.parse())))
enumCheck("variableVoronoiNoise3d", "rangeMode", rangeMode, listOf("FULL_RANGE", "ZERO_TO_ONE"))

enumCheck("variableVoronoiNoise3d", "enableDistance", enableDistance, listOf("FALSE", "TRUE"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_voronoi_noise_3d"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun variableWarp(variable: Any, number: Any, min: Any, max: Any) {
	val variableARG = typeCheck<Var>(variable)
	val numberARG =  numberConvert("variableWarp", "number", number)
	val minARG =  numberConvert("variableWarp", "min", min)
	val maxARG =  numberConvert("variableWarp", "max", max)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("variable"),"value" to variableARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("number"),"value" to numberARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("min"),"value" to minARG.parse())))
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("max"),"value" to maxARG.parse())))
    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("set_variable_warp"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

fun codeStartProcess(processName: Any, localVariablesMode: Any? = null, targetMode: Any? = null) {
	val processNameARG =  textConvert("codeStartProcess", "processName", processName)

    val funValues = mutableListOf<JsonObject>()
funValues.add(JsonObject(hashMapOf("name" to JsonPrimitive("process_name"),"value" to processNameARG.parse())))
enumCheck("codeStartProcess", "localVariablesMode", localVariablesMode, listOf("COPY", "DONT_COPY", "SHARE"))

enumCheck("codeStartProcess", "targetMode", targetMode, listOf("CURRENT_SELECTION", "CURRENT_TARGET", "FOR_EACH_IN_SELECTION", "NO_TARGET"))

    val op = JsonObject(hashMapOf(
        "action" to JsonPrimitive("start_process"),
        "values" to JsonArray(funValues)
    ))
    currentScope.addOperationToScope(op)
}

