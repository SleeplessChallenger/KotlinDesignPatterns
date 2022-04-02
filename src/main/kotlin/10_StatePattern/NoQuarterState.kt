package `10_StatePattern`

class NoQuarterState(context: Context): State {
    private val currentContext: Context = context

    override fun insertQuarter() {
        println("Inserting a quarter!")
        currentContext.setState(currentContext.getHasQuarterState())
    }

    override fun ejectQuarter() {
        println("You haven't inserted a quarter")
    }

    override fun turnCrank(): Boolean {
        println("You turned, but there's no quarter")
        return false
    }

    override fun dispense() {
        println("You need to pay first")
    }

    override fun refill() {
        // do nothing here
    }
}