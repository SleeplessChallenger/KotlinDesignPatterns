package `4_FactoryPattern`.SimpleFactory

class CheesePizza : Pizza() {
    override val dough: String = "Regular crust"
    override val currentPizza: String = "Cheese pizza"

    init {
        this.toppings.add("Fresh Mozzarella")
    }
}