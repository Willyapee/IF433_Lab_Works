package oop_00000115707_williamasabha.week04

fun main(){
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Lusi", 6000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}