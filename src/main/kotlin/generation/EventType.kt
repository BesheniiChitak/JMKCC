// ЭТОТ ФАЙЛ ГЕНЕРИРУЕТСЯ АВТОМАТИЧЕСКИ И НЕ ПРЕДНАЗНАЧЕН ДЛЯ ИЗМЕНЕНИЯ
@file:Suppress("unused", "SpellCheckingInspection", "PackageDirectoryMismatch")
enum class EventType(val cancellable: Boolean) {
	BELL_RING(true),
	BLOCK_BURN(true),
	BLOCK_DAMAGE(true),
	BLOCK_DAMAGE_ABORT(false),
	BLOCK_EXPLODE(true),
	BLOCK_FADE(true),
	BLOCK_FALL(true),
	BLOCK_FERTILIZE(true),
	BLOCK_FLOW(true),
	BLOCK_FORM(true),
	BLOCK_FORM_BY_ENTITY(true),
	BLOCK_GROW(true),
	BLOCK_IGNITE(false),
	BLOCK_PISTON_EXTEND(true),
	BLOCK_PISTON_RETRACT(true),
	BLOCK_SPREAD(true),
	BREW_COMPLETE(true),
	DISPENSER_DISPENSE_ITEM(true),
	DISPENSER_EQUIP_ARMOR(true),
	DISPENSER_SHEAR_SHEEP(true),
	ELDER_GUARDIAN_APPEARS_AT_PLAYER(true),
	ENDERMAN_ATTACK_PLAYER(true),
	ENDERMAN_ESCAPE(true),
	ENTITY_BELL_RING(true),
	ENTITY_DAMAGE_ENTITY(true),
	ENTITY_DAMAGE_PLAYER(true),
	ENTITY_DEATH(true),
	ENTITY_DROP_ITEM(true),
	ENTITY_EXPLODE(true),
	ENTITY_EXPLOSION(true),
	ENTITY_HEAL(true),
	ENTITY_INTERACT(true),
	ENTITY_KILL_ENTITY(true),
	ENTITY_LOAD_CROSSBOW(true),
	ENTITY_PICKUP_ITEM(true),
	ENTITY_REMOVED_FROM_WORLD(false),
	ENTITY_RESURRECT(true),
	ENTITY_SHOT_BOW(true),
	ENTITY_SPAWN(true),
	ENTITY_SPELL_CAST(true),
	ENTITY_TAKE_DAMAGE(true),
	ENTITY_TELEPORT(true),
	ENTITY_TRANSFORM(true),
	FALLING_BLOCK_LAND(true),
	FIREWORK_EXPLODE(true),
	FLUID_LEVEL_CHANGE(true),
	FURNACE_BURN(true),
	FURNACE_SMELT(true),
	FURNACE_START_SMELT(false),
	GOAT_RAM_ENTITY(true),
	HANGING_BREAK(true),
	HOPPER_PICKUP_ITEM(true),
	ITEM_DESPAWN(true),
	ITEM_MERGE(true),
	ITEM_MOVED_INTO_CONTAINER(true),
	LEAVES_DECAY(true),
	MOB_KILL_PLAYER(true),
	NOTE_PLAY(true),
	PIGLIN_BARTER(true),
	PLAYER_ANVIL_RENAME_INPUT(false),
	PLAYER_ARM_SWING(true),
	PLAYER_BREAK_BLOCK(true),
	PLAYER_BREAK_ITEM(false),
	PLAYER_CHANGE_SLOT(true),
	PLAYER_CHAT(true),
	PLAYER_CLICK_INVENTORY(true),
	PLAYER_CLICK_OWN_INVENTORY(true),
	PLAYER_CLOSE_ADVANCEMENTS_MENU(false),
	PLAYER_CLOSE_INVENTORY(false),
	PLAYER_COMMAND(true),
	PLAYER_CONSUME_ITEM(true),
	PLAYER_CRAFT_ITEM(true),
	PLAYER_DAMAGE_ENTITY(true),
	PLAYER_DAMAGE_PLAYER(true),
	PLAYER_DEATH(true),
	PLAYER_DISMOUNT(true),
	PLAYER_DRAG_INVENTORY(true),
	PLAYER_DROP_ITEM(true),
	PLAYER_EDIT_BOOK(true),
	PLAYER_EXHAUSTION(true),
	PLAYER_FAIL_MOVE(false),
	PLAYER_FISH(true),
	PLAYER_FOOD_LEVEL_CHANGE(true),
	PLAYER_FURNACE_EXTRACT(false),
	PLAYER_HEAL(true),
	PLAYER_HORSE_JUMP(true),
	PLAYER_IMBUE_POTION_CLOUD(true),
	PLAYER_INTERACT(true),
	PLAYER_ITEM_MEND(false),
	PLAYER_JOIN(false),
	PLAYER_JUMP(true),
	PLAYER_KILL_MOB(true),
	PLAYER_KILL_PLAYER(true),
	PLAYER_LAUNCH_PROJECTILE(true),
	PLAYER_LEASH_ENTITY(true),
	PLAYER_LEFT_CLICK(true),
	PLAYER_LOAD_CROSSBOW(true),
	PLAYER_LOCATION_CHANGE(true),
	PLAYER_MOVE(true),
	PLAYER_OPEN_ADVANCEMENTS_TAB(true),
	PLAYER_OPEN_INVENTORY(true),
	PLAYER_PICK_ITEM(true),
	PLAYER_PICKUP_EXPERIENCE(true),
	PLAYER_PICKUP_ITEM(true),
	PLAYER_PICKUP_PROJECTILE(true),
	PLAYER_PLACE_BLOCK(true),
	PLAYER_PRE_ATTACK_ENTITY(true),
	PLAYER_PROJECTILE_HIT(true),
	PLAYER_QUERY_BLOCK_INFO(true),
	PLAYER_QUERY_ENTITY_INFO(true),
	PLAYER_QUIT(false),
	PLAYER_REJOIN(true),
	PLAYER_RESPAWN(false),
	PLAYER_RESURRECT(true),
	PLAYER_RIGHT_CLICK(true),
	PLAYER_RIGHT_CLICK_ENTITY(true),
	PLAYER_RIGHT_CLICK_PLAYER(true),
	PLAYER_RIPTIDE(true),
	PLAYER_ROTATE(true),
	PLAYER_SHOT_BOW(true),
	PLAYER_SIGN_CHANGE(true),
	PLAYER_SNEAK(true),
	PLAYER_START_FLIGHT(true),
	PLAYER_START_SPECTATING_ENTITY(true),
	PLAYER_START_SPRINT(true),
	PLAYER_STOP_FLIGHT(true),
	PLAYER_STOP_SPECTATING_ENTITY(true),
	PLAYER_STOP_SPRINT(true),
	PLAYER_STOP_USING_ITEM(false),
	PLAYER_STRUCTURE_GROW(true),
	PLAYER_SWAP_HANDS(true),
	PLAYER_TAKE_DAMAGE(true),
	PLAYER_TAME_ENTITY(true),
	PLAYER_TELEPORT(true),
	PLAYER_UNSNEAK(true),
	PLAYER_VEHICLE_JUMP(false),
	PLAYER_VEHICLE_MOVE(false),
	PORTAL_CREATE(true),
	PROJECTILE_DAMAGE_ENTITY(true),
	PROJECTILE_DAMAGE_PLAYER(true),
	PROJECTILE_HIT(true),
	PROJECTILE_KILL_ENTITY(true),
	PROJECTILE_LAUNCH(true),
	PROJECTIVE_COLLIDE(true),
	REDSTONE_LEVEL_CHANGE(false),
	SCULK_BLOOM(true),
	SHEEP_REGROW_WOOL(true),
	SPONGE_ABSORB(true),
	STRUCTURE_GROW(true),
	TIME_SKIP(true),
	TNT_PRIME(true),
	VEHICLE_TAKE_DAMAGE(true),
	WITCH_THROW_POTION(true),
	WORLD_START(false),
	WORLD_STOP(false),
	WORLD_WEB_EXCEPTION(false),
	WORLD_WEB_RESPONSE(false),
}
