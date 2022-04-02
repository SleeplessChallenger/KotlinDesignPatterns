package `10_StatePattern`

// state after `HasQuarterState`
class SoldState(context: Context): State {
    private val currentContext: Context = context

    override fun insertQuarter() {
        println("We have already given you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank(): Boolean {
        println("Turning twice doesn't get you another gumball!")
        return false
    }

    override fun dispense() {
        currentContext.releaseGumBall()
        if (currentContext.getCurrentGumBallCount() > 0) {
            println("Switching to NoQuarterState")
            currentContext.setState(currentContext.getNoQuarterState())
        } else {
            println("No gumballs, switching to SolOutState")
            currentContext.setState(currentContext.getSoldOutState())
        }
    }

    override fun refill() {
        // do nothing
    }
}