package `4_FactoryPattern`.AbstractFactory

abstract class AbstractPizzaStore {
    abstract fun createPizza(type: String): AbstractPizza

    fun orderPizza(type: String): AbstractPizza {
        val pizza: AbstractPizza = createPizza(type)

        pizza.prepare()
        pizza.cut()
        pizza.box()

        return pizza
    }
}