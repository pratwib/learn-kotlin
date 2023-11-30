package app

fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun main() {
    displayCollection(listOf("Moch", "Pratama", "Wibawa"))
    displayCollection(setOf("Moch", "Pratama", "Wibawa", "Moch"))
    displayCollection(mapOf("Pratama" to "Wibi").entries)
//    displayCollection(mapOf("Pratama" to "Wibi")) ERROR, KARENA MAP BUKAN TURUNAN COLLECTION
}