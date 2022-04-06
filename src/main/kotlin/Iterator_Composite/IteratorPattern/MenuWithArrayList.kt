package Iterator_Composite.IteratorPattern

// class with Aggregate
class MenuWithArrayList: Menu {
    val menuItems: ArrayList<MenuItem> = arrayListOf<MenuItem>()

    init {
        this.addItems("Super Nice Meat", 12, false)
        this.addItems("Fresh fish", 9, true)
    }

    override fun createIterator(): Iterator {
        return CustomIteratorArrayList(menuItems)
        // return menuItems.iterator()
    }

    fun addItems(name: String, price: Int, vegeterian: Boolean) {
        val currMenuItem: MenuItem = MenuItem(name, price, vegeterian)
        menuItems.add(currMenuItem)
    }

    fun giveAllMenuItems(): ArrayList<MenuItem> {
        return this.menuItems
    }
}