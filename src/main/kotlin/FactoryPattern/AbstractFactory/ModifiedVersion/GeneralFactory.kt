package FactoryPattern.AbstractFactory.ModifiedVersion

// provides interface for a family of products. What's the family? ->
// all the things we need to create a product
interface GeneralFactory {
    fun createDough(): Dough

    fun createCheese(): Cheese

    fun createToppings(): MutableList<String>
}