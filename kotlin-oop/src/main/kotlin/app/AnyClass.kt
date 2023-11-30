package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("SamsungA20", "Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}