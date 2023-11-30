package app

fun main() {
    val numbers = (1..10).toList()

    println(numbers.contains(5))
    println(numbers.containsAll(listOf(1, 5, 10)))
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
}