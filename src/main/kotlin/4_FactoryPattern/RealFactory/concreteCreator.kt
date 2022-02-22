package `4_FactoryPattern`.RealFactory

class concreteCreator: abstractCreator() {
    override fun createObject(type: String): abstractProduct {
        if (type == "first variant") {
            return concreteProduct1()
        } else { // I use `else` for simplicity: not deal with `?` etc
            return concreteProduct2()
        }
    }
}