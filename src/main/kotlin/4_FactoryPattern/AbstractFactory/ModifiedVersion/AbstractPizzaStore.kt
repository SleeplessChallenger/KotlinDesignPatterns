package `4_FactoryPattern`.AbstractFactory.ModifiedVersion

abstract class AbstractPizzaStore {
    abstract fun createPizza(type: String): AbstractPizza

    fun orderPizza(type: String): AbstractPizza {
        val pizza: AbstractPizza = createPizza(type)

        // in this implementation `prepare()` is defined fully in abstract class
        pizza.prepare()
        pizza.cut()
        pizza.box()

        return pizza
    }
}