package `5_CommandPattern`

class RemoteLoader {
    fun main() {
        val ourRemoteControl: RemoteControl = RemoteControl()

        val light: Light = Light("Living light")

        // create single commands
        val lightOff: LightOffCommand = LightOffCommand(light)
        val lightOn: LightOnCommand = LightOnCommand(light)

        // dump a bunch of commands to list
        val multipleCommandsOn: MutableList<Command> = mutableListOf<Command>(lightOn)
        val multipleCommandsOff: MutableList<Command> = mutableListOf<Command>(lightOff)

        // attach that bunch to `macroCommand`
        val macroCommandOn: MacroCommand = MacroCommand(multipleCommandsOn)
        val macroCommandOff: MacroCommand = MacroCommand(multipleCommandsOff)

        // set to the slot
        ourRemoteControl.setCommand(0, lightOn, lightOff)
    }
}