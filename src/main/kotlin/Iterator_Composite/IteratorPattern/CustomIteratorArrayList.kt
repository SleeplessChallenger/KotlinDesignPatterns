package Iterator_Composite.IteratorPattern

// don't look at concrete implementation, just soak in the overall concept
class CustomIteratorArrayList(menuItems: ArrayList<MenuItem>): Iterator {
    val allItems = menuItems
    var currentIndex = 0

    override fun hasNext(): Boolean {
        return currentIndex != allItems.size
    }

    override fun next(): MenuItem {
        val currentItem: MenuItem = allItems.get(currentIndex)
        currentIndex += 1
        return currentItem
    }

    override fun remove(): Unit {
        throw NotImplementedError("This method doesn't have implementation here")
    }
}