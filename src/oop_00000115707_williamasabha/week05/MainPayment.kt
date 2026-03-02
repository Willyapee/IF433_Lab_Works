package oop_00000115707_williamasabha.week05

fun main() {
    val eWallet = EWallet("Orang",50000.0)
    val creditCard = CreditCard("Orang", 100000.0)

    val methods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in methods) {
        method.processPayment(75000.0)

        if (method is EWallet) {
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }
    }
}