package oop_00000115707_williamasabha.week07

class NetworkClient private constructor(var url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}