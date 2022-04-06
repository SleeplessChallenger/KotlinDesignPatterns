package FactoryPattern.Factory

fun main(): Unit {
    val newCreate: abstractCreator = concreteCreator()
    val newProduct: abstractProduct = newCreate.giveType("first variant")

    println("Our new product has the following attrs: ${newProduct.showAttrs()}")
}