package `4_FactoryPattern`.AbstractFactory.ModifiedVersion

fun main() {
    val tokyoStore: AbstractPizzaStore = TokyoPizzaStore()
    val pizza: AbstractPizza = tokyoStore.orderPizza("pepper")

    println("I ate $pizza")
}