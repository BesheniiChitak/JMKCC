package scripts

import Event
import EventType
import Function
import compile

import playerMessage

fun main() {

    Event(EventType.WORLD_START) {
        this.cancel()
    }

    Function("hi") {
        playerMessage("hi")
    }

    compile()
}