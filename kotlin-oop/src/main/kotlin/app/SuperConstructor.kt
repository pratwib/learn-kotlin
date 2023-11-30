package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Wibi")
    println(premiumCustomer.name)
    println(premiumCustomer.type)

    val executiveCustomer = ExecutiveCustomer("Wibi", 1_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}