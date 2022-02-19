package `1_StrategyPattern`

class Axe: WeaponOfCharacter {
    override fun useWeapon() {
        axe()
    }

    private fun axe() {
        println("Using Axe!")
    }

}