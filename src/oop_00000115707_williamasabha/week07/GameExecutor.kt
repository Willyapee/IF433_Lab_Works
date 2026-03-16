package oop_00000115707_williamasabha.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> println("Awas, anda bertemu dengan ${event.monsterName}")
        is BattleState.LootDropped -> {
            val (name, dmg, rarity) = event.item
            println("Dapat Item: $name (dmg: $dmg) [${rarity}]")
        }
        is BattleState.GameOver -> println("Game over! (${event.reason})")
        BattleState.SafeZone -> println("Kamu di zona aman")
    }
}