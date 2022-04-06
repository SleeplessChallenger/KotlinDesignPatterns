package FactoryPattern.Factory

class anotherConcreteCreator: abstractCreator() {
    override fun createObject(type: String): abstractProduct {
        if (type == "anotherFirstVariant") {
            return anotherConcreteProduct()
        } else {
            return anotherConcreteProduct2()
        }
    }
}