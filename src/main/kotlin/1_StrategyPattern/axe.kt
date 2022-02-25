package `1_StrategyPattern`

class Axe: WeaponOfCharacter {
    override fun use() {
        axe()
    }

    private fun axe() {
        println("Using Axe!")
    }

}