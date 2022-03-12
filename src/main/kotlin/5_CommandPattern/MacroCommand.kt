package `5_CommandPattern`

class MacroCommand: Command {
    val allCommands: MutableList<Command> = mutableListOf<Command>()

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