package `5_CommandPattern`

class NoCommand: Command {
    override fun execute() { }
    override fun undo() { }
}