package `4_FactoryPattern`.Factory

class concreteProduct2: abstractProduct() {
    override val attr1: String = "Second sub-product!"
    override val attr2: Int = 30

    init {
        this.container.add("Another juicy stuff!")
    }
}