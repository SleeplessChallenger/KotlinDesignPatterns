package Iterator_Composite.IteratorPattern

// don't look at concrete implementation, just soak in the overall concept
class CustomIterator(menuItems: List<MenuItem>): Iterator {
    var currentIndex: Int = 0
    val allItems = menuItems

    override fun hasNext(): Boolean {
        return allItems.size > currentIndex
    }

    override fun next(): MenuItem {
        val currentItem: MenuItem = allItems[currentIndex]
        currentIndex += 1
        return currentItem
    }

    override fun remove(): Unit {
        throw NotImplementedError("This method doesn't have implementation here")
    }
}