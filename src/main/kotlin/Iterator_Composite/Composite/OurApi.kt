package Iterator_Composite.Composite

class OurApi(allItems: MenuComponent) {
    val allCurrentComponents = allItems

    fun printMenu() {
        allCurrentComponents.print()
    }
}