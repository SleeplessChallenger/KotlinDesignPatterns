package FactoryPattern.AbstractFactory

class TokyoPizzaStore: AbstractPizzaStore() {
    lateinit var pizza: AbstractPizza
    lateinit var currentIngredientFactory: GeneralFactory

    override fun createPizza(type: String): AbstractPizza {
        // one of the possible ingredient factories
        currentIngredientFactory = TokyoIngredientFactory()

        if (type == "pepper") {
            pizza = Pepperoni(currentIngredientFactory)
            // as `name` is `lateinit`, set it to prevent errors.
            pizza.putName("Pepperoni")
        } else if (type == "meat") {
            pizza = MeatPizza(currentIngredientFactory)
            pizza.putName("Meat Pizza")
        }

        return pizza
    }
}