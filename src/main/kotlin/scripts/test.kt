package scripts

import Event
import EventType
import Function
import codeCallFunction
import compile

import playerMessage

fun main() {

    Event(EventType.WORLD_START) {
        this.cancel()
    }

    Function("hi") {
        playerMessage("hi")
    }

    Event(EventType.PLAYER_JOIN) {
        codeCallFunction("hi")
    }

    compile()
}