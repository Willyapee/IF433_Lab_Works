package oop_00000115707_williamasabha.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -100
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}