package Iterator_Composite.Composite

fun main() {
    val pancakeHouseMenu: MenuComponent = Menu("Pancake menu", "New menu with various stuff")
    val chocolateMenu: MenuComponent = Menu("Chocolate menu", "Another menu with different products")

    val chocolateSubMenu: MenuComponent = Menu(
        "Weekend Chocolate submenu","Submenu with food on weekends")

    val allMenus: MenuComponent = Menu("All menus", "It includes all menus")
    allMenus.add(pancakeHouseMenu)
    allMenus.add(chocolateMenu)

    chocolateMenu.add(MenuItem("Shake", 12, "Chocolate shake"))
    chocolateMenu.add(chocolateSubMenu)
    chocolateSubMenu.add(MenuItem("Bar with cherry flavour", 25, "Unique product"))

    pancakeHouseMenu.add(MenuItem("Fresh cake", 21, "Cake with vanilla flavour"))
    pancakeHouseMenu.add(MenuItem("Bar", 43, "Nice bar"))

    val api: OurApi = OurApi(allMenus)
    api.printMenu()
}