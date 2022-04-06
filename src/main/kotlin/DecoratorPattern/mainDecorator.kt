package DecoratorPattern

abstract class Topping: Pizza() {
    abstract val currentPizza: Pizza

    // TODO: compare with Java where we don't use override
    abstract override fun currentDescription(): String
}