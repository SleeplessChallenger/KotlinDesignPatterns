package FactoryPattern.SimpleFactory

class SimplePizzaFactory {
    lateinit var pizza: Pizza

    fun createPizza(type: String): Pizza {

        if (type == "cheese") {
            pizza = CheesePizza()
        } else if (type == "pepperoni") {
            pizza = PepperoniPizza()
        }

        return pizza
    }
}