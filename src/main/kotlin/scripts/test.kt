package scripts

import ArgumentType
import Event
import JMKCCFunction
import JMKCCFunctions
import compile
import playerMessage

//class Fun: JMKCCFunctions() {
//    companion object {
//        @JMKCCFunction(
//            name = "hi",
//            arguments = [ArgumentType.String]
//        )
//        fun myFun(message: Any) {
//            playerMessage("123", "321")
//        }
//
//        @JMKCCFunction("hello")
//        fun hello() {}
//    }
//}
//
fun main() {

    Event(EventType.PLAYER_JOIN) {
        playerMessage("привет!!!!")
    }

    compile("compiled")
}