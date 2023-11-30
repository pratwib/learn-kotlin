package app

import data.Person

fun main() {
    val wibi = Person()
    wibi.firstName = "Pratama"
    wibi.middleName = "Wibi"
    wibi.lastName = "Sono"

    wibi.sayHello("Asep")
    wibi.run()

    val fullName = wibi.getFullName()
    println(fullName)
}