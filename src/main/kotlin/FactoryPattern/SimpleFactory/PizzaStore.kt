package FactoryPattern.SimpleFactory

class PizzaStore {
    val factory = SimplePizzaFactory()
    lateinit var pizza: Pizza

    fun orderPizza(type: String): Pizza {
        pizza = this.factory.createPizza(type)

        // 1. We use methods of parent here by polymorphism 2. As we have `Pizza`, hence we use abstraction
        with(pizza) {
            prepare()
            bake()
            cut()
            box()
        }

        return pizza
    }
}