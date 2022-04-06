package ObserverPattern
// In this pattern we use more correct `pulling` technique when
// Observers pull data from Subject, not when Subject `push` it. Why?
// => Every observer may need different set of features from Subject
// hence notification of observers + getters is a better way to go

open class weatherData: Subject {
    private val observers = mutableListOf<Observer>()
    var temperature: Double = 0.0
    var pressure: Double = 0.0
    var humidity: Double = 0.0

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for(currObserver in observers) {
            currObserver.update()
        }
    }

    private fun dataChange() {
        notifyObservers()
    }

    // In Java we'd better use `setters`. This method will be triggered from external source
    open fun putNewData(newTemperature: Double, newPressure: Double, newHumidity: Double) {
        this.temperature = newTemperature
        this.pressure = newPressure
        this.humidity = newHumidity

        dataChange()
    }

    // below there are those getters that I mentioned above
    // PS: don't use `getPressure` etc literally as it'll conflict with Java code

    fun giveTemperature(): Double {
        return this.temperature
    }

    fun givePressure(): Double {
        return this.pressure
    }

    fun giveHumidity(): Double {
        return this.humidity
    }
}