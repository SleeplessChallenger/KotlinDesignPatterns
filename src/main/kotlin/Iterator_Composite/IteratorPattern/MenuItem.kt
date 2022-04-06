package Iterator_Composite.IteratorPattern

// our component which is stored inside Menus objects
open class MenuItem(name: String, price: Int, vegeterian: Boolean) {
    val currentPrice: Int = price
    val currentName: String = name
    val isVegeterian: Boolean = vegeterian

    fun givePrice(): Int {
        return this.currentPrice
    }

    fun giveName(): String {
        return this.currentName
    }

    fun giveVegeterian(): Boolean {
        return this.isVegeterian
    }
}