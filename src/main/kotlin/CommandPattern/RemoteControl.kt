package CommandPattern

class RemoteControl {
    val onCommands: MutableList<Command> = MutableList<Command>(6) { NoCommand() }
    val offCommands: MutableList<Command> = MutableList<Command>(6) { NoCommand() }
    var undoCommand: Command = NoCommand()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command): Unit {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    // invoker
    fun onButtonPush(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    // invoker
    fun offButtonPush(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoCommandPush() {
        undoCommand.undo()
    }
}