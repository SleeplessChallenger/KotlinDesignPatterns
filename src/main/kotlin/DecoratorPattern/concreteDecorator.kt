package DecoratorPattern

class Olives(newPizza: Pizza): Topping() {
    override val currentPizza: Pizza = newPizza

    override fun currentDescription(): String {
        return this.currentPizza.currentDescription() + ", Olives"
    }

    override fun cost(): Int {
        return this.currentPizza.cost() + 4
    }
}