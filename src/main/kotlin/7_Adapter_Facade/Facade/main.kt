package `7_Adapter_Facade`.Facade

fun main() {
    val currAmplifier = Amplifier("Home")
    val currProjector = Projector("Living room", currAmplifier)

    val currFacade = OurFacade(currAmplifier, currProjector)

    println(currFacade.activateEverything())
    println(currFacade.turnOffEverything())
}