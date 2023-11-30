package app

import data.Product

fun main() {
    val product = Product("Indomie", 3000, "Food")

    val product2 = product.copy(name = "Mie Sedap")

    println(product)
    println(product2)
}