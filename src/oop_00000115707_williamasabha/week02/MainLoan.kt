package oop_00000115707_williamasabha.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val title = scanner.nextLine()
    print("Peminjam: ")
    val user = scanner.nextLine()
    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) duration = 1

    val loan = Loan(title, user, duration)
    println("Total Denda: Rp ${loan.calculateFine()}")
}