package `4_FactoryPattern`.Factory

abstract class abstractProduct {
    abstract val attr1: String
    abstract val attr2: Int
    open val container: MutableList<String> = mutableListOf<String>()

    fun firstAction() {
        println("Make first action")
    }

    fun secondAction() {
        println("Now, make second action")
    }

    fun showAttrs(): String {
        return "In our case: ${attr1} && ${attr2}"
    }
}
