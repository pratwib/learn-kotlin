package app

import data.Address

fun main() {
    val address1 = Address("Jalan A", "Jakarta")
    val address2 = Address("Jalan B", "KL City", "Malaysia")

    println(address1.country)
    println(address2.country)
}