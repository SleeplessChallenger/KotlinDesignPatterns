package ObserverPattern

// we can't use constructor as there can be multiple Subjects that we observe
class firstCompanyObserver : Observer, Display {
    private val currWeatherData: weatherData = weatherData()

    init {
        currWeatherData.registerObserver(this)
    }

    private var temperature: Double = 0.0
    private var pressure: Double = 0.0

    override fun update() {
        this.temperature = currWeatherData.giveTemperature()
        this.pressure = currWeatherData.givePressure()

        display()
    }

    override fun display() {
        println("Current t. is ${this.temperature} and p. is ${this.pressure}")
    }
}