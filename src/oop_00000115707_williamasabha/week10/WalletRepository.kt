package oop_00000115707_williamasabha.week10

interface NamedCoin {
    val name: String
}

class WalletRepository<T> where T : NamedCoin, T : Any{
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> {
        return items.toList()
    }

    fun findByName(name: String): T? {
        return items.find { it.name.equals(name, ignoreCase = true) }
    }
}