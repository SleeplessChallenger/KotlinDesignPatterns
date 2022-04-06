package FactoryPattern.AbstractFactory.ModifiedVersion

// We put `name` && `factory` inside constructors
class MeatPizza(ingredientFactory: GeneralFactory): AbstractPizza("MeatPizza", ingredientFactory) {
    lateinit var drink: String

    override fun prepare() {
        super.prepare()
        drink = "Juice"
    }
}