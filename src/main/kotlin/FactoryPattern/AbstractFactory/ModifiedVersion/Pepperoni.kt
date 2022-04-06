package FactoryPattern.AbstractFactory.ModifiedVersion

// We put `name` && `factory` inside constructors
class Pepperoni(ingredientFactory: GeneralFactory): AbstractPizza("Pepperoni", ingredientFactory) {
    lateinit var specialIngridientL:String

    // for example, we have additional field in the method
    override fun prepare() {
        super.prepare()
        specialIngridientL = "special"
    }

}