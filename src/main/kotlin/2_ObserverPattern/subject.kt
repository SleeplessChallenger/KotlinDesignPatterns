package `2_ObserverPattern`

interface Subject {
    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}