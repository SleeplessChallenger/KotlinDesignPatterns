package CommandPattern

import kotlin.properties.Delegates

class CeilingFanHighCommand(fan: CeilingFan): Command {
    private val currentFan: CeilingFan = fan

    var prevSpeed by Delegates.notNull<Int>()

    override fun execute() {
        prevSpeed = currentFan.giveSpeed()
        currentFan.high()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.highRegime() -> {
                currentFan.high()
            }
            CeilingFan.mediumRegime() -> {
                currentFan.medium()
            }
            CeilingFan.lowRegime() -> {
                currentFan.low()
            }
            CeilingFan.offRegime() -> {
                currentFan.off()
            }
        }
    }
}