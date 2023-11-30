package app

import data.Person

fun main() {
    val wibi = Person()
    wibi.firstName = "Wibi"

    wibi.sayHello("Asep")
    wibi.sayHello("Hilmi", "Ahmad")
}