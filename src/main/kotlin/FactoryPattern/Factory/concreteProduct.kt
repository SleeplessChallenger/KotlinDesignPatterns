package FactoryPattern.Factory

class concreteProduct1: abstractProduct() {
    override val attr1: String = "First sub-product"
    override val attr2: Int = 9

    init {
        this.container.add("Something cool!")
    }
}