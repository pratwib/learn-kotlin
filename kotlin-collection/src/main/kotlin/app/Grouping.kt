package app

fun main() {
    val list = listOf("a", "b", "c", "a", "c", "b", "d", "aa", "aa", "bb", "Abc")
    val map = list.groupBy { it }
    println(map)
    val map2 = list.groupBy { it.length }
    println(map2)

    val grouping = list.groupingBy { it }
    println(grouping)
}