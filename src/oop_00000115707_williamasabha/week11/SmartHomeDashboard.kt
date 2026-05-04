package oop_00000115707_williamasabha.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lampu = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}