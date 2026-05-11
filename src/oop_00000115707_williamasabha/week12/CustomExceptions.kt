package oop_00000115707_williamasabha.week12

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")