package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Kurnia")
    manager.sayHello("Dedi")

    val vicePresident = VicePresident("Tegar")
    vicePresident.sayHello("Dedi")
}