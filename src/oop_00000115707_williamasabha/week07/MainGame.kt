package oop_00000115707_williamasabha.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary item drop chance: ${ItemRarity.LEGENDARY.dropChance}")
    val wep1 = Weapon.forgeStarterSword()
    println("Senjata Awal: ${wep1.item.name}")


}