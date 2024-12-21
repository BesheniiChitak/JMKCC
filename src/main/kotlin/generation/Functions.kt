@file:Suppress("SpellCheckingInspection", "PackageDirectoryMismatch", "unused")
fun codeCallFunction(functionName: Any) {
	val funName = "codeCallFunction"
	val functionNameARG=textConvert(funName,"functionName",functionName)
	handleFun("call_function", listOf(funValue("function_name",functionNameARG.parse())))
}
fun codeCallException(id: Any, message: Any, type: Any? = null) {
	val funName = "codeCallException"
	val idARG=textConvert(funName,"id",id)
	val messageARG=textConvert(funName,"message",message)
	enumCheck(funName,"type",type,listOf("ERROR","FATAL","WARNING"))
	handleFun("control_call_exception", listOf(funValue("id",idARG.parse()),funValue("message",messageARG.parse())))
}
fun codeBreak() {
	handleFun("control_end_thread", listOf())
}
fun codeReturnFunction() {
	handleFun("control_return_function", listOf())
}
fun codeSkipIteration() {
	handleFun("control_skip_iteration", listOf())
}
fun codeStopRepeat() {
	handleFun("control_stop_repeat", listOf())
}
fun codeWait(duration: Any, timeUnit: Any? = null) {
	val funName = "codeWait"
	val durationARG=numberConvert(funName,"duration",duration)
	enumCheck(funName,"timeUnit",timeUnit,listOf("MINUTES","SECONDS","TICKS"))
	handleFun("control_wait", listOf(funValue("duration",durationARG.parse())))
}
fun controllerAsyncRun() {
	handleFun("controller_async_run", listOf())
}
fun controllerCatchException(variable: Any, exceptionType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val funName = "controllerCatchException"
	enumCheck(funName,"exceptionType",exceptionType,listOf("ALL","ERROR","WARNING"))
	handleFun("controller_exception", listOf(funValue("variable",variableARG.parse())))
}
fun controllerMeasureTime(variable: Any, duration: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val funName = "controllerMeasureTime"
	enumCheck(funName,"duration",duration,listOf("MICROSECONDS","MILLISECONDS","NANOSECONDS"))
	handleFun("controller_measure_time", listOf(funValue("variable",variableARG.parse())))
}
fun codeElse() {
	handleFun("else", listOf())
}
fun entityAttachLead(nameOrUuid: Any, location: Any) {
	val funName = "entityAttachLead"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("entity_attach_lead", listOf(funValue("name_or_uuid",nameOrUuidARG.parse()),funValue("location",locationARG.parse())))
}
fun entityClearPotionEffects() {
	handleFun("entity_celar_potion_effects", listOf())
}
fun entityClearMerchantRecipes() {
	handleFun("entity_clear_merchant_recipes", listOf())
}
fun entityDamage(damage: Any, source: Any) {
	val funName = "entityDamage"
	val damageARG=numberConvert(funName,"damage",damage)
	val sourceARG=textConvert(funName,"source",source)
	handleFun("entity_damage", listOf(funValue("damage",damageARG.parse()),funValue("source",sourceARG.parse())))
}
fun entityDisguiseAsBlock(block: Any) {
	val blockARG=typeCheck<JBlock>(block)
	handleFun("entity_disguise_as_block", listOf(funValue("block",blockARG.parse())))
}
fun entityDisguiseAsEntity(entityType: Any) {
	val entityTypeARG=typeCheck<JItem>(entityType)
	handleFun("entity_disguise_as_entity", listOf(funValue("entity_type",entityTypeARG.parse())))
}
fun entityDisguiseAsItem(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("entity_disguise_as_item", listOf(funValue("item",itemARG.parse())))
}
fun entityDisguiseAsPlayer(nameOrUuid: Any, displayName: Any, serverType: Any? = null) {
	val funName = "entityDisguiseAsPlayer"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	val displayNameARG=textConvert(funName,"displayName",displayName)
	enumCheck(funName,"serverType",serverType,listOf("MOJANG","SERVER"))
	handleFun("entity_disguise_as_player", listOf(funValue("name_or_uuid",nameOrUuidARG.parse()),funValue("display_name",displayNameARG.parse())))
}
fun entityEatGrass() {
	handleFun("entity_eat_grass", listOf())
}
fun entityEatTarget(nameOrUuid: Any) {
	val funName = "entityEatTarget"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("entity_eat_target", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun entityExplode() {
	handleFun("entity_explode", listOf())
}
fun entityFaceLocation(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("entity_face_location", listOf(funValue("location",locationARG.parse())))
}
fun entityGetCustomTag(variable: Any, name: Any, default: Any) {
	val funName = "entityGetCustomTag"
	val variableARG=typeCheck<Var>(variable)
	val nameARG=textConvert(funName,"name",name)
	val defaultARG=typeCheck<JAny>(default)
	handleFun("entity_get_custom_tag", listOf(funValue("variable",variableARG.parse()),funValue("name",nameARG.parse()),funValue("default",defaultARG.parse())))
}
fun entityGivePotionEffects(potions: Any, overwrite: Any? = null, showIcon: Any? = null, particleMode: Any? = null) {
	val potionsARG=typeCheck<JPotion>(potions)
	val funName = "entityGivePotionEffects"
	enumCheck(funName,"overwrite",overwrite,listOf("FALSE","TRUE"))
	enumCheck(funName,"showIcon",showIcon,listOf("FALSE","TRUE"))
	enumCheck(funName,"particleMode",particleMode,listOf("AMBIENT","NONE","REGULAR"))
	handleFun("entity_give_potion_effects", listOf(funValue("potions",potionsARG.parse())))
}
fun entityHeal(heal: Any) {
	val funName = "entityHeal"
	val healARG=numberConvert(funName,"heal",heal)
	handleFun("entity_heal", listOf(funValue("heal",healARG.parse())))
}
fun entityIgniteCreeper() {
	handleFun("entity_ignite_creeper", listOf())
}
fun entityJump() {
	handleFun("entity_jump", listOf())
}
fun entityLaunchForward(power: Any, increment: Any? = null, launchAxis: Any? = null) {
	val funName = "entityLaunchForward"
	val powerARG=numberConvert(funName,"power",power)
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	enumCheck(funName,"launchAxis",launchAxis,listOf("YAW","YAW_AND_PITCH"))
	handleFun("entity_launch_forward", listOf(funValue("power",powerARG.parse())))
}
fun entityLaunchProjectile(projectile: Any, location: Any, name: Any, speed: Any, inaccuracy: Any, trail: Any) {
	val funName = "entityLaunchProjectile"
	val projectileARG=typeCheck<JItem>(projectile)
	val locationARG=typeCheck<JLocation>(location)
	val nameARG=textConvert(funName,"name",name)
	val speedARG=numberConvert(funName,"speed",speed)
	val inaccuracyARG=numberConvert(funName,"inaccuracy",inaccuracy)
	val trailARG=typeCheck<JParticle>(trail)
	handleFun("entity_launch_projectile", listOf(funValue("projectile",projectileARG.parse()),funValue("location",locationARG.parse()),funValue("name",nameARG.parse()),funValue("speed",speedARG.parse()),funValue("inaccuracy",inaccuracyARG.parse()),funValue("trail",trailARG.parse())))
}
fun entityLaunchToLocation(location: Any, power: Any, increment: Any? = null) {
	val funName = "entityLaunchToLocation"
	val locationARG=typeCheck<JLocation>(location)
	val powerARG=numberConvert(funName,"power",power)
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	handleFun("entity_launch_to_location", listOf(funValue("location",locationARG.parse()),funValue("power",powerARG.parse())))
}
fun entityLaunchUp(power: Any, increment: Any? = null) {
	val funName = "entityLaunchUp"
	val powerARG=numberConvert(funName,"power",power)
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	handleFun("entity_launch_up", listOf(funValue("power",powerARG.parse())))
}
fun entityLeaveVehicle() {
	handleFun("entity_leave_vehicle", listOf())
}
fun entityModifyPiglinBarterMaterials(materials: Any, modificationMode: Any? = null) {
	val materialsARG=typeCheck<JItem>(materials)
	val funName = "entityModifyPiglinBarterMaterials"
	enumCheck(funName,"modificationMode",modificationMode,listOf("ADD","REMOVE"))
	handleFun("entity_modify_piglin_barter_materials", listOf(funValue("materials",materialsARG.parse())))
}
fun entityModifyPiglinInterestedMaterials(materials: Any, modificationMode: Any? = null) {
	val materialsARG=typeCheck<JItem>(materials)
	val funName = "entityModifyPiglinInterestedMaterials"
	enumCheck(funName,"modificationMode",modificationMode,listOf("ADD","REMOVE"))
	handleFun("entity_modify_piglin_interested_materials", listOf(funValue("materials",materialsARG.parse())))
}
fun entityMoveToLocation(location: Any, speed: Any) {
	val funName = "entityMoveToLocation"
	val locationARG=typeCheck<JLocation>(location)
	val speedARG=numberConvert(funName,"speed",speed)
	handleFun("entity_move_to_location", listOf(funValue("location",locationARG.parse()),funValue("speed",speedARG.parse())))
}
fun entityMoveToLocationStop() {
	handleFun("entity_move_to_location_stop", listOf())
}
fun entityPlayDamageAnimation(damageType: Any? = null) {
	val funName = "entityPlayDamageAnimation"
	enumCheck(funName,"damageType",damageType,listOf("CRITICAL_DAMAGE","DAMAGE","MAGICAL_DAMAGE"))
	handleFun("entity_play_damage_animation", listOf())
}
fun entityPlayHurtAnimation(yaw: Any) {
	val funName = "entityPlayHurtAnimation"
	val yawARG=numberConvert(funName,"yaw",yaw)
	handleFun("entity_play_hurt_animation", listOf(funValue("yaw",yawARG.parse())))
}
fun entityRamTarget(nameOrUuid: Any) {
	val funName = "entityRamTarget"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("entity_ram_target", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun entityRemove() {
	handleFun("entity_remove", listOf())
}
fun entityRemoveCustomTag(name: Any) {
	val funName = "entityRemoveCustomTag"
	val nameARG=textConvert(funName,"name",name)
	handleFun("entity_remove_custom_tag", listOf(funValue("name",nameARG.parse())))
}
fun entityRemoveDisguise() {
	handleFun("entity_remove_disguise", listOf())
}
fun entityRemoveMerchantRecipe(recipeIndex: Any) {
	val funName = "entityRemoveMerchantRecipe"
	val recipeIndexARG=numberConvert(funName,"recipeIndex",recipeIndex)
	handleFun("entity_remove_merchant_recipe", listOf(funValue("recipe_index",recipeIndexARG.parse())))
}
fun entityRemovePotionEffect(effects: Any) {
	val effectsARG=typeCheck<JPotion>(effects)
	handleFun("entity_remove_potion_effect", listOf(funValue("effects",effectsARG.parse())))
}
fun entityResetDisplayBrightness() {
	handleFun("entity_reset_display_brightness", listOf())
}
fun entityResetDisplayGlowColor() {
	handleFun("entity_reset_display_glow_color", listOf())
}
fun entityResetTextDisplayBackground() {
	handleFun("entity_reset_text_display_background", listOf())
}
fun entityRideEntity(nameOrUuid: Any) {
	val funName = "entityRideEntity"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("entity_ride_entity", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun entitySetAbsorptionHealth(health: Any) {
	val funName = "entitySetAbsorptionHealth"
	val healthARG=numberConvert(funName,"health",health)
	handleFun("entity_set_absorption_health", listOf(funValue("health",healthARG.parse())))
}
fun entitySetAi(ai: Any? = null) {
	val funName = "entitySetAi"
	enumCheck(funName,"ai",ai,listOf("FALSE","TRUE"))
	handleFun("entity_set_ai", listOf())
}
fun entitySetAllayDancing(dance: Any? = null) {
	val funName = "entitySetAllayDancing"
	enumCheck(funName,"dance",dance,listOf("FALSE","TRUE"))
	handleFun("entity_set_allay_dancing", listOf())
}
fun entitySetAngry(target: Any, angry: Any? = null) {
	val funName = "entitySetAngry"
	val targetARG=textConvert(funName,"target",target)
	enumCheck(funName,"angry",angry,listOf("FALSE","TRUE"))
	handleFun("entity_set_angry", listOf(funValue("target",targetARG.parse())))
}
fun entitySetAnimalAge(age: Any, lock: Any? = null) {
	val funName = "entitySetAnimalAge"
	val ageARG=numberConvert(funName,"age",age)
	enumCheck(funName,"lock",lock,listOf("DISABLE","DONT_CHANGE","ENABLE"))
	handleFun("entity_set_animal_age", listOf(funValue("age",ageARG.parse())))
}
fun entitySetArmorItems(helmet: Any, chestplate: Any, leggings: Any, boots: Any) {
	val helmetARG=typeCheck<JItem>(helmet)
	val chestplateARG=typeCheck<JItem>(chestplate)
	val leggingsARG=typeCheck<JItem>(leggings)
	val bootsARG=typeCheck<JItem>(boots)
	handleFun("entity_set_armor_items", listOf(funValue("helmet",helmetARG.parse()),funValue("chestplate",chestplateARG.parse()),funValue("leggings",leggingsARG.parse()),funValue("boots",bootsARG.parse())))
}
fun entitySetArmorStandParts(arms: Any? = null, basePlate: Any? = null) {
	val funName = "entitySetArmorStandParts"
	enumCheck(funName,"arms",arms,listOf("DISABLE","DONT_CHANGE","ENABLE"))
	enumCheck(funName,"basePlate",basePlate,listOf("DISABLE","DONT_CHANGE","ENABLE"))
	handleFun("entity_set_armor_stand_parts", listOf())
}
fun entitySetArmorStandPose(xRotation: Any, yRotation: Any, zRotation: Any, bodyPart: Any? = null) {
	val funName = "entitySetArmorStandPose"
	val xRotationARG=numberConvert(funName,"xRotation",xRotation)
	val yRotationARG=numberConvert(funName,"yRotation",yRotation)
	val zRotationARG=numberConvert(funName,"zRotation",zRotation)
	enumCheck(funName,"bodyPart",bodyPart,listOf("BODY","HEAD","LEFT_ARM","LEFT_LEG","RIGHT_ARM","RIGHT_LEG"))
	handleFun("entity_set_armor_stand_pose", listOf(funValue("x_rotation",xRotationARG.parse()),funValue("y_rotation",yRotationARG.parse()),funValue("z_rotation",zRotationARG.parse())))
}
fun entitySetArrowHitSound(sound: Any) {
	val soundARG=typeCheck<JSound>(sound)
	handleFun("entity_set_arrow_hit_sound", listOf(funValue("sound",soundARG.parse())))
}
fun entitySetArrowPierce(pierce: Any) {
	val funName = "entitySetArrowPierce"
	val pierceARG=numberConvert(funName,"pierce",pierce)
	handleFun("entity_set_arrow_pierce", listOf(funValue("pierce",pierceARG.parse())))
}
fun entitySetAttribute(value: Any, attributeType: Any? = null) {
	val funName = "entitySetAttribute"
	val valueARG=numberConvert(funName,"value",value)
	enumCheck(funName,"attributeType",attributeType,listOf("GENERIC_ARMOR","GENERIC_ARMOR_TOUGHNESS","GENERIC_ATTACK_DAMAGE","GENERIC_ATTACK_KNOCKBACK","GENERIC_ATTACK_SPEED","GENERIC_BURNING_TIME","GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE","GENERIC_FALL_DAMAGE_MULTIPLIER","GENERIC_FLYING_SPEED","GENERIC_FOLLOW_RANGE","GENERIC_GRAVITY","GENERIC_JUMP_STRENGTH","GENERIC_KNOCKBACK_RESISTANCE","GENERIC_LUCK","GENERIC_MAX_ABSORPTION","GENERIC_MAX_HEALTH","GENERIC_MOVEMENT_EFFICIENCY","GENERIC_MOVEMENT_SPEED","GENERIC_OXYGEN_BONUS","GENERIC_SAFE_FALL_DISTANCE","GENERIC_SCALE","GENERIC_STEP_HEIGHT","GENERIC_WATER_MOVEMENT_EFFICIENCY","PLAYER_BLOCK_BREAK_SPEED","PLAYER_BLOCK_INTERACTION_RANGE","PLAYER_ENTITY_INTERACTION_RANGE","PLAYER_MINING_EFFICIENCY","PLAYER_SNEAKING_SPEED","PLAYER_SUBMERGED_MINING_SPEED","PLAYER_SWEEPING_DAMAGE_RATIO","ZOMBIE_SPAWN_REINFORCEMENTS"))
	handleFun("entity_set_attribute", listOf(funValue("value",valueARG.parse())))
}
fun entitySetAware(aware: Any? = null) {
	val funName = "entitySetAware"
	enumCheck(funName,"aware",aware,listOf("FALSE","TRUE"))
	handleFun("entity_set_aware", listOf())
}
fun entitySetAxolotlType(axolotlType: Any? = null) {
	val funName = "entitySetAxolotlType"
	enumCheck(funName,"axolotlType",axolotlType,listOf("BLUE","CYAN","GOLD","LUCY","WILD"))
	handleFun("entity_set_axolotl_type", listOf())
}
fun entitySetBaby(baby: Any? = null) {
	val funName = "entitySetBaby"
	enumCheck(funName,"baby",baby,listOf("FALSE","TRUE"))
	handleFun("entity_set_baby", listOf())
}
fun entitySetBaseArrowDamage(damage: Any) {
	val funName = "entitySetBaseArrowDamage"
	val damageARG=numberConvert(funName,"damage",damage)
	handleFun("entity_set_base_arrow_damage", listOf(funValue("damage",damageARG.parse())))
}
fun entitySetBeeHasStinger(stinger: Any? = null) {
	val funName = "entitySetBeeHasStinger"
	enumCheck(funName,"stinger",stinger,listOf("TRUE","FALSE"))
	handleFun("entity_set_bee_has_stinger", listOf())
}
fun entitySetBeeNectar(nectar: Any? = null) {
	val funName = "entitySetBeeNectar"
	enumCheck(funName,"nectar",nectar,listOf("FALSE","TRUE"))
	handleFun("entity_set_bee_nectar", listOf())
}
fun entitySetBlockDisplayBlock(displayedBlock: Any) {
	val displayedBlockARG=typeCheck<JBlock>(displayedBlock)
	handleFun("entity_set_block_display_block", listOf(funValue("displayed_block",displayedBlockARG.parse())))
}
fun entitySetCamelDashing(dashing: Any? = null) {
	val funName = "entitySetCamelDashing"
	enumCheck(funName,"dashing",dashing,listOf("FALSE","TRUE"))
	handleFun("entity_set_camel_dashing", listOf())
}
fun entitySetCarryingChest(carrying: Any? = null) {
	val funName = "entitySetCarryingChest"
	enumCheck(funName,"carrying",carrying,listOf("FALSE","TRUE"))
	handleFun("entity_set_carrying_chest", listOf())
}
fun entitySetCatLyingDown(lyingDown: Any? = null) {
	val funName = "entitySetCatLyingDown"
	enumCheck(funName,"lyingDown",lyingDown,listOf("FALSE","TRUE"))
	handleFun("entity_set_cat_lying_down", listOf())
}
fun entitySetCatType(catType: Any? = null) {
	val funName = "entitySetCatType"
	enumCheck(funName,"catType",catType,listOf("ALL_BLACK","BLACK","BRITISH_SHORTHAIR","CALICO","JELLIE","PERSIAN","RAGDOLL","RED","SIAMESE","TABBY","WHITE"))
	handleFun("entity_set_cat_type", listOf())
}
fun entitySetCelebrating(celebrating: Any? = null) {
	val funName = "entitySetCelebrating"
	enumCheck(funName,"celebrating",celebrating,listOf("FALSE","TRUE"))
	handleFun("entity_set_celebrating", listOf())
}
fun entitySetCollidable(collidable: Any? = null) {
	val funName = "entitySetCollidable"
	enumCheck(funName,"collidable",collidable,listOf("FALSE","TRUE"))
	handleFun("entity_set_collidable", listOf())
}
fun entitySetCreeperCharge(charged: Any? = null) {
	val funName = "entitySetCreeperCharge"
	enumCheck(funName,"charged",charged,listOf("FALSE","TRUE"))
	handleFun("entity_set_creeper_charge", listOf())
}
fun entitySetCreeperFuse(fuseTicks: Any) {
	val funName = "entitySetCreeperFuse"
	val fuseTicksARG=numberConvert(funName,"fuseTicks",fuseTicks)
	handleFun("entity_set_creeper_fuse", listOf(funValue("fuse_ticks",fuseTicksARG.parse())))
}
fun entitySetCurrentHealth(health: Any) {
	val funName = "entitySetCurrentHealth"
	val healthARG=numberConvert(funName,"health",health)
	handleFun("entity_set_current_health", listOf(funValue("health",healthARG.parse())))
}
fun entitySetCustomName(customName: Any) {
	val funName = "entitySetCustomName"
	val customNameARG=textConvert(funName,"customName",customName)
	handleFun("entity_set_custom_name", listOf(funValue("custom_name",customNameARG.parse())))
}
fun entitySetCustomNameVisibility(visibility: Any? = null) {
	val funName = "entitySetCustomNameVisibility"
	enumCheck(funName,"visibility",visibility,listOf("FALSE","TRUE"))
	handleFun("entity_set_custom_name_visibility", listOf())
}
fun entitySetCustomTag(name: Any, value: Any) {
	val funName = "entitySetCustomTag"
	val nameARG=textConvert(funName,"name",name)
	val valueARG=textConvert(funName,"value",value)
	handleFun("entity_set_custom_tag", listOf(funValue("name",nameARG.parse()),funValue("value",valueARG.parse())))
}
fun entitySetDeathDrops(drops: Any? = null) {
	val funName = "entitySetDeathDrops"
	enumCheck(funName,"drops",drops,listOf("FALSE","TRUE"))
	handleFun("entity_set_death_drops", listOf())
}
fun entitySetDeathTime(deathTime: Any) {
	val funName = "entitySetDeathTime"
	val deathTimeARG=numberConvert(funName,"deathTime",deathTime)
	handleFun("entity_set_death_time", listOf(funValue("death_time",deathTimeARG.parse())))
}
fun entitySetDefaultVisible(defaultVisible: Any? = null) {
	val funName = "entitySetDefaultVisible"
	enumCheck(funName,"defaultVisible",defaultVisible,listOf("TRUE","FALSE"))
	handleFun("entity_set_default_visible", listOf())
}
fun entitySetDespawning(despawning: Any? = null) {
	val funName = "entitySetDespawning"
	enumCheck(funName,"despawning",despawning,listOf("FALSE","TRUE"))
	handleFun("entity_set_despawning", listOf())
}
fun entitySetDisplayBillboard(billboardType: Any? = null) {
	val funName = "entitySetDisplayBillboard"
	enumCheck(funName,"billboardType",billboardType,listOf("CENTER","FIXED","HORIZONTAL","VERTICAL"))
	handleFun("entity_set_display_billboard", listOf())
}
fun entitySetDisplayBrightness(blockLightLevel: Any, skyLightLevel: Any) {
	val funName = "entitySetDisplayBrightness"
	val blockLightLevelARG=numberConvert(funName,"blockLightLevel",blockLightLevel)
	val skyLightLevelARG=numberConvert(funName,"skyLightLevel",skyLightLevel)
	handleFun("entity_set_display_brightness", listOf(funValue("block_light_level",blockLightLevelARG.parse()),funValue("sky_light_level",skyLightLevelARG.parse())))
}
fun entitySetDisplayCullingSize(width: Any, height: Any) {
	val funName = "entitySetDisplayCullingSize"
	val widthARG=numberConvert(funName,"width",width)
	val heightARG=numberConvert(funName,"height",height)
	handleFun("entity_set_display_culling_suze", listOf(funValue("width",widthARG.parse()),funValue("height",heightARG.parse())))
}
fun entitySetDisplayGlowColor(colorHexadecimal: Any) {
	val funName = "entitySetDisplayGlowColor"
	val colorHexadecimalARG=textConvert(funName,"colorHexadecimal",colorHexadecimal)
	handleFun("entity_set_display_glow_color", listOf(funValue("color_hexadecimal",colorHexadecimalARG.parse())))
}
fun entitySetDisplayInterpolation(interpolationDuration: Any, interpolationDelay: Any) {
	val funName = "entitySetDisplayInterpolation"
	val interpolationDurationARG=numberConvert(funName,"interpolationDuration",interpolationDuration)
	val interpolationDelayARG=numberConvert(funName,"interpolationDelay",interpolationDelay)
	handleFun("entity_set_display_interpolation", listOf(funValue("interpolation_duration",interpolationDurationARG.parse()),funValue("interpolation_delay",interpolationDelayARG.parse())))
}
fun entitySetDisplayRotationFromAxisAngle(axisVector: Any, angle: Any, mode: Any? = null, input: Any? = null, rotation: Any? = null) {
	val funName = "entitySetDisplayRotationFromAxisAngle"
	val axisVectorARG=typeCheck<JVector>(axisVector)
	val angleARG=numberConvert(funName,"angle",angle)
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	enumCheck(funName,"input",input,listOf("DEGREES","RADIANS"))
	enumCheck(funName,"rotation",rotation,listOf("LEFT_ROTATION","RIGHT_ROTATION"))
	handleFun("entity_set_display_rotation_from_axis_angle", listOf(funValue("axis_vector",axisVectorARG.parse()),funValue("angle",angleARG.parse())))
}
fun entitySetDisplayRotationFromEulerAngles(pitch: Any, yaw: Any, roll: Any, mode: Any? = null, input: Any? = null, rotation: Any? = null) {
	val funName = "entitySetDisplayRotationFromEulerAngles"
	val pitchARG=numberConvert(funName,"pitch",pitch)
	val yawARG=numberConvert(funName,"yaw",yaw)
	val rollARG=numberConvert(funName,"roll",roll)
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	enumCheck(funName,"input",input,listOf("DEGREES","RADIANS"))
	enumCheck(funName,"rotation",rotation,listOf("LEFT_ROTATION","RIGHT_ROTATION"))
	handleFun("entity_set_display_rotation_from_euler_angles", listOf(funValue("pitch",pitchARG.parse()),funValue("yaw",yawARG.parse()),funValue("roll",rollARG.parse())))
}
fun entitySetDisplayScale(scaleVector: Any, mode: Any? = null) {
	val scaleVectorARG=typeCheck<JVector>(scaleVector)
	val funName = "entitySetDisplayScale"
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	handleFun("entity_set_display_scale", listOf(funValue("scale_vector",scaleVectorARG.parse())))
}
fun entitySetDisplayShadow(shadowRadius: Any, shadowOpacityPercentage: Any) {
	val funName = "entitySetDisplayShadow"
	val shadowRadiusARG=numberConvert(funName,"shadowRadius",shadowRadius)
	val shadowOpacityPercentageARG=numberConvert(funName,"shadowOpacityPercentage",shadowOpacityPercentage)
	handleFun("entity_set_display_shadow", listOf(funValue("shadow_radius",shadowRadiusARG.parse()),funValue("shadow_opacity_percentage",shadowOpacityPercentageARG.parse())))
}
fun entitySetDisplayTeleportDuration(duration: Any) {
	val funName = "entitySetDisplayTeleportDuration"
	val durationARG=numberConvert(funName,"duration",duration)
	handleFun("entity_set_display_teleport_duration", listOf(funValue("duration",durationARG.parse())))
}
fun entitySetDisplayTransformationMatrix(rowMajorMatrix: Any) {
	val funName = "entitySetDisplayTransformationMatrix"
	val rowMajorMatrixARG=numberConvertPlural(funName,"rowMajorMatrix",rowMajorMatrix)
	handleFun("entity_set_display_transformation_matrix", listOf(funValue("row_major_matrix",rowMajorMatrixARG.parse())))
}
fun entitySetDisplayTranslation(translationVector: Any, mode: Any? = null) {
	val translationVectorARG=typeCheck<JVector>(translationVector)
	val funName = "entitySetDisplayTranslation"
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	handleFun("entity_set_display_translation", listOf(funValue("translation_vector",translationVectorARG.parse())))
}
fun entitySetDisplayViewRange(viewRange: Any) {
	val funName = "entitySetDisplayViewRange"
	val viewRangeARG=numberConvert(funName,"viewRange",viewRange)
	handleFun("entity_set_display_view_range", listOf(funValue("view_range",viewRangeARG.parse())))
}
fun entitySetDragonPhase(phase: Any? = null) {
	val funName = "entitySetDragonPhase"
	enumCheck(funName,"phase",phase,listOf("BREATH_ATTACK","CHARGE_PLAYER","CIRCLING","DYING","FLY_TO_PORTAL","HOVER","LAND_ON_PORTAL","LEAVE_PORTAL","ROAR_BEFORE_ATTACK","SEARCH_FOR_BREATH_ATTACK_TARGET","STRAFING"))
	handleFun("entity_set_dragon_phase", listOf())
}
fun entitySetDyeColor(color: Any? = null) {
	val funName = "entitySetDyeColor"
	enumCheck(funName,"color",color,listOf("BLACK","BLUE","BROWN","CYAN","GRAY","GREEN","LIGHT_BLUE","LIGHT_GRAY","LIME","MAGENTA","ORANGE","PINK","PURPLE","RED","WHITE","YELLOW"))
	handleFun("entity_set_dye_color", listOf())
}
fun entitySetEndCrystalBeam(beam: Any) {
	val beamARG=typeCheck<JLocation>(beam)
	handleFun("entity_set_end_crystal_beam", listOf(funValue("beam",beamARG.parse())))
}
fun entitySetEndermanBlock(block: Any) {
	val blockARG=typeCheck<JBlock>(block)
	handleFun("entity_set_enderman_block", listOf(funValue("block",blockARG.parse())))
}
fun entitySetEquipmentItem(item: Any, slot: Any? = null) {
	val itemARG=typeCheck<JItem>(item)
	val funName = "entitySetEquipmentItem"
	enumCheck(funName,"slot",slot,listOf("CHEST","FEET","HAND","HEAD","LEGS","OFF_HAND"))
	handleFun("entity_set_equipment_item", listOf(funValue("item",itemARG.parse())))
}
fun entitySetExplosivePower(power: Any) {
	val funName = "entitySetExplosivePower"
	val powerARG=numberConvert(funName,"power",power)
	handleFun("entity_set_explosive_power", listOf(funValue("power",powerARG.parse())))
}
fun entitySetFallDistance(fallDistance: Any) {
	val funName = "entitySetFallDistance"
	val fallDistanceARG=numberConvert(funName,"fallDistance",fallDistance)
	handleFun("entity_set_fall_distance", listOf(funValue("fall_distance",fallDistanceARG.parse())))
}
fun entitySetFallingBlockType(block: Any) {
	val blockARG=typeCheck<JBlock>(block)
	handleFun("entity_set_falling_block_type", listOf(funValue("block",blockARG.parse())))
}
fun entitySetFireTicks(ticks: Any) {
	val funName = "entitySetFireTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	handleFun("entity_set_fire_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun entitySetFishingWait(time: Any) {
	val funName = "entitySetFishingWait"
	val timeARG=numberConvert(funName,"time",time)
	handleFun("entity_set_fishing_wait", listOf(funValue("time",timeARG.parse())))
}
fun entitySetFoxLeaping(leaping: Any? = null) {
	val funName = "entitySetFoxLeaping"
	enumCheck(funName,"leaping",leaping,listOf("FALSE","TRUE"))
	handleFun("entity_set_fox_leaping", listOf())
}
fun entitySetFoxType(foxType: Any? = null) {
	val funName = "entitySetFoxType"
	enumCheck(funName,"foxType",foxType,listOf("RED","SNOW"))
	handleFun("entity_set_fox_type", listOf())
}
fun entitySetFreezeTicks(ticks: Any, tickingLocked: Any? = null) {
	val funName = "entitySetFreezeTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	enumCheck(funName,"tickingLocked",tickingLocked,listOf("FALSE","TRUE"))
	handleFun("entity_set_freeze_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun entitySetFriction(friction: Any? = null) {
	val funName = "entitySetFriction"
	enumCheck(funName,"friction",friction,listOf("NOT_SET","TRUE","FALSE"))
	handleFun("entity_set_friction", listOf())
}
fun entitySetFrogType(frogVariant: Any? = null) {
	val funName = "entitySetFrogType"
	enumCheck(funName,"frogVariant",frogVariant,listOf("COLD","TEMPERATE","WARM"))
	handleFun("entity_set_frog_type", listOf())
}
fun entitySetGliding(isGliding: Any? = null) {
	val funName = "entitySetGliding"
	enumCheck(funName,"isGliding",isGliding,listOf("FALSE","TRUE"))
	handleFun("entity_set_gliding", listOf())
}
fun entitySetGlowSquidDark(darkTicks: Any) {
	val funName = "entitySetGlowSquidDark"
	val darkTicksARG=numberConvert(funName,"darkTicks",darkTicks)
	handleFun("entity_set_glow_squid_dark", listOf(funValue("dark_ticks",darkTicksARG.parse())))
}
fun entitySetGlowing(glowing: Any? = null) {
	val funName = "entitySetGlowing"
	enumCheck(funName,"glowing",glowing,listOf("FALSE","TRUE"))
	handleFun("entity_set_glowing", listOf())
}
fun entitySetGoatScreaming(screams: Any? = null) {
	val funName = "entitySetGoatScreaming"
	enumCheck(funName,"screams",screams,listOf("FALSE","TRUE"))
	handleFun("entity_set_goat_screaming", listOf())
}
fun entitySetGravity(gravity: Any? = null) {
	val funName = "entitySetGravity"
	enumCheck(funName,"gravity",gravity,listOf("FALSE","TRUE"))
	handleFun("entity_set_gravity", listOf())
}
fun entitySetHorseJump(power: Any) {
	val funName = "entitySetHorseJump"
	val powerARG=numberConvert(funName,"power",power)
	handleFun("entity_set_horse_jump", listOf(funValue("power",powerARG.parse())))
}
fun entitySetHorsePattern(horseColor: Any? = null, horseStyle: Any? = null) {
	val funName = "entitySetHorsePattern"
	enumCheck(funName,"horseColor",horseColor,listOf("BLACK","BROWN","CHESTNUT","CREAMY","DARK_BROWN","DO_NOT_CHANGE","GRAY","WHITE"))
	enumCheck(funName,"horseStyle",horseStyle,listOf("BLACK_DOTS","DO_NOT_CHANGE","NONE","WHITE","WHITEFIELD","WHITE_DOTS"))
	handleFun("entity_set_horse_pattern", listOf())
}
fun entitySetImmuneToZombification(isImmune: Any? = null) {
	val funName = "entitySetImmuneToZombification"
	enumCheck(funName,"isImmune",isImmune,listOf("FALSE","TRUE"))
	handleFun("entity_set_immune_to_zombification", listOf())
}
fun entitySetInteractionResponsive(responsive: Any? = null) {
	val funName = "entitySetInteractionResponsive"
	enumCheck(funName,"responsive",responsive,listOf("FALSE","TRUE"))
	handleFun("entity_set_interaction_responsive", listOf())
}
fun entitySetInteractionSize(width: Any, height: Any) {
	val funName = "entitySetInteractionSize"
	val widthARG=numberConvert(funName,"width",width)
	val heightARG=numberConvert(funName,"height",height)
	handleFun("entity_set_interaction_size", listOf(funValue("width",widthARG.parse()),funValue("height",heightARG.parse())))
}
fun entitySetInvisible(invisible: Any? = null) {
	val funName = "entitySetInvisible"
	enumCheck(funName,"invisible",invisible,listOf("FALSE","TRUE"))
	handleFun("entity_set_invisible", listOf())
}
fun entitySetInvulnerabilityTicks(ticks: Any) {
	val funName = "entitySetInvulnerabilityTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	handleFun("entity_set_invulnerability_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun entitySetInvulnerable(invulnerable: Any? = null) {
	val funName = "entitySetInvulnerable"
	enumCheck(funName,"invulnerable",invulnerable,listOf("FALSE","TRUE"))
	handleFun("entity_set_invulnerable", listOf())
}
fun entitySetItem(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("entity_set_item", listOf(funValue("item",itemARG.parse())))
}
fun entitySetItemDisplayItem(displayedItem: Any) {
	val displayedItemARG=typeCheck<JItem>(displayedItem)
	handleFun("entity_set_item_display_item", listOf(funValue("displayed_item",displayedItemARG.parse())))
}
fun entitySetItemDisplayModelType(displayModelType: Any? = null) {
	val funName = "entitySetItemDisplayModelType"
	enumCheck(funName,"displayModelType",displayModelType,listOf("FIRSTPERSON_LEFTHAND","FIRSTPERSON_RIGHTHAND","FIXED","GROUND","GUI","HEAD","NONE","THIRDPERSON_LEFTHAND","THIRDPERSON_RIGHTHAND"))
	handleFun("entity_set_item_display_model_type", listOf())
}
fun entitySetItemInFrame(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("entity_set_item_in_frame", listOf(funValue("item",itemARG.parse())))
}
fun entitySetLlamaType(type: Any? = null) {
	val funName = "entitySetLlamaType"
	enumCheck(funName,"type",type,listOf("BROWN","CREAMY","GRAY","WHITE"))
	handleFun("entity_set_llama_type", listOf())
}
fun entitySetLocation(velocity: Any, increment: Any? = null) {
	val velocityARG=typeCheck<JVector>(velocity)
	val funName = "entitySetLocation"
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	handleFun("entity_set_location", listOf(funValue("velocity",velocityARG.parse())))
}
fun entitySetMarker(marker: Any? = null) {
	val funName = "entitySetMarker"
	enumCheck(funName,"marker",marker,listOf("FALSE","TRUE"))
	handleFun("entity_set_marker", listOf())
}
fun entitySetMaxHealth(maxHealth: Any, healToMax: Any? = null) {
	val funName = "entitySetMaxHealth"
	val maxHealthARG=numberConvert(funName,"maxHealth",maxHealth)
	enumCheck(funName,"healToMax",healToMax,listOf("FALSE","TRUE"))
	handleFun("entity_set_max_health", listOf(funValue("max_health",maxHealthARG.parse())))
}
fun entitySetMerchantRecipe(result: Any, ingredientOne: Any, ingredientTwo: Any, uses: Any, maxUses: Any, index: Any, villagerExperience: Any, priceMultiplifier: Any, demand: Any, specialPrice: Any, mode: Any? = null, experienceReward: Any? = null, ignoreDiscounts: Any? = null) {
	val funName = "entitySetMerchantRecipe"
	val resultARG=typeCheck<JItem>(result)
	val ingredientOneARG=typeCheck<JItem>(ingredientOne)
	val ingredientTwoARG=typeCheck<JItem>(ingredientTwo)
	val usesARG=numberConvert(funName,"uses",uses)
	val maxUsesARG=numberConvert(funName,"maxUses",maxUses)
	val indexARG=numberConvert(funName,"index",index)
	val villagerExperienceARG=numberConvert(funName,"villagerExperience",villagerExperience)
	val priceMultiplifierARG=numberConvert(funName,"priceMultiplifier",priceMultiplifier)
	val demandARG=numberConvert(funName,"demand",demand)
	val specialPriceARG=numberConvert(funName,"specialPrice",specialPrice)
	enumCheck(funName,"mode",mode,listOf("APPEND","MERGE"))
	enumCheck(funName,"experienceReward",experienceReward,listOf("FALSE","TRUE"))
	enumCheck(funName,"ignoreDiscounts",ignoreDiscounts,listOf("FALSE","TRUE"))
	handleFun("entity_set_merchant_recipe", listOf(funValue("result",resultARG.parse()),funValue("ingredient_one",ingredientOneARG.parse()),funValue("ingredient_two",ingredientTwoARG.parse()),funValue("uses",usesARG.parse()),funValue("max_uses",maxUsesARG.parse()),funValue("index",indexARG.parse()),funValue("villager_experience",villagerExperienceARG.parse()),funValue("price_multiplifier",priceMultiplifierARG.parse()),funValue("demand",demandARG.parse()),funValue("special_price",specialPriceARG.parse())))
}
fun entitySetMinecartBlock(block: Any, blockOffset: Any) {
	val funName = "entitySetMinecartBlock"
	val blockARG=typeCheck<JBlock>(block)
	val blockOffsetARG=numberConvert(funName,"blockOffset",blockOffset)
	handleFun("entity_set_minecart_block", listOf(funValue("block",blockARG.parse()),funValue("block_offset",blockOffsetARG.parse())))
}
fun entitySetMobAggressive(aggressive: Any? = null) {
	val funName = "entitySetMobAggressive"
	enumCheck(funName,"aggressive",aggressive,listOf("FALSE","TRUE"))
	handleFun("entity_set_mob_aggressive", listOf())
}
fun entitySetMushroomCowType(cowType: Any? = null) {
	val funName = "entitySetMushroomCowType"
	enumCheck(funName,"cowType",cowType,listOf("BROWN","RED"))
	handleFun("entity_set_mushroom_cow_type", listOf())
}
fun entityNoPhysics(noPhysics: Any? = null) {
	val funName = "entityNoPhysics"
	enumCheck(funName,"noPhysics",noPhysics,listOf("TRUE","FALSE"))
	handleFun("entity_set_no_physics", listOf())
}
fun entitySetPandaGene(gene: Any? = null, geneType: Any? = null) {
	val funName = "entitySetPandaGene"
	enumCheck(funName,"gene",gene,listOf("BOTH","HIDDEN","MAIN"))
	enumCheck(funName,"geneType",geneType,listOf("AGGRESSIVE","BROWN","LAZY","NORMAL","PLAYFUL","WEAK","WORRIED"))
	handleFun("entity_set_panda_gene", listOf())
}
fun entitySetPandaOnBack(onBack: Any? = null) {
	val funName = "entitySetPandaOnBack"
	enumCheck(funName,"onBack",onBack,listOf("TRUE","FALSE"))
	handleFun("entity_set_panda_on_back", listOf())
}
fun entitySetPandaRolling(rolling: Any? = null) {
	val funName = "entitySetPandaRolling"
	enumCheck(funName,"rolling",rolling,listOf("TRUE","FALSE"))
	handleFun("entity_set_panda_rolling", listOf())
}
fun entitySetPandaSadTicks(sadTicks: Any) {
	val funName = "entitySetPandaSadTicks"
	val sadTicksARG=numberConvert(funName,"sadTicks",sadTicks)
	handleFun("entity_set_panda_sad_ticks", listOf(funValue("sad_ticks",sadTicksARG.parse())))
}
fun entitySetParrotType(parrotType: Any? = null) {
	val funName = "entitySetParrotType"
	enumCheck(funName,"parrotType",parrotType,listOf("BLUE","CYAN","GRAY","GREEN","RED"))
	handleFun("entity_set_parrot_type", listOf())
}
fun entitySetPersistence(persistence: Any? = null) {
	val funName = "entitySetPersistence"
	enumCheck(funName,"persistence",persistence,listOf("FALSE","TRUE"))
	handleFun("entity_set_persistence", listOf())
}
fun entitySetPickup(canMobPickup: Any? = null, canPlayerPickup: Any? = null) {
	val funName = "entitySetPickup"
	enumCheck(funName,"canMobPickup",canMobPickup,listOf("TRUE","FALSE"))
	enumCheck(funName,"canPlayerPickup",canPlayerPickup,listOf("TRUE","FALSE"))
	handleFun("entity_set_pickup", listOf())
}
fun entitySetPickupDelay(delay: Any) {
	val funName = "entitySetPickupDelay"
	val delayARG=numberConvert(funName,"delay",delay)
	handleFun("entity_set_pickup_delay", listOf(funValue("delay",delayARG.parse())))
}
fun entitySetPiglinAbleToHunt(able: Any? = null) {
	val funName = "entitySetPiglinAbleToHunt"
	enumCheck(funName,"able",able,listOf("FALSE","TRUE"))
	handleFun("entity_set_piglin_able_to_hunt", listOf())
}
fun entitySetPiglinChargingCrossbow(charging: Any? = null) {
	val funName = "entitySetPiglinChargingCrossbow"
	enumCheck(funName,"charging",charging,listOf("FALSE","TRUE"))
	handleFun("entity_set_piglin_charging_crossbow", listOf())
}
fun entitySetPiglinDancing(dancingTime: Any) {
	val funName = "entitySetPiglinDancing"
	val dancingTimeARG=numberConvert(funName,"dancingTime",dancingTime)
	handleFun("entity_set_piglin_dancing", listOf(funValue("dancing_time",dancingTimeARG.parse())))
}
fun entitySetPose(pose: Any? = null) {
	val funName = "entitySetPose"
	enumCheck(funName,"pose",pose,listOf("CROAKING","CROUCHING","DIGGING","DYING","EMERGING","FALL_FLYING","LONG_JUMPING","ROARING","SITTING","SLEEPING","SNEAKING","SNIFFING","SPIN_ATTACK","STANDING","SWIMMING","USING_TONGUE"))
	handleFun("entity_set_pose", listOf())
}
fun entitySetPotionCloudRadius(radius: Any, shrinkingSpeed: Any) {
	val funName = "entitySetPotionCloudRadius"
	val radiusARG=numberConvert(funName,"radius",radius)
	val shrinkingSpeedARG=numberConvert(funName,"shrinkingSpeed",shrinkingSpeed)
	handleFun("entity_set_potion_cloud_radius", listOf(funValue("radius",radiusARG.parse()),funValue("shrinking_speed",shrinkingSpeedARG.parse())))
}
fun entitySetPrimedTntBlock(block: Any) {
	val blockARG=typeCheck<JBlock>(block)
	handleFun("entity_set_primed_tnt_block", listOf(funValue("block",blockARG.parse())))
}
fun entitySetProjectileDisplayItem(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("entity_set_projectile_display_item", listOf(funValue("item",itemARG.parse())))
}
fun entitySetProjectilePower(power: Any) {
	val powerARG=typeCheck<JVector>(power)
	handleFun("entity_set_projectile_power", listOf(funValue("power",powerARG.parse())))
}
fun entitySetProjectileShooter(uuid: Any) {
	val funName = "entitySetProjectileShooter"
	val uuidARG=textConvert(funName,"uuid",uuid)
	handleFun("entity_set_projectile_shooter", listOf(funValue("uuid",uuidARG.parse())))
}
fun entitySetRabbitType(rabbitType: Any? = null) {
	val funName = "entitySetRabbitType"
	enumCheck(funName,"rabbitType",rabbitType,listOf("BLACK","BLACK_AND_WHITE","BROWN","GOLD","SALT_AND_PEPPER","THE_KILLER_BUNNY","WHITE"))
	handleFun("entity_set_rabbit_type", listOf())
}
fun entitySetRearing(rearing: Any? = null) {
	val funName = "entitySetRearing"
	enumCheck(funName,"rearing",rearing,listOf("FALSE","TRUE"))
	handleFun("entity_set_rearing", listOf())
}
fun entitySetRiptiding(riptiding: Any? = null) {
	val funName = "entitySetRiptiding"
	enumCheck(funName,"riptiding",riptiding,listOf("FALSE","TRUE"))
	handleFun("entity_set_riptiding", listOf())
}
fun entitySetRotation(yaw: Any, pitch: Any) {
	val funName = "entitySetRotation"
	val yawARG=numberConvert(funName,"yaw",yaw)
	val pitchARG=numberConvert(funName,"pitch",pitch)
	handleFun("entity_set_rotation", listOf(funValue("yaw",yawARG.parse()),funValue("pitch",pitchARG.parse())))
}
fun entitySetRotationByVector(vector: Any) {
	val vectorARG=typeCheck<JVector>(vector)
	handleFun("entity_set_rotation_by_vector", listOf(funValue("vector",vectorARG.parse())))
}
fun entitySetSheepSheared(sheared: Any? = null) {
	val funName = "entitySetSheepSheared"
	enumCheck(funName,"sheared",sheared,listOf("FALSE","TRUE"))
	handleFun("entity_set_sheep_sheared", listOf())
}
fun entitySetShulkerBulletTarget(target: Any) {
	val funName = "entitySetShulkerBulletTarget"
	val targetARG=textConvert(funName,"target",target)
	handleFun("entity_set_shulker_bullet_target", listOf(funValue("target",targetARG.parse())))
}
fun entitySetShulkerPeek(rolling: Any, silent: Any? = null) {
	val funName = "entitySetShulkerPeek"
	val rollingARG=numberConvert(funName,"rolling",rolling)
	enumCheck(funName,"silent",silent,listOf("TRUE","FALSE"))
	handleFun("entity_set_shulker_peek", listOf(funValue("rolling",rollingARG.parse())))
}
fun entitySetSilenced(silenced: Any? = null) {
	val funName = "entitySetSilenced"
	enumCheck(funName,"silenced",silenced,listOf("FALSE","TRUE"))
	handleFun("entity_set_silenced", listOf())
}
fun entitySetSitting(sitting: Any? = null) {
	val funName = "entitySetSitting"
	enumCheck(funName,"sitting",sitting,listOf("FALSE","TRUE"))
	handleFun("entity_set_sitting", listOf())
}
fun entitySetSize(size: Any) {
	val funName = "entitySetSize"
	val sizeARG=numberConvert(funName,"size",size)
	handleFun("entity_set_size", listOf(funValue("size",sizeARG.parse())))
}
fun entitySetSnifferState(state: Any? = null) {
	val funName = "entitySetSnifferState"
	enumCheck(funName,"state",state,listOf("DIGGING","FEELING_HAPPY","IDLING","RISING","SCENTING","SEARCHING","SNIFFING"))
	handleFun("entity_set_sniffer_state", listOf())
}
fun entitySetSnowmanPumpkin(pumpkin: Any? = null) {
	val funName = "entitySetSnowmanPumpkin"
	enumCheck(funName,"pumpkin",pumpkin,listOf("FALSE","TRUE"))
	handleFun("entity_set_snowman_pumpkin", listOf())
}
fun entitySetTame(nameOrUuid: Any) {
	val funName = "entitySetTame"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("entity_set_tame", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun entitySetTarget(nameOrUuid: Any) {
	val funName = "entitySetTarget"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("entity_set_target", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun entitySetTextDisplayAlignment(textAlignment: Any? = null) {
	val funName = "entitySetTextDisplayAlignment"
	enumCheck(funName,"textAlignment",textAlignment,listOf("CENTER","LEFT","RIGHT"))
	handleFun("entity_set_text_display_alignment", listOf())
}
fun entitySetTextDisplayBackground(colorHexadecimal: Any, opacity: Any) {
	val funName = "entitySetTextDisplayBackground"
	val colorHexadecimalARG=textConvert(funName,"colorHexadecimal",colorHexadecimal)
	val opacityARG=numberConvert(funName,"opacity",opacity)
	handleFun("entity_set_text_display_background", listOf(funValue("color_hexadecimal",colorHexadecimalARG.parse()),funValue("opacity",opacityARG.parse())))
}
fun entitySetTextDisplayLineWidth(lineWidth: Any) {
	val funName = "entitySetTextDisplayLineWidth"
	val lineWidthARG=numberConvert(funName,"lineWidth",lineWidth)
	handleFun("entity_set_text_display_line_width", listOf(funValue("line_width",lineWidthARG.parse())))
}
fun entitySetTextDisplayOpacity(textOpacity: Any) {
	val funName = "entitySetTextDisplayOpacity"
	val textOpacityARG=numberConvert(funName,"textOpacity",textOpacity)
	handleFun("entity_set_text_display_opacity", listOf(funValue("text_opacity",textOpacityARG.parse())))
}
fun entitySetTextDisplaySeeThrough(enableSeeThrough: Any? = null) {
	val funName = "entitySetTextDisplaySeeThrough"
	enumCheck(funName,"enableSeeThrough",enableSeeThrough,listOf("FALSE","TRUE"))
	handleFun("entity_set_text_display_see_through", listOf())
}
fun entitySetTextDisplayText(displayedText: Any, mergingMode: Any? = null) {
	val funName = "entitySetTextDisplayText"
	val displayedTextARG=textConvertPlural(funName,"displayedText",displayedText)
	enumCheck(funName,"mergingMode",mergingMode,listOf("CONCATENATION","SEPARATE_LINES","SPACES"))
	handleFun("entity_set_text_display_text", listOf(funValue("displayed_text",displayedTextARG.parse())))
}
fun entitySetTextDisplayTextShadow(enableTextShadow: Any? = null) {
	val funName = "entitySetTextDisplayTextShadow"
	enumCheck(funName,"enableTextShadow",enableTextShadow,listOf("FALSE","TRUE"))
	handleFun("entity_set_text_display_text_shadow", listOf())
}
fun entitySetTropicalFishPattern(patternColor: Any? = null, bodyColor: Any? = null, pattern: Any? = null) {
	val funName = "entitySetTropicalFishPattern"
	enumCheck(funName,"patternColor",patternColor,listOf("BLACK","BLUE","BROWN","CYAN","DO_NOT_CHANGE","GRAY","GREEN","LIGHT_BLUE","LIGHT_GRAY","LIME","MAGENTA","ORANGE","PINK","PURPLE","RED","WHITE","YELLOW"))
	enumCheck(funName,"bodyColor",bodyColor,listOf("BLACK","BLUE","BROWN","CYAN","DO_NOT_CHANGE","GRAY","GREEN","LIGHT_BLUE","LIGHT_GRAY","LIME","MAGENTA","ORANGE","PINK","PURPLE","RED","WHITE","YELLOW"))
	enumCheck(funName,"pattern",pattern,listOf("BETTY","BLOCKFISH","BRINELY","CLAYFISH","DASHER","DO_NOT_CHANGE","FLOPPER","GLITTER","KOB","SNOOPER","SPOTTY","STRIPEY","SUNSTREAK"))
	handleFun("entity_set_tropical_fish_pattern", listOf())
}
fun entitySetVexCharging(charging: Any? = null) {
	val funName = "entitySetVexCharging"
	enumCheck(funName,"charging",charging,listOf("FALSE","TRUE"))
	handleFun("entity_set_vex_charging", listOf())
}
fun entitySetVexLimitedLifetimeTicks(lifetime: Any) {
	val funName = "entitySetVexLimitedLifetimeTicks"
	val lifetimeARG=numberConvert(funName,"lifetime",lifetime)
	handleFun("entity_set_vex_limited_lifetime_ticks", listOf(funValue("lifetime",lifetimeARG.parse())))
}
fun entitySetVillagerBiome(biome: Any? = null) {
	val funName = "entitySetVillagerBiome"
	enumCheck(funName,"biome",biome,listOf("DESERT","JUNGLE","PLAINS","SAVANNA","SNOW","SWAMP","TAIGA"))
	handleFun("entity_set_villager_biome", listOf())
}
fun entitySetVillagerExperience(experience: Any) {
	val funName = "entitySetVillagerExperience"
	val experienceARG=numberConvert(funName,"experience",experience)
	handleFun("entity_set_villager_experience", listOf(funValue("experience",experienceARG.parse())))
}
fun entitySetVillagerProfession(profession: Any? = null) {
	val funName = "entitySetVillagerProfession"
	enumCheck(funName,"profession",profession,listOf("ARMORER","BUTCHER","CARTOGRAPHER","CLERIC","FARMER","FISHERMAN","FLETCHER","LEATHERWORKER","LIBRARIAN","MASON","NITWIT","NONE","SHEPHERD","TOOLSMITH","WEAPONSMITH"))
	handleFun("entity_set_villager_profession", listOf())
}
fun entitySetVisualFire(visualFire: Any? = null) {
	val funName = "entitySetVisualFire"
	enumCheck(funName,"visualFire",visualFire,listOf("FALSE","TRUE"))
	handleFun("entity_set_visual_fire", listOf())
}
fun entitySetWardenAngerLevel(nameOrUuid: Any, anger: Any) {
	val funName = "entitySetWardenAngerLevel"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	val angerARG=numberConvert(funName,"anger",anger)
	handleFun("entity_set_warden_anger_level", listOf(funValue("name_or_uuid",nameOrUuidARG.parse()),funValue("anger",angerARG.parse())))
}
fun entitySetWardenDigging(digging: Any? = null) {
	val funName = "entitySetWardenDigging"
	enumCheck(funName,"digging",digging,listOf("DIG_DOWN","EMERGE"))
	handleFun("entity_set_warden_digging", listOf())
}
fun entitySetWearingSaddle(wearing: Any? = null) {
	val funName = "entitySetWearingSaddle"
	enumCheck(funName,"wearing",wearing,listOf("FALSE","TRUE"))
	handleFun("entity_set_wearing_saddle", listOf())
}
fun entitySetWitherInvulnerabilityTicks(ticks: Any) {
	val funName = "entitySetWitherInvulnerabilityTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	handleFun("entity_set_wither_invulnerability_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun entitySetWolfType(wolfType: Any? = null) {
	val funName = "entitySetWolfType"
	enumCheck(funName,"wolfType",wolfType,listOf("ASHEN","SNOWY","RUSTY","BLACK","CHESTNUT","SPOTTED","STRIPED","PALE"))
	handleFun("entity_set_wolf_type", listOf())
}
fun entitySetZombieArmsRaised(armsRaised: Any? = null) {
	val funName = "entitySetZombieArmsRaised"
	enumCheck(funName,"armsRaised",armsRaised,listOf("FALSE","TRUE"))
	handleFun("entity_set_zombie_arms_raised", listOf())
}
fun entityShear() {
	handleFun("entity_shear", listOf())
}
fun entityShearSheep() {
	handleFun("entity_shear_sheep", listOf())
}
fun entitySleep(sleep: Any? = null) {
	val funName = "entitySleep"
	enumCheck(funName,"sleep",sleep,listOf("FALSE","TRUE"))
	handleFun("entity_sleep", listOf())
}
fun entitySwingHand(handType: Any? = null) {
	val funName = "entitySwingHand"
	enumCheck(funName,"handType",handType,listOf("MAIN","OFF"))
	handleFun("entity_swing_hand", listOf())
}
fun entityTeleport(location: Any, keepRotation: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "entityTeleport"
	enumCheck(funName,"keepRotation",keepRotation,listOf("FALSE","TRUE"))
	handleFun("entity_teleport", listOf(funValue("location",locationARG.parse())))
}
fun entityUseItem(hand: Any? = null, enable: Any? = null) {
	val funName = "entityUseItem"
	enumCheck(funName,"hand",hand,listOf("MAIN_HAND","OFF_HAND"))
	enumCheck(funName,"enable",enable,listOf("FALSE","TRUE"))
	handleFun("entity_use_item", listOf())
}
fun worldBlockGrowth(location: Any, growthStage: Any, growthType: Any? = null) {
	val funName = "worldBlockGrowth"
	val locationARG=typeCheck<JLocation>(location)
	val growthStageARG=numberConvert(funName,"growthStage",growthStage)
	enumCheck(funName,"growthType",growthType,listOf("PERCENTAGE","STAGE_NUMBER"))
	handleFun("game_block_growth", listOf(funValue("location",locationARG.parse()),funValue("growth_stage",growthStageARG.parse())))
}
fun worldBloomSkulkCatalyst(location: Any, bloomLocation: Any, charge: Any) {
	val funName = "worldBloomSkulkCatalyst"
	val locationARG=typeCheck<JLocation>(location)
	val bloomLocationARG=typeCheck<JLocation>(bloomLocation)
	val chargeARG=numberConvert(funName,"charge",charge)
	handleFun("game_bloom_skulk_catalyst", listOf(funValue("location",locationARG.parse()),funValue("bloom_location",bloomLocationARG.parse()),funValue("charge",chargeARG.parse())))
}
fun worldBoneMealBlock(location: Any, count: Any) {
	val funName = "worldBoneMealBlock"
	val locationARG=typeCheck<JLocation>(location)
	val countARG=numberConvert(funName,"count",count)
	handleFun("game_bone_meal_block", listOf(funValue("location",locationARG.parse()),funValue("count",countARG.parse())))
}
fun worldBreakBlock(locations: Any, tool: Any, dropExp: Any? = null) {
	val locationsARG=typeCheck<JLocation>(locations)
	val toolARG=typeCheck<JItem>(tool)
	val funName = "worldBreakBlock"
	enumCheck(funName,"dropExp",dropExp,listOf("FALSE","TRUE"))
	handleFun("game_break_block", listOf(funValue("locations",locationsARG.parse()),funValue("tool",toolARG.parse())))
}
fun worldCancelEvent() {
	handleFun("game_cancel_event", listOf())
}
fun worldClearContainer(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_clear_container", listOf(funValue("location",locationARG.parse())))
}
fun worldClearContainerItems(items: Any, location: Any) {
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_clear_container_items", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse())))
}
fun worldClearExplodedBlocks(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_clear_exploded_blocks", listOf(funValue("location",locationARG.parse())))
}
fun worldClearRegion(pos1: Any, pos2: Any) {
	val pos1ARG=typeCheck<JLocation>(pos1)
	val pos2ARG=typeCheck<JLocation>(pos2)
	handleFun("game_clear_region", listOf(funValue("pos_1",pos1ARG.parse()),funValue("pos_2",pos2ARG.parse())))
}
fun worldClearScoreboardScores(id: Any) {
	val funName = "worldClearScoreboardScores"
	val idARG=textConvert(funName,"id",id)
	handleFun("game_clear_scoreboard_scores", listOf(funValue("id",idARG.parse())))
}
fun worldCloneRegion(pos1: Any, pos2: Any, targetPos: Any, pastePos: Any, ignoreAir: Any? = null, copyEntity: Any? = null) {
	val pos1ARG=typeCheck<JLocation>(pos1)
	val pos2ARG=typeCheck<JLocation>(pos2)
	val targetPosARG=typeCheck<JLocation>(targetPos)
	val pastePosARG=typeCheck<JLocation>(pastePos)
	val funName = "worldCloneRegion"
	enumCheck(funName,"ignoreAir",ignoreAir,listOf("FALSE","TRUE"))
	enumCheck(funName,"copyEntity",copyEntity,listOf("FALSE","TRUE"))
	handleFun("game_clone_region", listOf(funValue("pos_1",pos1ARG.parse()),funValue("pos_2",pos2ARG.parse()),funValue("target_pos",targetPosARG.parse()),funValue("paste_pos",pastePosARG.parse())))
}
fun worldCreateExplosion(location: Any, power: Any) {
	val funName = "worldCreateExplosion"
	val locationARG=typeCheck<JLocation>(location)
	val powerARG=numberConvert(funName,"power",power)
	handleFun("game_create_explosion", listOf(funValue("location",locationARG.parse()),funValue("power",powerARG.parse())))
}
fun worldCreateScoreboard(id: Any, displayName: Any) {
	val funName = "worldCreateScoreboard"
	val idARG=textConvert(funName,"id",id)
	val displayNameARG=textConvert(funName,"displayName",displayName)
	handleFun("game_create_scoreboard", listOf(funValue("id",idARG.parse()),funValue("display_name",displayNameARG.parse())))
}
fun worldFillContainer(items: Any, location: Any) {
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_fill_container", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse())))
}
fun worldGenerateTree(location: Any, treeType: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldGenerateTree"
	enumCheck(funName,"treeType",treeType,listOf("ACACIA","AZALEA","BIG_TREE","BIRCH","BROWN_MUSHROOM","CHERRY","CHORUS_PLANT","COCOA_TREE","CRIMSON_FUNGUS","DARK_OAK","JUNGLE","JUNGLE_BUSH","MANGROVE","MEGA_REDWOOD","REDWOOD","RED_MUSHROOM","SMALL_JUNGLE","SWAMP","TALL_BIRCH","TALL_MANGROVE","TALL_REDWOOD","TREE","WARPED_FUNGUS"))
	handleFun("game_generate_tree", listOf(funValue("location",locationARG.parse())))
}
fun worldHideEventMessage(hide: Any? = null) {
	val funName = "worldHideEventMessage"
	enumCheck(funName,"hide",hide,listOf("FALSE","TRUE"))
	handleFun("game_hide_event_message", listOf())
}
fun worldLaunchFirework(firework: Any, location: Any, movement: Any? = null, instant: Any? = null) {
	val fireworkARG=typeCheck<JItem>(firework)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldLaunchFirework"
	enumCheck(funName,"movement",movement,listOf("DIRECTIONAL","UPWARDS"))
	enumCheck(funName,"instant",instant,listOf("FALSE","TRUE"))
	handleFun("game_launch_firework", listOf(funValue("firework",fireworkARG.parse()),funValue("location",locationARG.parse())))
}
fun worldLaunchProjectile(projectile: Any, location: Any, speed: Any, inaccuracy: Any, customName: Any, trail: Any) {
	val funName = "worldLaunchProjectile"
	val projectileARG=typeCheck<JItem>(projectile)
	val locationARG=typeCheck<JLocation>(location)
	val speedARG=numberConvert(funName,"speed",speed)
	val inaccuracyARG=numberConvert(funName,"inaccuracy",inaccuracy)
	val customNameARG=textConvert(funName,"customName",customName)
	val trailARG=typeCheck<JParticle>(trail)
	handleFun("game_launch_projectile", listOf(funValue("projectile",projectileARG.parse()),funValue("location",locationARG.parse()),funValue("speed",speedARG.parse()),funValue("inaccuracy",inaccuracyARG.parse()),funValue("custom_name",customNameARG.parse()),funValue("trail",trailARG.parse())))
}
fun worldRandomTickBlock(location: Any, times: Any) {
	val funName = "worldRandomTickBlock"
	val locationARG=typeCheck<JLocation>(location)
	val timesARG=numberConvert(funName,"times",times)
	handleFun("game_random_tick_block", listOf(funValue("location",locationARG.parse()),funValue("times",timesARG.parse())))
}
fun worldRemoveContainerItems(items: Any, location: Any) {
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_remove_container_items", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse())))
}
fun worldRemoveScoreboard(id: Any) {
	val funName = "worldRemoveScoreboard"
	val idARG=textConvert(funName,"id",id)
	handleFun("game_remove_scoreboard", listOf(funValue("id",idARG.parse())))
}
fun worldRemoveScoreboardScoreByName(id: Any, text: Any) {
	val funName = "worldRemoveScoreboardScoreByName"
	val idARG=textConvert(funName,"id",id)
	val textARG=textConvert(funName,"text",text)
	handleFun("game_remove_scoreboard_score_by_name", listOf(funValue("id",idARG.parse()),funValue("text",textARG.parse())))
}
fun worldRemoveScoreboardScoreByScore(id: Any, score: Any) {
	val funName = "worldRemoveScoreboardScoreByScore"
	val idARG=textConvert(funName,"id",id)
	val scoreARG=numberConvert(funName,"score",score)
	handleFun("game_remove_scoreboard_score_by_score", listOf(funValue("id",idARG.parse()),funValue("score",scoreARG.parse())))
}
fun worldReplaceBlocksInRegion(oldBlock: Any, pos1: Any, pos2: Any, newBlock: Any) {
	val oldBlockARG=typeCheck<JBlock>(oldBlock)
	val pos1ARG=typeCheck<JLocation>(pos1)
	val pos2ARG=typeCheck<JLocation>(pos2)
	val newBlockARG=typeCheck<JBlock>(newBlock)
	handleFun("game_replace_blocks_in_region", listOf(funValue("old_block",oldBlockARG.parse()),funValue("pos_1",pos1ARG.parse()),funValue("pos_2",pos2ARG.parse()),funValue("new_block",newBlockARG.parse())))
}
fun worldReplaceContainerItems(items: Any, location: Any, replace: Any, count: Any) {
	val funName = "worldReplaceContainerItems"
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	val replaceARG=typeCheck<JItem>(replace)
	val countARG=numberConvert(funName,"count",count)
	handleFun("game_replace_container_items", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse()),funValue("replace",replaceARG.parse()),funValue("count",countARG.parse())))
}
fun worldSendWebRequest(url: Any, contentBody: Any, requestType: Any? = null, contentType: Any? = null) {
	val funName = "worldSendWebRequest"
	val urlARG=textConvert(funName,"url",url)
	val contentBodyARG=textConvert(funName,"contentBody",contentBody)
	enumCheck(funName,"requestType",requestType,listOf("DELETE","GET","POST","PUT"))
	enumCheck(funName,"contentType",contentType,listOf("APPLICATION_JSON","TEXT_PLAIN"))
	handleFun("game_send_web_request", listOf(funValue("url",urlARG.parse()),funValue("content_body",contentBodyARG.parse())))
}
fun worldSetAge(location: Any, tick: Any) {
	val funName = "worldSetAge"
	val locationARG=typeCheck<JLocation>(location)
	val tickARG=numberConvert(funName,"tick",tick)
	handleFun("game_set_age", listOf(funValue("location",locationARG.parse()),funValue("tick",tickARG.parse())))
}
fun worldSetBlock(locations: Any, block: Any, updateBlocks: Any? = null) {
	val locationsARG=typeCheck<JLocation>(locations)
	val blockARG=typeCheck<JBlock>(block)
	val funName = "worldSetBlock"
	enumCheck(funName,"updateBlocks",updateBlocks,listOf("FALSE","TRUE"))
	handleFun("game_set_block", listOf(funValue("locations",locationsARG.parse()),funValue("block",blockARG.parse())))
}
fun worldSetBlockAnaloguePower(location: Any, powerLevel: Any) {
	val funName = "worldSetBlockAnaloguePower"
	val locationARG=typeCheck<JLocation>(location)
	val powerLevelARG=numberConvert(funName,"powerLevel",powerLevel)
	handleFun("game_set_block_analogue_power", listOf(funValue("location",locationARG.parse()),funValue("power_level",powerLevelARG.parse())))
}
fun worldSetBlockCustomTag(location: Any, tagName: Any, tagValue: Any) {
	val funName = "worldSetBlockCustomTag"
	val locationARG=typeCheck<JLocation>(location)
	val tagNameARG=textConvert(funName,"tagName",tagName)
	val tagValueARG=textConvert(funName,"tagValue",tagValue)
	handleFun("game_set_block_custom_tag", listOf(funValue("location",locationARG.parse()),funValue("tag_name",tagNameARG.parse()),funValue("tag_value",tagValueARG.parse())))
}
fun worldSetBlockData(location: Any, blockData: Any) {
	val funName = "worldSetBlockData"
	val locationARG=typeCheck<JLocation>(location)
	val blockDataARG=textConvert(funName,"blockData",blockData)
	handleFun("game_set_block_data", listOf(funValue("location",locationARG.parse()),funValue("block_data",blockDataARG.parse())))
}
fun worldSetBlockDropsEnabled(enable: Any? = null) {
	val funName = "worldSetBlockDropsEnabled"
	enumCheck(funName,"enable",enable,listOf("FALSE","TRUE"))
	handleFun("game_set_block_drops_enabled", listOf())
}
fun worldSetBlockPowered(location: Any, powered: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldSetBlockPowered"
	enumCheck(funName,"powered",powered,listOf("FALSE","TRUE"))
	handleFun("game_set_block_powered", listOf(funValue("location",locationARG.parse())))
}
fun worldSetBlockSingleData(location: Any, data: Any, value: Any) {
	val funName = "worldSetBlockSingleData"
	val locationARG=typeCheck<JLocation>(location)
	val dataARG=textConvert(funName,"data",data)
	val valueARG=textConvert(funName,"value",value)
	handleFun("game_set_block_single_data", listOf(funValue("location",locationARG.parse()),funValue("data",dataARG.parse()),funValue("value",valueARG.parse())))
}
fun worldSetBrushableBlockItem(location: Any, item: Any) {
	val locationARG=typeCheck<JLocation>(location)
	val itemARG=typeCheck<JItem>(item)
	handleFun("game_set_brushable_block_item", listOf(funValue("location",locationARG.parse()),funValue("item",itemARG.parse())))
}
fun worldSetCampfireItem(location: Any, item: Any, cookingTime: Any, slot: Any? = null) {
	val funName = "worldSetCampfireItem"
	val locationARG=typeCheck<JLocation>(location)
	val itemARG=typeCheck<JItem>(item)
	val cookingTimeARG=numberConvert(funName,"cookingTime",cookingTime)
	enumCheck(funName,"slot",slot,listOf("FIRST","FOURTH","SECOND","THIRD"))
	handleFun("game_set_campfire_item", listOf(funValue("location",locationARG.parse()),funValue("item",itemARG.parse()),funValue("cooking_time",cookingTimeARG.parse())))
}
fun worldSetContainer(items: Any, location: Any) {
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_set_container", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse())))
}
fun worldSetContainerLock(location: Any, containerKey: Any) {
	val funName = "worldSetContainerLock"
	val locationARG=typeCheck<JLocation>(location)
	val containerKeyARG=textConvert(funName,"containerKey",containerKey)
	handleFun("game_set_container_lock", listOf(funValue("location",locationARG.parse()),funValue("container_key",containerKeyARG.parse())))
}
fun worldSetContainerName(location: Any, name: Any) {
	val funName = "worldSetContainerName"
	val locationARG=typeCheck<JLocation>(location)
	val nameARG=textConvert(funName,"name",name)
	handleFun("game_set_container_name", listOf(funValue("location",locationARG.parse()),funValue("name",nameARG.parse())))
}
fun worldSetDecoratePotSherd(location: Any, item: Any, side: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val itemARG=typeCheck<JItem>(item)
	val funName = "worldSetDecoratePotSherd"
	enumCheck(funName,"side",side,listOf("BACK","FRONT","LEFT","RIGHT"))
	handleFun("game_set_decorate_pot_sherd", listOf(funValue("location",locationARG.parse()),funValue("item",itemARG.parse())))
}
fun worldSetEventDamage(damage: Any) {
	val funName = "worldSetEventDamage"
	val damageARG=numberConvert(funName,"damage",damage)
	handleFun("game_set_event_damage", listOf(funValue("damage",damageARG.parse())))
}
fun worldSetEventExhaustion(exhaustion: Any) {
	val funName = "worldSetEventExhaustion"
	val exhaustionARG=numberConvert(funName,"exhaustion",exhaustion)
	handleFun("game_set_event_exhaustion", listOf(funValue("exhaustion",exhaustionARG.parse())))
}
fun worldSetEventExperience(experience: Any) {
	val funName = "worldSetEventExperience"
	val experienceARG=numberConvert(funName,"experience",experience)
	handleFun("game_set_event_experience", listOf(funValue("experience",experienceARG.parse())))
}
fun worldSetEventHeal(heal: Any) {
	val funName = "worldSetEventHeal"
	val healARG=numberConvert(funName,"heal",heal)
	handleFun("game_set_event_heal", listOf(funValue("heal",healARG.parse())))
}
fun worldSetEventItem(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("game_set_event_item", listOf(funValue("item",itemARG.parse())))
}
fun worldSetEventItems(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("game_set_event_items", listOf(funValue("items",itemsARG.parse())))
}
fun worldSetEventMoveAllowed(allowed: Any? = null) {
	val funName = "worldSetEventMoveAllowed"
	enumCheck(funName,"allowed",allowed,listOf("FALSE","TRUE"))
	handleFun("game_set_event_move_allowed", listOf())
}
fun worldSetEventProjectile(projectile: Any, name: Any) {
	val funName = "worldSetEventProjectile"
	val projectileARG=typeCheck<JItem>(projectile)
	val nameARG=textConvert(funName,"name",name)
	handleFun("game_set_event_projectile", listOf(funValue("projectile",projectileARG.parse()),funValue("name",nameARG.parse())))
}
fun worldSetEventSound(sound: Any) {
	val soundARG=typeCheck<JSound>(sound)
	handleFun("game_set_event_sound", listOf(funValue("sound",soundARG.parse())))
}
fun worldSetEventSourceSlot(sourceSlot: Any) {
	val funName = "worldSetEventSourceSlot"
	val sourceSlotARG=numberConvert(funName,"sourceSlot",sourceSlot)
	handleFun("game_set_event_source_slot", listOf(funValue("source_slot",sourceSlotARG.parse())))
}
fun worldSetEventTargetSlot(target: Any) {
	val funName = "worldSetEventTargetSlot"
	val targetARG=numberConvert(funName,"target",target)
	handleFun("game_set_event_target_slot", listOf(funValue("target",targetARG.parse())))
}
fun worldSetEventUeryInfo(information: Any) {
	val funName = "worldSetEventUeryInfo"
	val informationARG=textConvert(funName,"information",information)
	handleFun("game_set_event_uery_info", listOf(funValue("information",informationARG.parse())))
}
fun worldSetFurnaceCookTime(location: Any, time: Any) {
	val funName = "worldSetFurnaceCookTime"
	val locationARG=typeCheck<JLocation>(location)
	val timeARG=numberConvert(funName,"time",time)
	handleFun("game_set_furnace_cook_time", listOf(funValue("location",locationARG.parse()),funValue("time",timeARG.parse())))
}
fun worldSetItemInContainerSlot(location: Any, item: Any, slot: Any) {
	val funName = "worldSetItemInContainerSlot"
	val locationARG=typeCheck<JLocation>(location)
	val itemARG=typeCheck<JItem>(item)
	val slotARG=numberConvert(funName,"slot",slot)
	handleFun("game_set_item_in_container_slot", listOf(funValue("location",locationARG.parse()),funValue("item",itemARG.parse()),funValue("slot",slotARG.parse())))
}
fun worldSetLecternBook(location: Any, item: Any, page: Any) {
	val funName = "worldSetLecternBook"
	val locationARG=typeCheck<JLocation>(location)
	val itemARG=typeCheck<JItem>(item)
	val pageARG=numberConvert(funName,"page",page)
	handleFun("game_set_lectern_book", listOf(funValue("location",locationARG.parse()),funValue("item",itemARG.parse()),funValue("page",pageARG.parse())))
}
fun worldSetPlayerHead(location: Any, nameOrUuid: Any, receiveType: Any? = null) {
	val funName = "worldSetPlayerHead"
	val locationARG=typeCheck<JLocation>(location)
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"receiveType",receiveType,listOf("NAME_OR_UUID","VALUE"))
	handleFun("game_set_player_head", listOf(funValue("location",locationARG.parse()),funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun worldSetRegion(block: Any, pos1: Any, pos2: Any) {
	val blockARG=typeCheck<JBlock>(block)
	val pos1ARG=typeCheck<JLocation>(pos1)
	val pos2ARG=typeCheck<JLocation>(pos2)
	handleFun("game_set_region", listOf(funValue("block",blockARG.parse()),funValue("pos_1",pos1ARG.parse()),funValue("pos_2",pos2ARG.parse())))
}
fun worldSetScoreboardLine(id: Any, line: Any, display: Any, score: Any, formatContent: Any, format: Any? = null) {
	val funName = "worldSetScoreboardLine"
	val idARG=textConvert(funName,"id",id)
	val lineARG=textConvert(funName,"line",line)
	val displayARG=textConvert(funName,"display",display)
	val scoreARG=numberConvert(funName,"score",score)
	val formatContentARG=textConvert(funName,"formatContent",formatContent)
	enumCheck(funName,"format",format,listOf("BLANK","FIXED","RESET","STYLED"))
	handleFun("game_set_scoreboard_line", listOf(funValue("id",idARG.parse()),funValue("line",lineARG.parse()),funValue("display",displayARG.parse()),funValue("score",scoreARG.parse()),funValue("format_content",formatContentARG.parse())))
}
fun worldSetScoreboardLineDisplay(id: Any, line: Any, display: Any) {
	val funName = "worldSetScoreboardLineDisplay"
	val idARG=textConvert(funName,"id",id)
	val lineARG=textConvert(funName,"line",line)
	val displayARG=textConvert(funName,"display",display)
	handleFun("game_set_scoreboard_line_display", listOf(funValue("id",idARG.parse()),funValue("line",lineARG.parse()),funValue("display",displayARG.parse())))
}
fun worldSetScoreboardLineFormat(id: Any, line: Any, formatContent: Any, format: Any? = null) {
	val funName = "worldSetScoreboardLineFormat"
	val idARG=textConvert(funName,"id",id)
	val lineARG=textConvert(funName,"line",line)
	val formatContentARG=textConvert(funName,"formatContent",formatContent)
	enumCheck(funName,"format",format,listOf("BLANK","FIXED","RESET","STYLED"))
	handleFun("game_set_scoreboard_line_format", listOf(funValue("id",idARG.parse()),funValue("line",lineARG.parse()),funValue("format_content",formatContentARG.parse())))
}
fun worldSetScoreboardNumberFormat(id: Any, formatContent: Any, format: Any? = null) {
	val funName = "worldSetScoreboardNumberFormat"
	val idARG=textConvert(funName,"id",id)
	val formatContentARG=textConvert(funName,"formatContent",formatContent)
	enumCheck(funName,"format",format,listOf("BLANK","FIXED","RESET","STYLED"))
	handleFun("game_set_scoreboard_number_format", listOf(funValue("id",idARG.parse()),funValue("format_content",formatContentARG.parse())))
}
fun worldSetScoreboardScore(id: Any, text: Any, score: Any) {
	val funName = "worldSetScoreboardScore"
	val idARG=textConvert(funName,"id",id)
	val textARG=textConvert(funName,"text",text)
	val scoreARG=numberConvert(funName,"score",score)
	handleFun("game_set_scoreboard_score", listOf(funValue("id",idARG.parse()),funValue("text",textARG.parse()),funValue("score",scoreARG.parse())))
}
fun worldSetScoreboardTitle(id: Any, title: Any) {
	val funName = "worldSetScoreboardTitle"
	val idARG=textConvert(funName,"id",id)
	val titleARG=textConvert(funName,"title",title)
	handleFun("game_set_scoreboard_title", listOf(funValue("id",idARG.parse()),funValue("title",titleARG.parse())))
}
fun worldSetSculkShriekerCanSummon(location: Any, canSummon: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldSetSculkShriekerCanSummon"
	enumCheck(funName,"canSummon",canSummon,listOf("FALSE","TRUE"))
	handleFun("game_set_sculk_shrieker_can_summon", listOf(funValue("location",locationARG.parse())))
}
fun worldSetSculkShriekerShrieking(location: Any, shrieking: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldSetSculkShriekerShrieking"
	enumCheck(funName,"shrieking",shrieking,listOf("FALSE","TRUE"))
	handleFun("game_set_sculk_shrieker_shrieking", listOf(funValue("location",locationARG.parse())))
}
fun worldSetSculkShriekerWarningLevel(location: Any, warningLevel: Any) {
	val funName = "worldSetSculkShriekerWarningLevel"
	val locationARG=typeCheck<JLocation>(location)
	val warningLevelARG=numberConvert(funName,"warningLevel",warningLevel)
	handleFun("game_set_sculk_shrieker_warning_level", listOf(funValue("location",locationARG.parse()),funValue("warning_level",warningLevelARG.parse())))
}
fun worldSetSignText(location: Any, text: Any, line: Any, side: Any? = null) {
	val funName = "worldSetSignText"
	val locationARG=typeCheck<JLocation>(location)
	val textARG=textConvert(funName,"text",text)
	val lineARG=numberConvert(funName,"line",line)
	enumCheck(funName,"side",side,listOf("ALL","BACK","FRONT"))
	handleFun("game_set_sign_text", listOf(funValue("location",locationARG.parse()),funValue("text",textARG.parse()),funValue("line",lineARG.parse())))
}
fun worldSetSignTextColor(location: Any, side: Any? = null, signTextColor: Any? = null, glowing: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldSetSignTextColor"
	enumCheck(funName,"side",side,listOf("ALL","BACK","FRONT"))
	enumCheck(funName,"signTextColor",signTextColor,listOf("BLACK","BLUE","BROWN","CYAN","GRAY","GREEN","LIGHT_BLUE","LIGHT_GRAY","LIME","MAGENTA","ORANGE","PINK","PURPLE","RED","WHITE","YELLOW"))
	enumCheck(funName,"glowing",glowing,listOf("FALSE","TRUE"))
	handleFun("game_set_sign_text_color", listOf(funValue("location",locationARG.parse())))
}
fun worldSetSignWaxed(location: Any, waxed: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldSetSignWaxed"
	enumCheck(funName,"waxed",waxed,listOf("FALSE","TRUE"))
	handleFun("game_set_sign_waxed", listOf(funValue("location",locationARG.parse())))
}
fun worldSetSpawnerEntity(location: Any, entity: Any) {
	val locationARG=typeCheck<JLocation>(location)
	val entityARG=typeCheck<JItem>(entity)
	handleFun("game_set_spawner_entity", listOf(funValue("location",locationARG.parse()),funValue("entity",entityARG.parse())))
}
fun worldSetWorldDifficulty(difficulty: Any? = null) {
	val funName = "worldSetWorldDifficulty"
	enumCheck(funName,"difficulty",difficulty,listOf("EASY","HARD","NORMAL","PEACEFUL"))
	handleFun("game_set_world_difficulty", listOf())
}
fun worldSetWorldSimulationDistance(distance: Any) {
	val funName = "worldSetWorldSimulationDistance"
	val distanceARG=numberConvert(funName,"distance",distance)
	handleFun("game_set_world_simulation_distance", listOf(funValue("distance",distanceARG.parse())))
}
fun worldSetWorldTime(time: Any) {
	val funName = "worldSetWorldTime"
	val timeARG=numberConvert(funName,"time",time)
	handleFun("game_set_world_time", listOf(funValue("time",timeARG.parse())))
}
fun worldSetWorldWeather(weatherDuration: Any, weatherType: Any? = null) {
	val funName = "worldSetWorldWeather"
	val weatherDurationARG=numberConvert(funName,"weatherDuration",weatherDuration)
	enumCheck(funName,"weatherType",weatherType,listOf("CLEAR","RAINING","THUNDER"))
	handleFun("game_set_world_weather", listOf(funValue("weather_duration",weatherDurationARG.parse())))
}
fun worldSpawnArmorStand(helmet: Any, chestplate: Any, boots: Any, leggings: Any, rightHand: Any, leftHand: Any, location: Any, customName: Any, gravity: Any? = null, marker: Any? = null, small: Any? = null, showArms: Any? = null, basePlate: Any? = null, invisible: Any? = null) {
	val funName = "worldSpawnArmorStand"
	val helmetARG=typeCheck<JItem>(helmet)
	val chestplateARG=typeCheck<JItem>(chestplate)
	val bootsARG=typeCheck<JItem>(boots)
	val leggingsARG=typeCheck<JItem>(leggings)
	val rightHandARG=typeCheck<JItem>(rightHand)
	val leftHandARG=typeCheck<JItem>(leftHand)
	val locationARG=typeCheck<JLocation>(location)
	val customNameARG=textConvert(funName,"customName",customName)
	enumCheck(funName,"gravity",gravity,listOf("FALSE","TRUE"))
	enumCheck(funName,"marker",marker,listOf("FALSE","TRUE"))
	enumCheck(funName,"small",small,listOf("FALSE","TRUE"))
	enumCheck(funName,"showArms",showArms,listOf("FALSE","TRUE"))
	enumCheck(funName,"basePlate",basePlate,listOf("FALSE","TRUE"))
	enumCheck(funName,"invisible",invisible,listOf("FALSE","TRUE"))
	handleFun("game_spawn_armor_stand", listOf(funValue("helmet",helmetARG.parse()),funValue("chestplate",chestplateARG.parse()),funValue("boots",bootsARG.parse()),funValue("leggings",leggingsARG.parse()),funValue("right_hand",rightHandARG.parse()),funValue("left_hand",leftHandARG.parse()),funValue("location",locationARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnBlockDisplay(spawnLocation: Any, customName: Any, block: Any) {
	val funName = "worldSpawnBlockDisplay"
	val spawnLocationARG=typeCheck<JLocation>(spawnLocation)
	val customNameARG=textConvert(funName,"customName",customName)
	val blockARG=typeCheck<JBlock>(block)
	handleFun("game_spawn_block_display", listOf(funValue("spawn_location",spawnLocationARG.parse()),funValue("custom_name",customNameARG.parse()),funValue("block",blockARG.parse())))
}
fun worldSpawnEffectCloud(location: Any, duration: Any, radius: Any, effects: Any, particle: Any, customName: Any) {
	val funName = "worldSpawnEffectCloud"
	val locationARG=typeCheck<JLocation>(location)
	val durationARG=numberConvert(funName,"duration",duration)
	val radiusARG=numberConvert(funName,"radius",radius)
	val effectsARG=typeCheck<JPotion>(effects)
	val particleARG=typeCheck<JParticle>(particle)
	val customNameARG=textConvert(funName,"customName",customName)
	handleFun("game_spawn_effect_cloud", listOf(funValue("location",locationARG.parse()),funValue("duration",durationARG.parse()),funValue("radius",radiusARG.parse()),funValue("effects",effectsARG.parse()),funValue("particle",particleARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnEndCrystal(location: Any, customName: Any, showBottom: Any? = null) {
	val funName = "worldSpawnEndCrystal"
	val locationARG=typeCheck<JLocation>(location)
	val customNameARG=textConvert(funName,"customName",customName)
	enumCheck(funName,"showBottom",showBottom,listOf("FALSE","TRUE"))
	handleFun("game_spawn_end_crystal", listOf(funValue("location",locationARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnEvokerFangs(location: Any, customName: Any) {
	val funName = "worldSpawnEvokerFangs"
	val locationARG=typeCheck<JLocation>(location)
	val customNameARG=textConvert(funName,"customName",customName)
	handleFun("game_spawn_evoker_fangs", listOf(funValue("location",locationARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnExperienceOrb(location: Any, experienceAmount: Any, customName: Any) {
	val funName = "worldSpawnExperienceOrb"
	val locationARG=typeCheck<JLocation>(location)
	val experienceAmountARG=numberConvert(funName,"experienceAmount",experienceAmount)
	val customNameARG=textConvert(funName,"customName",customName)
	handleFun("game_spawn_experience_orb", listOf(funValue("location",locationARG.parse()),funValue("experience_amount",experienceAmountARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnEyeOfEnder(location: Any, destination: Any, lifespan: Any, customName: Any, endOfLifespan: Any? = null) {
	val funName = "worldSpawnEyeOfEnder"
	val locationARG=typeCheck<JLocation>(location)
	val destinationARG=typeCheck<JLocation>(destination)
	val lifespanARG=numberConvert(funName,"lifespan",lifespan)
	val customNameARG=textConvert(funName,"customName",customName)
	enumCheck(funName,"endOfLifespan",endOfLifespan,listOf("DROP","RANDOM","SHATTER"))
	handleFun("game_spawn_eye_of_ender", listOf(funValue("location",locationARG.parse()),funValue("destination",destinationARG.parse()),funValue("lifespan",lifespanARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnFallingBlock(block: Any, location: Any, name: Any, shouldExpire: Any? = null) {
	val funName = "worldSpawnFallingBlock"
	val blockARG=typeCheck<JBlock>(block)
	val locationARG=typeCheck<JLocation>(location)
	val nameARG=textConvert(funName,"name",name)
	enumCheck(funName,"shouldExpire",shouldExpire,listOf("FALSE","TRUE"))
	handleFun("game_spawn_falling_block", listOf(funValue("block",blockARG.parse()),funValue("location",locationARG.parse()),funValue("name",nameARG.parse())))
}
fun worldSpawnInteractionEntity(location: Any, customName: Any, width: Any, height: Any, responsive: Any? = null) {
	val funName = "worldSpawnInteractionEntity"
	val locationARG=typeCheck<JLocation>(location)
	val customNameARG=textConvert(funName,"customName",customName)
	val widthARG=numberConvert(funName,"width",width)
	val heightARG=numberConvert(funName,"height",height)
	enumCheck(funName,"responsive",responsive,listOf("FALSE","TRUE"))
	handleFun("game_spawn_interaction_entity", listOf(funValue("location",locationARG.parse()),funValue("custom_name",customNameARG.parse()),funValue("width",widthARG.parse()),funValue("height",heightARG.parse())))
}
fun worldSpawnItem(location: Any, item: Any, customName: Any, canMobPickup: Any? = null, canPlayerPickup: Any? = null, applyMotion: Any? = null) {
	val funName = "worldSpawnItem"
	val locationARG=typeCheck<JLocation>(location)
	val itemARG=typeCheck<JItem>(item)
	val customNameARG=textConvert(funName,"customName",customName)
	enumCheck(funName,"canMobPickup",canMobPickup,listOf("FALSE","TRUE"))
	enumCheck(funName,"canPlayerPickup",canPlayerPickup,listOf("FALSE","TRUE"))
	enumCheck(funName,"applyMotion",applyMotion,listOf("FALSE","TRUE"))
	handleFun("game_spawn_item", listOf(funValue("location",locationARG.parse()),funValue("item",itemARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnItemDisplay(spawnLocation: Any, customName: Any, displayedItem: Any) {
	val funName = "worldSpawnItemDisplay"
	val spawnLocationARG=typeCheck<JLocation>(spawnLocation)
	val customNameARG=textConvert(funName,"customName",customName)
	val displayedItemARG=typeCheck<JItem>(displayedItem)
	handleFun("game_spawn_item_display", listOf(funValue("spawn_location",spawnLocationARG.parse()),funValue("custom_name",customNameARG.parse()),funValue("displayed_item",displayedItemARG.parse())))
}
fun worldSpawnLightningBolt(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_spawn_lightning_bolt", listOf(funValue("location",locationARG.parse())))
}
fun worldSpawnMob(mob: Any, location: Any, health: Any, potionEffects: Any, customName: Any, mainHand: Any, helmet: Any, chestplate: Any, leggings: Any, boots: Any, offHand: Any, naturalEquipment: Any? = null) {
	val funName = "worldSpawnMob"
	val mobARG=typeCheck<JItem>(mob)
	val locationARG=typeCheck<JLocation>(location)
	val healthARG=numberConvert(funName,"health",health)
	val potionEffectsARG=typeCheck<JPotion>(potionEffects)
	val customNameARG=textConvert(funName,"customName",customName)
	val mainHandARG=typeCheck<JItem>(mainHand)
	val helmetARG=typeCheck<JItem>(helmet)
	val chestplateARG=typeCheck<JItem>(chestplate)
	val leggingsARG=typeCheck<JItem>(leggings)
	val bootsARG=typeCheck<JItem>(boots)
	val offHandARG=typeCheck<JItem>(offHand)
	enumCheck(funName,"naturalEquipment",naturalEquipment,listOf("FALSE","TRUE"))
	handleFun("game_spawn_mob", listOf(funValue("mob",mobARG.parse()),funValue("location",locationARG.parse()),funValue("health",healthARG.parse()),funValue("potion_effects",potionEffectsARG.parse()),funValue("custom_name",customNameARG.parse()),funValue("main_hand",mainHandARG.parse()),funValue("helmet",helmetARG.parse()),funValue("chestplate",chestplateARG.parse()),funValue("leggings",leggingsARG.parse()),funValue("boots",bootsARG.parse()),funValue("off_hand",offHandARG.parse())))
}
fun worldSpawnPrimedTnt(location: Any, tntPower: Any, fuseDuration: Any, customName: Any, block: Any) {
	val funName = "worldSpawnPrimedTnt"
	val locationARG=typeCheck<JLocation>(location)
	val tntPowerARG=numberConvert(funName,"tntPower",tntPower)
	val fuseDurationARG=numberConvert(funName,"fuseDuration",fuseDuration)
	val customNameARG=textConvert(funName,"customName",customName)
	val blockARG=typeCheck<JBlock>(block)
	handleFun("game_spawn_primed_tnt", listOf(funValue("location",locationARG.parse()),funValue("tnt_power",tntPowerARG.parse()),funValue("fuse_duration",fuseDurationARG.parse()),funValue("custom_name",customNameARG.parse()),funValue("block",blockARG.parse())))
}
fun worldSpawnShulkerBullet(location: Any, customName: Any) {
	val funName = "worldSpawnShulkerBullet"
	val locationARG=typeCheck<JLocation>(location)
	val customNameARG=textConvert(funName,"customName",customName)
	handleFun("game_spawn_shulker_bullet", listOf(funValue("location",locationARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnTextDisplay(spawnLocation: Any, displayedText: Any, customName: Any, mergingMode: Any? = null) {
	val funName = "worldSpawnTextDisplay"
	val spawnLocationARG=typeCheck<JLocation>(spawnLocation)
	val displayedTextARG=textConvertPlural(funName,"displayedText",displayedText)
	val customNameARG=textConvert(funName,"customName",customName)
	enumCheck(funName,"mergingMode",mergingMode,listOf("CONCATENATION","SEPARATE_LINES","SPACES"))
	handleFun("game_spawn_text_display", listOf(funValue("spawn_location",spawnLocationARG.parse()),funValue("displayed_text",displayedTextARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldSpawnVehicle(vehicle: Any, location: Any, customName: Any) {
	val funName = "worldSpawnVehicle"
	val vehicleARG=typeCheck<JItem>(vehicle)
	val locationARG=typeCheck<JLocation>(location)
	val customNameARG=textConvert(funName,"customName",customName)
	handleFun("game_spawn_vehicle", listOf(funValue("vehicle",vehicleARG.parse()),funValue("location",locationARG.parse()),funValue("custom_name",customNameARG.parse())))
}
fun worldUncancelEvent() {
	handleFun("game_uncancel_event", listOf())
}
fun worldUpdateBlock(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("game_update_block", listOf(funValue("location",locationARG.parse())))
}
fun entityCollidesAtLocation(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("if_entity_collides_at_location", listOf(funValue("location",locationARG.parse())))
}
fun entityCollidesUsingHitbox(min: Any, max: Any) {
	val minARG=typeCheck<JLocation>(min)
	val maxARG=typeCheck<JLocation>(max)
	handleFun("if_entity_collides_using_hitbox", listOf(funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun entityCollidesWithEntity(nameOrUuid: Any, checkType: Any? = null) {
	val funName = "entityCollidesWithEntity"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"checkType",checkType,listOf("CONTAINS","OVERLAPS"))
	handleFun("if_entity_collides_with_entity", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun entityExists() {
	handleFun("if_entity_exists", listOf())
}
fun entityHasCustomTag(tag: Any, tagValue: Any, compareType: Any? = null) {
	val funName = "entityHasCustomTag"
	val tagARG=textConvert(funName,"tag",tag)
	val tagValueARG=textConvert(funName,"tagValue",tagValue)
	enumCheck(funName,"compareType",compareType,listOf("CONTAINS","ENDS_WITH","EQUALS","STARTS_WITH"))
	handleFun("if_entity_has_custom_tag", listOf(funValue("tag",tagARG.parse()),funValue("tag_value",tagValueARG.parse())))
}
fun entityHasPotionEffect(potions: Any, checkMode: Any? = null) {
	val potionsARG=typeCheck<JPotion>(potions)
	val funName = "entityHasPotionEffect"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	handleFun("if_entity_has_potion_effect", listOf(funValue("potions",potionsARG.parse())))
}
fun entityInArea(location1: Any, location2: Any, ignoreYAxis: Any? = null, intersectType: Any? = null, checkType: Any? = null) {
	val location1ARG=typeCheck<JLocation>(location1)
	val location2ARG=typeCheck<JLocation>(location2)
	val funName = "entityInArea"
	enumCheck(funName,"ignoreYAxis",ignoreYAxis,listOf("FALSE","TRUE"))
	enumCheck(funName,"intersectType",intersectType,listOf("HITBOX","POINT"))
	enumCheck(funName,"checkType",checkType,listOf("CONTAINS","OVERLAPS"))
	handleFun("if_entity_in_area", listOf(funValue("location_1",location1ARG.parse()),funValue("location_2",location2ARG.parse())))
}
fun entityIsDisguised() {
	handleFun("if_entity_is_disguised", listOf())
}
fun entityIsGrounded() {
	handleFun("if_entity_is_grounded", listOf())
}
fun entityIsItem() {
	handleFun("if_entity_is_item", listOf())
}
fun entityIsMob() {
	handleFun("if_entity_is_mob", listOf())
}
fun entityIsNearLocation(range: Any, location: Any, ignoreYAxis: Any? = null) {
	val funName = "entityIsNearLocation"
	val rangeARG=numberConvert(funName,"range",range)
	val locationARG=typeCheck<JLocation>(location)
	enumCheck(funName,"ignoreYAxis",ignoreYAxis,listOf("FALSE","TRUE"))
	handleFun("if_entity_is_near_location", listOf(funValue("range",rangeARG.parse()),funValue("location",locationARG.parse())))
}
fun entityIsProjectile() {
	handleFun("if_entity_is_projectile", listOf())
}
fun entityIsRidingEntity(entityIds: Any, compareMode: Any? = null) {
	val funName = "entityIsRidingEntity"
	val entityIdsARG=textConvertPlural(funName,"entityIds",entityIds)
	enumCheck(funName,"compareMode",compareMode,listOf("FARTHEST","NAME_OR_UUID","NEAREST","TYPE"))
	handleFun("if_entity_is_riding_entity", listOf(funValue("entity_ids",entityIdsARG.parse())))
}
fun entityIsStandingOnBlock(blocks: Any, locations: Any, onlySolid: Any? = null) {
	val blocksARG=typeCheck<JBlock>(blocks)
	val locationsARG=typeCheck<JLocation>(locations)
	val funName = "entityIsStandingOnBlock"
	enumCheck(funName,"onlySolid",onlySolid,listOf("FALSE","TRUE"))
	handleFun("if_entity_is_standing_on_block", listOf(funValue("blocks",blocksARG.parse()),funValue("locations",locationsARG.parse())))
}
fun entityIsType(entityTypes: Any) {
	val entityTypesARG=typeCheck<JItem>(entityTypes)
	handleFun("if_entity_is_type", listOf(funValue("entity_types",entityTypesARG.parse())))
}
fun entityIsVehicle() {
	handleFun("if_entity_is_vehicle", listOf())
}
fun entityNameEquals(namesOrUuids: Any) {
	val funName = "entityNameEquals"
	val namesOrUuidsARG=textConvertPlural(funName,"namesOrUuids",namesOrUuids)
	handleFun("if_entity_name_equals", listOf(funValue("names_or_uuids",namesOrUuidsARG.parse())))
}
fun entitySpawnReasonEquals(reason: Any? = null) {
	val funName = "entitySpawnReasonEquals"
	enumCheck(funName,"reason",reason,listOf("BEEHIVE","BREEDING","BUILD_IRONGOLEM","BUILD_SNOWMAN","BUILD_WITHER","COMMAND","CURED","CUSTOM","DEFAULT","DISPENSE_EGG","DROWNED","EGG","ENDER_PEARL","EXPLOSION","FROZEN","INFECTION","JOCKEY","LIGHTNING","MOUNT","NATURAL","NETHER_PORTAL","OCELOT_BABY","PATROL","PIGLIN_ZOMBIFIED","RAID","REINFORCEMENTS","SHEARED","SHOULDER_ENTITY","SILVERFISH_BLOCK","SLIME_SPLIT","SPAWNER","SPAWNER_EGG","TRAP","VILLAGER_DEFENSE","VILLAGE_INVASION"))
	handleFun("if_entity_spawn_reason_equals", listOf())
}
fun worldBlockEquals(blocks: Any, location: Any) {
	val blocksARG=typeCheck<JBlock>(blocks)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("if_game_block_equals", listOf(funValue("blocks",blocksARG.parse()),funValue("location",locationARG.parse())))
}
fun worldBlockPowered(locations: Any, powerMode: Any? = null) {
	val locationsARG=typeCheck<JLocation>(locations)
	val funName = "worldBlockPowered"
	enumCheck(funName,"powerMode",powerMode,listOf("DIRECT","INDIRECT"))
	handleFun("if_game_block_powered", listOf(funValue("locations",locationsARG.parse())))
}
fun worldChunkIsLoaded(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("if_game_chunk_is_loaded", listOf(funValue("location",locationARG.parse())))
}
fun worldContainerHas(items: Any, location: Any, checkMode: Any? = null, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldContainerHas"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_game_container_has", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse())))
}
fun worldContainerHasRoomForItem(items: Any, location: Any, checkMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "worldContainerHasRoomForItem"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	handleFun("if_game_container_has_room_for_item", listOf(funValue("items",itemsARG.parse()),funValue("location",locationARG.parse())))
}
fun worldDamageCauseEquals(cause: Any? = null) {
	val funName = "worldDamageCauseEquals"
	enumCheck(funName,"cause",cause,listOf("BLOCK_EXPLOSION","CONTACT","CRAMMING","CUSTOM","DRAGON_BREATH","DROWNING","DRYOUT","ENTITY_ATTACK","ENTITY_EXPLOSION","ENTITY_SWEEP_ATTACK","FALL","FALLING_BLOCK","FIRE","FIRE_TICK","FLY_INTO_WALL","FREEZE","HOT_FLOOR","KILL","LAVA","LIGHTNING","MAGIC","MELTING","POISON","PROJECTILE","SONIC_BOOM","STARVATION","SUFFOCATION","SUICIDE","THORNS","VOID","WITHER","WORLD_BORDER"))
	handleFun("if_game_damage_cause_equals", listOf())
}
fun worldEventAttackIsCritical() {
	handleFun("if_game_event_attack_is_critical", listOf())
}
fun worldEventBlockEquals(blocks: Any, locations: Any) {
	val blocksARG=typeCheck<JBlock>(blocks)
	val locationsARG=typeCheck<JLocation>(locations)
	handleFun("if_game_event_block_equals", listOf(funValue("blocks",blocksARG.parse()),funValue("locations",locationsARG.parse())))
}
fun worldEventIsCanceled() {
	handleFun("if_game_event_is_canceled", listOf())
}
fun worldEventItemEquals(items: Any, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "worldEventItemEquals"
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_game_event_item_equals", listOf(funValue("items",itemsARG.parse())))
}
fun worldHasPlayer(namesOrUuids: Any) {
	val funName = "worldHasPlayer"
	val namesOrUuidsARG=textConvertPlural(funName,"namesOrUuids",namesOrUuids)
	handleFun("if_game_has_player", listOf(funValue("names_or_uuids",namesOrUuidsARG.parse())))
}
fun worldHealCauseEquals(healCause: Any? = null) {
	val funName = "worldHealCauseEquals"
	enumCheck(funName,"healCause",healCause,listOf("CUSTOM","EATING","ENDER_CRYSTAL","MAGIC","MAGIC_REGEN","REGEN","SATIATED","WITHER","WITHER_SPAWN"))
	handleFun("if_game_heal_cause_equals", listOf())
}
fun worldIgniteCauseEquals(cause: Any? = null) {
	val funName = "worldIgniteCauseEquals"
	enumCheck(funName,"cause",cause,listOf("ARROW","ENDER_CRYSTAL","EXPLOSION","FALL","FIREBALL","FLINT_AND_STEEL","LAVA","LIGHTNING","SPREAD","SUFFOCATION"))
	handleFun("if_game_ignite_cause_equals", listOf())
}
fun worldInstrumentEquals(instrument: Any? = null) {
	val funName = "worldInstrumentEquals"
	enumCheck(funName,"instrument",instrument,listOf("BANJO","BASS_DRUM","BASS_GUITAR","BELL","BIT","CHIME","COW_BELL","CREEPER","CUSTOM_HEAD","DIDGERIDOO","DRAGON","FLUTE","GUITAR","IRON_XYLOPHONE","PIANO","PIGLIN","PLING","SKELETON","SNARE_DRUM","STICKS","WITHER_SKELETON","XYLOPHONE","ZOMBIE"))
	handleFun("if_game_instrument_equals", listOf())
}
fun worldSignContains(location: Any, texts: Any, checkSide: Any? = null, checkMode: Any? = null, lines: Any? = null) {
	val funName = "worldSignContains"
	val locationARG=typeCheck<JLocation>(location)
	val textsARG=textConvertPlural(funName,"texts",texts)
	enumCheck(funName,"checkSide",checkSide,listOf("ANY","BACK","FRONT"))
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY","CONTAINS","EQUALS"))
	enumCheck(funName,"lines",lines,listOf("ALL","ANY","FIRST","FOURTH","SECOND","THIRD"))
	handleFun("if_game_sign_contains", listOf(funValue("location",locationARG.parse()),funValue("texts",textsARG.parse())))
}
fun playerChatColorsEnabled() {
	handleFun("if_player_chat_colors_enabled", listOf())
}
fun playerChatMessageEquals(chatMessages: Any) {
	val funName = "playerChatMessageEquals"
	val chatMessagesARG=textConvertPlural(funName,"chatMessages",chatMessages)
	handleFun("if_player_chat_message_equals", listOf(funValue("chat_messages",chatMessagesARG.parse())))
}
fun playerCollidesAtLocation(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("if_player_collides_at_location", listOf(funValue("location",locationARG.parse())))
}
fun playerCollidesUsingHitbox(min: Any, max: Any) {
	val minARG=typeCheck<JLocation>(min)
	val maxARG=typeCheck<JLocation>(max)
	handleFun("if_player_collides_using_hitbox", listOf(funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun playerCollidesWithEntity(nameOrUuid: Any, checkType: Any? = null) {
	val funName = "playerCollidesWithEntity"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"checkType",checkType,listOf("CONTAINS","OVERLAPS"))
	handleFun("if_player_collides_with_entity", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun playerCursorItemEquals(items: Any, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerCursorItemEquals"
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_cursor_item_equals", listOf(funValue("items",itemsARG.parse())))
}
fun playerGamemodeEquals(gamemode: Any? = null) {
	val funName = "playerGamemodeEquals"
	enumCheck(funName,"gamemode",gamemode,listOf("ADVENTURE","CREATIVE","SPECTATOR","SURVIVAL"))
	handleFun("if_player_gamemode_equals", listOf())
}
fun playerHasItem(items: Any, checkMode: Any? = null, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerHasItem"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_has_item", listOf(funValue("items",itemsARG.parse())))
}
fun playerHasItemAtLeast(item: Any, count: Any, comparisonMode: Any? = null) {
	val funName = "playerHasItemAtLeast"
	val itemARG=typeCheck<JItem>(item)
	val countARG=numberConvert(funName,"count",count)
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_has_item_at_least", listOf(funValue("item",itemARG.parse()),funValue("count",countARG.parse())))
}
fun playerHasItemInSlot(slots: Any, items: Any, comparisonMode: Any? = null) {
	val funName = "playerHasItemInSlot"
	val slotsARG=numberConvertPlural(funName,"slots",slots)
	val itemsARG=typeCheck<JItem>(items)
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_has_item_in_slot", listOf(funValue("slots",slotsARG.parse()),funValue("items",itemsARG.parse())))
}
fun playerHasPotionEffect(potions: Any, checkMode: Any? = null) {
	val potionsARG=typeCheck<JPotion>(potions)
	val funName = "playerHasPotionEffect"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	handleFun("if_player_has_potion_effect", listOf(funValue("potions",potionsARG.parse())))
}
fun playerHasPrivilege(privilege: Any? = null, exact: Any? = null) {
	val funName = "playerHasPrivilege"
	enumCheck(funName,"privilege",privilege,listOf("BUILDER","BUILDER_AND_DEVELOPER","DEVELOPER","OWNER","WHITELISTED"))
	enumCheck(funName,"exact",exact,listOf("FALSE","TRUE"))
	handleFun("if_player_has_privilege", listOf())
}
fun playerHasRoomForItem(items: Any, checkedSlots: Any? = null, checkMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerHasRoomForItem"
	enumCheck(funName,"checkedSlots",checkedSlots,listOf("ARMOR","ENTIRE_INVENTORY","HOTBAR","MAIN_INVENTORY","UPPER_INVENTORY"))
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	handleFun("if_player_has_room_for_item", listOf(funValue("items",itemsARG.parse())))
}
fun playerHotbarSlotEquals(slot: Any) {
	val funName = "playerHotbarSlotEquals"
	val slotARG=numberConvert(funName,"slot",slot)
	handleFun("if_player_hotbar_slot_equals", listOf(funValue("slot",slotARG.parse())))
}
fun playerInArea(location1: Any, location2: Any, ignoreYAxis: Any? = null, intersectType: Any? = null, checkType: Any? = null) {
	val location1ARG=typeCheck<JLocation>(location1)
	val location2ARG=typeCheck<JLocation>(location2)
	val funName = "playerInArea"
	enumCheck(funName,"ignoreYAxis",ignoreYAxis,listOf("FALSE","TRUE"))
	enumCheck(funName,"intersectType",intersectType,listOf("HITBOX","POINT"))
	enumCheck(funName,"checkType",checkType,listOf("CONTAINS","OVERLAPS"))
	handleFun("if_player_in_area", listOf(funValue("location_1",location1ARG.parse()),funValue("location_2",location2ARG.parse())))
}
fun playerInventoryMenuSlotEquals(slots: Any, items: Any, comparisonMode: Any? = null) {
	val funName = "playerInventoryMenuSlotEquals"
	val slotsARG=numberConvertPlural(funName,"slots",slots)
	val itemsARG=typeCheck<JItem>(items)
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_inventory_menu_slot_equals", listOf(funValue("slots",slotsARG.parse()),funValue("items",itemsARG.parse())))
}
fun playerInventoryTypeOpen(inventoryType: Any? = null) {
	val funName = "playerInventoryTypeOpen"
	enumCheck(funName,"inventoryType",inventoryType,listOf("ANVIL","BARREL","BEACON","BLAST_FURNACE","BREWING","CARTOGRAPHY","CHEST","CHISELED_BOOKSHELF","COMPOSTER","CRAFTER","CRAFTING","CREATIVE","DECORATED_POT","DISPENSER","DROPPER","ENCHANTING","ENDER_CHEST","FURNACE","GRINDSTONE","HOPPER","JUKEBOX","LECTERN","LOOM","MERCHANT","PLAYER","SHULKER_BOX","SMITHING","SMITHING_NEW","SMOKER","STONECUTTER","WORKBENCH"))
	handleFun("if_player_inventory_type_open", listOf())
}
fun playerIsAllowServerListing() {
	handleFun("if_player_is_allow_server_listing", listOf())
}
fun playerIsBlocking() {
	handleFun("if_player_is_blocking", listOf())
}
fun playerIsDisguised() {
	handleFun("if_player_is_disguised", listOf())
}
fun playerIsFlying() {
	handleFun("if_player_is_flying", listOf())
}
fun playerIsGliding() {
	handleFun("if_player_is_gliding", listOf())
}
fun playerHolding(items: Any, handSlot: Any? = null, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerHolding"
	enumCheck(funName,"handSlot",handSlot,listOf("EITHER_HAND","MAIN_HAND","OFF_HAND"))
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_is_holding", listOf(funValue("items",itemsARG.parse())))
}
fun playerIsLookingAtBlock(blocks: Any, locations: Any, distance: Any, fluidMode: Any? = null) {
	val funName = "playerIsLookingAtBlock"
	val blocksARG=typeCheck<JBlock>(blocks)
	val locationsARG=typeCheck<JLocation>(locations)
	val distanceARG=numberConvert(funName,"distance",distance)
	enumCheck(funName,"fluidMode",fluidMode,listOf("ALWAYS","NEVER","SOURCE_ONLY"))
	handleFun("if_player_is_looking_at_block", listOf(funValue("blocks",blocksARG.parse()),funValue("locations",locationsARG.parse()),funValue("distance",distanceARG.parse())))
}
fun playerIsNear(range: Any, location: Any, ignoreYAxis: Any? = null) {
	val funName = "playerIsNear"
	val rangeARG=numberConvert(funName,"range",range)
	val locationARG=typeCheck<JLocation>(location)
	enumCheck(funName,"ignoreYAxis",ignoreYAxis,listOf("FALSE","TRUE"))
	handleFun("if_player_is_near", listOf(funValue("range",rangeARG.parse()),funValue("location",locationARG.parse())))
}
fun playerIsOnGround() {
	handleFun("if_player_is_on_ground", listOf())
}
fun playerIsOnlineMode() {
	handleFun("if_player_is_online_mode", listOf())
}
fun playerIsRidingEntity(entityIds: Any, compareMode: Any? = null) {
	val funName = "playerIsRidingEntity"
	val entityIdsARG=textConvertPlural(funName,"entityIds",entityIds)
	enumCheck(funName,"compareMode",compareMode,listOf("FARTHEST","NAME_OR_UUID","NEAREST","TYPE"))
	handleFun("if_player_is_riding_entity", listOf(funValue("entity_ids",entityIdsARG.parse())))
}
fun playerIsSelfDisguised() {
	handleFun("if_player_is_self_disguised", listOf())
}
fun playerIsSleeping() {
	handleFun("if_player_is_sleeping", listOf())
}
fun playerIsSneaking() {
	handleFun("if_player_is_sneaking", listOf())
}
fun playerIsSprinting() {
	handleFun("if_player_is_sprinting", listOf())
}
fun playerIsStandingOnBlock(blocks: Any, locations: Any, onlySolid: Any? = null) {
	val blocksARG=typeCheck<JBlock>(blocks)
	val locationsARG=typeCheck<JLocation>(locations)
	val funName = "playerIsStandingOnBlock"
	enumCheck(funName,"onlySolid",onlySolid,listOf("FALSE","TRUE"))
	handleFun("if_player_is_standing_on_block", listOf(funValue("blocks",blocksARG.parse()),funValue("locations",locationsARG.parse())))
}
fun playerIsSwimming() {
	handleFun("if_player_is_swimming", listOf())
}
fun playerIsUsingItem(items: Any, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerIsUsingItem"
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_is_using_item", listOf(funValue("items",itemsARG.parse())))
}
fun playerIsWearingItem(items: Any, checkMode: Any? = null, comparisonMode: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerIsWearingItem"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_player_is_wearing_item", listOf(funValue("items",itemsARG.parse())))
}
fun playerItemIsNotOnCooldown(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("if_player_item_is_not_on_cooldown", listOf(funValue("items",itemsARG.parse())))
}
fun playerNameEquals(namesOrUuids: Any) {
	val funName = "playerNameEquals"
	val namesOrUuidsARG=textConvertPlural(funName,"namesOrUuids",namesOrUuids)
	handleFun("if_player_name_equals", listOf(funValue("names_or_uuids",namesOrUuidsARG.parse())))
}
fun playerTextFilteringEnabled() {
	handleFun("if_player_text_filtering_enabled", listOf())
}
fun variableEquals(value: Any, compare: Any) {
	val valueARG=typeCheck<JAny>(value)
	val compareARG=typeCheck<JAny>(compare)
	handleFun("if_variable_equals", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableExists(variable: Any) {
	val variableARG=typeCheck<Var>(variable)
	handleFun("if_variable_exists", listOf(funValue("variable",variableARG.parse())))
}
fun variableGreater(value: Any, compare: Any) {
	val funName = "variableGreater"
	val valueARG=numberConvert(funName,"value",value)
	val compareARG=numberConvert(funName,"compare",compare)
	handleFun("if_variable_greater", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableGreaterOrEquals(value: Any, compare: Any) {
	val funName = "variableGreaterOrEquals"
	val valueARG=numberConvert(funName,"value",value)
	val compareARG=numberConvert(funName,"compare",compare)
	handleFun("if_variable_greater_or_equals", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableInRange(value: Any, min: Any, max: Any) {
	val valueARG=typeCheck<JAny>(value)
	val minARG=typeCheck<JAny>(min)
	val maxARG=typeCheck<JAny>(max)
	handleFun("if_variable_in_range", listOf(funValue("value",valueARG.parse()),funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun variableIsType(value: Any, variableType: Any? = null) {
	val valueARG=typeCheck<JAny>(value)
	val funName = "variableIsType"
	enumCheck(funName,"variableType",variableType,listOf("ARRAY","ITEM","LOCATION","MAP","NUMBER","PARTICLE","POTION","SOUND","TEXT","VECTOR"))
	handleFun("if_variable_is_type", listOf(funValue("value",valueARG.parse())))
}
fun variableItemEquals(value: Any, compare: Any, comparisonMode: Any? = null) {
	val valueARG=typeCheck<JItem>(value)
	val compareARG=typeCheck<JItem>(compare)
	val funName = "variableItemEquals"
	enumCheck(funName,"comparisonMode",comparisonMode,listOf("EXACTLY","IGNORE_DURABILITY_AND_STACK_SIZE","IGNORE_STACK_SIZE","TYPE_ONLY"))
	handleFun("if_variable_item_equals", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableItemHasEnchantment(item: Any, enchant: Any, level: Any) {
	val funName = "variableItemHasEnchantment"
	val itemARG=typeCheck<JItem>(item)
	val enchantARG=textConvert(funName,"enchant",enchant)
	val levelARG=numberConvert(funName,"level",level)
	handleFun("if_variable_item_has_enchantment", listOf(funValue("item",itemARG.parse()),funValue("enchant",enchantARG.parse()),funValue("level",levelARG.parse())))
}
fun variableItemHasTag(item: Any, tag: Any, value: Any, compareType: Any? = null) {
	val funName = "variableItemHasTag"
	val itemARG=typeCheck<JItem>(item)
	val tagARG=textConvert(funName,"tag",tag)
	val valueARG=textConvert(funName,"value",value)
	enumCheck(funName,"compareType",compareType,listOf("CONTAINS","ENDS_WITH","EQUALS","STARTS_WITH"))
	handleFun("if_variable_item_has_tag", listOf(funValue("item",itemARG.parse()),funValue("tag",tagARG.parse()),funValue("value",valueARG.parse())))
}
fun variableLess(value: Any, compare: Any) {
	val funName = "variableLess"
	val valueARG=numberConvert(funName,"value",value)
	val compareARG=numberConvert(funName,"compare",compare)
	handleFun("if_variable_less", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableLessOrEquals(value: Any, compare: Any) {
	val funName = "variableLessOrEquals"
	val valueARG=numberConvert(funName,"value",value)
	val compareARG=numberConvert(funName,"compare",compare)
	handleFun("if_variable_less_or_equals", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableListContainsValue(list: Any, values: Any, checkMode: Any? = null) {
	val listARG=typeCheck<JArray>(list)
	val valuesARG=typeCheck<JAny>(values)
	val funName = "variableListContainsValue"
	enumCheck(funName,"checkMode",checkMode,listOf("ALL","ANY"))
	handleFun("if_variable_list_contains_value", listOf(funValue("list",listARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableListIsEmpty(list: Any) {
	val listARG=typeCheck<JAny>(list)
	handleFun("if_variable_list_is_empty", listOf(funValue("list",listARG.parse())))
}
fun variableListValueEquals(list: Any, index: Any, values: Any) {
	val funName = "variableListValueEquals"
	val listARG=typeCheck<JArray>(list)
	val indexARG=numberConvert(funName,"index",index)
	val valuesARG=typeCheck<JAny>(values)
	handleFun("if_variable_list_value_equals", listOf(funValue("list",listARG.parse()),funValue("index",indexARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableLocationInRange(value: Any, min: Any, max: Any, borderHandling: Any? = null) {
	val valueARG=typeCheck<JLocation>(value)
	val minARG=typeCheck<JLocation>(min)
	val maxARG=typeCheck<JLocation>(max)
	val funName = "variableLocationInRange"
	enumCheck(funName,"borderHandling",borderHandling,listOf("BLOCK","EXACT","FULL_BLOCK_RANGE"))
	handleFun("if_variable_location_in_range", listOf(funValue("value",valueARG.parse()),funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun variableLocationIsNear(location: Any, radius: Any, check: Any, shape: Any? = null) {
	val funName = "variableLocationIsNear"
	val locationARG=typeCheck<JLocation>(location)
	val radiusARG=numberConvert(funName,"radius",radius)
	val checkARG=typeCheck<JLocation>(check)
	enumCheck(funName,"shape",shape,listOf("CIRCLE","CUBE","SPHERE","SQUARE"))
	handleFun("if_variable_location_is_near", listOf(funValue("location",locationARG.parse()),funValue("radius",radiusARG.parse()),funValue("check",checkARG.parse())))
}
fun variableMapHasKey(map: Any, key: Any) {
	val mapARG=typeCheck<JMap>(map)
	val keyARG=typeCheck<JAny>(key)
	handleFun("if_variable_map_has_key", listOf(funValue("map",mapARG.parse()),funValue("key",keyARG.parse())))
}
fun variableMapValueEquals(map: Any, key: Any, values: Any) {
	val mapARG=typeCheck<JMap>(map)
	val keyARG=typeCheck<JAny>(key)
	val valuesARG=typeCheck<JAny>(values)
	handleFun("if_variable_map_value_equals", listOf(funValue("map",mapARG.parse()),funValue("key",keyARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableNotEquals(value: Any, compare: Any) {
	val valueARG=typeCheck<JAny>(value)
	val compareARG=typeCheck<JAny>(compare)
	handleFun("if_variable_not_equals", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableRangeIntersectsRange(min1: Any, max1: Any, min2: Any, max2: Any, checkType: Any? = null) {
	val min1ARG=typeCheck<JLocation>(min1)
	val max1ARG=typeCheck<JLocation>(max1)
	val min2ARG=typeCheck<JLocation>(min2)
	val max2ARG=typeCheck<JLocation>(max2)
	val funName = "variableRangeIntersectsRange"
	enumCheck(funName,"checkType",checkType,listOf("CONTAINS","OVERLAPS"))
	handleFun("if_variable_range_intersects_range", listOf(funValue("min1",min1ARG.parse()),funValue("max1",max1ARG.parse()),funValue("min2",min2ARG.parse()),funValue("max2",max2ARG.parse())))
}
fun variableTextContains(value: Any, compare: Any, ignoreCase: Any? = null) {
	val funName = "variableTextContains"
	val valueARG=textConvert(funName,"value",value)
	val compareARG=textConvertPlural(funName,"compare",compare)
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	handleFun("if_variable_text_contains", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableTextEndsWith(value: Any, compare: Any, ignoreCase: Any? = null) {
	val funName = "variableTextEndsWith"
	val valueARG=textConvert(funName,"value",value)
	val compareARG=textConvertPlural(funName,"compare",compare)
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	handleFun("if_variable_text_ends_with", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun variableTextMatches(match: Any, values: Any, regularExpressions: Any? = null, ignoreCase: Any? = null) {
	val funName = "variableTextMatches"
	val matchARG=textConvert(funName,"match",match)
	val valuesARG=textConvertPlural(funName,"values",values)
	enumCheck(funName,"regularExpressions",regularExpressions,listOf("FALSE","TRUE"))
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	handleFun("if_variable_text_matches", listOf(funValue("match",matchARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableTextStartsWith(value: Any, compare: Any, ignoreCase: Any? = null) {
	val funName = "variableTextStartsWith"
	val valueARG=textConvert(funName,"value",value)
	val compareARG=textConvertPlural(funName,"compare",compare)
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	handleFun("if_variable_text_starts_with", listOf(funValue("value",valueARG.parse()),funValue("compare",compareARG.parse())))
}
fun playerAddInventoryMenuRow(items: Any, position: Any? = null) {
	val itemsARG=typeCheck<JItem>(items)
	val funName = "playerAddInventoryMenuRow"
	enumCheck(funName,"position",position,listOf("BUTTON","TOP"))
	handleFun("player_add_inventory_menu_row", listOf(funValue("items",itemsARG.parse())))
}
fun playerAllowPlacingBreakingBlocks(blocks: Any, allow: Any? = null) {
	val blocksARG=typeCheck<JBlock>(blocks)
	val funName = "playerAllowPlacingBreakingBlocks"
	enumCheck(funName,"allow",allow,listOf("FALSE","TRUE"))
	handleFun("player_allow_placing_breaking_blocks", listOf(funValue("blocks",blocksARG.parse())))
}
fun playerBoostElytra(firework: Any) {
	val fireworkARG=typeCheck<JItem>(firework)
	handleFun("player_boost_elytra", listOf(funValue("firework",fireworkARG.parse())))
}
fun playerClearChat() {
	handleFun("player_clear_chat", listOf())
}
fun playerClearDebugMarkers() {
	handleFun("player_clear_debug_markers", listOf())
}
fun playerClearEnderChestContents() {
	handleFun("player_clear_ender_chest_contents", listOf())
}
fun playerClearInventory(clearMode: Any? = null) {
	val funName = "playerClearInventory"
	enumCheck(funName,"clearMode",clearMode,listOf("ARMOR","ENTIRE","HOTBAR","MAIN","UPPER"))
	handleFun("player_clear_inventory", listOf())
}
fun playerClearItems(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("player_clear_items", listOf(funValue("items",itemsARG.parse())))
}
fun playerClearPotionEffects() {
	handleFun("player_clear_potion_effects", listOf())
}
fun playerCloseInventory() {
	handleFun("player_close_inventory", listOf())
}
fun playerDamage(damage: Any, source: Any) {
	val funName = "playerDamage"
	val damageARG=numberConvert(funName,"damage",damage)
	val sourceARG=textConvert(funName,"source",source)
	handleFun("player_damage", listOf(funValue("damage",damageARG.parse()),funValue("source",sourceARG.parse())))
}
fun playerDisguiseAsBlock(block: Any, visibleToSelf: Any? = null) {
	val blockARG=typeCheck<JBlock>(block)
	val funName = "playerDisguiseAsBlock"
	enumCheck(funName,"visibleToSelf",visibleToSelf,listOf("FALSE","TRUE"))
	handleFun("player_disguise_as_block", listOf(funValue("block",blockARG.parse())))
}
fun playerDisguiseAsEntity(entityType: Any, visibleToSelf: Any? = null) {
	val entityTypeARG=typeCheck<JItem>(entityType)
	val funName = "playerDisguiseAsEntity"
	enumCheck(funName,"visibleToSelf",visibleToSelf,listOf("FALSE","TRUE"))
	handleFun("player_disguise_as_entity", listOf(funValue("entity_type",entityTypeARG.parse())))
}
fun playerDisguiseAsItem(item: Any, visibleToSelf: Any? = null) {
	val itemARG=typeCheck<JItem>(item)
	val funName = "playerDisguiseAsItem"
	enumCheck(funName,"visibleToSelf",visibleToSelf,listOf("FALSE","TRUE"))
	handleFun("player_disguise_as_item", listOf(funValue("item",itemARG.parse())))
}
fun playerDisplayBellRing(location: Any, direction: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "playerDisplayBellRing"
	enumCheck(funName,"direction",direction,listOf("DOWN","EAST","NORTH","SOUTH","WEST"))
	handleFun("player_display_bell_ring", listOf(funValue("location",locationARG.parse())))
}
fun playerDisplayBlock(location: Any, block: Any) {
	val locationARG=typeCheck<JLocation>(location)
	val blockARG=typeCheck<JBlock>(block)
	handleFun("player_display_block", listOf(funValue("location",locationARG.parse()),funValue("block",blockARG.parse())))
}
fun playerDisplayEndGatewayBeam(location: Any, color: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "playerDisplayEndGatewayBeam"
	enumCheck(funName,"color",color,listOf("DARK_PURPLE","LIGHT_PURPLE"))
	handleFun("player_display_end_gateway_beam", listOf(funValue("location",locationARG.parse())))
}
fun playerDisplayHologram(location: Any, text: Any) {
	val funName = "playerDisplayHologram"
	val locationARG=typeCheck<JLocation>(location)
	val textARG=textConvert(funName,"text",text)
	handleFun("player_display_hologram", listOf(funValue("location",locationARG.parse()),funValue("text",textARG.parse())))
}
fun playerDisplayLightning(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("player_display_lightning", listOf(funValue("location",locationARG.parse())))
}
fun playerDisplayParticle(particle: Any, location: Any) {
	val particleARG=typeCheck<JParticle>(particle)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("player_display_particle", listOf(funValue("particle",particleARG.parse()),funValue("location",locationARG.parse())))
}
fun playerDisplayParticleCircle(particle: Any, center: Any, radius: Any, points: Any, startAngle: Any, perpendicular: Any, angleUnit: Any? = null) {
	val funName = "playerDisplayParticleCircle"
	val particleARG=typeCheck<JParticle>(particle)
	val centerARG=typeCheck<JLocation>(center)
	val radiusARG=numberConvert(funName,"radius",radius)
	val pointsARG=numberConvert(funName,"points",points)
	val startAngleARG=numberConvert(funName,"startAngle",startAngle)
	val perpendicularARG=typeCheck<JVector>(perpendicular)
	enumCheck(funName,"angleUnit",angleUnit,listOf("DEGREES","RADIANS"))
	handleFun("player_display_particle_circle", listOf(funValue("particle",particleARG.parse()),funValue("center",centerARG.parse()),funValue("radius",radiusARG.parse()),funValue("points",pointsARG.parse()),funValue("start_angle",startAngleARG.parse()),funValue("perpendicular",perpendicularARG.parse())))
}
fun playerDisplayParticleCube(particle: Any, firstCorner: Any, secondCorner: Any, spacing: Any, type: Any? = null) {
	val funName = "playerDisplayParticleCube"
	val particleARG=typeCheck<JParticle>(particle)
	val firstCornerARG=typeCheck<JLocation>(firstCorner)
	val secondCornerARG=typeCheck<JLocation>(secondCorner)
	val spacingARG=numberConvert(funName,"spacing",spacing)
	enumCheck(funName,"type",type,listOf("HOLLOW","SOLID","WIREFRAME"))
	handleFun("player_display_particle_cube", listOf(funValue("particle",particleARG.parse()),funValue("first_corner",firstCornerARG.parse()),funValue("second_corner",secondCornerARG.parse()),funValue("spacing",spacingARG.parse())))
}
fun playerDisplayParticleLine(particle: Any, start: Any, end: Any, divider: Any, unitOfMeasurement: Any? = null) {
	val funName = "playerDisplayParticleLine"
	val particleARG=typeCheck<JParticle>(particle)
	val startARG=typeCheck<JLocation>(start)
	val endARG=typeCheck<JLocation>(end)
	val dividerARG=numberConvert(funName,"divider",divider)
	enumCheck(funName,"unitOfMeasurement",unitOfMeasurement,listOf("DISTANCE","POINTS"))
	handleFun("player_display_particle_line", listOf(funValue("particle",particleARG.parse()),funValue("start",startARG.parse()),funValue("end",endARG.parse()),funValue("divider",dividerARG.parse())))
}
fun playerDisplayParticleRay(particle: Any, start: Any, ray: Any, divider: Any, unitOfMeasurement: Any? = null) {
	val funName = "playerDisplayParticleRay"
	val particleARG=typeCheck<JParticle>(particle)
	val startARG=typeCheck<JLocation>(start)
	val rayARG=typeCheck<JVector>(ray)
	val dividerARG=numberConvert(funName,"divider",divider)
	enumCheck(funName,"unitOfMeasurement",unitOfMeasurement,listOf("DISTANCE","POINTS"))
	handleFun("player_display_particle_ray", listOf(funValue("particle",particleARG.parse()),funValue("start",startARG.parse()),funValue("ray",rayARG.parse()),funValue("divider",dividerARG.parse())))
}
fun playerDisplayParticleSphere(particle: Any, center: Any, radius: Any, points: Any) {
	val funName = "playerDisplayParticleSphere"
	val particleARG=typeCheck<JParticle>(particle)
	val centerARG=typeCheck<JLocation>(center)
	val radiusARG=numberConvert(funName,"radius",radius)
	val pointsARG=numberConvert(funName,"points",points)
	handleFun("player_display_particle_sphere", listOf(funValue("particle",particleARG.parse()),funValue("center",centerARG.parse()),funValue("radius",radiusARG.parse()),funValue("points",pointsARG.parse())))
}
fun playerDisplayParticleSpiral(particle: Any, center: Any, distance: Any, radius: Any, points: Any, rotations: Any, startAngle: Any, angleUnit: Any? = null) {
	val funName = "playerDisplayParticleSpiral"
	val particleARG=typeCheck<JParticle>(particle)
	val centerARG=typeCheck<JLocation>(center)
	val distanceARG=numberConvert(funName,"distance",distance)
	val radiusARG=numberConvert(funName,"radius",radius)
	val pointsARG=numberConvert(funName,"points",points)
	val rotationsARG=numberConvert(funName,"rotations",rotations)
	val startAngleARG=numberConvert(funName,"startAngle",startAngle)
	enumCheck(funName,"angleUnit",angleUnit,listOf("DEGREES","RADIANS"))
	handleFun("player_display_particle_spiral", listOf(funValue("particle",particleARG.parse()),funValue("center",centerARG.parse()),funValue("distance",distanceARG.parse()),funValue("radius",radiusARG.parse()),funValue("points",pointsARG.parse()),funValue("rotations",rotationsARG.parse()),funValue("start_angle",startAngleARG.parse())))
}
fun playerDisplayPickUpAnimation(collectedNameOrUuid: Any, collectorNameOrUuid: Any, amount: Any) {
	val funName = "playerDisplayPickUpAnimation"
	val collectedNameOrUuidARG=textConvert(funName,"collectedNameOrUuid",collectedNameOrUuid)
	val collectorNameOrUuidARG=textConvert(funName,"collectorNameOrUuid",collectorNameOrUuid)
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("player_display_pick_up_animation", listOf(funValue("collected_name_or_uuid",collectedNameOrUuidARG.parse()),funValue("collector_name_or_uuid",collectorNameOrUuidARG.parse()),funValue("amount",amountARG.parse())))
}
fun playerDisplaySignText(location: Any, line1: Any, line2: Any, line3: Any, line4: Any) {
	val funName = "playerDisplaySignText"
	val locationARG=typeCheck<JLocation>(location)
	val line1ARG=textConvert(funName,"line1",line1)
	val line2ARG=textConvert(funName,"line2",line2)
	val line3ARG=textConvert(funName,"line3",line3)
	val line4ARG=textConvert(funName,"line4",line4)
	handleFun("player_display_sign_text", listOf(funValue("location",locationARG.parse()),funValue("line_1",line1ARG.parse()),funValue("line_2",line2ARG.parse()),funValue("line_3",line3ARG.parse()),funValue("line_4",line4ARG.parse())))
}
fun playerDisplayVibration(from: Any, to: Any, destinationTime: Any) {
	val funName = "playerDisplayVibration"
	val fromARG=typeCheck<JLocation>(from)
	val toARG=typeCheck<JLocation>(to)
	val destinationTimeARG=numberConvert(funName,"destinationTime",destinationTime)
	handleFun("player_display_vibration", listOf(funValue("from",fromARG.parse()),funValue("to",toARG.parse()),funValue("destination_time",destinationTimeARG.parse())))
}
fun playerExpandInventoryMenu(items: Any, size: Any) {
	val funName = "playerExpandInventoryMenu"
	val itemsARG=typeCheck<JItem>(items)
	val sizeARG=numberConvert(funName,"size",size)
	handleFun("player_expand_inventory_menu", listOf(funValue("items",itemsARG.parse()),funValue("size",sizeARG.parse())))
}
fun playerFaceLocation(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("player_face_location", listOf(funValue("location",locationARG.parse())))
}
fun playerForceFlightMode(isFlying: Any? = null) {
	val funName = "playerForceFlightMode"
	enumCheck(funName,"isFlying",isFlying,listOf("FALSE","TRUE"))
	handleFun("player_force_flight_mode", listOf())
}
fun playerGiveExperience(experience: Any, mode: Any? = null) {
	val funName = "playerGiveExperience"
	val experienceARG=numberConvert(funName,"experience",experience)
	enumCheck(funName,"mode",mode,listOf("LEVEL","LEVEL_PERCENTAGE","POINTS"))
	handleFun("player_give_experience", listOf(funValue("experience",experienceARG.parse())))
}
fun playerGiveItems(items: Any, amount: Any) {
	val funName = "playerGiveItems"
	val itemsARG=typeCheck<JItem>(items)
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("player_give_items", listOf(funValue("items",itemsARG.parse()),funValue("amount",amountARG.parse())))
}
fun playerGivePotionEffect(potions: Any, showIcon: Any? = null, overwrite: Any? = null, particleMode: Any? = null) {
	val potionsARG=typeCheck<JPotion>(potions)
	val funName = "playerGivePotionEffect"
	enumCheck(funName,"showIcon",showIcon,listOf("FALSE","TRUE"))
	enumCheck(funName,"overwrite",overwrite,listOf("FALSE","TRUE"))
	enumCheck(funName,"particleMode",particleMode,listOf("AMBIENT","NONE","REGULAR"))
	handleFun("player_give_potion_effect", listOf(funValue("potions",potionsARG.parse())))
}
fun playerGiveRandomItem(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("player_give_random_item", listOf(funValue("items",itemsARG.parse())))
}
fun playerHeal(heal: Any) {
	val funName = "playerHeal"
	val healARG=numberConvert(funName,"heal",heal)
	handleFun("player_heal", listOf(funValue("heal",healARG.parse())))
}
fun playerHideEntity(nameOrUuid: Any, hide: Any? = null) {
	val funName = "playerHideEntity"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"hide",hide,listOf("FALSE","TRUE"))
	handleFun("player_hide_entity", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun playerHideScoreboard() {
	handleFun("player_hide_scoreboard", listOf())
}
fun playerKick() {
	handleFun("player_kick", listOf())
}
fun playerLaunchForward(power: Any, increment: Any? = null, launchAxis: Any? = null) {
	val funName = "playerLaunchForward"
	val powerARG=numberConvert(funName,"power",power)
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	enumCheck(funName,"launchAxis",launchAxis,listOf("YAW","YAW_AND_PITCH"))
	handleFun("player_launch_forward", listOf(funValue("power",powerARG.parse())))
}
fun playerLaunchProjectile(projectile: Any, location: Any, name: Any, speed: Any, inaccuracy: Any, trail: Any) {
	val funName = "playerLaunchProjectile"
	val projectileARG=typeCheck<JItem>(projectile)
	val locationARG=typeCheck<JLocation>(location)
	val nameARG=textConvert(funName,"name",name)
	val speedARG=numberConvert(funName,"speed",speed)
	val inaccuracyARG=numberConvert(funName,"inaccuracy",inaccuracy)
	val trailARG=typeCheck<JParticle>(trail)
	handleFun("player_launch_projectile", listOf(funValue("projectile",projectileARG.parse()),funValue("location",locationARG.parse()),funValue("name",nameARG.parse()),funValue("speed",speedARG.parse()),funValue("inaccuracy",inaccuracyARG.parse()),funValue("trail",trailARG.parse())))
}
fun playerLaunchToLocation(location: Any, power: Any, increment: Any? = null) {
	val funName = "playerLaunchToLocation"
	val locationARG=typeCheck<JLocation>(location)
	val powerARG=numberConvert(funName,"power",power)
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	handleFun("player_launch_to_location", listOf(funValue("location",locationARG.parse()),funValue("power",powerARG.parse())))
}
fun playerLaunchUp(power: Any, increment: Any? = null) {
	val funName = "playerLaunchUp"
	val powerARG=numberConvert(funName,"power",power)
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	handleFun("player_launch_up", listOf(funValue("power",powerARG.parse())))
}
fun playerLeaveVehicle() {
	handleFun("player_leave_vehicle", listOf())
}
fun playerLoadInventory() {
	handleFun("player_load_inventory", listOf())
}
fun playerOpenBook(book: Any) {
	val bookARG=typeCheck<JItem>(book)
	handleFun("player_open_book", listOf(funValue("book",bookARG.parse())))
}
fun playerOpenContainerInventory(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("player_open_container_inventory", listOf(funValue("location",locationARG.parse())))
}
fun playerPlayAnimationAction(animation: Any? = null) {
	val funName = "playerPlayAnimationAction"
	enumCheck(funName,"animation",animation,listOf("DAMAGE","JUMPSCARE","TOTEM","WAKE_UP"))
	handleFun("player_play_animation_action", listOf())
}
fun playerPlayHurtAnimation(yaw: Any) {
	val funName = "playerPlayHurtAnimation"
	val yawARG=numberConvert(funName,"yaw",yaw)
	handleFun("player_play_hurt_animation", listOf(funValue("yaw",yawARG.parse())))
}
fun playerPlaySound(sound: Any, location: Any) {
	val soundARG=typeCheck<JSound>(sound)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("player_play_sound", listOf(funValue("sound",soundARG.parse()),funValue("location",locationARG.parse())))
}
fun playerPlaySoundFromEntity(nameOrUuid: Any, sounds: Any) {
	val funName = "playerPlaySoundFromEntity"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	val soundsARG=typeCheck<JSound>(sounds)
	handleFun("player_play_sound_from_entity", listOf(funValue("name_or_uuid",nameOrUuidARG.parse()),funValue("sounds",soundsARG.parse())))
}
fun playerPlaySoundSequence(sounds: Any, location: Any, delay: Any) {
	val funName = "playerPlaySoundSequence"
	val soundsARG=typeCheck<JSound>(sounds)
	val locationARG=typeCheck<JLocation>(location)
	val delayARG=numberConvert(funName,"delay",delay)
	handleFun("player_play_sound_sequence", listOf(funValue("sounds",soundsARG.parse()),funValue("location",locationARG.parse()),funValue("delay",delayARG.parse())))
}
fun playerRandomizedTeleport(locations: Any, keepRotation: Any? = null, keepVelocity: Any? = null, dismount: Any? = null) {
	val locationsARG=typeCheck<JLocation>(locations)
	val funName = "playerRandomizedTeleport"
	enumCheck(funName,"keepRotation",keepRotation,listOf("FALSE","TRUE"))
	enumCheck(funName,"keepVelocity",keepVelocity,listOf("FALSE","TRUE"))
	enumCheck(funName,"dismount",dismount,listOf("FALSE","TRUE"))
	handleFun("player_randomized_teleport", listOf(funValue("locations",locationsARG.parse())))
}
fun playerRedirectWorld(worldId: Any) {
	val funName = "playerRedirectWorld"
	val worldIdARG=textConvert(funName,"worldId",worldId)
	handleFun("player_redirect_world", listOf(funValue("world_id",worldIdARG.parse())))
}
fun playerRemoveBossBar(id: Any) {
	val funName = "playerRemoveBossBar"
	val idARG=textConvert(funName,"id",id)
	handleFun("player_remove_boss_bar", listOf(funValue("id",idARG.parse())))
}
fun playerRemoveDisguise() {
	handleFun("player_remove_disguise", listOf())
}
fun playerRemoveDisplayBlocks(pos1: Any, pos2: Any) {
	val pos1ARG=typeCheck<JLocation>(pos1)
	val pos2ARG=typeCheck<JLocation>(pos2)
	handleFun("player_remove_display_blocks", listOf(funValue("pos_1",pos1ARG.parse()),funValue("pos_2",pos2ARG.parse())))
}
fun playerRemoveInventoryMenuRow(size: Any, position: Any? = null) {
	val funName = "playerRemoveInventoryMenuRow"
	val sizeARG=numberConvert(funName,"size",size)
	enumCheck(funName,"position",position,listOf("BUTTON","TOP"))
	handleFun("player_remove_inventory_menu_row", listOf(funValue("size",sizeARG.parse())))
}
fun playerRemoveItems(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("player_remove_items", listOf(funValue("items",itemsARG.parse())))
}
fun playerRemovePose() {
	handleFun("player_remove_pose", listOf())
}
fun playerRemovePotionEffect(potions: Any) {
	val potionsARG=typeCheck<JPotion>(potions)
	handleFun("player_remove_potion_effect", listOf(funValue("potions",potionsARG.parse())))
}
fun playerRemoveSelfDisguise() {
	handleFun("player_remove_self_disguise", listOf())
}
fun playerRemoveSkin() {
	handleFun("player_remove_skin", listOf())
}
fun playerRemoveWorldBorder() {
	handleFun("player_remove_world_border", listOf())
}
fun playerReplaceItems(items: Any, replace: Any, count: Any) {
	val funName = "playerReplaceItems"
	val itemsARG=typeCheck<JItem>(items)
	val replaceARG=typeCheck<JItem>(replace)
	val countARG=numberConvert(funName,"count",count)
	handleFun("player_replace_items", listOf(funValue("items",itemsARG.parse()),funValue("replace",replaceARG.parse()),funValue("count",countARG.parse())))
}
fun playerResetWeather() {
	handleFun("player_reset_weather", listOf())
}
fun playerRideEntity(nameOrUuid: Any) {
	val funName = "playerRideEntity"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("player_ride_entity", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun playerSaveInventory() {
	handleFun("player_save_inventory", listOf())
}
fun playerSelfDisguiseAsBlock(block: Any) {
	val blockARG=typeCheck<JBlock>(block)
	handleFun("player_self_disguise_as_block", listOf(funValue("block",blockARG.parse())))
}
fun playerSelfDisguiseAsEntity(entityType: Any) {
	val entityTypeARG=typeCheck<JItem>(entityType)
	handleFun("player_self_disguise_as_entity", listOf(funValue("entity_type",entityTypeARG.parse())))
}
fun playerSelfDisguiseAsItem(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("player_self_disguise_as_item", listOf(funValue("item",itemARG.parse())))
}
fun playerSendActionBar(messages: Any, merging: Any? = null) {
	val funName = "playerSendActionBar"
	val messagesARG=textConvertPlural(funName,"messages",messages)
	enumCheck(funName,"merging",merging,listOf("CONCATENATION","SPACES"))
	handleFun("player_send_action_bar", listOf(funValue("messages",messagesARG.parse())))
}
fun playerSendAdvancement(icon: Any, name: Any, frame: Any? = null) {
	val funName = "playerSendAdvancement"
	val iconARG=typeCheck<JItem>(icon)
	val nameARG=textConvert(funName,"name",name)
	enumCheck(funName,"frame",frame,listOf("CHALLENGE","GOAL","TASK"))
	handleFun("player_send_advancement", listOf(funValue("icon",iconARG.parse()),funValue("name",nameARG.parse())))
}
fun playerSendBreakAnimation(locations: Any, stage: Any) {
	val funName = "playerSendBreakAnimation"
	val locationsARG=typeCheck<JLocation>(locations)
	val stageARG=numberConvert(funName,"stage",stage)
	handleFun("player_send_break_animation", listOf(funValue("locations",locationsARG.parse()),funValue("stage",stageARG.parse())))
}
fun playerSendDialogue(messages: Any, delay: Any) {
	val funName = "playerSendDialogue"
	val messagesARG=textConvertPlural(funName,"messages",messages)
	val delayARG=numberConvert(funName,"delay",delay)
	handleFun("player_send_dialogue", listOf(funValue("messages",messagesARG.parse()),funValue("delay",delayARG.parse())))
}
fun playerSendHover(message: Any, hover: Any) {
	val funName = "playerSendHover"
	val messageARG=textConvert(funName,"message",message)
	val hoverARG=textConvert(funName,"hover",hover)
	handleFun("player_send_hover", listOf(funValue("message",messageARG.parse()),funValue("hover",hoverARG.parse())))
}
fun playerMessage(messages: Any, merging: Any? = null) {
	val funName = "playerMessage"
	val messagesARG=textConvertPlural(funName,"messages",messages)
	enumCheck(funName,"merging",merging,listOf("CONCATENATION","SEPARATE_LINES","SPACES"))
	handleFun("player_send_message", listOf(funValue("messages",messagesARG.parse())))
}
fun playerSendMinimessage(minimessage: Any) {
	val funName = "playerSendMinimessage"
	val minimessageARG=textConvert(funName,"minimessage",minimessage)
	handleFun("player_send_minimessage", listOf(funValue("minimessage",minimessageARG.parse())))
}
fun playerSendTitle(title: Any, subtitle: Any, fadeIn: Any, stay: Any, fadeOut: Any) {
	val funName = "playerSendTitle"
	val titleARG=textConvert(funName,"title",title)
	val subtitleARG=textConvert(funName,"subtitle",subtitle)
	val fadeInARG=numberConvert(funName,"fadeIn",fadeIn)
	val stayARG=numberConvert(funName,"stay",stay)
	val fadeOutARG=numberConvert(funName,"fadeOut",fadeOut)
	handleFun("player_send_title", listOf(funValue("title",titleARG.parse()),funValue("subtitle",subtitleARG.parse()),funValue("fade_in",fadeInARG.parse()),funValue("stay",stayARG.parse()),funValue("fade_out",fadeOutARG.parse())))
}
fun playerSetAbsorptionHealth(health: Any) {
	val funName = "playerSetAbsorptionHealth"
	val healthARG=numberConvert(funName,"health",health)
	handleFun("player_set_absorption_health", listOf(funValue("health",healthARG.parse())))
}
fun playerSetAirTicks(ticks: Any) {
	val funName = "playerSetAirTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	handleFun("player_set_air_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun playerSetAllowFlying(allowFlying: Any? = null) {
	val funName = "playerSetAllowFlying"
	enumCheck(funName,"allowFlying",allowFlying,listOf("FALSE","TRUE"))
	handleFun("player_set_allow_flying", listOf())
}
fun playerSetArmor(helmet: Any, chestplate: Any, leggings: Any, boots: Any) {
	val helmetARG=typeCheck<JItem>(helmet)
	val chestplateARG=typeCheck<JItem>(chestplate)
	val leggingsARG=typeCheck<JItem>(leggings)
	val bootsARG=typeCheck<JItem>(boots)
	handleFun("player_set_armor", listOf(funValue("helmet",helmetARG.parse()),funValue("chestplate",chestplateARG.parse()),funValue("leggings",leggingsARG.parse()),funValue("boots",bootsARG.parse())))
}
fun playerSetArrowsInBody(amount: Any) {
	val funName = "playerSetArrowsInBody"
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("player_set_arrows_in_body", listOf(funValue("amount",amountARG.parse())))
}
fun playerSetAttackSpeed(speed: Any) {
	val funName = "playerSetAttackSpeed"
	val speedARG=numberConvert(funName,"speed",speed)
	handleFun("player_set_attack_speed", listOf(funValue("speed",speedARG.parse())))
}
fun playerSetAttribute(value: Any, attributeType: Any? = null) {
	val funName = "playerSetAttribute"
	val valueARG=numberConvert(funName,"value",value)
	enumCheck(funName,"attributeType",attributeType,listOf("GENERIC_ARMOR","GENERIC_ARMOR_TOUGHNESS","GENERIC_ATTACK_DAMAGE","GENERIC_ATTACK_KNOCKBACK","GENERIC_ATTACK_SPEED","GENERIC_BURNING_TIME","GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE","GENERIC_FALL_DAMAGE_MULTIPLIER","GENERIC_FLYING_SPEED","GENERIC_FOLLOW_RANGE","GENERIC_GRAVITY","GENERIC_JUMP_STRENGTH","GENERIC_KNOCKBACK_RESISTANCE","GENERIC_LUCK","GENERIC_MAX_ABSORPTION","GENERIC_MAX_HEALTH","GENERIC_MOVEMENT_EFFICIENCY","GENERIC_MOVEMENT_SPEED","GENERIC_OXYGEN_BONUS","GENERIC_SAFE_FALL_DISTANCE","GENERIC_SCALE","GENERIC_STEP_HEIGHT","GENERIC_WATER_MOVEMENT_EFFICIENCY","PLAYER_BLOCK_BREAK_SPEED","PLAYER_BLOCK_INTERACTION_RANGE","PLAYER_ENTITY_INTERACTION_RANGE","PLAYER_MINING_EFFICIENCY","PLAYER_SNEAKING_SPEED","PLAYER_SUBMERGED_MINING_SPEED","PLAYER_SWEEPING_DAMAGE_RATIO","ZOMBIE_SPAWN_REINFORCEMENTS"))
	handleFun("player_set_attribute", listOf(funValue("value",valueARG.parse())))
}
fun playerSetBeeStingersInBody(amount: Any) {
	val funName = "playerSetBeeStingersInBody"
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("player_set_bee_stingers_in_body", listOf(funValue("amount",amountARG.parse())))
}
fun playerSetBlockOpenedState(location: Any, isOpened: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "playerSetBlockOpenedState"
	enumCheck(funName,"isOpened",isOpened,listOf("FALSE","TRUE"))
	handleFun("player_set_block_opened_state", listOf(funValue("location",locationARG.parse())))
}
fun playerSetBossBar(id: Any, title: Any, progress: Any, skyEffect: Any? = null, style: Any? = null, color: Any? = null) {
	val funName = "playerSetBossBar"
	val idARG=textConvert(funName,"id",id)
	val titleARG=textConvert(funName,"title",title)
	val progressARG=numberConvert(funName,"progress",progress)
	enumCheck(funName,"skyEffect",skyEffect,listOf("DARK_SKY","FOG","FOG_AND_DARK_SKY","NONE"))
	enumCheck(funName,"style",style,listOf("NOTCHED_10","NOTCHED_12","NOTCHED_20","NOTCHED_6","PROGRESS"))
	enumCheck(funName,"color",color,listOf("BLUE","GREEN","PINK","PURPLE","RED","WHITE","YELLOW"))
	handleFun("player_set_boss_bar", listOf(funValue("id",idARG.parse()),funValue("title",titleARG.parse()),funValue("progress",progressARG.parse())))
}
fun playerSetChatCompletions(completions: Any, settingMode: Any? = null) {
	val funName = "playerSetChatCompletions"
	val completionsARG=textConvertPlural(funName,"completions",completions)
	enumCheck(funName,"settingMode",settingMode,listOf("ADD","REMOVE","SET"))
	handleFun("player_set_chat_completions", listOf(funValue("completions",completionsARG.parse())))
}
fun playerSetCollidable(collidable: Any? = null) {
	val funName = "playerSetCollidable"
	enumCheck(funName,"collidable",collidable,listOf("FALSE","TRUE"))
	handleFun("player_set_collidable", listOf())
}
fun playerSetCompassTarget(location: Any) {
	val locationARG=typeCheck<JLocation>(location)
	handleFun("player_set_compass_target", listOf(funValue("location",locationARG.parse())))
}
fun playerSetCursorItem(item: Any) {
	val itemARG=typeCheck<JItem>(item)
	handleFun("player_set_cursor_item", listOf(funValue("item",itemARG.parse())))
}
fun playerSetDeathDrops(deathDrops: Any? = null) {
	val funName = "playerSetDeathDrops"
	enumCheck(funName,"deathDrops",deathDrops,listOf("FALSE","TRUE"))
	handleFun("player_set_death_drops", listOf())
}
fun playerSetDefaultVisible(defaultVisible: Any? = null) {
	val funName = "playerSetDefaultVisible"
	enumCheck(funName,"defaultVisible",defaultVisible,listOf("TRUE","FALSE"))
	handleFun("player_set_default_visible", listOf())
}
fun playerSetEnderChestContents(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("player_set_ender_chest_contents", listOf(funValue("items",itemsARG.parse())))
}
fun playerSetEntityGlowing(nameOrUuid: Any, color: Any? = null, glow: Any? = null) {
	val funName = "playerSetEntityGlowing"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"color",color,listOf("AQUA","BLACK","BLUE","DARK_AQUA","DARK_BLUE","DARK_GRAY","DARK_GREEN","DARK_PURPLE","DARK_RED","GOLD","GRAY","GREEN","PURPLE","RED","WHITE","YELLOW"))
	enumCheck(funName,"glow",glow,listOf("FALSE","TRUE"))
	handleFun("player_set_entity_glowing", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun playerSetEquipment(item: Any, slot: Any? = null) {
	val itemARG=typeCheck<JItem>(item)
	val funName = "playerSetEquipment"
	enumCheck(funName,"slot",slot,listOf("CHEST","FEET","HAND","HEAD","LEGS","OFF_HAND"))
	handleFun("player_set_equipment", listOf(funValue("item",itemARG.parse())))
}
fun playerSetExhaustion(exhaustion: Any, mode: Any? = null) {
	val funName = "playerSetExhaustion"
	val exhaustionARG=numberConvert(funName,"exhaustion",exhaustion)
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	handleFun("player_set_exhaustion", listOf(funValue("exhaustion",exhaustionARG.parse())))
}
fun playerSetExperience(experience: Any, mode: Any? = null) {
	val funName = "playerSetExperience"
	val experienceARG=numberConvert(funName,"experience",experience)
	enumCheck(funName,"mode",mode,listOf("LEVEL","LEVEL_PERCENTAGE","POINTS"))
	handleFun("player_set_experience", listOf(funValue("experience",experienceARG.parse())))
}
fun playerSetFallDistance(distance: Any) {
	val funName = "playerSetFallDistance"
	val distanceARG=numberConvert(funName,"distance",distance)
	handleFun("player_set_fall_distance", listOf(funValue("distance",distanceARG.parse())))
}
fun playerSetFireTicks(ticks: Any) {
	val funName = "playerSetFireTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	handleFun("player_set_fire_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun playerSetFlying(isFlying: Any? = null) {
	val funName = "playerSetFlying"
	enumCheck(funName,"isFlying",isFlying,listOf("FALSE","TRUE"))
	handleFun("player_set_flying", listOf())
}
fun playerSetFogDistance(distance: Any) {
	val funName = "playerSetFogDistance"
	val distanceARG=numberConvert(funName,"distance",distance)
	handleFun("player_set_fog_distance", listOf(funValue("distance",distanceARG.parse())))
}
fun playerSetFood(food: Any, mode: Any? = null) {
	val funName = "playerSetFood"
	val foodARG=numberConvert(funName,"food",food)
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	handleFun("player_set_food", listOf(funValue("food",foodARG.parse())))
}
fun playerSetFreezeTicks(ticks: Any, tickingLocked: Any? = null) {
	val funName = "playerSetFreezeTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	enumCheck(funName,"tickingLocked",tickingLocked,listOf("FALSE","TRUE"))
	handleFun("player_set_freeze_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun playerSetGamemode(gamemode: Any? = null, flightMode: Any? = null) {
	val funName = "playerSetGamemode"
	enumCheck(funName,"gamemode",gamemode,listOf("ADVENTURE","CREATIVE","SPECTATOR","SURVIVAL"))
	enumCheck(funName,"flightMode",flightMode,listOf("KEEP_ORIGINAL","RESPECT_GAMEMODE"))
	handleFun("player_set_gamemode", listOf())
}
fun playerSetGliding(isGliding: Any? = null) {
	val funName = "playerSetGliding"
	enumCheck(funName,"isGliding",isGliding,listOf("FALSE","TRUE"))
	handleFun("player_set_gliding", listOf())
}
fun playerSetHealth(health: Any) {
	val funName = "playerSetHealth"
	val healthARG=numberConvert(funName,"health",health)
	handleFun("player_set_health", listOf(funValue("health",healthARG.parse())))
}
fun playerSetHotbarSlot(slot: Any) {
	val funName = "playerSetHotbarSlot"
	val slotARG=numberConvert(funName,"slot",slot)
	handleFun("player_set_hotbar_slot", listOf(funValue("slot",slotARG.parse())))
}
fun playerSetInstantRespawn(instantRespawn: Any? = null) {
	val funName = "playerSetInstantRespawn"
	enumCheck(funName,"instantRespawn",instantRespawn,listOf("FALSE","TRUE"))
	handleFun("player_set_instant_respawn", listOf())
}
fun playerSetInventoryKept(kept: Any? = null) {
	val funName = "playerSetInventoryKept"
	enumCheck(funName,"kept",kept,listOf("FALSE","TRUE"))
	handleFun("player_set_inventory_kept", listOf())
}
fun playerSetInventoryMenuItem(item: Any, slot: Any) {
	val funName = "playerSetInventoryMenuItem"
	val itemARG=typeCheck<JItem>(item)
	val slotARG=numberConvert(funName,"slot",slot)
	handleFun("player_set_inventory_menu_item", listOf(funValue("item",itemARG.parse()),funValue("slot",slotARG.parse())))
}
fun playerSetInventoryMenuName(text: Any) {
	val funName = "playerSetInventoryMenuName"
	val textARG=textConvert(funName,"text",text)
	handleFun("player_set_inventory_menu_name", listOf(funValue("text",textARG.parse())))
}
fun playerSetInvulnerabilityTicks(ticks: Any) {
	val funName = "playerSetInvulnerabilityTicks"
	val ticksARG=numberConvert(funName,"ticks",ticks)
	handleFun("player_set_invulnerability_ticks", listOf(funValue("ticks",ticksARG.parse())))
}
fun playerSetItemCooldown(cooldown: Any, item: Any, sound: Any) {
	val funName = "playerSetItemCooldown"
	val cooldownARG=numberConvert(funName,"cooldown",cooldown)
	val itemARG=typeCheck<JItem>(item)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("player_set_item_cooldown", listOf(funValue("cooldown",cooldownARG.parse()),funValue("item",itemARG.parse()),funValue("sound",soundARG.parse())))
}
fun playerSetItems(items: Any) {
	val itemsARG=typeCheck<JItem>(items)
	handleFun("player_set_items", listOf(funValue("items",itemsARG.parse())))
}
fun playerSetMaxHealth(health: Any, heal: Any? = null) {
	val funName = "playerSetMaxHealth"
	val healthARG=numberConvert(funName,"health",health)
	enumCheck(funName,"heal",heal,listOf("FALSE","TRUE"))
	handleFun("player_set_max_health", listOf(funValue("health",healthARG.parse())))
}
fun playerSetMovementSpeed(distance: Any, movementType: Any? = null) {
	val funName = "playerSetMovementSpeed"
	val distanceARG=numberConvert(funName,"distance",distance)
	enumCheck(funName,"movementType",movementType,listOf("FLY","WALK"))
	handleFun("player_set_movement_speed", listOf(funValue("distance",distanceARG.parse())))
}
fun playerSetNametagVisible(visible: Any? = null) {
	val funName = "playerSetNametagVisible"
	enumCheck(funName,"visible",visible,listOf("FALSE","TRUE"))
	handleFun("player_set_nametag_visible", listOf())
}
fun playerSetPlayerListInfo(text: Any, merging: Any? = null, position: Any? = null) {
	val funName = "playerSetPlayerListInfo"
	val textARG=textConvertPlural(funName,"text",text)
	enumCheck(funName,"merging",merging,listOf("CONCATENATION","SEPARATE_LINES","SPACES"))
	enumCheck(funName,"position",position,listOf("FOOTER","HEADER"))
	handleFun("player_set_player_list_info", listOf(funValue("text",textARG.parse())))
}
fun playerSetPose(pose: Any? = null, locked: Any? = null) {
	val funName = "playerSetPose"
	enumCheck(funName,"pose",pose,listOf("CROAKING","CROUCHING","DIGGING","DYING","EMERGING","FALL_FLYING","LONG_JUMPING","ROARING","SITTING","SLEEPING","SNEAKING","SNIFFING","SPIN_ATTACK","STANDING","SWIMMING","USING_TONGUE"))
	enumCheck(funName,"locked",locked,listOf("FALSE","TRUE"))
	handleFun("player_set_pose", listOf())
}
fun playerSetPvp(pvp: Any? = null) {
	val funName = "playerSetPvp"
	enumCheck(funName,"pvp",pvp,listOf("FALSE","TRUE"))
	handleFun("player_set_pvp", listOf())
}
fun playerSetRainLevel(rainLevel: Any) {
	val funName = "playerSetRainLevel"
	val rainLevelARG=numberConvert(funName,"rainLevel",rainLevel)
	handleFun("player_set_rain_level", listOf(funValue("rain_level",rainLevelARG.parse())))
}
fun playerSetRotation(yaw: Any, pitch: Any) {
	val funName = "playerSetRotation"
	val yawARG=numberConvert(funName,"yaw",yaw)
	val pitchARG=numberConvert(funName,"pitch",pitch)
	handleFun("player_set_rotation", listOf(funValue("yaw",yawARG.parse()),funValue("pitch",pitchARG.parse())))
}
fun playerSetRotationByVector(vector: Any) {
	val vectorARG=typeCheck<JVector>(vector)
	handleFun("player_set_rotation_by_vector", listOf(funValue("vector",vectorARG.parse())))
}
fun playerSetSaturation(saturation: Any, mode: Any? = null) {
	val funName = "playerSetSaturation"
	val saturationARG=numberConvert(funName,"saturation",saturation)
	enumCheck(funName,"mode",mode,listOf("ADD","SET"))
	handleFun("player_set_saturation", listOf(funValue("saturation",saturationARG.parse())))
}
fun playerSetSimulationDistance(distance: Any) {
	val funName = "playerSetSimulationDistance"
	val distanceARG=numberConvert(funName,"distance",distance)
	handleFun("player_set_simulation_distance", listOf(funValue("distance",distanceARG.parse())))
}
fun playerSetSkin(nameOrUuid: Any, serverType: Any? = null) {
	val funName = "playerSetSkin"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"serverType",serverType,listOf("MOJANG","SERVER"))
	handleFun("player_set_skin", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun playerSetSlotItem(item: Any, slot: Any) {
	val funName = "playerSetSlotItem"
	val itemARG=typeCheck<JItem>(item)
	val slotARG=numberConvert(funName,"slot",slot)
	handleFun("player_set_slot_item", listOf(funValue("item",itemARG.parse()),funValue("slot",slotARG.parse())))
}
fun playerSetSpawnPoint(spawnPoint: Any) {
	val spawnPointARG=typeCheck<JLocation>(spawnPoint)
	handleFun("player_set_spawn_point", listOf(funValue("spawn_point",spawnPointARG.parse())))
}
fun playerSetThunderLevel(thunderLevel: Any) {
	val funName = "playerSetThunderLevel"
	val thunderLevelARG=numberConvert(funName,"thunderLevel",thunderLevel)
	handleFun("player_set_thunder_level", listOf(funValue("thunder_level",thunderLevelARG.parse())))
}
fun playerSetTickRate(tickRate: Any) {
	val funName = "playerSetTickRate"
	val tickRateARG=numberConvert(funName,"tickRate",tickRate)
	handleFun("player_set_tick_rate", listOf(funValue("tick_rate",tickRateARG.parse())))
}
fun playerSetTime(time: Any) {
	val funName = "playerSetTime"
	val timeARG=numberConvert(funName,"time",time)
	handleFun("player_set_time", listOf(funValue("time",timeARG.parse())))
}
fun playerSetVelocity(velocity: Any, increment: Any? = null) {
	val velocityARG=typeCheck<JVector>(velocity)
	val funName = "playerSetVelocity"
	enumCheck(funName,"increment",increment,listOf("FALSE","TRUE"))
	handleFun("player_set_velocity", listOf(funValue("velocity",velocityARG.parse())))
}
fun playerSetVisualFire(visualFire: Any? = null) {
	val funName = "playerSetVisualFire"
	enumCheck(funName,"visualFire",visualFire,listOf("FALSE","TRUE"))
	handleFun("player_set_visual_fire", listOf())
}
fun playerSetWeather(weatherType: Any? = null) {
	val funName = "playerSetWeather"
	enumCheck(funName,"weatherType",weatherType,listOf("CLEAR","DOWNFALL"))
	handleFun("player_set_weather", listOf())
}
fun playerSetWorldBorder(center: Any, size: Any, warning: Any) {
	val funName = "playerSetWorldBorder"
	val centerARG=typeCheck<JLocation>(center)
	val sizeARG=numberConvert(funName,"size",size)
	val warningARG=numberConvert(funName,"warning",warning)
	handleFun("player_set_world_border", listOf(funValue("center",centerARG.parse()),funValue("size",sizeARG.parse()),funValue("warning",warningARG.parse())))
}
fun playerShiftWorldBorder(oldSize: Any, size: Any, time: Any) {
	val funName = "playerShiftWorldBorder"
	val oldSizeARG=numberConvert(funName,"oldSize",oldSize)
	val sizeARG=numberConvert(funName,"size",size)
	val timeARG=numberConvert(funName,"time",time)
	handleFun("player_shift_world_border", listOf(funValue("old_size",oldSizeARG.parse()),funValue("size",sizeARG.parse()),funValue("time",timeARG.parse())))
}
fun playerShowDebugMarker(location: Any, name: Any, duration: Any, red: Any, green: Any, blue: Any, alpha: Any) {
	val funName = "playerShowDebugMarker"
	val locationARG=typeCheck<JLocation>(location)
	val nameARG=textConvert(funName,"name",name)
	val durationARG=numberConvert(funName,"duration",duration)
	val redARG=numberConvert(funName,"red",red)
	val greenARG=numberConvert(funName,"green",green)
	val blueARG=numberConvert(funName,"blue",blue)
	val alphaARG=numberConvert(funName,"alpha",alpha)
	handleFun("player_show_debug_marker", listOf(funValue("location",locationARG.parse()),funValue("name",nameARG.parse()),funValue("duration",durationARG.parse()),funValue("red",redARG.parse()),funValue("green",greenARG.parse()),funValue("blue",blueARG.parse()),funValue("alpha",alphaARG.parse())))
}
fun playerShowDemoScreen() {
	handleFun("player_show_demo_screen", listOf())
}
fun playerShowInventoryMenu(items: Any, name: Any, inventoryType: Any? = null) {
	val funName = "playerShowInventoryMenu"
	val itemsARG=typeCheck<JItem>(items)
	val nameARG=textConvert(funName,"name",name)
	enumCheck(funName,"inventoryType",inventoryType,listOf("ANVIL","BARREL","BEACON","BLAST_FURNACE","BREWING","CARTOGRAPHY","CHEST","COMPOSTER","CRAFTING","CREATIVE","DISPENSER","DROPPER","ENCHANTING","ENDER_CHEST","FURNACE","GRINDSTONE","HOPPER","LECTERN","LOOM","MERCHANT","PLAYER","SHULKER_BOX","SMITHING","SMOKER","STONECUTTER","WORKBENCH"))
	handleFun("player_show_inventory_menu", listOf(funValue("items",itemsARG.parse()),funValue("name",nameARG.parse())))
}
fun playerShowScoreboard(id: Any) {
	val funName = "playerShowScoreboard"
	val idARG=textConvert(funName,"id",id)
	handleFun("player_show_scoreboard", listOf(funValue("id",idARG.parse())))
}
fun playerShowWinScreen() {
	handleFun("player_show_win_screen", listOf())
}
fun playerSpectateTarget(nameOrUuid: Any) {
	val funName = "playerSpectateTarget"
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("player_spectate_target", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun playerStopSound(sounds: Any) {
	val soundsARG=typeCheck<JSound>(sounds)
	handleFun("player_stop_sound", listOf(funValue("sounds",soundsARG.parse())))
}
fun playerStopSoundsBySource(source: Any? = null) {
	val funName = "playerStopSoundsBySource"
	enumCheck(funName,"source",source,listOf("AMBIENT","BLOCK","HOSTILE","MASTER","MUSIC","NEUTRAL","PLAYER","RECORD","VOICE","WEATHER"))
	handleFun("player_stop_sounds_by_source", listOf())
}
fun playerSwingHand(handType: Any? = null) {
	val funName = "playerSwingHand"
	enumCheck(funName,"handType",handType,listOf("MAIN","OFF"))
	handleFun("player_swing_hand", listOf())
}
fun playerTeleport(location: Any, keepRotation: Any? = null, keepVelocity: Any? = null, dismount: Any? = null) {
	val locationARG=typeCheck<JLocation>(location)
	val funName = "playerTeleport"
	enumCheck(funName,"keepRotation",keepRotation,listOf("FALSE","TRUE"))
	enumCheck(funName,"keepVelocity",keepVelocity,listOf("FALSE","TRUE"))
	enumCheck(funName,"dismount",dismount,listOf("FALSE","TRUE"))
	handleFun("player_teleport", listOf(funValue("location",locationARG.parse())))
}
fun playerTeleportSequence(locations: Any, delay: Any) {
	val funName = "playerTeleportSequence"
	val locationsARG=typeCheck<JLocation>(locations)
	val delayARG=numberConvert(funName,"delay",delay)
	handleFun("player_teleport_sequence", listOf(funValue("locations",locationsARG.parse()),funValue("delay",delayARG.parse())))
}
fun repeatAdjacently(variable: Any, origin: Any, changeRotation: Any? = null, includeSelf: Any? = null, pattern: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val originARG=typeCheck<JLocation>(origin)
	val funName = "repeatAdjacently"
	enumCheck(funName,"changeRotation",changeRotation,listOf("FALSE","TRUE"))
	enumCheck(funName,"includeSelf",includeSelf,listOf("FALSE","TRUE"))
	enumCheck(funName,"pattern",pattern,listOf("ADJACENT","CARDINAL","CUBE","SQUARE"))
	handleFun("repeat_adjacently", listOf(funValue("variable",variableARG.parse()),funValue("origin",originARG.parse())))
}
fun repeatForEachInList(indexVariable: Any, valueVariable: Any, list: Any) {
	val indexVariableARG=typeCheck<Var>(indexVariable)
	val valueVariableARG=typeCheck<Var>(valueVariable)
	val listARG=typeCheck<JArray>(list)
	handleFun("repeat_for_each_in_list", listOf(funValue("index_variable",indexVariableARG.parse()),funValue("value_variable",valueVariableARG.parse()),funValue("list",listARG.parse())))
}
fun repeatForEachMapEntry(keyVariable: Any, valueVariable: Any, map: Any) {
	val keyVariableARG=typeCheck<Var>(keyVariable)
	val valueVariableARG=typeCheck<Var>(valueVariable)
	val mapARG=typeCheck<JMap>(map)
	handleFun("repeat_for_each_map_entry", listOf(funValue("key_variable",keyVariableARG.parse()),funValue("value_variable",valueVariableARG.parse()),funValue("map",mapARG.parse())))
}
fun repeatForever() {
	handleFun("repeat_forever", listOf())
}
fun repeatMultiTimes(variable: Any, amount: Any) {
	val funName = "repeatMultiTimes"
	val variableARG=typeCheck<Var>(variable)
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("repeat_multi_times", listOf(funValue("variable",variableARG.parse()),funValue("amount",amountARG.parse())))
}
fun repeatOnCircle(variable: Any, center: Any, radius: Any, circlePoints: Any, perpendicularToPlane: Any, startAngle: Any, angleUnit: Any? = null) {
	val funName = "repeatOnCircle"
	val variableARG=typeCheck<Var>(variable)
	val centerARG=typeCheck<JLocation>(center)
	val radiusARG=numberConvert(funName,"radius",radius)
	val circlePointsARG=numberConvert(funName,"circlePoints",circlePoints)
	val perpendicularToPlaneARG=typeCheck<JVector>(perpendicularToPlane)
	val startAngleARG=numberConvert(funName,"startAngle",startAngle)
	enumCheck(funName,"angleUnit",angleUnit,listOf("DEGREES","RADIANS"))
	handleFun("repeat_on_circle", listOf(funValue("variable",variableARG.parse()),funValue("center",centerARG.parse()),funValue("radius",radiusARG.parse()),funValue("circle_points",circlePointsARG.parse()),funValue("perpendicular_to_plane",perpendicularToPlaneARG.parse()),funValue("start_angle",startAngleARG.parse())))
}
fun repeatOnGrid(variable: Any, start: Any, end: Any) {
	val variableARG=typeCheck<Var>(variable)
	val startARG=typeCheck<JLocation>(start)
	val endARG=typeCheck<JLocation>(end)
	handleFun("repeat_on_grid", listOf(funValue("variable",variableARG.parse()),funValue("start",startARG.parse()),funValue("end",endARG.parse())))
}
fun repeatOnPath(variable: Any, step: Any, locations: Any, rotation: Any? = null) {
	val funName = "repeatOnPath"
	val variableARG=typeCheck<Var>(variable)
	val stepARG=numberConvert(funName,"step",step)
	val locationsARG=typeCheck<JLocation>(locations)
	enumCheck(funName,"rotation",rotation,listOf("FALSE","TRUE"))
	handleFun("repeat_on_path", listOf(funValue("variable",variableARG.parse()),funValue("step",stepARG.parse()),funValue("locations",locationsARG.parse())))
}
fun repeatOnRange(variable: Any, start: Any, end: Any, interval: Any) {
	val funName = "repeatOnRange"
	val variableARG=typeCheck<Var>(variable)
	val startARG=numberConvert(funName,"start",start)
	val endARG=numberConvert(funName,"end",end)
	val intervalARG=numberConvert(funName,"interval",interval)
	handleFun("repeat_on_range", listOf(funValue("variable",variableARG.parse()),funValue("start",startARG.parse()),funValue("end",endARG.parse()),funValue("interval",intervalARG.parse())))
}
fun repeatOnSphere(variable: Any, center: Any, radius: Any, points: Any, rotateLocation: Any? = null) {
	val funName = "repeatOnSphere"
	val variableARG=typeCheck<Var>(variable)
	val centerARG=typeCheck<JLocation>(center)
	val radiusARG=numberConvert(funName,"radius",radius)
	val pointsARG=numberConvert(funName,"points",points)
	enumCheck(funName,"rotateLocation",rotateLocation,listOf("INWARDS","NO_CHANGES","OUTWARDS"))
	handleFun("repeat_on_sphere", listOf(funValue("variable",variableARG.parse()),funValue("center",centerARG.parse()),funValue("radius",radiusARG.parse()),funValue("points",pointsARG.parse())))
}
fun repeatWhile() {
	handleFun("repeat_while", listOf())
}
fun selectAddAllEntities() {
	handleFun("select_add_all_entities", listOf())
}
fun selectAddAllMobs() {
	handleFun("select_add_all_mobs", listOf())
}
fun selectAddAllPlayers() {
	handleFun("select_add_all_players", listOf())
}
fun selectAddEntityByConditional() {
	handleFun("select_add_entity_by_conditional", listOf())
}
fun selectAddEntityByName(nameOrUuid: Any) {
	val funName = "selectAddEntityByName"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	handleFun("select_add_entity_by_name", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun selectAddEventTarget(selectionType: Any? = null) {
	val funName = "selectAddEventTarget"
	enumCheck(funName,"selectionType",selectionType,listOf("DAMAGER","DEFAULT","KILLER","PROJECTILE","SHOOTER","VICTIM"))
	handleFun("select_add_event_target", listOf())
}
fun selectAddLastEntity() {
	handleFun("select_add_last_entity", listOf())
}
fun selectAddLastMob() {
	handleFun("select_add_last_mob", listOf())
}
fun selectAddMobByName(nameOrUuid: Any) {
	val funName = "selectAddMobByName"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	handleFun("select_add_mob_by_name", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun selectAddPlayerByConditional() {
	handleFun("select_add_player_by_conditional", listOf())
}
fun selectAddPlayerByName(nameOrUuid: Any) {
	val funName = "selectAddPlayerByName"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	handleFun("select_add_player_by_name", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun selectAddRandomEntity() {
	handleFun("select_add_random_entity", listOf())
}
fun selectAddRandomMob() {
	handleFun("select_add_random_mob", listOf())
}
fun selectAddRandomPlayer() {
	handleFun("select_add_random_player", listOf())
}
fun selectAllEntities() {
	handleFun("select_all_entities", listOf())
}
fun selectAllMobs() {
	handleFun("select_all_mobs", listOf())
}
fun selectAllPlayers() {
	handleFun("select_all_players", listOf())
}
fun selectEntityByConditional() {
	handleFun("select_entity_by_conditional", listOf())
}
fun selectEntityByName(nameOrUuid: Any) {
	val funName = "selectEntityByName"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	handleFun("select_entity_by_name", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun selectEventTarget(selectionType: Any? = null) {
	val funName = "selectEventTarget"
	enumCheck(funName,"selectionType",selectionType,listOf("DAMAGER","DEFAULT","KILLER","PROJECTILE","SHOOTER","VICTIM"))
	handleFun("select_event_target", listOf())
}
fun selectFilterByConditional() {
	handleFun("select_filter_by_conditional", listOf())
}
fun selectFilterByDistance(location: Any, selectionSize: Any, ignoreYAxis: Any? = null, compareMode: Any? = null) {
	val funName = "selectFilterByDistance"
	val locationARG=typeCheck<JLocation>(location)
	val selectionSizeARG=numberConvert(funName,"selectionSize",selectionSize)
	enumCheck(funName,"ignoreYAxis",ignoreYAxis,listOf("FALSE","TRUE"))
	enumCheck(funName,"compareMode",compareMode,listOf("FARTHEST","NEAREST"))
	handleFun("select_filter_by_distance", listOf(funValue("location",locationARG.parse()),funValue("selection_size",selectionSizeARG.parse())))
}
fun selectFilterByRaycast(variable: Any, origin: Any, maxDistance: Any, raySize: Any, selectionSize: Any, considerBlocks: Any? = null, ignorePassableBlocks: Any? = null, fluidCollisionMode: Any? = null) {
	val funName = "selectFilterByRaycast"
	val variableARG=typeCheck<Var>(variable)
	val originARG=typeCheck<JLocation>(origin)
	val maxDistanceARG=numberConvert(funName,"maxDistance",maxDistance)
	val raySizeARG=numberConvert(funName,"raySize",raySize)
	val selectionSizeARG=numberConvert(funName,"selectionSize",selectionSize)
	enumCheck(funName,"considerBlocks",considerBlocks,listOf("FALSE","TRUE"))
	enumCheck(funName,"ignorePassableBlocks",ignorePassableBlocks,listOf("FALSE","TRUE"))
	enumCheck(funName,"fluidCollisionMode",fluidCollisionMode,listOf("ALWAYS","NEVER","SOURCE_ONLY"))
	handleFun("select_filter_by_raycast", listOf(funValue("variable",variableARG.parse()),funValue("origin",originARG.parse()),funValue("max_distance",maxDistanceARG.parse()),funValue("ray_size",raySizeARG.parse()),funValue("selection_size",selectionSizeARG.parse())))
}
fun selectFilterRandomly(size: Any) {
	val funName = "selectFilterRandomly"
	val sizeARG=numberConvert(funName,"size",size)
	handleFun("select_filter_randomly", listOf(funValue("size",sizeARG.parse())))
}
fun selectInvert() {
	handleFun("select_invert", listOf())
}
fun selectLastEntity() {
	handleFun("select_last_entity", listOf())
}
fun selectLastMob() {
	handleFun("select_last_mob", listOf())
}
fun selectMobByName(nameOrUuid: Any) {
	val funName = "selectMobByName"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	handleFun("select_mob_by_name", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun selectPlayerByConditional() {
	handleFun("select_player_by_conditional", listOf())
}
fun selectPlayerByName(nameOrUuid: Any) {
	val funName = "selectPlayerByName"
	val nameOrUuidARG=textConvertPlural(funName,"nameOrUuid",nameOrUuid)
	handleFun("select_player_by_name", listOf(funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun selectRandomEntity() {
	handleFun("select_random_entity", listOf())
}
fun selectRandomMob() {
	handleFun("select_random_mob", listOf())
}
fun selectRandomPlayer() {
	handleFun("select_random_player", listOf())
}
fun selectReset() {
	handleFun("select_reset", listOf())
}
fun variableAbsolute(variable: Any, number: Any) {
	val funName = "variableAbsolute"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	handleFun("set_variable_absolute", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableAdd(variable: Any, value: Any) {
	val funName = "variableAdd"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	handleFun("set_variable_add", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableAddItemEnchantment(variable: Any, item: Any, enchantment: Any, level: Any) {
	val funName = "variableAddItemEnchantment"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val enchantmentARG=textConvert(funName,"enchantment",enchantment)
	val levelARG=numberConvert(funName,"level",level)
	handleFun("set_variable_add_item_enchantment", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("enchantment",enchantmentARG.parse()),funValue("level",levelARG.parse())))
}
fun variableAddItemPotionEffects(variable: Any, potions: Any, item: Any, overwrite: Any? = null, showIcon: Any? = null, particleMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val potionsARG=typeCheck<JPotion>(potions)
	val itemARG=typeCheck<JItem>(item)
	val funName = "variableAddItemPotionEffects"
	enumCheck(funName,"overwrite",overwrite,listOf("FALSE","TRUE"))
	enumCheck(funName,"showIcon",showIcon,listOf("FALSE","TRUE"))
	enumCheck(funName,"particleMode",particleMode,listOf("AMBIENT","NONE","REGULAR"))
	handleFun("set_variable_add_item_potion_effects", listOf(funValue("variable",variableARG.parse()),funValue("potions",potionsARG.parse()),funValue("item",itemARG.parse())))
}
fun variableAddVectors(variable: Any, vectors: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vectorsARG=typeCheck<JVector>(vectors)
	handleFun("set_variable_add_vectors", listOf(funValue("variable",variableARG.parse()),funValue("vectors",vectorsARG.parse())))
}
fun variableAlignLocation(variable: Any, location: Any, rotationMode: Any? = null, coordinatesMode: Any? = null, alignMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableAlignLocation"
	enumCheck(funName,"rotationMode",rotationMode,listOf("KEEP","REMOVE"))
	enumCheck(funName,"coordinatesMode",coordinatesMode,listOf("ALL","X_Z","Y"))
	enumCheck(funName,"alignMode",alignMode,listOf("BLOCK_CENTER","CORNER"))
	handleFun("set_variable_align_location", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableAlignToAxisVector(variable: Any, vector: Any, normalize: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val funName = "variableAlignToAxisVector"
	enumCheck(funName,"normalize",normalize,listOf("FALSE","TRUE"))
	handleFun("set_variable_align_to_axis_vector", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse())))
}
fun variableAppendComponent(variable: Any, components: Any, merging: Any? = null) {
	val funName = "variableAppendComponent"
	val variableARG=typeCheck<Var>(variable)
	val componentsARG=textConvertPlural(funName,"components",components)
	enumCheck(funName,"merging",merging,listOf("CONCATENATION","SEPARATE_LINES","SPACES"))
	handleFun("set_variable_append_component", listOf(funValue("variable",variableARG.parse()),funValue("components",componentsARG.parse())))
}
fun variableAppendList(variable: Any, list1: Any, list2: Any) {
	val variableARG=typeCheck<Var>(variable)
	val list1ARG=typeCheck<JArray>(list1)
	val list2ARG=typeCheck<JArray>(list2)
	handleFun("set_variable_append_list", listOf(funValue("variable",variableARG.parse()),funValue("list_1",list1ARG.parse()),funValue("list_2",list2ARG.parse())))
}
fun variableAppendMap(variable: Any, map: Any, otherMap: Any) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val otherMapARG=typeCheck<JMap>(otherMap)
	handleFun("set_variable_append_map", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("other_map",otherMapARG.parse())))
}
fun variableAppendValue(variable: Any, values: Any) {
	val variableARG=typeCheck<Var>(variable)
	val valuesARG=typeCheck<JAny>(values)
	handleFun("set_variable_append_value", listOf(funValue("variable",variableARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableAverage(variable: Any, value: Any) {
	val funName = "variableAverage"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	handleFun("set_variable_average", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableBitwiseOperation(variable: Any, operand1: Any, operand2: Any, operator: Any? = null) {
	val funName = "variableBitwiseOperation"
	val variableARG=typeCheck<Var>(variable)
	val operand1ARG=numberConvert(funName,"operand1",operand1)
	val operand2ARG=numberConvert(funName,"operand2",operand2)
	enumCheck(funName,"operator",operator,listOf("AND","LEFT_SHIFT","NOT","OR","RIGHT_SHIFT","UNSIGNED_RIGHT_SHIFT","XOR"))
	handleFun("set_variable_bitwise_operation", listOf(funValue("variable",variableARG.parse()),funValue("operand1",operand1ARG.parse()),funValue("operand2",operand2ARG.parse())))
}
fun variableCenterLocation(variable: Any, locations: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationsARG=typeCheck<JLocation>(locations)
	handleFun("set_variable_center_location", listOf(funValue("variable",variableARG.parse()),funValue("locations",locationsARG.parse())))
}
fun variableChangeComponentParsing(variable: Any, component: Any, parsing: Any? = null) {
	val funName = "variableChangeComponentParsing"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	enumCheck(funName,"parsing",parsing,listOf("JSON","LEGACY","MINIMESSAGE","PLAIN"))
	handleFun("set_variable_change_component_parsing", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableCharToNumber(variable: Any, char: Any) {
	val funName = "variableCharToNumber"
	val variableARG=typeCheck<Var>(variable)
	val charARG=textConvert(funName,"char",char)
	handleFun("set_variable_char_to_number", listOf(funValue("variable",variableARG.parse()),funValue("char",charARG.parse())))
}
fun variableClamp(variable: Any, number: Any, min: Any, max: Any) {
	val funName = "variableClamp"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	val minARG=numberConvert(funName,"min",min)
	val maxARG=numberConvert(funName,"max",max)
	handleFun("set_variable_clamp", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse()),funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun variableClearColorCodes(variable: Any, text: Any) {
	val funName = "variableClearColorCodes"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	handleFun("set_variable_clear_color_codes", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableClearMap(map: Any) {
	val mapARG=typeCheck<Var>(map)
	handleFun("set_variable_clear_map", listOf(funValue("map",mapARG.parse())))
}
fun variableCompactComponent(variable: Any, component: Any) {
	val funName = "variableCompactComponent"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	handleFun("set_variable_compact_component", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableComponentOfChildren(variable: Any, components: Any) {
	val funName = "variableComponentOfChildren"
	val variableARG=typeCheck<Var>(variable)
	val componentsARG=textConvertPlural(funName,"components",components)
	handleFun("set_variable_component_of_children", listOf(funValue("variable",variableARG.parse()),funValue("components",componentsARG.parse())))
}
fun variableConvertNumberToText(variable: Any, number: Any, radix: Any) {
	val funName = "variableConvertNumberToText"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	val radixARG=numberConvert(funName,"radix",radix)
	handleFun("set_variable_convert_number_to_text", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse()),funValue("radix",radixARG.parse())))
}
fun variableConvertTextToNumber(variable: Any, text: Any, radix: Any) {
	val funName = "variableConvertTextToNumber"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val radixARG=numberConvert(funName,"radix",radix)
	handleFun("set_variable_convert_text_to_number", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("radix",radixARG.parse())))
}
fun variableCosine(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val funName = "variableCosine"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	enumCheck(funName,"variant",variant,listOf("ARCCOSINE","COSINE","HYPERBOLIC_COSINE"))
	enumCheck(funName,"input",input,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_cosine", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableCotangent(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val funName = "variableCotangent"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	enumCheck(funName,"variant",variant,listOf("ARCCOTANGENT","COTANGENT","HYPERBOLIC_COTANGENT"))
	enumCheck(funName,"input",input,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_cotangent", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableCreateKeybindComponent(variable: Any, key: Any) {
	val funName = "variableCreateKeybindComponent"
	val variableARG=typeCheck<Var>(variable)
	val keyARG=textConvert(funName,"key",key)
	handleFun("set_variable_create_keybind_component", listOf(funValue("variable",variableARG.parse()),funValue("key",keyARG.parse())))
}
fun variableCreateList(variable: Any, values: Any) {
	val variableARG=typeCheck<Var>(variable)
	val valuesARG=typeCheck<JAny>(values)
	handleFun("set_variable_create_list", listOf(funValue("variable",variableARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableCreateMap(variable: Any, keys: Any, values: Any) {
	val variableARG=typeCheck<Var>(variable)
	val keysARG=typeCheck<JArray>(keys)
	val valuesARG=typeCheck<JArray>(values)
	handleFun("set_variable_create_map", listOf(funValue("variable",variableARG.parse()),funValue("keys",keysARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableCreateMapFromValues(variable: Any, keys: Any, values: Any) {
	val variableARG=typeCheck<Var>(variable)
	val keysARG=typeCheck<JAny>(keys)
	val valuesARG=typeCheck<JAny>(values)
	handleFun("set_variable_create_map_from_values", listOf(funValue("variable",variableARG.parse()),funValue("keys",keysARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableCreateTranslatableComponent(variable: Any, key: Any, args: Any) {
	val funName = "variableCreateTranslatableComponent"
	val variableARG=typeCheck<Var>(variable)
	val keyARG=textConvert(funName,"key",key)
	val argsARG=textConvertPlural(funName,"args",args)
	handleFun("set_variable_create_translatable_component", listOf(funValue("variable",variableARG.parse()),funValue("key",keyARG.parse()),funValue("args",argsARG.parse())))
}
fun variableDecrement(variable: Any, number: Any) {
	val funName = "variableDecrement"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	handleFun("set_variable_decrement", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableDivide(variable: Any, value: Any, divisionMode: Any? = null) {
	val funName = "variableDivide"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	enumCheck(funName,"divisionMode",divisionMode,listOf("CEIL","DEFAULT","FLOOR","ROUND_TO_INT"))
	handleFun("set_variable_divide", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableDivideVector(variable: Any, vector: Any, divider: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val dividerARG=typeCheck<JVector>(divider)
	handleFun("set_variable_divide_vector", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse()),funValue("divider",dividerARG.parse())))
}
fun variableFaceLocation(variable: Any, location: Any, target: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val targetARG=typeCheck<JLocation>(target)
	handleFun("set_variable_face_location", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("target",targetARG.parse())))
}
fun variableFlattenList(variable: Any, list: Any) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	handleFun("set_variable_flatten_list", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableFormatTimestamp(variable: Any, time: Any, pattern: Any, zoneId: Any, locale: Any, format: Any? = null) {
	val funName = "variableFormatTimestamp"
	val variableARG=typeCheck<Var>(variable)
	val timeARG=numberConvert(funName,"time",time)
	val patternARG=textConvert(funName,"pattern",pattern)
	val zoneIdARG=textConvert(funName,"zoneId",zoneId)
	val localeARG=textConvert(funName,"locale",locale)
	enumCheck(funName,"format",format,listOf("CUSTOM","DD_MM_YYYY","DD_MM_YYYY_HH_MM_S","EEEE","EEE_D_MMMM","EEE_MMMM_D","HH_MM_SS","H_H_M_M_S_S","H_MM_A","S_S","YYYY_MM_DD","YYYY_MM_DD_HH_MM_S"))
	handleFun("set_variable_format_timestamp", listOf(funValue("variable",variableARG.parse()),funValue("time",timeARG.parse()),funValue("pattern",patternARG.parse()),funValue("zone_id",zoneIdARG.parse()),funValue("locale",localeARG.parse())))
}
fun variableGaussianDistribution(variable: Any, deviant: Any, mean: Any, distribution: Any? = null) {
	val funName = "variableGaussianDistribution"
	val variableARG=typeCheck<Var>(variable)
	val deviantARG=numberConvert(funName,"deviant",deviant)
	val meanARG=numberConvert(funName,"mean",mean)
	enumCheck(funName,"distribution",distribution,listOf("FOLDER_NORMAL","NORMAL"))
	handleFun("set_variable_gaussian_distribution", listOf(funValue("variable",variableARG.parse()),funValue("deviant",deviantARG.parse()),funValue("mean",meanARG.parse())))
}
fun variableGetAllBlockData(variable: Any, location: Any, hideUnspecified: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetAllBlockData"
	enumCheck(funName,"hideUnspecified",hideUnspecified,listOf("FALSE","TRUE"))
	handleFun("set_variable_get_all_block_data", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetAllCoordinates(x: Any, y: Any, z: Any, yaw: Any, pitch: Any, location: Any) {
	val xARG=typeCheck<Var>(x)
	val yARG=typeCheck<Var>(y)
	val zARG=typeCheck<Var>(z)
	val yawARG=typeCheck<Var>(yaw)
	val pitchARG=typeCheck<Var>(pitch)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_all_coordinates", listOf(funValue("x",xARG.parse()),funValue("y",yARG.parse()),funValue("z",zARG.parse()),funValue("yaw",yawARG.parse()),funValue("pitch",pitchARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetAngleBetweenVectors(variable: Any, vector1: Any, vector2: Any, angleUnits: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val vector1ARG=typeCheck<JVector>(vector1)
	val vector2ARG=typeCheck<JVector>(vector2)
	val funName = "variableGetAngleBetweenVectors"
	enumCheck(funName,"angleUnits",angleUnits,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_get_angle_between_vectors", listOf(funValue("variable",variableARG.parse()),funValue("vector_1",vector1ARG.parse()),funValue("vector_2",vector2ARG.parse())))
}
fun variableGetBlockCustomTag(variable: Any, location: Any, tagName: Any, tagValue: Any, defaultValue: Any) {
	val funName = "variableGetBlockCustomTag"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val tagNameARG=textConvert(funName,"tagName",tagName)
	val tagValueARG=textConvert(funName,"tagValue",tagValue)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	handleFun("set_variable_get_block_custom_tag", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("tag_name",tagNameARG.parse()),funValue("tag_value",tagValueARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetBlockData(variable: Any, location: Any, tagName: Any) {
	val funName = "variableGetBlockData"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val tagNameARG=textConvert(funName,"tagName",tagName)
	handleFun("set_variable_get_block_data", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("tag_name",tagNameARG.parse())))
}
fun variableGetBlockGrowth(variable: Any, location: Any, growthUnit: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetBlockGrowth"
	enumCheck(funName,"growthUnit",growthUnit,listOf("GROWTH_PERCENTAGE","GROWTH_STAGE"))
	handleFun("set_variable_get_block_growth", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetBlockMaterial(variable: Any, location: Any, valueType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetBlockMaterial"
	enumCheck(funName,"valueType",valueType,listOf("ID","ID_WITH_DATA","ITEM","NAME"))
	handleFun("set_variable_get_block_material", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetBlockMaterialProperty(variable: Any, block: Any, property: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val blockARG=typeCheck<JBlock>(block)
	val funName = "variableGetBlockMaterialProperty"
	enumCheck(funName,"property",property,listOf("BLAST_RESISTANCE","HARDNESS","SLIPPERINESS"))
	handleFun("set_variable_get_block_material_property", listOf(funValue("variable",variableARG.parse()),funValue("block",blockARG.parse())))
}
fun variableGetBlockPower(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_block_power", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetBookText(variable: Any, book: Any, page: Any) {
	val funName = "variableGetBookText"
	val variableARG=typeCheck<Var>(variable)
	val bookARG=typeCheck<JItem>(book)
	val pageARG=numberConvert(funName,"page",page)
	handleFun("set_variable_get_book_text", listOf(funValue("variable",variableARG.parse()),funValue("book",bookARG.parse()),funValue("page",pageARG.parse())))
}
fun variableGetBrushableBlockItem(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_brushable_block_item", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetBundleItems(variable: Any, bundle: Any) {
	val variableARG=typeCheck<Var>(variable)
	val bundleARG=typeCheck<JItem>(bundle)
	handleFun("set_variable_get_bundle_items", listOf(funValue("variable",variableARG.parse()),funValue("bundle",bundleARG.parse())))
}
fun variableGetCharAt(variable: Any, text: Any, index: Any) {
	val funName = "variableGetCharAt"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val indexARG=numberConvert(funName,"index",index)
	handleFun("set_variable_get_char_at", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("index",indexARG.parse())))
}
fun variableGetColorChannels(variable: Any, color: Any, colorChannels: Any? = null) {
	val funName = "variableGetColorChannels"
	val variableARG=typeCheck<Var>(variable)
	val colorARG=textConvert(funName,"color",color)
	enumCheck(funName,"colorChannels",colorChannels,listOf("HSB","HSL","RGB"))
	handleFun("set_variable_get_color_channels", listOf(funValue("variable",variableARG.parse()),funValue("color",colorARG.parse())))
}
fun variableGetCompassLodestone(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_compass_lodestone", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetComponentChildren(variable: Any, component: Any) {
	val funName = "variableGetComponentChildren"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	handleFun("set_variable_get_component_children", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableGetComponentDecorations(variable: Any, component: Any) {
	val funName = "variableGetComponentDecorations"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	handleFun("set_variable_get_component_decorations", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableGetComponentHexColor(variable: Any, component: Any) {
	val funName = "variableGetComponentHexColor"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	handleFun("set_variable_get_component_hex_color", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableGetComponentParsing(variable: Any, component: Any) {
	val funName = "variableGetComponentParsing"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	handleFun("set_variable_get_component_parsing", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableGetContainerContents(variable: Any, location: Any, ignoreEmptySlots: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetContainerContents"
	enumCheck(funName,"ignoreEmptySlots",ignoreEmptySlots,listOf("FALSE","TRUE"))
	handleFun("set_variable_get_container_contents", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetContainerLock(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_container_lock", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetContainerName(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_container_name", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetCoordinate(variable: Any, location: Any, type: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetCoordinate"
	enumCheck(funName,"type",type,listOf("PITCH","X","Y","YAW","Z"))
	handleFun("set_variable_get_coordinate", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetDecoratePotSherd(variable: Any, location: Any, side: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetDecoratePotSherd"
	enumCheck(funName,"side",side,listOf("BACK","FRONT","LEFT","RIGHT"))
	handleFun("set_variable_get_decorate_pot_sherd", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetIndexOfSubtext(variable: Any, text: Any, subtext: Any, startIndex: Any, searchMode: Any? = null) {
	val funName = "variableGetIndexOfSubtext"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val subtextARG=textConvert(funName,"subtext",subtext)
	val startIndexARG=numberConvert(funName,"startIndex",startIndex)
	enumCheck(funName,"searchMode",searchMode,listOf("FIRST","LAST"))
	handleFun("set_variable_get_index_of_subtext", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("subtext",subtextARG.parse()),funValue("start_index",startIndexARG.parse())))
}
fun variableGetItemAmount(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_amount", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemAttribute(variable: Any, item: Any, name: Any, attribute: Any? = null, slot: Any? = null, operation: Any? = null) {
	val funName = "variableGetItemAttribute"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val nameARG=textConvert(funName,"name",name)
	enumCheck(funName,"attribute",attribute,listOf("ARMOR","ARMOR_TOUGHNESS","ATTACK_DAMAGE","ATTACK_KNOCKBACK","ATTACK_SPEED","FLYING_SPEED","FOLLOW_RANGE","GENERIC_ARMOR","GENERIC_ARMOR_TOUGHNESS","GENERIC_ATTACK_DAMAGE","GENERIC_ATTACK_KNOCKBACK","GENERIC_ATTACK_SPEED","GENERIC_BURNING_TIME","GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE","GENERIC_FALL_DAMAGE_MULTIPLIER","GENERIC_FLYING_SPEED","GENERIC_FOLLOW_RANGE","GENERIC_GRAVITY","GENERIC_JUMP_STRENGTH","GENERIC_KNOCKBACK_RESISTANCE","GENERIC_LUCK","GENERIC_MAX_ABSORPTION","GENERIC_MAX_HEALTH","GENERIC_MOVEMENT_EFFICIENCY","GENERIC_MOVEMENT_SPEED","GENERIC_OXYGEN_BONUS","GENERIC_SAFE_FALL_DISTANCE","GENERIC_SCALE","GENERIC_STEP_HEIGHT","GENERIC_WATER_MOVEMENT_EFFICIENCY","HORSE_JUMP_STRENGTH","KNOCKBACK_RESISTANCE","LUCK","MAX_ABSORPTION","MAX_HEALTH","MOVEMENT_SPEED","PLAYER_BLOCK_BREAK_SPEED","PLAYER_BLOCK_INTERACTION_RANGE","PLAYER_ENTITY_INTERACTION_RANGE","PLAYER_MINING_EFFICIENCY","PLAYER_SNEAKING_SPEED","PLAYER_SUBMERGED_MINING_SPEED","PLAYER_SWEEPING_DAMAGE_RATIO","ZOMBIE_SPAWN_REINFORCEMENTS"))
	enumCheck(funName,"slot",slot,listOf("ALL","ARMOR","BODY","BOOTS","CHEST","HAND","HEAD","LEGGINGS","MAIN_HAND","OFF_HAND"))
	enumCheck(funName,"operation",operation,listOf("ADD_NUMBER","ADD_SCALAR","MULTIPLY_SCALAR_1"))
	handleFun("set_variable_get_item_attribute", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("name",nameARG.parse())))
}
fun variableGetItemColor(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_color", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemCustomModelData(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_custom_model_data", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemCustomTag(variable: Any, item: Any, tagName: Any, defaultValue: Any) {
	val funName = "variableGetItemCustomTag"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val tagNameARG=textConvert(funName,"tagName",tagName)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	handleFun("set_variable_get_item_custom_tag", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("tag_name",tagNameARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetItemCustomTags(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_custom_tags", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemDestroyableBlocks(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_destroyable_blocks", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemDurability(variable: Any, item: Any, durabilityType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val funName = "variableGetItemDurability"
	enumCheck(funName,"durabilityType",durabilityType,listOf("DAMAGE","DAMAGE_PERCENTAGE","MAXIMUM","REMAINING","REMAINING_PERCENTAGE"))
	handleFun("set_variable_get_item_durability", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemEnchantments(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_enchantments", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemLore(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_lore", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemLoreLine(variable: Any, item: Any, line: Any) {
	val funName = "variableGetItemLoreLine"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val lineARG=numberConvert(funName,"line",line)
	handleFun("set_variable_get_item_lore_line", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("line",lineARG.parse())))
}
fun variableGetItemMaxStackSize(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_max_stack_size", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemName(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_name", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemNbtTags(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_nbt_tags", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemPlaceableBlocks(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_placeable_blocks", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemPotionEffects(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_potion_effects", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemRarity(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_get_item_rarity", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableGetItemType(variable: Any, type: Any, value: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val typeARG=typeCheck<JItem>(type)
	val funName = "variableGetItemType"
	enumCheck(funName,"value",value,listOf("ID","ITEM","NAME"))
	handleFun("set_variable_get_item_type", listOf(funValue("variable",variableARG.parse()),funValue("type",typeARG.parse())))
}
fun variableGetLecternBook(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_lectern_book", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetLecternPage(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_lectern_page", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetLightLevel(variable: Any, location: Any, valueType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetLightLevel"
	enumCheck(funName,"valueType",valueType,listOf("BLOCKS","SKY","TOTAL"))
	handleFun("set_variable_get_light_level", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetListIndexOfValue(variable: Any, list: Any, value: Any, searchMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val valueARG=typeCheck<JAny>(value)
	val funName = "variableGetListIndexOfValue"
	enumCheck(funName,"searchMode",searchMode,listOf("FIRST","LAST"))
	handleFun("set_variable_get_list_index_of_value", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("value",valueARG.parse())))
}
fun variableGetListLength(variable: Any, list: Any) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	handleFun("set_variable_get_list_length", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableGetListRandomValue(variable: Any, list: Any) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	handleFun("set_variable_get_list_random_value", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableGetListValue(variable: Any, list: Any, number: Any, defaultValue: Any) {
	val funName = "variableGetListValue"
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val numberARG=numberConvert(funName,"number",number)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	handleFun("set_variable_get_list_value", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("number",numberARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetListVariables(variable: Any, scope: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val funName = "variableGetListVariables"
	enumCheck(funName,"scope",scope,listOf("GAME","LOCAL","SAVE"))
	handleFun("set_variable_get_list_variables", listOf(funValue("variable",variableARG.parse())))
}
fun variableGetLocationDirection(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_location_direction", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetMapKeyByIndex(variable: Any, map: Any, index: Any, defaultValue: Any) {
	val funName = "variableGetMapKeyByIndex"
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val indexARG=numberConvert(funName,"index",index)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	handleFun("set_variable_get_map_key_by_index", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("index",indexARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetMapKeys(variable: Any, map: Any) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	handleFun("set_variable_get_map_keys", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse())))
}
fun variableGetMapKeysByValue(variable: Any, map: Any, value: Any, defaultValue: Any, findMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val valueARG=typeCheck<JAny>(value)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	val funName = "variableGetMapKeysByValue"
	enumCheck(funName,"findMode",findMode,listOf("ALL","FIRST","LAST"))
	handleFun("set_variable_get_map_keys_by_value", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("value",valueARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetMapSize(variable: Any, map: Any) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	handleFun("set_variable_get_map_size", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse())))
}
fun variableGetMapValue(variable: Any, map: Any, key: Any, defaultValue: Any) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val keyARG=typeCheck<JAny>(key)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	handleFun("set_variable_get_map_value", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("key",keyARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetMapValueByIndex(variable: Any, map: Any, index: Any, defaultValue: Any) {
	val funName = "variableGetMapValueByIndex"
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val indexARG=numberConvert(funName,"index",index)
	val defaultValueARG=typeCheck<JAny>(defaultValue)
	handleFun("set_variable_get_map_value_by_index", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("index",indexARG.parse()),funValue("default_value",defaultValueARG.parse())))
}
fun variableGetMapValues(variable: Any, map: Any) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	handleFun("set_variable_get_map_values", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse())))
}
fun variableGetMidpointBetweenVectors(variable: Any, vector1: Any, vector2: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vector1ARG=typeCheck<JVector>(vector1)
	val vector2ARG=typeCheck<JVector>(vector2)
	handleFun("set_variable_get_midpoint_between_vectors", listOf(funValue("variable",variableARG.parse()),funValue("vector_1",vector1ARG.parse()),funValue("vector_2",vector2ARG.parse())))
}
fun variableGetParticleAmount(variable: Any, particle: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	handleFun("set_variable_get_particle_amount", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetParticleColor(variable: Any, particle: Any, colorType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val funName = "variableGetParticleColor"
	enumCheck(funName,"colorType",colorType,listOf("COLOR","TO_COLOR"))
	handleFun("set_variable_get_particle_color", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetParticleMaterial(variable: Any, particle: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	handleFun("set_variable_get_particle_material", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetParticleOffset(variable: Any, particle: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	handleFun("set_variable_get_particle_offset", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetParticleSize(variable: Any, particle: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	handleFun("set_variable_get_particle_size", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetParticleSpread(variable: Any, particle: Any, type: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val funName = "variableGetParticleSpread"
	enumCheck(funName,"type",type,listOf("HORIZONTAL","VERTICAL"))
	handleFun("set_variable_get_particle_spread", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetParticleType(variable: Any, particle: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	handleFun("set_variable_get_particle_type", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse())))
}
fun variableGetPlayerHead(variable: Any, nameOrUuid: Any, receiveType: Any? = null) {
	val funName = "variableGetPlayerHead"
	val variableARG=typeCheck<Var>(variable)
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"receiveType",receiveType,listOf("NAME_OR_UUID","VALUE"))
	handleFun("set_variable_get_player_head", listOf(funValue("variable",variableARG.parse()),funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun variableGetPlayerHeadOwner(variable: Any, head: Any, returnValue: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val headARG=typeCheck<JItem>(head)
	val funName = "variableGetPlayerHeadOwner"
	enumCheck(funName,"returnValue",returnValue,listOf("NAME","UUID","VALUE"))
	handleFun("set_variable_get_player_head_owner", listOf(funValue("variable",variableARG.parse()),funValue("head",headARG.parse())))
}
fun variableGetPlayerHeadValue(variable: Any, location: Any, returnValue: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetPlayerHeadValue"
	enumCheck(funName,"returnValue",returnValue,listOf("NAME","UUID","VALUE"))
	handleFun("set_variable_get_player_head_value", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetPotionEffectAmplifier(variable: Any, potion: Any) {
	val variableARG=typeCheck<Var>(variable)
	val potionARG=typeCheck<JPotion>(potion)
	handleFun("set_variable_get_potion_effect_amplifier", listOf(funValue("variable",variableARG.parse()),funValue("potion",potionARG.parse())))
}
fun variableGetPotionEffectDuration(variable: Any, potion: Any) {
	val variableARG=typeCheck<Var>(variable)
	val potionARG=typeCheck<JPotion>(potion)
	handleFun("set_variable_get_potion_effect_duration", listOf(funValue("variable",variableARG.parse()),funValue("potion",potionARG.parse())))
}
fun variableGetPotionEffectType(variable: Any, potion: Any) {
	val variableARG=typeCheck<Var>(variable)
	val potionARG=typeCheck<JPotion>(potion)
	handleFun("set_variable_get_potion_effect_type", listOf(funValue("variable",variableARG.parse()),funValue("potion",potionARG.parse())))
}
fun variableGetSculkShriekerWarningLevel(variable: Any, location: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	handleFun("set_variable_get_sculk_shrieker_warning_level", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetSignText(variable: Any, location: Any, checkSide: Any? = null, signLine: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableGetSignText"
	enumCheck(funName,"checkSide",checkSide,listOf("ALL","BACK","FRONT"))
	enumCheck(funName,"signLine",signLine,listOf("ALL","FIRST","FOURTH","SECOND","THIRD"))
	handleFun("set_variable_get_sign_text", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse())))
}
fun variableGetSoundPitch(variable: Any, sound: Any) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("set_variable_get_sound_pitch", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableGetSoundSource(variable: Any, sound: Any) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("set_variable_get_sound_source", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableGetSoundType(variable: Any, sound: Any) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("set_variable_get_sound_type", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableGetSoundVariation(variable: Any, sound: Any) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("set_variable_get_sound_variation", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableGetSoundVariations(variable: Any, sound: Any) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("set_variable_get_sound_variations", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableGetSoundVolumeAction(variable: Any, sound: Any) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	handleFun("set_variable_get_sound_volume_action", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableGetTemplateCode(variable: Any, template: Any, returnType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val templateARG=typeCheck<JItem>(template)
	val funName = "variableGetTemplateCode"
	enumCheck(funName,"returnType",returnType,listOf("MAP","TEXT"))
	handleFun("set_variable_get_template_code", listOf(funValue("variable",variableARG.parse()),funValue("template",templateARG.parse())))
}
fun variableGetTextWidth(variable: Any, text: Any) {
	val funName = "variableGetTextWidth"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	handleFun("set_variable_get_text_width", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableGetVectorAllComponents(x: Any, y: Any, z: Any, vector: Any) {
	val xARG=typeCheck<Var>(x)
	val yARG=typeCheck<Var>(y)
	val zARG=typeCheck<Var>(z)
	val vectorARG=typeCheck<JVector>(vector)
	handleFun("set_variable_get_vector_all_components", listOf(funValue("x",xARG.parse()),funValue("y",yARG.parse()),funValue("z",zARG.parse()),funValue("vector",vectorARG.parse())))
}
fun variableGetVectorBetweenLocations(variable: Any, endLocation: Any, startLocation: Any) {
	val variableARG=typeCheck<Var>(variable)
	val endLocationARG=typeCheck<JLocation>(endLocation)
	val startLocationARG=typeCheck<JLocation>(startLocation)
	handleFun("set_variable_get_vector_between_locations", listOf(funValue("variable",variableARG.parse()),funValue("end_location",endLocationARG.parse()),funValue("start_location",startLocationARG.parse())))
}
fun variableGetVectorComponent(variable: Any, vector: Any, vectorComponent: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val funName = "variableGetVectorComponent"
	enumCheck(funName,"vectorComponent",vectorComponent,listOf("X","Y","Z"))
	handleFun("set_variable_get_vector_component", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse())))
}
fun variableGetVectorFromBlockFace(variable: Any, blockFace: Any) {
	val funName = "variableGetVectorFromBlockFace"
	val variableARG=typeCheck<Var>(variable)
	val blockFaceARG=textConvert(funName,"blockFace",blockFace)
	handleFun("set_variable_get_vector_from_block_face", listOf(funValue("variable",variableARG.parse()),funValue("block_face",blockFaceARG.parse())))
}
fun variableGetVectorLength(variable: Any, vector: Any, lengthType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val funName = "variableGetVectorLength"
	enumCheck(funName,"lengthType",lengthType,listOf("LENGTH","LENGTH_SQUARED"))
	handleFun("set_variable_get_vector_length", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse())))
}
fun variableGetTextHash(variable: Any, text: Any, algorithm: Any? = null) {
	val funName = "variableGetTextHash"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	enumCheck(funName,"algorithm",algorithm,listOf("MD5","SHA1","SHA256"))
	handleFun("set_variable_hash", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableIncrement(variable: Any, number: Any) {
	val funName = "variableIncrement"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	handleFun("set_variable_increment", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableInsertListValue(variable: Any, list: Any, number: Any, value: Any) {
	val funName = "variableInsertListValue"
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val numberARG=numberConvert(funName,"number",number)
	val valueARG=typeCheck<JAny>(value)
	handleFun("set_variable_insert_list_value", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("number",numberARG.parse()),funValue("value",valueARG.parse())))
}
fun variableJoinText(variable: Any, list: Any, separator: Any, prefix: Any, postfix: Any, limit: Any, truncated: Any) {
	val funName = "variableJoinText"
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val separatorARG=textConvert(funName,"separator",separator)
	val prefixARG=textConvert(funName,"prefix",prefix)
	val postfixARG=textConvert(funName,"postfix",postfix)
	val limitARG=numberConvert(funName,"limit",limit)
	val truncatedARG=textConvert(funName,"truncated",truncated)
	handleFun("set_variable_join_text", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("separator",separatorARG.parse()),funValue("prefix",prefixARG.parse()),funValue("postfix",postfixARG.parse()),funValue("limit",limitARG.parse()),funValue("truncated",truncatedARG.parse())))
}
fun variableLerpNumber(variable: Any, start: Any, stop: Any, amount: Any) {
	val funName = "variableLerpNumber"
	val variableARG=typeCheck<Var>(variable)
	val startARG=numberConvert(funName,"start",start)
	val stopARG=numberConvert(funName,"stop",stop)
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("set_variable_lerp_number", listOf(funValue("variable",variableARG.parse()),funValue("start",startARG.parse()),funValue("stop",stopARG.parse()),funValue("amount",amountARG.parse())))
}
fun variableLocationRelative(variable: Any, location: Any, distance: Any, blockFace: Any? = null) {
	val funName = "variableLocationRelative"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val distanceARG=numberConvert(funName,"distance",distance)
	enumCheck(funName,"blockFace",blockFace,listOf("DOWN","EAST","EAST_NORTH_EAST","EAST_SOUTH_EAST","NORTH","NORTH_EAST","NORTH_NORTH_EAST","NORTH_NORTH_WEST","NORTH_WEST","SELF","SOUTH","SOUTH_EAST","SOUTH_SOUTH_EAST","SOUTH_SOUTH_WEST","SOUTH_WEST","UP","WEST","WEST_NORTH_WEST","WEST_SOUTH_WEST"))
	handleFun("set_variable_location_relative", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("distance",distanceARG.parse())))
}
fun variableLocationsDistance(variable: Any, location1: Any, location2: Any, type: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val location1ARG=typeCheck<JLocation>(location1)
	val location2ARG=typeCheck<JLocation>(location2)
	val funName = "variableLocationsDistance"
	enumCheck(funName,"type",type,listOf("ALTITUDE","THREE_D","TWO_D"))
	handleFun("set_variable_locations_distance", listOf(funValue("variable",variableARG.parse()),funValue("location_1",location1ARG.parse()),funValue("location_2",location2ARG.parse())))
}
fun variableLog(variable: Any, number: Any, base: Any) {
	val funName = "variableLog"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	val baseARG=numberConvert(funName,"base",base)
	handleFun("set_variable_log", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse()),funValue("base",baseARG.parse())))
}
fun variableMapRange(variable: Any, number: Any, fromStart: Any, fromStop: Any, toStart: Any, toStop: Any) {
	val funName = "variableMapRange"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	val fromStartARG=numberConvert(funName,"fromStart",fromStart)
	val fromStopARG=numberConvert(funName,"fromStop",fromStop)
	val toStartARG=numberConvert(funName,"toStart",toStart)
	val toStopARG=numberConvert(funName,"toStop",toStop)
	handleFun("set_variable_map_range", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse()),funValue("from_start",fromStartARG.parse()),funValue("from_stop",fromStopARG.parse()),funValue("to_start",toStartARG.parse()),funValue("to_stop",toStopARG.parse())))
}
fun variableMax(variable: Any, value: Any) {
	val funName = "variableMax"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	handleFun("set_variable_max", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableMin(variable: Any, value: Any) {
	val funName = "variableMin"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	handleFun("set_variable_min", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableMultiply(variable: Any, value: Any) {
	val funName = "variableMultiply"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	handleFun("set_variable_multiply", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableMultiplyVector(variable: Any, vector: Any, multiplier: Any) {
	val funName = "variableMultiplyVector"
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val multiplierARG=numberConvert(funName,"multiplier",multiplier)
	handleFun("set_variable_multiply_vector", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse()),funValue("multiplier",multiplierARG.parse())))
}
fun variableParseJson(variable: Any, json: Any) {
	val funName = "variableParseJson"
	val variableARG=typeCheck<Var>(variable)
	val jsonARG=textConvert(funName,"json",json)
	handleFun("set_variable_parse_json", listOf(funValue("variable",variableARG.parse()),funValue("json",jsonARG.parse())))
}
fun variableParseToComponent(variable: Any, text: Any, parsing: Any? = null) {
	val funName = "variableParseToComponent"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	enumCheck(funName,"parsing",parsing,listOf("JSON","LEGACY","MINIMESSAGE","PLAIN"))
	handleFun("set_variable_parse_to_component", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variablePerlinNoise3d(variable: Any, location: Any, seed: Any, locFrequency: Any, octaves: Any, frequency: Any, amplitude: Any, rangeMode: Any? = null, normalized: Any? = null) {
	val funName = "variablePerlinNoise3d"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val seedARG=numberConvert(funName,"seed",seed)
	val locFrequencyARG=numberConvert(funName,"locFrequency",locFrequency)
	val octavesARG=numberConvert(funName,"octaves",octaves)
	val frequencyARG=numberConvert(funName,"frequency",frequency)
	val amplitudeARG=numberConvert(funName,"amplitude",amplitude)
	enumCheck(funName,"rangeMode",rangeMode,listOf("FULL_RANGE","ZERO_TO_ONE"))
	enumCheck(funName,"normalized",normalized,listOf("FALSE","TRUE"))
	handleFun("set_variable_perlin_noise_3d", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("seed",seedARG.parse()),funValue("loc_frequency",locFrequencyARG.parse()),funValue("octaves",octavesARG.parse()),funValue("frequency",frequencyARG.parse()),funValue("amplitude",amplitudeARG.parse())))
}
fun variablePow(variable: Any, base: Any, power: Any) {
	val funName = "variablePow"
	val variableARG=typeCheck<Var>(variable)
	val baseARG=numberConvert(funName,"base",base)
	val powerARG=numberConvert(funName,"power",power)
	handleFun("set_variable_pow", listOf(funValue("variable",variableARG.parse()),funValue("base",baseARG.parse()),funValue("power",powerARG.parse())))
}
fun variablePurge(names: Any, scope: Any? = null, match: Any? = null, ignoreCase: Any? = null) {
	val funName = "variablePurge"
	val namesARG=textConvertPlural(funName,"names",names)
	enumCheck(funName,"scope",scope,listOf("GAME","LOCAL","SAVE"))
	enumCheck(funName,"match",match,listOf("EQUALS","NAME_CONTAINS","PART_CONTAINS"))
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	handleFun("set_variable_purge", listOf(funValue("names",namesARG.parse())))
}
fun variableRandom(variable: Any, values: Any) {
	val variableARG=typeCheck<Var>(variable)
	val valuesARG=typeCheck<JAny>(values)
	handleFun("set_variable_random", listOf(funValue("variable",variableARG.parse()),funValue("values",valuesARG.parse())))
}
fun variableRandomLocation(variable: Any, location1: Any, location2: Any, integer: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val location1ARG=typeCheck<JLocation>(location1)
	val location2ARG=typeCheck<JLocation>(location2)
	val funName = "variableRandomLocation"
	enumCheck(funName,"integer",integer,listOf("FALSE","TRUE"))
	handleFun("set_variable_random_location", listOf(funValue("variable",variableARG.parse()),funValue("location_1",location1ARG.parse()),funValue("location_2",location2ARG.parse())))
}
fun variableRandomNumber(variable: Any, min: Any, max: Any, integer: Any? = null) {
	val funName = "variableRandomNumber"
	val variableARG=typeCheck<Var>(variable)
	val minARG=numberConvert(funName,"min",min)
	val maxARG=numberConvert(funName,"max",max)
	enumCheck(funName,"integer",integer,listOf("FALSE","TRUE"))
	handleFun("set_variable_random_number", listOf(funValue("variable",variableARG.parse()),funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun variableRandomizeListOrder(variable: Any, list: Any) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	handleFun("set_variable_randomize_list_order", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableRayTraceResult(variableForHitLocation: Any, variableForHitBlockLocation: Any, variableForHitBlockFace: Any, variableForHitEntityUuid: Any, start: Any, raySize: Any, maxDistance: Any, entities: Any, rayCollisionMode: Any? = null, ignorePassableBlocks: Any? = null, fluidCollisionMode: Any? = null) {
	val funName = "variableRayTraceResult"
	val variableForHitLocationARG=typeCheck<Var>(variableForHitLocation)
	val variableForHitBlockLocationARG=typeCheck<Var>(variableForHitBlockLocation)
	val variableForHitBlockFaceARG=typeCheck<Var>(variableForHitBlockFace)
	val variableForHitEntityUuidARG=typeCheck<Var>(variableForHitEntityUuid)
	val startARG=typeCheck<JLocation>(start)
	val raySizeARG=numberConvert(funName,"raySize",raySize)
	val maxDistanceARG=numberConvert(funName,"maxDistance",maxDistance)
	val entitiesARG=typeCheck<JArray>(entities)
	enumCheck(funName,"rayCollisionMode",rayCollisionMode,listOf("BLOCKS_AND_ENTITIES","ONLY_BLOCKS","ONLY_ENTITIES"))
	enumCheck(funName,"ignorePassableBlocks",ignorePassableBlocks,listOf("FALSE","TRUE"))
	enumCheck(funName,"fluidCollisionMode",fluidCollisionMode,listOf("ALWAYS","NEVER","SOURCE_ONLY"))
	handleFun("set_variable_ray_trace_result", listOf(funValue("variable_for_hit_location",variableForHitLocationARG.parse()),funValue("variable_for_hit_block_location",variableForHitBlockLocationARG.parse()),funValue("variable_for_hit_block_face",variableForHitBlockFaceARG.parse()),funValue("variable_for_hit_entity_uuid",variableForHitEntityUuidARG.parse()),funValue("start",startARG.parse()),funValue("ray_size",raySizeARG.parse()),funValue("max_distance",maxDistanceARG.parse()),funValue("entities",entitiesARG.parse())))
}
fun variableReflectVectorProduct(variable: Any, vector1: Any, vector2: Any, bounce: Any) {
	val funName = "variableReflectVectorProduct"
	val variableARG=typeCheck<Var>(variable)
	val vector1ARG=typeCheck<JVector>(vector1)
	val vector2ARG=typeCheck<JVector>(vector2)
	val bounceARG=numberConvert(funName,"bounce",bounce)
	handleFun("set_variable_reflect_vector_product", listOf(funValue("variable",variableARG.parse()),funValue("vector_1",vector1ARG.parse()),funValue("vector_2",vector2ARG.parse()),funValue("bounce",bounceARG.parse())))
}
fun variableRegexReplaceText(variable: Any, text: Any, regex: Any, replacement: Any, first: Any? = null, ignoreCase: Any? = null, multiline: Any? = null, literal: Any? = null, unixLines: Any? = null, comments: Any? = null, dotMatchesAll: Any? = null, cannonEq: Any? = null) {
	val funName = "variableRegexReplaceText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val regexARG=textConvert(funName,"regex",regex)
	val replacementARG=textConvert(funName,"replacement",replacement)
	enumCheck(funName,"first",first,listOf("ANY","FIRST"))
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	enumCheck(funName,"multiline",multiline,listOf("FALSE","TRUE"))
	enumCheck(funName,"literal",literal,listOf("FALSE","TRUE"))
	enumCheck(funName,"unixLines",unixLines,listOf("FALSE","TRUE"))
	enumCheck(funName,"comments",comments,listOf("FALSE","TRUE"))
	enumCheck(funName,"dotMatchesAll",dotMatchesAll,listOf("FALSE","TRUE"))
	enumCheck(funName,"cannonEq",cannonEq,listOf("FALSE","TRUE"))
	handleFun("set_variable_regex_replace_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("regex",regexARG.parse()),funValue("replacement",replacementARG.parse())))
}
fun variableRemainder(variable: Any, dividend: Any, divisor: Any, remainderMode: Any? = null) {
	val funName = "variableRemainder"
	val variableARG=typeCheck<Var>(variable)
	val dividendARG=numberConvert(funName,"dividend",dividend)
	val divisorARG=numberConvert(funName,"divisor",divisor)
	enumCheck(funName,"remainderMode",remainderMode,listOf("MODULO","REMAINDER"))
	handleFun("set_variable_remainder", listOf(funValue("variable",variableARG.parse()),funValue("dividend",dividendARG.parse()),funValue("divisor",divisorARG.parse())))
}
fun variableRemoveCompassLodestone(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_remove_compass_lodestone", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableRemoveEnchantment(variable: Any, item: Any, enchantment: Any) {
	val funName = "variableRemoveEnchantment"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val enchantmentARG=textConvert(funName,"enchantment",enchantment)
	handleFun("set_variable_remove_enchantment", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("enchantment",enchantmentARG.parse())))
}
fun variableRemoveItemAttribute(variable: Any, item: Any, nameOrUuid: Any, attribute: Any? = null) {
	val funName = "variableRemoveItemAttribute"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	enumCheck(funName,"attribute",attribute,listOf("ARMOR","ARMOR_TOUGHNESS","ATTACK_DAMAGE","ATTACK_KNOCKBACK","ATTACK_SPEED","FLYING_SPEED","FOLLOW_RANGE","GENERIC_ARMOR","GENERIC_ARMOR_TOUGHNESS","GENERIC_ATTACK_DAMAGE","GENERIC_ATTACK_KNOCKBACK","GENERIC_ATTACK_SPEED","GENERIC_BURNING_TIME","GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE","GENERIC_FALL_DAMAGE_MULTIPLIER","GENERIC_FLYING_SPEED","GENERIC_FOLLOW_RANGE","GENERIC_GRAVITY","GENERIC_JUMP_STRENGTH","GENERIC_KNOCKBACK_RESISTANCE","GENERIC_LUCK","GENERIC_MAX_ABSORPTION","GENERIC_MAX_HEALTH","GENERIC_MOVEMENT_EFFICIENCY","GENERIC_MOVEMENT_SPEED","GENERIC_OXYGEN_BONUS","GENERIC_SAFE_FALL_DISTANCE","GENERIC_SCALE","GENERIC_STEP_HEIGHT","GENERIC_WATER_MOVEMENT_EFFICIENCY","HORSE_JUMP_STRENGTH","KNOCKBACK_RESISTANCE","LUCK","MAX_ABSORPTION","MAX_HEALTH","MOVEMENT_SPEED","PLAYER_BLOCK_BREAK_SPEED","PLAYER_BLOCK_INTERACTION_RANGE","PLAYER_ENTITY_INTERACTION_RANGE","PLAYER_MINING_EFFICIENCY","PLAYER_SNEAKING_SPEED","PLAYER_SUBMERGED_MINING_SPEED","PLAYER_SWEEPING_DAMAGE_RATIO","ZOMBIE_SPAWN_REINFORCEMENTS"))
	handleFun("set_variable_remove_item_attribute", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun variableRemoveItemCustomModelData(variable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_remove_item_custom_model_data", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableRemoveItemCustomTag(variable: Any, item: Any, tagName: Any) {
	val funName = "variableRemoveItemCustomTag"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val tagNameARG=textConvert(funName,"tagName",tagName)
	handleFun("set_variable_remove_item_custom_tag", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("tag_name",tagNameARG.parse())))
}
fun variableRemoveItemLoreLine(variable: Any, item: Any, line: Any) {
	val funName = "variableRemoveItemLoreLine"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val lineARG=numberConvert(funName,"line",line)
	handleFun("set_variable_remove_item_lore_line", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("line",lineARG.parse())))
}
fun variableRemoveItemPotionEffects(variable: Any, effects: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val effectsARG=typeCheck<JPotion>(effects)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_remove_item_potion_effects", listOf(funValue("variable",variableARG.parse()),funValue("effects",effectsARG.parse()),funValue("item",itemARG.parse())))
}
fun variableRemoveListDuplicates(variable: Any, list: Any) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	handleFun("set_variable_remove_list_duplicates", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableRemoveListValue(variable: Any, list: Any, value: Any, removeMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val valueARG=typeCheck<JAny>(value)
	val funName = "variableRemoveListValue"
	enumCheck(funName,"removeMode",removeMode,listOf("ALL","FIRST","LAST"))
	handleFun("set_variable_remove_list_value", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("value",valueARG.parse())))
}
fun variableRemoveListValueAtIndex(removedValue: Any, variable: Any, list: Any, index: Any) {
	val funName = "variableRemoveListValueAtIndex"
	val removedValueARG=typeCheck<Var>(removedValue)
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val indexARG=numberConvert(funName,"index",index)
	handleFun("set_variable_remove_list_value_at_index", listOf(funValue("removed_value",removedValueARG.parse()),funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("index",indexARG.parse())))
}
fun variableRemoveMapEntry(removedValue: Any, variable: Any, map: Any, values: Any, key: Any) {
	val removedValueARG=typeCheck<Var>(removedValue)
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val valuesARG=typeCheck<JAny>(values)
	val keyARG=typeCheck<JAny>(key)
	handleFun("set_variable_remove_map_entry", listOf(funValue("removed_value",removedValueARG.parse()),funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("values",valuesARG.parse()),funValue("key",keyARG.parse())))
}
fun variableRemoveText(variable: Any, remove: Any, text: Any, regex: Any? = null) {
	val funName = "variableRemoveText"
	val variableARG=typeCheck<Var>(variable)
	val removeARG=textConvertPlural(funName,"remove",remove)
	val textARG=textConvert(funName,"text",text)
	enumCheck(funName,"regex",regex,listOf("FALSE","TRUE"))
	handleFun("set_variable_remove_text", listOf(funValue("variable",variableARG.parse()),funValue("remove",removeARG.parse()),funValue("text",textARG.parse())))
}
fun variableRepeatText(variable: Any, text: Any, repeat: Any) {
	val funName = "variableRepeatText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val repeatARG=numberConvert(funName,"repeat",repeat)
	handleFun("set_variable_repeat_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("repeat",repeatARG.parse())))
}
fun variableReplaceText(variable: Any, text: Any, replace: Any, replacement: Any, first: Any? = null, ignoreCase: Any? = null) {
	val funName = "variableReplaceText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val replaceARG=textConvert(funName,"replace",replace)
	val replacementARG=textConvert(funName,"replacement",replacement)
	enumCheck(funName,"first",first,listOf("ANY","FIRST"))
	enumCheck(funName,"ignoreCase",ignoreCase,listOf("FALSE","TRUE"))
	handleFun("set_variable_replace_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("replace",replaceARG.parse()),funValue("replacement",replacementARG.parse())))
}
fun variableReverseList(variable: Any, list: Any) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	handleFun("set_variable_reverse_list", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableRoot(variable: Any, base: Any, root: Any) {
	val funName = "variableRoot"
	val variableARG=typeCheck<Var>(variable)
	val baseARG=numberConvert(funName,"base",base)
	val rootARG=numberConvert(funName,"root",root)
	handleFun("set_variable_root", listOf(funValue("variable",variableARG.parse()),funValue("base",baseARG.parse()),funValue("root",rootARG.parse())))
}
fun variableRotateVectorAroundAxis(variable: Any, vector: Any, angle: Any, axis: Any? = null, angleUnits: Any? = null) {
	val funName = "variableRotateVectorAroundAxis"
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val angleARG=numberConvert(funName,"angle",angle)
	enumCheck(funName,"axis",axis,listOf("X","Y","Z"))
	enumCheck(funName,"angleUnits",angleUnits,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_rotate_vector_around_axis", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse()),funValue("angle",angleARG.parse())))
}
fun variableRotateVectorAroundVector(variable: Any, rotatingVector: Any, axisVector: Any, angle: Any, angleUnits: Any? = null) {
	val funName = "variableRotateVectorAroundVector"
	val variableARG=typeCheck<Var>(variable)
	val rotatingVectorARG=typeCheck<JVector>(rotatingVector)
	val axisVectorARG=typeCheck<JVector>(axisVector)
	val angleARG=numberConvert(funName,"angle",angle)
	enumCheck(funName,"angleUnits",angleUnits,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_rotate_vector_around_vector", listOf(funValue("variable",variableARG.parse()),funValue("rotating_vector",rotatingVectorARG.parse()),funValue("axis_vector",axisVectorARG.parse()),funValue("angle",angleARG.parse())))
}
fun variableRound(variable: Any, number: Any, precision: Any, roundType: Any? = null) {
	val funName = "variableRound"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	val precisionARG=numberConvert(funName,"precision",precision)
	enumCheck(funName,"roundType",roundType,listOf("CEIL","FLOOR","ROUND"))
	handleFun("set_variable_round", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse()),funValue("precision",precisionARG.parse())))
}
fun variableSetAllCoordinates(variable: Any, x: Any, y: Any, z: Any, yaw: Any, pitch: Any) {
	val funName = "variableSetAllCoordinates"
	val variableARG=typeCheck<Var>(variable)
	val xARG=numberConvert(funName,"x",x)
	val yARG=numberConvert(funName,"y",y)
	val zARG=numberConvert(funName,"z",z)
	val yawARG=numberConvert(funName,"yaw",yaw)
	val pitchARG=numberConvert(funName,"pitch",pitch)
	handleFun("set_variable_set_all_coordinates", listOf(funValue("variable",variableARG.parse()),funValue("x",xARG.parse()),funValue("y",yARG.parse()),funValue("z",zARG.parse()),funValue("yaw",yawARG.parse()),funValue("pitch",pitchARG.parse())))
}
fun variableSetArmorTrim(variable: Any, armor: Any, material: Any, pattern: Any) {
	val variableARG=typeCheck<Var>(variable)
	val armorARG=typeCheck<JItem>(armor)
	val materialARG=typeCheck<JItem>(material)
	val patternARG=typeCheck<JItem>(pattern)
	handleFun("set_variable_set_armor_trim", listOf(funValue("variable",variableARG.parse()),funValue("armor",armorARG.parse()),funValue("material",materialARG.parse()),funValue("pattern",patternARG.parse())))
}
fun variableSetBookPage(variable: Any, book: Any, text: Any, page: Any, mode: Any? = null) {
	val funName = "variableSetBookPage"
	val variableARG=typeCheck<Var>(variable)
	val bookARG=typeCheck<JItem>(book)
	val textARG=textConvert(funName,"text",text)
	val pageARG=numberConvert(funName,"page",page)
	enumCheck(funName,"mode",mode,listOf("APPEND","MERGE"))
	handleFun("set_variable_set_book_page", listOf(funValue("variable",variableARG.parse()),funValue("book",bookARG.parse()),funValue("text",textARG.parse()),funValue("page",pageARG.parse())))
}
fun variableSetBookPages(variable: Any, book: Any, text: Any) {
	val funName = "variableSetBookPages"
	val variableARG=typeCheck<Var>(variable)
	val bookARG=typeCheck<JItem>(book)
	val textARG=textConvertPlural(funName,"text",text)
	handleFun("set_variable_set_book_pages", listOf(funValue("variable",variableARG.parse()),funValue("book",bookARG.parse()),funValue("text",textARG.parse())))
}
fun variableSetBundleItems(variable: Any, items: Any, bundle: Any, settingMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val itemsARG=typeCheck<JItem>(items)
	val bundleARG=typeCheck<JItem>(bundle)
	val funName = "variableSetBundleItems"
	enumCheck(funName,"settingMode",settingMode,listOf("ADD","REMOVE","SET"))
	handleFun("set_variable_set_bundle_items", listOf(funValue("variable",variableARG.parse()),funValue("items",itemsARG.parse()),funValue("bundle",bundleARG.parse())))
}
fun variableSetCompassLodestone(variable: Any, item: Any, location: Any, tracked: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val locationARG=typeCheck<JLocation>(location)
	val funName = "variableSetCompassLodestone"
	enumCheck(funName,"tracked",tracked,listOf("FALSE","TRUE"))
	handleFun("set_variable_set_compass_lodestone", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("location",locationARG.parse())))
}
fun variableSetComponentChildren(variable: Any, component: Any, children: Any) {
	val funName = "variableSetComponentChildren"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val childrenARG=textConvertPlural(funName,"children",children)
	handleFun("set_variable_set_component_children", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("children",childrenARG.parse())))
}
fun variableSetComponentClick(variable: Any, component: Any, value: Any, clickAction: Any? = null) {
	val funName = "variableSetComponentClick"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val valueARG=textConvert(funName,"value",value)
	enumCheck(funName,"clickAction",clickAction,listOf("CHANGE_PAGE","COPY_TO_CLIPBOARD","COPY_TO_CLIPBORD","OPEN_URL","SUGGEST_COMMAND"))
	handleFun("set_variable_set_component_click", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetComponentDecorations(variable: Any, component: Any, bold: Any? = null, italic: Any? = null, underlined: Any? = null, strikethrough: Any? = null, obfuscated: Any? = null) {
	val funName = "variableSetComponentDecorations"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	enumCheck(funName,"bold",bold,listOf("FALSE","NOT_SET","TRUE"))
	enumCheck(funName,"italic",italic,listOf("FALSE","NOT_SET","TRUE"))
	enumCheck(funName,"underlined",underlined,listOf("FALSE","NOT_SET","TRUE"))
	enumCheck(funName,"strikethrough",strikethrough,listOf("FALSE","NOT_SET","TRUE"))
	enumCheck(funName,"obfuscated",obfuscated,listOf("FALSE","NOT_SET","TRUE"))
	handleFun("set_variable_set_component_decorations", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse())))
}
fun variableSetComponentEntityHover(variable: Any, component: Any, nameOrUuid: Any) {
	val funName = "variableSetComponentEntityHover"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val nameOrUuidARG=textConvert(funName,"nameOrUuid",nameOrUuid)
	handleFun("set_variable_set_component_entity_hover", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("name_or_uuid",nameOrUuidARG.parse())))
}
fun variableSetComponentFont(variable: Any, component: Any, namespace: Any, value: Any) {
	val funName = "variableSetComponentFont"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val namespaceARG=textConvert(funName,"namespace",namespace)
	val valueARG=textConvert(funName,"value",value)
	handleFun("set_variable_set_component_font", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("namespace",namespaceARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetComponentHexColor(variable: Any, component: Any, color: Any) {
	val funName = "variableSetComponentHexColor"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val colorARG=textConvert(funName,"color",color)
	handleFun("set_variable_set_component_hex_color", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("color",colorARG.parse())))
}
fun variableSetComponentHover(variable: Any, component: Any, hover: Any) {
	val funName = "variableSetComponentHover"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val hoverARG=textConvert(funName,"hover",hover)
	handleFun("set_variable_set_component_hover", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("hover",hoverARG.parse())))
}
fun variableSetComponentInsertion(variable: Any, component: Any, insertion: Any) {
	val funName = "variableSetComponentInsertion"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val insertionARG=textConvert(funName,"insertion",insertion)
	handleFun("set_variable_set_component_insertion", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("insertion",insertionARG.parse())))
}
fun variableSetComponentItemHover(variable: Any, component: Any, hover: Any) {
	val funName = "variableSetComponentItemHover"
	val variableARG=typeCheck<Var>(variable)
	val componentARG=textConvert(funName,"component",component)
	val hoverARG=typeCheck<JItem>(hover)
	handleFun("set_variable_set_component_item_hover", listOf(funValue("variable",variableARG.parse()),funValue("component",componentARG.parse()),funValue("hover",hoverARG.parse())))
}
fun variableSetCoordinate(variable: Any, location: Any, coordinate: Any, type: Any? = null) {
	val funName = "variableSetCoordinate"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val coordinateARG=numberConvert(funName,"coordinate",coordinate)
	enumCheck(funName,"type",type,listOf("PITCH","X","Y","YAW","Z"))
	handleFun("set_variable_set_coordinate", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("coordinate",coordinateARG.parse())))
}
fun variableSetItemAmount(variable: Any, item: Any, amount: Any) {
	val funName = "variableSetItemAmount"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("set_variable_set_item_amount", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("amount",amountARG.parse())))
}
fun variableSetItemAttribute(variable: Any, item: Any, amount: Any, name: Any, attribute: Any? = null, slot: Any? = null, operation: Any? = null) {
	val funName = "variableSetItemAttribute"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val amountARG=numberConvert(funName,"amount",amount)
	val nameARG=textConvert(funName,"name",name)
	enumCheck(funName,"attribute",attribute,listOf("ARMOR","ARMOR_TOUGHNESS","ATTACK_DAMAGE","ATTACK_KNOCKBACK","ATTACK_SPEED","FLYING_SPEED","FOLLOW_RANGE","GENERIC_ARMOR","GENERIC_ARMOR_TOUGHNESS","GENERIC_ATTACK_DAMAGE","GENERIC_ATTACK_KNOCKBACK","GENERIC_ATTACK_SPEED","GENERIC_BURNING_TIME","GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE","GENERIC_FALL_DAMAGE_MULTIPLIER","GENERIC_FLYING_SPEED","GENERIC_FOLLOW_RANGE","GENERIC_GRAVITY","GENERIC_JUMP_STRENGTH","GENERIC_KNOCKBACK_RESISTANCE","GENERIC_LUCK","GENERIC_MAX_ABSORPTION","GENERIC_MAX_HEALTH","GENERIC_MOVEMENT_EFFICIENCY","GENERIC_MOVEMENT_SPEED","GENERIC_OXYGEN_BONUS","GENERIC_SAFE_FALL_DISTANCE","GENERIC_SCALE","GENERIC_STEP_HEIGHT","GENERIC_WATER_MOVEMENT_EFFICIENCY","HORSE_JUMP_STRENGTH","KNOCKBACK_RESISTANCE","LUCK","MAX_ABSORPTION","MAX_HEALTH","MOVEMENT_SPEED","PLAYER_BLOCK_BREAK_SPEED","PLAYER_BLOCK_INTERACTION_RANGE","PLAYER_ENTITY_INTERACTION_RANGE","PLAYER_MINING_EFFICIENCY","PLAYER_SNEAKING_SPEED","PLAYER_SUBMERGED_MINING_SPEED","PLAYER_SWEEPING_DAMAGE_RATIO","ZOMBIE_SPAWN_REINFORCEMENTS"))
	enumCheck(funName,"slot",slot,listOf("ALL","ARMOR","BODY","BOOTS","CHEST","HAND","HEAD","LEGGINGS","MAIN_HAND","OFF_HAND"))
	enumCheck(funName,"operation",operation,listOf("ADD_NUMBER","ADD_SCALAR","MULTIPLY_SCALAR_1"))
	handleFun("set_variable_set_item_attribute", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("amount",amountARG.parse()),funValue("name",nameARG.parse())))
}
fun variableSetItemColor(variable: Any, item: Any, color: Any) {
	val funName = "variableSetItemColor"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val colorARG=textConvert(funName,"color",color)
	handleFun("set_variable_set_item_color", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("color",colorARG.parse())))
}
fun variableSetItemComponent(variable: Any, item: Any, component: Any, value: Any) {
	val funName = "variableSetItemComponent"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val componentARG=textConvert(funName,"component",component)
	val valueARG=typeCheck<JAny>(value)
	handleFun("set_variable_set_item_component", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("component",componentARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetItemCustomModelData(variable: Any, item: Any, model: Any) {
	val funName = "variableSetItemCustomModelData"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val modelARG=numberConvert(funName,"model",model)
	handleFun("set_variable_set_item_custom_model_data", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("model",modelARG.parse())))
}
fun variableSetItemCustomTag(variable: Any, item: Any, tagName: Any, tagValue: Any) {
	val funName = "variableSetItemCustomTag"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val tagNameARG=textConvert(funName,"tagName",tagName)
	val tagValueARG=textConvert(funName,"tagValue",tagValue)
	handleFun("set_variable_set_item_custom_tag", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("tag_name",tagNameARG.parse()),funValue("tag_value",tagValueARG.parse())))
}
fun variableSetItemDestroyableBlocks(variable: Any, destroyable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val destroyableARG=typeCheck<JItem>(destroyable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_set_item_destroyable_blocks", listOf(funValue("variable",variableARG.parse()),funValue("destroyable",destroyableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableSetItemDurability(variable: Any, item: Any, durability: Any, durabilityType: Any? = null) {
	val funName = "variableSetItemDurability"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val durabilityARG=numberConvert(funName,"durability",durability)
	enumCheck(funName,"durabilityType",durabilityType,listOf("DAMAGE","DAMAGE_PERCENTAGE","MAXIMUM","REMAINING","REMAINING_PERCENTAGE"))
	handleFun("set_variable_set_item_durability", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("durability",durabilityARG.parse())))
}
fun variableSetItemEnchantments(variable: Any, item: Any, enchantments: Any) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val enchantmentsARG=typeCheck<JMap>(enchantments)
	handleFun("set_variable_set_item_enchantments", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("enchantments",enchantmentsARG.parse())))
}
fun variableSetItemLore(variable: Any, lore: Any, item: Any) {
	val funName = "variableSetItemLore"
	val variableARG=typeCheck<Var>(variable)
	val loreARG=textConvertPlural(funName,"lore",lore)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_set_item_lore", listOf(funValue("variable",variableARG.parse()),funValue("lore",loreARG.parse()),funValue("item",itemARG.parse())))
}
fun variableSetItemLoreLine(variable: Any, item: Any, text: Any, line: Any, mode: Any? = null) {
	val funName = "variableSetItemLoreLine"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val textARG=textConvert(funName,"text",text)
	val lineARG=numberConvert(funName,"line",line)
	enumCheck(funName,"mode",mode,listOf("APPEND","MERGE"))
	handleFun("set_variable_set_item_lore_line", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("text",textARG.parse()),funValue("line",lineARG.parse())))
}
fun variableSetItemMaxStackSize(variable: Any, item: Any, size: Any) {
	val funName = "variableSetItemMaxStackSize"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val sizeARG=numberConvert(funName,"size",size)
	handleFun("set_variable_set_item_max_stack_size", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("size",sizeARG.parse())))
}
fun variableSetItemName(variable: Any, item: Any, text: Any) {
	val funName = "variableSetItemName"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val textARG=textConvert(funName,"text",text)
	handleFun("set_variable_set_item_name", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("text",textARG.parse())))
}
fun variableSetItemPlaceableBlocks(variable: Any, placeable: Any, item: Any) {
	val variableARG=typeCheck<Var>(variable)
	val placeableARG=typeCheck<JItem>(placeable)
	val itemARG=typeCheck<JItem>(item)
	handleFun("set_variable_set_item_placeable_blocks", listOf(funValue("variable",variableARG.parse()),funValue("placeable",placeableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableSetItemType(variable: Any, item: Any, type: Any) {
	val funName = "variableSetItemType"
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val typeARG=textConvert(funName,"type",type)
	handleFun("set_variable_set_item_type", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse()),funValue("type",typeARG.parse())))
}
fun variableSetItemUnbreakable(variable: Any, item: Any, unbreakable: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val funName = "variableSetItemUnbreakable"
	enumCheck(funName,"unbreakable",unbreakable,listOf("FALSE","TRUE"))
	handleFun("set_variable_set_item_unbreakable", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableSetItemVisibilityFlags(variable: Any, item: Any, hideDye: Any? = null, hideEnchantments: Any? = null, hideAttributes: Any? = null, hideUnbreakable: Any? = null, hidePlaceOn: Any? = null, hideDestroys: Any? = null, hidePotionEffects: Any? = null, hideArmorTrim: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val itemARG=typeCheck<JItem>(item)
	val funName = "variableSetItemVisibilityFlags"
	enumCheck(funName,"hideDye",hideDye,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hideEnchantments",hideEnchantments,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hideAttributes",hideAttributes,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hideUnbreakable",hideUnbreakable,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hidePlaceOn",hidePlaceOn,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hideDestroys",hideDestroys,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hidePotionEffects",hidePotionEffects,listOf("NO_CHANGE","OFF","ON"))
	enumCheck(funName,"hideArmorTrim",hideArmorTrim,listOf("NO_CHANGE","OFF","ON"))
	handleFun("set_variable_set_item_visibility_flags", listOf(funValue("variable",variableARG.parse()),funValue("item",itemARG.parse())))
}
fun variableSetListValue(variable: Any, list: Any, number: Any, value: Any) {
	val funName = "variableSetListValue"
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val numberARG=numberConvert(funName,"number",number)
	val valueARG=typeCheck<JAny>(value)
	handleFun("set_variable_set_list_value", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("number",numberARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetLocationDirection(variable: Any, location: Any, vector: Any) {
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val vectorARG=typeCheck<JVector>(vector)
	handleFun("set_variable_set_location_direction", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("vector",vectorARG.parse())))
}
fun variableSetMapValue(variable: Any, map: Any, key: Any, value: Any) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val keyARG=typeCheck<JAny>(key)
	val valueARG=typeCheck<JAny>(value)
	handleFun("set_variable_set_map_value", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("key",keyARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetParticleAmount(variable: Any, particle: Any, amount: Any) {
	val funName = "variableSetParticleAmount"
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val amountARG=numberConvert(funName,"amount",amount)
	handleFun("set_variable_set_particle_amount", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("amount",amountARG.parse())))
}
fun variableSetParticleColor(variable: Any, particle: Any, hexColor: Any, colorType: Any? = null) {
	val funName = "variableSetParticleColor"
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val hexColorARG=textConvert(funName,"hexColor",hexColor)
	enumCheck(funName,"colorType",colorType,listOf("COLOR","TO_COLOR"))
	handleFun("set_variable_set_particle_color", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("hex_color",hexColorARG.parse())))
}
fun variableSetParticleMaterial(variable: Any, particle: Any, material: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val materialARG=typeCheck<JItem>(material)
	handleFun("set_variable_set_particle_material", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("material",materialARG.parse())))
}
fun variableSetParticleOffset(variable: Any, particle: Any, offset: Any) {
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val offsetARG=typeCheck<JVector>(offset)
	handleFun("set_variable_set_particle_offset", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("offset",offsetARG.parse())))
}
fun variableSetParticleSize(variable: Any, particle: Any, size: Any) {
	val funName = "variableSetParticleSize"
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val sizeARG=numberConvert(funName,"size",size)
	handleFun("set_variable_set_particle_size", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("size",sizeARG.parse())))
}
fun variableSetParticleSpread(variable: Any, particle: Any, horizontal: Any, vertical: Any) {
	val funName = "variableSetParticleSpread"
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val horizontalARG=numberConvert(funName,"horizontal",horizontal)
	val verticalARG=numberConvert(funName,"vertical",vertical)
	handleFun("set_variable_set_particle_spread", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("horizontal",horizontalARG.parse()),funValue("vertical",verticalARG.parse())))
}
fun variableSetParticleType(variable: Any, particle: Any, type: Any) {
	val funName = "variableSetParticleType"
	val variableARG=typeCheck<Var>(variable)
	val particleARG=typeCheck<JParticle>(particle)
	val typeARG=textConvert(funName,"type",type)
	handleFun("set_variable_set_particle_type", listOf(funValue("variable",variableARG.parse()),funValue("particle",particleARG.parse()),funValue("type",typeARG.parse())))
}
fun variableSetPotionEffectAmplifier(variable: Any, potion: Any, amplifier: Any) {
	val funName = "variableSetPotionEffectAmplifier"
	val variableARG=typeCheck<Var>(variable)
	val potionARG=typeCheck<JPotion>(potion)
	val amplifierARG=numberConvert(funName,"amplifier",amplifier)
	handleFun("set_variable_set_potion_effect_amplifier", listOf(funValue("variable",variableARG.parse()),funValue("potion",potionARG.parse()),funValue("amplifier",amplifierARG.parse())))
}
fun variableSetPotionEffectDuration(variable: Any, potion: Any, duration: Any) {
	val funName = "variableSetPotionEffectDuration"
	val variableARG=typeCheck<Var>(variable)
	val potionARG=typeCheck<JPotion>(potion)
	val durationARG=numberConvert(funName,"duration",duration)
	handleFun("set_variable_set_potion_effect_duration", listOf(funValue("variable",variableARG.parse()),funValue("potion",potionARG.parse()),funValue("duration",durationARG.parse())))
}
fun variableSetPotionEffectType(variable: Any, potion: Any, effectType: Any) {
	val funName = "variableSetPotionEffectType"
	val variableARG=typeCheck<Var>(variable)
	val potionARG=typeCheck<JPotion>(potion)
	val effectTypeARG=textConvert(funName,"effectType",effectType)
	handleFun("set_variable_set_potion_effect_type", listOf(funValue("variable",variableARG.parse()),funValue("potion",potionARG.parse()),funValue("effect_type",effectTypeARG.parse())))
}
fun variableSetSoundPitch(variable: Any, sound: Any, pitch: Any) {
	val funName = "variableSetSoundPitch"
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	val pitchARG=numberConvert(funName,"pitch",pitch)
	handleFun("set_variable_set_sound_pitch", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse()),funValue("pitch",pitchARG.parse())))
}
fun variableSetSoundSource(variable: Any, sound: Any, source: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	val funName = "variableSetSoundSource"
	enumCheck(funName,"source",source,listOf("AMBIENT","BLOCK","HOSTILE","MASTER","MUSIC","NEUTRAL","PLAYER","RECORD","VOICE","WEATHER"))
	handleFun("set_variable_set_sound_source", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse())))
}
fun variableSetSoundType(variable: Any, sound: Any, namespace: Any, value: Any) {
	val funName = "variableSetSoundType"
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	val namespaceARG=textConvert(funName,"namespace",namespace)
	val valueARG=textConvert(funName,"value",value)
	handleFun("set_variable_set_sound_type", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse()),funValue("namespace",namespaceARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetSoundVariation(variable: Any, sound: Any, variation: Any) {
	val funName = "variableSetSoundVariation"
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	val variationARG=textConvert(funName,"variation",variation)
	handleFun("set_variable_set_sound_variation", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse()),funValue("variation",variationARG.parse())))
}
fun variableSetSoundVolumeAction(variable: Any, sound: Any, volume: Any) {
	val funName = "variableSetSoundVolumeAction"
	val variableARG=typeCheck<Var>(variable)
	val soundARG=typeCheck<JSound>(sound)
	val volumeARG=numberConvert(funName,"volume",volume)
	handleFun("set_variable_set_sound_volume_action", listOf(funValue("variable",variableARG.parse()),funValue("sound",soundARG.parse()),funValue("volume",volumeARG.parse())))
}
fun variableSetTemplateCode(variable: Any, template: Any, code: Any) {
	val variableARG=typeCheck<Var>(variable)
	val templateARG=typeCheck<JItem>(template)
	val codeARG=typeCheck<JAny>(code)
	handleFun("set_variable_set_template_code", listOf(funValue("variable",variableARG.parse()),funValue("template",templateARG.parse()),funValue("code",codeARG.parse())))
}
fun variableSetTextureToMap(variable: Any, map: Any, url: Any) {
	val funName = "variableSetTextureToMap"
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JItem>(map)
	val urlARG=textConvert(funName,"url",url)
	handleFun("set_variable_set_texture_to_map", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse()),funValue("url",urlARG.parse())))
}
fun variableSetVectorComponent(variable: Any, vector: Any, value: Any, vectorComponent: Any? = null) {
	val funName = "variableSetVectorComponent"
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val valueARG=numberConvert(funName,"value",value)
	enumCheck(funName,"vectorComponent",vectorComponent,listOf("X","Y","Z"))
	handleFun("set_variable_set_vector_component", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetVectorLength(variable: Any, vector: Any, length: Any) {
	val funName = "variableSetVectorLength"
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	val lengthARG=numberConvert(funName,"length",length)
	handleFun("set_variable_set_vector_length", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse()),funValue("length",lengthARG.parse())))
}
fun variableShiftAllCoordinates(variable: Any, location: Any, x: Any, y: Any, z: Any, yaw: Any, pitch: Any) {
	val funName = "variableShiftAllCoordinates"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val xARG=numberConvert(funName,"x",x)
	val yARG=numberConvert(funName,"y",y)
	val zARG=numberConvert(funName,"z",z)
	val yawARG=numberConvert(funName,"yaw",yaw)
	val pitchARG=numberConvert(funName,"pitch",pitch)
	handleFun("set_variable_shift_all_coordinates", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("x",xARG.parse()),funValue("y",yARG.parse()),funValue("z",zARG.parse()),funValue("yaw",yawARG.parse()),funValue("pitch",pitchARG.parse())))
}
fun variableShiftCoordinate(variable: Any, location: Any, distance: Any, type: Any? = null) {
	val funName = "variableShiftCoordinate"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val distanceARG=numberConvert(funName,"distance",distance)
	enumCheck(funName,"type",type,listOf("PITCH","X","Y","YAW","Z"))
	handleFun("set_variable_shift_coordinate", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("distance",distanceARG.parse())))
}
fun variableShiftLocationInDirection(variable: Any, location: Any, shift: Any, direction: Any? = null) {
	val funName = "variableShiftLocationInDirection"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val shiftARG=numberConvert(funName,"shift",shift)
	enumCheck(funName,"direction",direction,listOf("FORWARD","SIDEWAYS","UPWARD"))
	handleFun("set_variable_shift_location_in_direction", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("shift",shiftARG.parse())))
}
fun variableShiftLocationOnVector(variable: Any, location: Any, vector: Any, length: Any) {
	val funName = "variableShiftLocationOnVector"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val vectorARG=typeCheck<JVector>(vector)
	val lengthARG=numberConvert(funName,"length",length)
	handleFun("set_variable_shift_location_on_vector", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("vector",vectorARG.parse()),funValue("length",lengthARG.parse())))
}
fun variableShiftLocationTowardsLocation(variable: Any, locationFrom: Any, locationTo: Any, distance: Any) {
	val funName = "variableShiftLocationTowardsLocation"
	val variableARG=typeCheck<Var>(variable)
	val locationFromARG=typeCheck<JLocation>(locationFrom)
	val locationToARG=typeCheck<JLocation>(locationTo)
	val distanceARG=numberConvert(funName,"distance",distance)
	handleFun("set_variable_shift_location_towards_location", listOf(funValue("variable",variableARG.parse()),funValue("location_from",locationFromARG.parse()),funValue("location_to",locationToARG.parse()),funValue("distance",distanceARG.parse())))
}
fun variableSimplexNoise3d(variable: Any, location: Any, seed: Any, locFrequency: Any, octaves: Any, frequency: Any, amplitude: Any, rangeMode: Any? = null, normalized: Any? = null) {
	val funName = "variableSimplexNoise3d"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val seedARG=numberConvert(funName,"seed",seed)
	val locFrequencyARG=numberConvert(funName,"locFrequency",locFrequency)
	val octavesARG=numberConvert(funName,"octaves",octaves)
	val frequencyARG=numberConvert(funName,"frequency",frequency)
	val amplitudeARG=numberConvert(funName,"amplitude",amplitude)
	enumCheck(funName,"rangeMode",rangeMode,listOf("FULL_RANGE","ZERO_TO_ONE"))
	enumCheck(funName,"normalized",normalized,listOf("FALSE","TRUE"))
	handleFun("set_variable_simplex_noise_3d", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("seed",seedARG.parse()),funValue("loc_frequency",locFrequencyARG.parse()),funValue("octaves",octavesARG.parse()),funValue("frequency",frequencyARG.parse()),funValue("amplitude",amplitudeARG.parse())))
}
fun variableSine(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val funName = "variableSine"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	enumCheck(funName,"variant",variant,listOf("ARCSINE","HYPERBOLIC_SINE","SINE"))
	enumCheck(funName,"input",input,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_sine", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableSortList(variable: Any, list: Any, sortMode: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val funName = "variableSortList"
	enumCheck(funName,"sortMode",sortMode,listOf("ASCENDING","DESCENDING"))
	handleFun("set_variable_sort_any_list", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse())))
}
fun variableSortMap(variable: Any, map: Any, sortOrder: Any? = null, sortType: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val mapARG=typeCheck<JMap>(map)
	val funName = "variableSortMap"
	enumCheck(funName,"sortOrder",sortOrder,listOf("ASCENDING","DESCENDING"))
	enumCheck(funName,"sortType",sortType,listOf("KEYS","VALUES"))
	handleFun("set_variable_sort_any_map", listOf(funValue("variable",variableARG.parse()),funValue("map",mapARG.parse())))
}
fun variableSplitText(variable: Any, text: Any, delimiter: Any) {
	val funName = "variableSplitText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val delimiterARG=textConvert(funName,"delimiter",delimiter)
	handleFun("set_variable_split_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("delimiter",delimiterARG.parse())))
}
fun variableStripText(variable: Any, text: Any, stripType: Any? = null) {
	val funName = "variableStripText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	enumCheck(funName,"stripType",stripType,listOf("ALL","END","INDENT","START"))
	handleFun("set_variable_strip_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableSubtract(variable: Any, value: Any) {
	val funName = "variableSubtract"
	val variableARG=typeCheck<Var>(variable)
	val valueARG=numberConvertPlural(funName,"value",value)
	handleFun("set_variable_subtract", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSubtractVectors(variable: Any, vectors: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vectorsARG=typeCheck<JVector>(vectors)
	handleFun("set_variable_subtract_vectors", listOf(funValue("variable",variableARG.parse()),funValue("vectors",vectorsARG.parse())))
}
fun variableTangent(variable: Any, number: Any, variant: Any? = null, input: Any? = null) {
	val funName = "variableTangent"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	enumCheck(funName,"variant",variant,listOf("ARCTANGENT","HYPERBOLIC_TANGENT","TANGENT"))
	enumCheck(funName,"input",input,listOf("DEGREES","RADIANS"))
	handleFun("set_variable_tangent", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableSetText(variable: Any, text: Any, merging: Any? = null) {
	val funName = "variableSetText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvertPlural(funName,"text",text)
	enumCheck(funName,"merging",merging,listOf("CONCATENATION","SEPARATE_LINES","SPACES"))
	handleFun("set_variable_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableSetTextCase(variable: Any, text: Any, caseType: Any? = null) {
	val funName = "variableSetTextCase"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	enumCheck(funName,"caseType",caseType,listOf("INVERT","LOWER","PROPER","RANDOM","UPPER"))
	handleFun("set_variable_text_case", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableGetTextLength(variable: Any, text: Any) {
	val funName = "variableGetTextLength"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	handleFun("set_variable_text_length", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse())))
}
fun variableToChar(variable: Any, number: Any) {
	val funName = "variableToChar"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	handleFun("set_variable_to_char", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse())))
}
fun variableToHsb(variable: Any, hue: Any, saturation: Any, brightness: Any) {
	val funName = "variableToHsb"
	val variableARG=typeCheck<Var>(variable)
	val hueARG=numberConvert(funName,"hue",hue)
	val saturationARG=numberConvert(funName,"saturation",saturation)
	val brightnessARG=numberConvert(funName,"brightness",brightness)
	handleFun("set_variable_to_hsb", listOf(funValue("variable",variableARG.parse()),funValue("hue",hueARG.parse()),funValue("saturation",saturationARG.parse()),funValue("brightness",brightnessARG.parse())))
}
fun variableToHsl(variable: Any, hue: Any, saturation: Any, lightness: Any) {
	val funName = "variableToHsl"
	val variableARG=typeCheck<Var>(variable)
	val hueARG=numberConvert(funName,"hue",hue)
	val saturationARG=numberConvert(funName,"saturation",saturation)
	val lightnessARG=numberConvert(funName,"lightness",lightness)
	handleFun("set_variable_to_hsl", listOf(funValue("variable",variableARG.parse()),funValue("hue",hueARG.parse()),funValue("saturation",saturationARG.parse()),funValue("lightness",lightnessARG.parse())))
}
fun variableToJson(variable: Any, value: Any, prettyPrint: Any? = null) {
	val variableARG=typeCheck<Var>(variable)
	val valueARG=typeCheck<JAny>(value)
	val funName = "variableToJson"
	enumCheck(funName,"prettyPrint",prettyPrint,listOf("FALSE","TRUE"))
	handleFun("set_variable_to_json", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableToRgb(variable: Any, red: Any, green: Any, blue: Any) {
	val funName = "variableToRgb"
	val variableARG=typeCheck<Var>(variable)
	val redARG=numberConvert(funName,"red",red)
	val greenARG=numberConvert(funName,"green",green)
	val blueARG=numberConvert(funName,"blue",blue)
	handleFun("set_variable_to_rgb", listOf(funValue("variable",variableARG.parse()),funValue("red",redARG.parse()),funValue("green",greenARG.parse()),funValue("blue",blueARG.parse())))
}
fun variableTrimList(variable: Any, list: Any, start: Any, end: Any) {
	val funName = "variableTrimList"
	val variableARG=typeCheck<Var>(variable)
	val listARG=typeCheck<JArray>(list)
	val startARG=numberConvert(funName,"start",start)
	val endARG=numberConvert(funName,"end",end)
	handleFun("set_variable_trim_list", listOf(funValue("variable",variableARG.parse()),funValue("list",listARG.parse()),funValue("start",startARG.parse()),funValue("end",endARG.parse())))
}
fun variableTrimText(variable: Any, text: Any, start: Any, end: Any) {
	val funName = "variableTrimText"
	val variableARG=typeCheck<Var>(variable)
	val textARG=textConvert(funName,"text",text)
	val startARG=numberConvert(funName,"start",start)
	val endARG=numberConvert(funName,"end",end)
	handleFun("set_variable_trim_text", listOf(funValue("variable",variableARG.parse()),funValue("text",textARG.parse()),funValue("start",startARG.parse()),funValue("end",endARG.parse())))
}
fun variableSetValue(variable: Any, value: Any) {
	val variableARG=typeCheck<Var>(variable)
	val valueARG=typeCheck<JAny>(value)
	handleFun("set_variable_value", listOf(funValue("variable",variableARG.parse()),funValue("value",valueARG.parse())))
}
fun variableSetVector(variable: Any, x: Any, y: Any, z: Any) {
	val funName = "variableSetVector"
	val variableARG=typeCheck<Var>(variable)
	val xARG=numberConvert(funName,"x",x)
	val yARG=numberConvert(funName,"y",y)
	val zARG=numberConvert(funName,"z",z)
	handleFun("set_variable_vector", listOf(funValue("variable",variableARG.parse()),funValue("x",xARG.parse()),funValue("y",yARG.parse()),funValue("z",zARG.parse())))
}
fun variableVectorCrossProduct(variable: Any, vector1: Any, vector2: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vector1ARG=typeCheck<JVector>(vector1)
	val vector2ARG=typeCheck<JVector>(vector2)
	handleFun("set_variable_vector_cross_product", listOf(funValue("variable",variableARG.parse()),funValue("vector_1",vector1ARG.parse()),funValue("vector_2",vector2ARG.parse())))
}
fun variableVectorDotProduct(variable: Any, vector1: Any, vector2: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vector1ARG=typeCheck<JVector>(vector1)
	val vector2ARG=typeCheck<JVector>(vector2)
	handleFun("set_variable_vector_dot_product", listOf(funValue("variable",variableARG.parse()),funValue("vector_1",vector1ARG.parse()),funValue("vector_2",vector2ARG.parse())))
}
fun variableVectorToDirectionName(variable: Any, vector: Any) {
	val variableARG=typeCheck<Var>(variable)
	val vectorARG=typeCheck<JVector>(vector)
	handleFun("set_variable_vector_to_direction_name", listOf(funValue("variable",variableARG.parse()),funValue("vector",vectorARG.parse())))
}
fun variableVoronoiNoise3d(variable: Any, location: Any, seed: Any, frequency: Any, displacement: Any, rangeMode: Any? = null, enableDistance: Any? = null) {
	val funName = "variableVoronoiNoise3d"
	val variableARG=typeCheck<Var>(variable)
	val locationARG=typeCheck<JLocation>(location)
	val seedARG=numberConvert(funName,"seed",seed)
	val frequencyARG=numberConvert(funName,"frequency",frequency)
	val displacementARG=numberConvert(funName,"displacement",displacement)
	enumCheck(funName,"rangeMode",rangeMode,listOf("FULL_RANGE","ZERO_TO_ONE"))
	enumCheck(funName,"enableDistance",enableDistance,listOf("FALSE","TRUE"))
	handleFun("set_variable_voronoi_noise_3d", listOf(funValue("variable",variableARG.parse()),funValue("location",locationARG.parse()),funValue("seed",seedARG.parse()),funValue("frequency",frequencyARG.parse()),funValue("displacement",displacementARG.parse())))
}
fun variableWarp(variable: Any, number: Any, min: Any, max: Any) {
	val funName = "variableWarp"
	val variableARG=typeCheck<Var>(variable)
	val numberARG=numberConvert(funName,"number",number)
	val minARG=numberConvert(funName,"min",min)
	val maxARG=numberConvert(funName,"max",max)
	handleFun("set_variable_warp", listOf(funValue("variable",variableARG.parse()),funValue("number",numberARG.parse()),funValue("min",minARG.parse()),funValue("max",maxARG.parse())))
}
fun codeStartProcess(processName: Any, localVariablesMode: Any? = null, targetMode: Any? = null) {
	val funName = "codeStartProcess"
	val processNameARG=textConvert(funName,"processName",processName)
	enumCheck(funName,"localVariablesMode",localVariablesMode,listOf("COPY","DONT_COPY","SHARE"))
	enumCheck(funName,"targetMode",targetMode,listOf("CURRENT_SELECTION","CURRENT_TARGET","FOR_EACH_IN_SELECTION","NO_TARGET"))
	handleFun("start_process", listOf(funValue("process_name",processNameARG.parse())))
}
