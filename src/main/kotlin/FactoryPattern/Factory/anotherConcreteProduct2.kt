package FactoryPattern.Factory

class anotherConcreteProduct2: abstractProduct() {
    override val attr1: String = "Second another-sub Product"
    override val attr2: Int = 5

    init {
        this.container.add("Super-duper stuff!")
    }
}