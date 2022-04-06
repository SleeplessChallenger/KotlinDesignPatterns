package TemplatePattern

fun main() {
    val firstComponent: HighLevelComponent = LowLevelComponentOne()
    val secondComponent: HighLevelComponent = LowLevelComponentTwo()

    firstComponent.mainMethod()
    println("Now, second component")
    secondComponent.mainMethod()
}