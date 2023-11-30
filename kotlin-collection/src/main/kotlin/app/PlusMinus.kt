package app

fun main() {
    val list1 = listOf("Moch", "Pratama", "Wibawa")
    val list2 = list1 + "Icih"
    println(list2)
    val list3 = list1 + listOf("Dani", "Icih", "Ucok")
    println(list3)
    val list4 = list1 - "Moch"
    println(list4)

    val map1 = mapOf("a" to "Pratama", "b" to "Wibi")
    val map2 = map1 + ("c" to "Moch")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}