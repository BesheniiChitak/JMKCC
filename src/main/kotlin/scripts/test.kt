package scripts

import Event
import EventType
import compile

import playerMessage

fun main() {

    Event(EventType.WORLD_START) {
        playerMessage("i love feet")
    }

    compile()
}