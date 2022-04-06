package Iterator_Composite.Composite

abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent) {
        throw NotImplementedError("Method is not implemented")
    }
    open fun remove(menuComponent: MenuComponent) {
        throw NotImplementedError("Method is not implemented")
    }
    open fun getChild(idx: Int): MenuComponent {
        throw NotImplementedError("Method is not implemented")
    }

    open fun getName(): String {
        throw NotImplementedError("Method is not implemented")
    }
    open fun getPrice(): Int {
        throw NotImplementedError("Method is not implemented")
    }
    open fun getDescription(): String {
        throw NotImplementedError("Method is not implemented")
    }

    open fun createIterator(): Iterator<MenuItem> {
        throw NotImplementedError("Method is not implemented")
    }

    open fun print() {
        throw NotImplementedError("Method is not implemented")
    }
}