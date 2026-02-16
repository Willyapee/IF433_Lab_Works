package oop_00000115707_williamasabha.week03

class Weapon(val name: String){
    var dmg: Int = 0
        set(value){
            if(value < 0) {
                println("ERROR: $value is negative !")
            } else if (value > 1000) {
                println("ERROR: $value is greater than 1000 !")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when{
            dmg > 800 -> "Legendary"
            dmg > 500 -> "Epic"
            else -> "Common"
        }
}