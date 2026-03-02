package oop_00000115707_williamasabha.week05

class Admin(nama: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doADdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}