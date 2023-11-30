package app

fun main() {
    val list = listOf("Moch", "Pratama", "Wibawa")

    val map1 = list.associate { Pair(it,it.length) }
    println(map1)

    val map2 = list.associateWith { it.length }
    println(map2)

    val map3 = list.associateBy { it.length }
    println(map3)
}