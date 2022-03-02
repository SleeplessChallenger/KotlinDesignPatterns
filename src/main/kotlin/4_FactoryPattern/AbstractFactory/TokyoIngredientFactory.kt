package `4_FactoryPattern`.AbstractFactory

class TokyoIngredientFactory: GeneralFactory {
    override fun createDough(): Dough {
        return ThickCrust()
    }

    override fun createCheese(): Cheese {
        return ParmesanCheese()
    }

    override fun createToppings(): MutableList<String> {
        return mutableListOf("Onions", "Sausages")
    }
}