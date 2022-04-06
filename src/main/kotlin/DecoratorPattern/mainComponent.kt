package DecoratorPattern

abstract class Pizza {
    open val description: String = "Base pizza"

    // As Kotlin doesn't have getters, name method without `get...`
    open fun currentDescription(): String {
        return this.description
    }

    abstract fun cost(): Int
}