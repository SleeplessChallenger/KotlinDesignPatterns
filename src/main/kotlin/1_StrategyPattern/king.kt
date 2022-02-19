package `1_StrategyPattern`
import OurCharacter

class King: OurCharacter() {
    override val newWeapon: WeaponOfCharacter = Axe()

    override fun fight() {
        kingFight()
    }

    fun kingFight() {
        println("King is fighting!")
    }

    override fun useWeapon() {
        newWeapon.useWeapon()
    }
}