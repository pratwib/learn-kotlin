package app

import data.Person

fun main() {
    val set = setOf(
        Person("Muhammad"), Person("Pratama"), Person("Wibawa"), Person("Pratama")
    )

    println(set.size)
    println(set.contains(Person("Pratama")))

    for (person in set) {
        println(person)
    }
}