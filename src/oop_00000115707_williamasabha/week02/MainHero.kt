package oop_00000115707_williamasabha.week02

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    print("Hero's Name: ")
    val name = sc.nextLine()
    print("Hero's Base Damage: ")
    val baseDamage = sc.nextInt()
    val myHero = Hero(name, baseDamage)
    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        print("\n1. Attack | 2. Run Away")
        val opt = sc.nextInt()
        if(opt == 1){
            myHero.attack("Enemy")
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Enemy's hp: ${enemyHp}")

            if (enemyHp > 0) {
                val enemyDmg = (10..20).random()
                myHero.takeDamage(enemyDmg)
                println("${myHero.name}'s hp: ${myHero.hp}")
            }
        } else if (opt == 2){
            println("Run!!!")
            break
        } else {
            println("ERROR: Invalid input. Try again!")
        }
    }

    if (enemyHp <= 0) println("You win!") else println("You lose!")
}