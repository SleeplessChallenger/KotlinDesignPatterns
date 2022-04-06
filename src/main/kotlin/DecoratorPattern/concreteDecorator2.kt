package DecoratorPattern

class Cheese(newPizza: Pizza): Topping() {
    override val currentPizza: Pizza = newPizza

    override fun currentDescription(): String {
        return this.currentPizza.currentDescription() + ", Cheese"
    }

    override fun cost(): Int {
        return this.currentPizza.cost() + 5
    }
}