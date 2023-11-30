package app

fun main() {
    val list1 = listOf("Moch", "Pratama", "Wibawa")
    val list2 = list1.filter { it.length > 5 }
    println(list2)
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4 = listOf(null, 1, "Pratama", "Wibi", 2, null)
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}