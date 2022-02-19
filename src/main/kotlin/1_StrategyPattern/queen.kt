package `1_StrategyPattern`
import OurCharacter

class Queen: OurCharacter() {
    override val newWeapon: WeaponOfCharacter = Sword()

    override fun fight() {
        queenFight()
    }

    fun queenFight() {
        println("Queen is fighting!")
    }

    override fun useWeapon() {
        newWeapon.useWeapon()
    }
}