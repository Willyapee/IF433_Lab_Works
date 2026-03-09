package oop_00000115707_williamasabha.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn(){
        println("CCTV $name ($id) dinyalakan!")
        startRecord()
    }

    override fun turnOff(){
        println("CCTV $name ($id) dimatikan!")
    }

    override fun startRecord() {
        println("CCTV $name sedang merekam...")
    }
}