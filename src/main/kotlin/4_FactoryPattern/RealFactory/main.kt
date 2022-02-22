package `4_FactoryPattern`.RealFactory

fun main(): Unit {
    val newCreate: abstractCreator = concreteCreator()
    val newProduct: abstractProduct = newCreate.createObject("first variant")

    println("Our new product has the following attrs: ${newProduct.showAttrs()}")
}