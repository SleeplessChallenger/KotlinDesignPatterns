package DecoratorPattern

// if we want in runtime to return the description, `currentDescription` will be called
class FreshPizza: Pizza() {
    override val description: String = "Fresh Pizza"

    override fun cost(): Int {
        return 25
    }
}