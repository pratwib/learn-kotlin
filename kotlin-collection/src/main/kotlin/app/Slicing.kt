package app

fun main() {
    val numbers = (0..100).toList()

    val list1 = numbers.slice(0..50)
    println(list1)

    val list2 =numbers.slice(0..50 step 2)
    println(list2)
}