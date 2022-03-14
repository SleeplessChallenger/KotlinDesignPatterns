package `4_FactoryPattern`.Factory

class anotherConcreteProduct: abstractProduct() {
    override val attr1: String = "First another-sub Product"
    override val attr2: Int = 9

    init {
        this.container.add("Another cool stuff!")
    }
}