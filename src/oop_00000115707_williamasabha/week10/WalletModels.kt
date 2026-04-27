package oop_00000115707_williamasabha.week10

data class Coin(override val name: String, val balance: Double) : NamedCoin
data class Transaction(val id: String, val amount: Double) : NamedCoin {
    override val name: String = id
}
