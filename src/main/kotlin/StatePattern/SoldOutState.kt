package StatePattern

// state before `refill()`
class SoldOutState(context: Context): State {
    private val currentContext: Context = context

    override fun insertQuarter() {
        println("You can't insert a quarter, the machine is sold out")
    }

    override fun ejectQuarter() {
        println("You can't eject, you haven't inserted a quarter yet")
    }

    override fun turnCrank(): Boolean {
        println("You turned, but there are no gumballs")
        return false
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun refill() {
        currentContext.setState(currentContext.getNoQuarterState())
    }
}