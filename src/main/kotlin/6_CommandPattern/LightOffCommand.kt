package `6_CommandPattern`

class LightOffCommand(light: Light): Command {
    private val currentLight: Light = light

    override fun execute() {
        currentLight.off()
    }

    override fun undo() {
        currentLight.on()
    }
}