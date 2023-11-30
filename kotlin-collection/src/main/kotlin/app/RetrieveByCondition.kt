package app

fun main() {
    val numbers = (1..20).toList()

    println(numbers.first { it > 10 })
    println(numbers.last { it > 10 })
    println(numbers.firstOrNull { it > 30 })
    println(numbers.lastOrNull { it > 30 })
    println(numbers.find { it > 30 })
    println(numbers.findLast { it > 30 })
}