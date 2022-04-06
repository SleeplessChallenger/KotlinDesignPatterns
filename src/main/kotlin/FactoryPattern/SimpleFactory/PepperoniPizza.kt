package FactoryPattern.SimpleFactory

class PepperoniPizza: Pizza() {
    override val dough: String = "Thin crust"
    override val currentPizza: String = "Pepperoni pizza"

    init {
        this.toppings.add("Sliced Onion")
    }
}