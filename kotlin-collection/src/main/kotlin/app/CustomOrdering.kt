package app

data class Fruit(val name: String, val qty: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 12),
        Fruit("Orange", 6),
        Fruit("Banana", 2)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.qty })

    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.qty })

    println(fruits.sortedWith(compareBy { it.name }))
    println(fruits.sortedWith(Comparator { fruit1, fruit2 ->
        fruit1.qty.compareTo(fruit2.qty)
    }))
}