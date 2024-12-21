fun debugPrint(message: String) {
    println("\u001b[32m[ДЕБАГ] $message \u001b[0m")
}
fun errorPrint(message: String) {
    println("\u001b[91m[ОШИБКА] $message \u001b[0m")
}
fun warningPrint(message: String) {
    println("\u001b[33m[ПРЕДУПРЕЖДЕНИЕ] $message \u001b[0m")
}