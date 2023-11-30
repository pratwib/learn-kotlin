package app

import data.Person

fun main() {
    val mutableSet = mutableSetOf<Person>()

    mutableSet.add(Person("Muhammad"))
    mutableSet.add(Person("Pratama"))
    mutableSet.add(Person("Wibawa"))
    mutableSet.add(Person("Pratama"))

    for (person in mutableSet) {
        println(person)
    }
}