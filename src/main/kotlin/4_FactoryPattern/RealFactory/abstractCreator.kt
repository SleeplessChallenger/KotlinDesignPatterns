package `4_FactoryPattern`.RealFactory

abstract class abstractCreator {
    // our factory method
    abstract fun createObject(type: String): abstractProduct

    protected fun giveType(type: String): abstractProduct {
        val newObject: abstractProduct = this.createObject(type)

        // we don't care which child has been created till it's sub-type of `abstractProduct`
        newObject.firstAction()
        newObject.secondAction()

        return newObject
    }
}