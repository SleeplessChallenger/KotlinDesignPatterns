package CommandPattern

class RemoteLoader {
    val ourRemoteControl: RemoteControl = RemoteControl()

    val light: Light = Light("Living light")
    val fan: CeilingFan = CeilingFan("Kitchen fan")

    // create single commands
    val lightOff: LightOffCommand = LightOffCommand(light)
    val lightOn: LightOnCommand = LightOnCommand(light)

    val fanHigh: CeilingFanHighCommand = CeilingFanHighCommand(fan)
    val fanOff: CeilingFanOffCommand = CeilingFanOffCommand(fan)

    // dump a bunch of commands to list
    val multipleCommandsOn: MutableList<Command> = mutableListOf<Command>(lightOn, fanHigh)
    val multipleCommandsOff: MutableList<Command> = mutableListOf<Command>(lightOff, fanOff)

    // attach that bunch to `macroCommand`
    val macroCommandOn: MacroCommand = MacroCommand(multipleCommandsOn)
    val macroCommandOff: MacroCommand = MacroCommand(multipleCommandsOff)

    // set to the slot
    init {
        ourRemoteControl.setCommand(0, lightOn, lightOff)
        ourRemoteControl.setCommand(3, fanHigh, fanOff)
        ourRemoteControl.setCommand(2, macroCommandOn, macroCommandOff)
    }
}

fun main() {
    val currentLoader: RemoteLoader = RemoteLoader()
}