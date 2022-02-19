package `1_StrategyPattern`

class Sword: WeaponOfCharacter {
    override fun useWeapon() {
        sword()
    }

    private fun sword() {
        println("Using sword!")
    }
}