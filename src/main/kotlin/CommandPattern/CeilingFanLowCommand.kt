package CommandPattern

import kotlin.properties.Delegates

class CeilingFanLowCommand(fan: CeilingFan): Command {
    private val currentFan: CeilingFan = fan

    var prevSpeed by Delegates.notNull<Int>()

    override fun execute() {
        prevSpeed = currentFan.giveSpeed()
        currentFan.low()
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