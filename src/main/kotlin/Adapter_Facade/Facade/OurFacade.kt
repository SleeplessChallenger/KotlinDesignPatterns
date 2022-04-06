package Adapter_Facade.Facade

class OurFacade(amplifier: Amplifier, projector: Projector) {
    val currAmplifier: AmplifierInterface = amplifier
    val currProjector: ProjectInterface = projector

    fun activateEverything() {
        currAmplifier.on()
        currProjector.on()
        currProjector.maxAmpMode()
    }

    fun turnOffEverything() {
        currAmplifier.off()
        currProjector.off()
    }
}