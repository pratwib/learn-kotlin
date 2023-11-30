package app

fun main() {
    val array = arrayOf(1, 5, 3, 23, 12, 6, 71, 8)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet= range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()
}