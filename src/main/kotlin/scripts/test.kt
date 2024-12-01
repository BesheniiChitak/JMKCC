package scripts

import Event
import EventType
import compile

import playerMessage

fun main() {

    Event(EventType.WORLD_START) {
        for (a in 1..10) {
            playerMessage("test $a")
        }
    }

    compile()
}