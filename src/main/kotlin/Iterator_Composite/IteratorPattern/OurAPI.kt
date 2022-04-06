package Iterator_Composite.IteratorPattern

class OurAPI {
    // define desired classes here
    init {
        // geenral interface => API doesn't care which implementation was returned
        val firstMenu: Menu = MenuWithArray()
        val secondMenu: Menu = MenuWithArrayList()

        val firstIterator: Iterator = firstMenu.createIterator()
        val secondIterator: Iterator = secondMenu.createIterator()

        printMenu(firstIterator)
        printMenu(secondIterator)
    }

    fun printMenu(currentIterator: Iterator): Unit {
        while (currentIterator.hasNext()) {
            val currentItem: MenuItem = currentIterator.next()
            println(
                "Our current item is ${currentItem.giveName()}, ${currentItem.givePrice()}, ${currentItem.isVegeterian}"
            )
        }
    }

}

fun main() {
    val apiObject = OurAPI()

}