package `3_DecoratorPattern`

class OurStore {
    private val newOrder: Pizza = FreshPizza()
    private val cheesePizza: Pizza = Cheese(newOrder)
    private val olivesPizza: Pizza = Olives(cheesePizza)

    val ourPizzaDescription: String = olivesPizza.currentDescription()
    val ourPizzaCost: Int = olivesPizza.cost()

}

fun main(): Unit {
    val storeOne = OurStore()

    println("${storeOne.ourPizzaDescription} and ${storeOne.ourPizzaCost}")
}