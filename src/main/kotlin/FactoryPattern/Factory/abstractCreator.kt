package FactoryPattern.Factory

abstract class abstractCreator {
    // our factory method
    abstract fun createObject(type: String): abstractProduct

    open fun giveType(type: String): abstractProduct {
        val newObject: abstractProduct = this.createObject(type)

        // we don't care which child has been created till it's sub-type of `abstractProduct`
        // I.e. we did Dependency Inversion Principle: abstractFactory && concreteCreator
        // both depend on abstraction -> abstractProduct
        newObject.firstAction()
        newObject.secondAction()

        return newObject
    }
}