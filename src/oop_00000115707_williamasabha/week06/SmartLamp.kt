package oop_00000115707_williamasabha.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Perangkat $name ($id) dinyalakan!")
    }

    override fun turnOff() {
        println("Perangkat $name ($id) dimatikan!")
    }
}