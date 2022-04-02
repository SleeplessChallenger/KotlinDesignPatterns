package `10_StatePattern`

class WinnerState(context: Context): State {
    private val currentContext: Context = context

    override fun insertQuarter() {
        println("We have already given you a gumball")
    }

    override fun ejectQuarter() {
        println("Please wait, we're already giving you a Gumball")
    }

    override fun turnCrank() {
        println("Turning again doesn't get you another gumball!")
    }

    override fun dispense() {
        currentContext.releaseGumBall()

        if (currentContext.getCurrentGumBallCount() > 0) {
            currentContext.releaseGumBall()
            println("YOU'RE A WINNER! You got two gumballs for your quarter")

            if (currentContext.getCurrentGumBallCount() > 0) {
                currentContext.setState(currentContext.getNoQuarterState())
            } else {
                println("Oops, out of gumballs!")
                currentContext.setState(currentContext.getSoldOutState())
            }
        } else {
            currentContext.setState(currentContext.getSoldOutState())
        }
    }

    override fun refill() {
        // do nothing
    }
}