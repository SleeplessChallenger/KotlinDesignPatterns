package `10_StatePattern`
import java.lang.System.currentTimeMillis
import java.util.Random

class HasQuarterState(context: Context): State {
    private val currentContext: Context = context
    private val randomWinner = Random(currentTimeMillis())

    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        currentContext.setState(currentContext.getNoQuarterState())
    }

    override fun turnCrank() {
        println("You turned the crank")
        val currWinner = randomWinner.nextInt(10)

        if (currWinner == 0 && currentContext.getCurrentGumBallCount() > 1) {
            currentContext.setState(currentContext.getWinnerState())
        } else {
            currentContext.setState(currentContext.getSoldState())
        }
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun refill() {
        // do nothing
    }
}