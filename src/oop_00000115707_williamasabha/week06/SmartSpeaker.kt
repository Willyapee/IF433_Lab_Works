package oop_00000115707_williamasabha.week06

class SmartSpeaker (override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn(){
        println("Speaker $name ($id) dinyalakan!")
    }

    override fun turnOff(){
        println("Speaker $name ($id) dimatikan!")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}