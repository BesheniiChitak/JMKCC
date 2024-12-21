package scripts

import ArgumentType
import EntitySelector
import Event
import GameValues
import JGameValue
import withSelector
import JMKCCFunction
import JMKCCFunctions
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
            playerMessage("${Value(GameValues.NAME)} зашёл в мир!!!!")
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