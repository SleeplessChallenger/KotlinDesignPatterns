package CommandPattern

class MacroCommand(currentCommands: MutableList<Command>): Command {
    val allCommands: MutableList<Command> = currentCommands

    override fun execute() {
        for(i in 0 until allCommands.size) {
            allCommands[i].execute()
        }
    }

    override fun undo() {
        for(i in allCommands.size downTo 0) {
            allCommands[i].undo()
        }
    }
}