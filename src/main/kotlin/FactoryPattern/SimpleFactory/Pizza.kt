package FactoryPattern.SimpleFactory

abstract class Pizza {
    abstract val dough: String
    abstract val currentPizza: String
    open val toppings: MutableList<String> = mutableListOf<String>()

    fun showCurrentPizza(): String {
        return this.currentPizza
    }

    fun prepare() {
        println("Preparing ${this.currentPizza}")
    }

    fun bake() {
        println("Baking ${this.currentPizza}")
    }

    fun cut() {
        println("Cutting ${this.currentPizza}")
    }

    fun box() {
        println("Boxing ${this.currentPizza}")
    }
}