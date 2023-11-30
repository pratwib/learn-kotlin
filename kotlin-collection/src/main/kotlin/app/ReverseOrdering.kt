package app

fun main() {
    val list = mutableListOf("Moch", "Pratama", "Wibawa")

    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()

    println(listReversed)
    println(listAsReversed)

    list.add("Kangguru")

    println(listReversed)
    println(listAsReversed)
}