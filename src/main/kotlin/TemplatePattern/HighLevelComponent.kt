package TemplatePattern

// In Kotlin all methods are final, hence we don't need to use `final`
// keyword as in Java
// But we need to add `open` word to allow hook to work
abstract class HighLevelComponent {
    fun mainMethod(): Unit {
        this.firstMethod()
        this.secondMethod()
        this.thirdMethod()
    }

    fun firstMethod() {
        println("Some implementation")
    }

    abstract fun secondMethod(): Unit

    open fun thirdMethod(): Boolean {
        return true
    }
}