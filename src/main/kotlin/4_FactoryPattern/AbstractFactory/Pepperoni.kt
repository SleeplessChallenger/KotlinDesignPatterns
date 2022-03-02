package `4_FactoryPattern`.AbstractFactory

// pizza is DECOUPLED from the concrete store. I.e. pizza leverages the factory
// it has been composed with to produce the ingredients
class Pepperoni(ingredientFactory: GeneralFactory): AbstractPizza() {
    val currentFactory: GeneralFactory = ingredientFactory

    override fun prepare() {
        dough = currentFactory.createDough()
        cheese = currentFactory.createCheese()
        toppings = currentFactory.createToppings()
    }

}