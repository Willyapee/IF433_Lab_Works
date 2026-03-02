package oop_00000115707_williamasabha.week05

abstract class PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double)
}