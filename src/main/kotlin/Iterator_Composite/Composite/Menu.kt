package Iterator_Composite.Composite

// composite
class Menu(name: String, description: String): MenuComponent() {
    val currentName: String = name
    val currentDescription: String = description
    // put super-type
    val menuItems: ArrayList<MenuComponent> = arrayListOf<MenuComponent>()

    override fun getName(): String {
        return this.currentName
    }

    override fun getDescription(): String {
        return this.currentDescription
    }

    override fun getChild(idx: Int): MenuComponent {
        return this.menuItems[idx]
    }

    override fun add(menuComponent: MenuComponent): Unit {
        this.menuItems.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent): Unit {
        this.menuItems.remove(menuComponent)
    }

    override fun print() {
        println("${this.getName()}, ${this.getDescription()}")

        val menuIterator = this.menuItems.iterator()
        while (menuIterator.hasNext()) {
            val currentComponent = menuIterator.next()
            currentComponent.print()
        }
    }
}