package app

fun main() {
    val list = listOf("Moch", "Pratama", "Wibawa")

    val pair = list.partition { it.length > 5 }
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(pair.first)
    println(pair.second)
    println(listMatch)
    println(listNotMatch)
}