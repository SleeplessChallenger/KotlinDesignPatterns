package CommandPattern

interface Command {
    fun execute()

    fun undo()
}