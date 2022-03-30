package `9_Iterator_Composite`.IteratorPattern

interface Iterator {
    fun hasNext(): Boolean

    fun next(): MenuItem

    fun remove(): Unit
}