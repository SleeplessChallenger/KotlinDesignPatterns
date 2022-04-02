package `10_StatePattern`

// class that leverages States (i.e. Our Machine itself)
class Context(gumballCount: Int) {
    private val noQuarterState: State = NoQuarterState(this)
    private val hasQuarterState: State = HasQuarterState(this)
    private val soldState: State = SoldState(this)
    private val soldOutState: State = SoldOutState(this)
    private val winnerState: State = WinnerState(this)

    var currGumballCount: Int = gumballCount
    private var currentState: State = when {
        currGumballCount > 0 -> {
            noQuarterState
        } else -> {
            soldOutState
        }
    }

    // main methods
    fun insertQuarter() {
        currentState.insertQuarter()
    }

    fun ejectQuarter() {
        currentState.ejectQuarter()
    }

    fun turnCrank() {
        val crankWasTurned: Boolean = currentState.turnCrank() // To work this must be triggered on `HasQuarterState`
        if (crankWasTurned) {
            currentState.dispense() // Previous State changes to SoldState which has this method
        } else {
            println("You can't turn crank unless it is a HasQuarterState")
        }
    }

    fun releaseGumBall() {
        println("Machine will release one of the balls")
        if (this.currGumballCount > 0) {
            this.currGumballCount -= 1
        }
    }

    fun refill(count: Int) {
        this.currGumballCount += count
        println("The gumball machine was refilled!")
        currentState.refill() // this will work only when we're in `SoldOut State`
    }

    // getters & setters
    fun getCurrentGumBallCount(): Int {
        return this.currGumballCount
    }

    fun getState(): State {
        return this.currentState
    }

    fun getNoQuarterState(): State {
        return this.noQuarterState
    }

    fun getHasQuarterState(): State {
        return this.hasQuarterState
    }

    fun getSoldState(): State {
        return this.soldState
    }

    fun getSoldOutState(): State {
        return this.soldOutState
    }

    fun getWinnerState(): State {
        return this.winnerState
    }

    fun setState(state: State) {
        this.currentState = state
    }
}