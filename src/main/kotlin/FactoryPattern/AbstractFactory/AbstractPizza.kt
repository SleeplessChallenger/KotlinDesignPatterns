package FactoryPattern.AbstractFactory

abstract class AbstractPizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var cheese: Cheese
    lateinit var toppings: MutableList<String>

    abstract fun prepare()

    fun cut() {
        println("Cut in 6 slices!")
    }

    fun box() {
        println("Box it in original box!")
    }

    fun putName(currName: String) {
        this.name = currName
    }

    fun showName(): String {
        return name
    }

    override fun toString(): String {
        val result = StringBuilder()
        result.append("--${name}--")

        result.append("--${dough}--")

        result.append("--${cheese}--")

        toppings.map {
            result.append("New topping: $it")
        }

        return result.toString()
    }
}