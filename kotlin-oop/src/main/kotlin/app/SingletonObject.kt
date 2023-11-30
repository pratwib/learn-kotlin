package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Diubah"
    println(Utilities.toUpper("Wibi"))
    a()
    b()

    println(Application.Companion.toUpper("Budi"))
    println(Application.toUpper("Budi"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}