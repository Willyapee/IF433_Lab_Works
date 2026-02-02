package oop_00000115707_williamasabha.week01

fun main() {
    val gameTitle = "Valheim"
    val price = 215000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int) = println("Title: $title, final Price: $finalPrice")

