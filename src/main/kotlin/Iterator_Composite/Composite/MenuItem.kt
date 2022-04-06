package Iterator_Composite.Composite

// leaf
class MenuItem(name: String, price: Int, description: String): MenuComponent() {
    val currentName: String = name
    val currentPrice: Int = price
    val currentDescription = description

    override fun getName(): String {
        return this.currentName
    }

    override fun getPrice(): Int {
        return this.currentPrice
    }

    override fun getDescription(): String {
        return this.currentDescription
    }

    override fun print(): Unit {
        println("${this.getName()}, ${this.getPrice()}, ${this.getDescription()}")
    }
}