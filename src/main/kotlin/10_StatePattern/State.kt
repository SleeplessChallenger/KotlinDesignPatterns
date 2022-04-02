package `10_StatePattern`

interface State {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()

    fun refill()
}