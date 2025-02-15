package scripts

import Event
import GameValues
import withSelector
import PlayerSelector
import Value
import compile
import playerMessage

fun main() {

    Event(EventType.PLAYER_JOIN) {

        playerMessage(listOf(
            "здаров браток",
            "как дела?"
        ))

        withSelector(PlayerSelector.ALL_PLAYERS) {
            playerMessage(listOf("${GameValues.NAME} зашёл в мир!!!!", GameValues.NAME))
        }

    }

    compile("compiled")
}

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