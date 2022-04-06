package StrategyPattern

class Sword: WeaponOfCharacter {
    override fun use() {
        sword()
    }

    private fun sword() {
        println("Using sword!")
    }
}