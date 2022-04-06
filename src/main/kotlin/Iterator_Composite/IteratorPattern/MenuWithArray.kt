package Iterator_Composite.IteratorPattern

// class with Aggregate
class MenuWithArray: Menu {
    val maxSize: Int = 4
    var currentSize: Int = 0
    var menuItems: MutableList<MenuItem> = mutableListOf<MenuItem>()

    init {
        this.addItems("Super Nice Meat", 12, false)
        this.addItems("Fresh fish", 9, true)
    }

    override fun createIterator(): Iterator {
        return CustomIterator(menuItems)
    }

    fun addItems(name: String, price: Int, vegeterian: Boolean) {
        val currentItem: MenuItem = MenuItem(name, price, vegeterian)
        if (currentSize >= maxSize) {
            throw IndexOutOfBoundsException("Your index is out of bound")
        } else {
            menuItems.add(currentItem)
            currentSize += 1
        }
    }

    fun giveAllMenuItems(): List<MenuItem> {
        return this.menuItems
    }
}