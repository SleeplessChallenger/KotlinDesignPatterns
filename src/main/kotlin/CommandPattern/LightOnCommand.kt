package CommandPattern

class LightOnCommand(light: Light): Command {
    private val currentLight: Light = light

    override fun execute() {
        // request object calls receiver
        currentLight.on()
    }

    override fun undo() {
        currentLight.off()
    }

}