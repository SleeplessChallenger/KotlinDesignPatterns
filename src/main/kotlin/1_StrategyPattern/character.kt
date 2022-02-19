import `1_StrategyPattern`.WeaponOfCharacter

// we don't use setter here as in Java
abstract class OurCharacter() {
    abstract val newWeapon: WeaponOfCharacter

    open fun useWeapon() {
        newWeapon.useWeapon()
    }

    abstract fun fight()
}