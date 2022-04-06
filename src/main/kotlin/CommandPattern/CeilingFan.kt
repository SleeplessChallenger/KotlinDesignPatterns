package CommandPattern

class CeilingFan(currentFan: String) {
    // resembles Java static
    companion object {
        public fun highRegime(): Int {
            return 5
        }

        public fun mediumRegime(): Int {
            return 4
        }

        public fun lowRegime(): Int {
            return 2
        }

        public fun offRegime(): Int {
            return 0
        }
    }

    val location: String = currentFan
    // by default `speed` is at OffRegime
    private var speed: Int = offRegime()

    fun high() {
        speed = highRegime()
        println("Fan is on Max")
    }

    fun medium() {
        speed = mediumRegime()
        println("Fan is on Medium")
    }

    fun low() {
        speed = lowRegime()
        println("Fan is on Low")
    }

    fun off() {
        speed = offRegime()
        println("fan is Off")
    }

    // don't use `get..` as it conflicts with getters
    fun giveSpeed(): Int {
        return this.speed
    }

}