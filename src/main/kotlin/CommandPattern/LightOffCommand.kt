package CommandPattern

class LightOffCommand(light: Light): Command {
    private val currentLight: Light = light

    override fun execute() {
        currentLight.off()
    }

    override fun undo() {
        currentLight.on()
    }
}