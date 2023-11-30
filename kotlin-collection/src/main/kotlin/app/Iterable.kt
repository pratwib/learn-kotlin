package app

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Moch", "Pratama", "Wibawa"))
    displayIterable(setOf("Moch", "Pratama", "Wibawa", "Moch"))
}