package TemplatePattern

// in this child we use `hook` method
class LowLevelComponentOne: HighLevelComponent() {
    override fun secondMethod() {
        println("First component implementation")
    }

    override fun thirdMethod(): Boolean {
        val answer: String = someMethodWhichReturnResult()
        println("Inside implemented hook")
        return answer.startsWith("s")
    }
}

fun someMethodWhichReturnResult(): String {
    return "Super string"
}