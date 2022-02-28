package `4_FactoryPattern`.AbstractFactory.ModifiedVersion

class TokyoPizzaStore: AbstractPizzaStore() {
    lateinit var pizza: AbstractPizza
    lateinit var currentIngredientFactory: GeneralFactory

    override fun createPizza(type: String): AbstractPizza {
        // one of the possible ingredient factories
        currentIngredientFactory = TokyoIngredientFactory()

        if (type == "pepper") {
            val pizza: AbstractPizza = Pepperoni(currentIngredientFactory)
        } else if (type == "meat") {
            val pizza: AbstractPizza = MeatPizza(currentIngredientFactory)
        }

        return pizza
    }
}