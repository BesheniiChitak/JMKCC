package scripts

import Event
import EventType
import JString
import compile

import playerMessage

fun main() {

    Event(EventType.WORLD_START) {
        for (a in 1..10) {
            playerMessage("test $a")
        }
        playerMessage(JString("<red>wtf</red> ok", StringType.MINIMESSAGE))
    }

    compile()
}