package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Moch", "Pratama", "Wibawa"))
    displayMutableCollection(mutableSetOf("Moch", "Pratama", "Wibawa", "Moch"))
    displayMutableCollection(mutableMapOf("Pratama" to "Wibi").entries)
}