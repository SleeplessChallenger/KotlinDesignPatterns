package `10_StatePattern`

interface State {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank(): Boolean
    fun dispense()

    fun refill()
}