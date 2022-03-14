package `5_CommandPattern`

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
            CeilingFan.Regimes.highRegime() -> {
                currentFan.high()
            }
            CeilingFan.Regimes.mediumRegime() -> {
                currentFan.medium()
            }
            CeilingFan.Regimes.lowRegime() -> {
                currentFan.low()
            }
            CeilingFan.Regimes.offRegime() -> {
                currentFan.off()
            }
        }
    }
}