package FactoryPattern.AbstractFactory.ModifiedVersion

//  By removing logic of creation from subclasses to super-class we manage to clean up the code
// by decreasing duplicate code
abstract class AbstractPizza(val name: String, ingredientFactory: GeneralFactory) {
    // to be able to use setter
    var definedName: String = name

    lateinit var dough: Dough
    lateinit var cheese: Cheese
    lateinit var toppings: MutableList<String>

    private val currentFactory: GeneralFactory = ingredientFactory

    open fun prepare() {
        dough = currentFactory.createDough()
        cheese = currentFactory.createCheese()
        toppings = currentFactory.createToppings()
    }

    fun cut() {
        println("Cut in 6 slices!")
    }

    fun box() {
        println("Box it in original box!")
    }

    fun putName(currName: String) {
        this.definedName = currName
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