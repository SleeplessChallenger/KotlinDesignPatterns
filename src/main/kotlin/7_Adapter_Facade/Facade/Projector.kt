package `7_Adapter_Facade`.Facade

class Projector(name: String, amplifier: Amplifier): ProjectInterface {
    val currName: String = name
    val currAmplifier: Amplifier = amplifier

    override fun on() {
        println("$currName Projector is on")
    }

    override fun off() {
        println("$currName Projector is off")
    }

    override fun maxAmpMode() {
        println("$currAmplifier is on maximum")
    }
}