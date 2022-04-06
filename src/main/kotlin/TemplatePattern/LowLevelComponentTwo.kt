package TemplatePattern

// in this child we don't use `hook` method
class LowLevelComponentTwo: HighLevelComponent() {
    override fun secondMethod() {
        println("Second component implementation")
    }
}