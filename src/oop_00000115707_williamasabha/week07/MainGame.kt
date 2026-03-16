package oop_00000115707_williamasabha.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary item drop chance: ${ItemRarity.LEGENDARY.dropChance}")
    val wep1 = Weapon.forgeStarterSword()
    println("Senjata Awal: ${wep1.item.name}")

    val wep2 = wep1.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Kratos"))
    processEvent(BattleState.LootDropped(wep2))
    processEvent(BattleState.GameOver("Skill issue"))
}