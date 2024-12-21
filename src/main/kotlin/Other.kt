var currentSelector: Selector? = null

interface Selector

enum class EntitySelector(val id: String) : Selector {
    CURRENT("current"), DEFAULT("default_entity"), KILLER("killer_entity"),
    PROJECTILE("projectile"), SHOOTER("shooter_entity"), VICTIM("victim_entity"),
    RANDOM("random_entity"), ALL_MOBS("all_mobs"), ALL_ENTITIES("all_entities"),
    LAST("last_entity");
}
enum class PlayerSelector(val id: String) : Selector {
    CURRENT("current"), DEFAULT("default_player"), KILLER("killer_player"),
    ATTACKER("damager_player"), VICTIM("victim_player"), SHOOTER("shooter_player"),
    RANDOM("random_player"), ALL_PLAYERS("all_players");
}
fun withSelector(selector: Selector, call: () -> Unit) {
    currentSelector = selector
    call()
    currentSelector = null
}

enum class GameValueSelector(val id: String) {
    CURRENT("current");
}
enum class VarScope {
    GAME, SAVE, LOCAL
}
enum class StringType {
    LEGACY, MINIMESSAGE, PLAIN, JSON
}