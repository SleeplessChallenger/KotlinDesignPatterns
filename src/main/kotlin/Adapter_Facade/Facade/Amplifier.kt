package Adapter_Facade.Facade

class Amplifier(name: String): AmplifierInterface {
    val currName: String = "Amplifier"
    lateinit var currProjector: Projector

    override fun on() {
        println("Amplifier is on")
    }

    override fun off() {
        println("Turn off Amplifier")
    }
}