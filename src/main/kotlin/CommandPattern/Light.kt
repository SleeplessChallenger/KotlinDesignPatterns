package CommandPattern

import kotlin.properties.Delegates

// Receiver which will be used by Command. Also, in the scope of the flow
// it can be considered a Request in Command which knows how to deal with a Receiver
class Light(currentLight: String) {
    val light: String = currentLight

    var level by Delegates.notNull<Int>()

    fun on(): Unit {
        level = 100
        println("Light is turned on!")
    }

    fun off(): Unit {
        level = 0
        println("Light is turned off!")
    }

    fun dim(level: Int) {
        this.level = level
        if (this.level == 0) {
            off()
        } else {
            println("Light is dimmed up to $level")
        }
    }
}