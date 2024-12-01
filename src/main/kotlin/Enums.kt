enum class Selector() {

    ALL_PLAYERS;

    override fun toString(): String {
        return this.name.lowercase()
    }
}
enum class VarScope {
    GAME, SAVE, LOCAL
}
enum class StringType {
    LEGACY, MINIMESSAGE, PLAIN, JSON
}