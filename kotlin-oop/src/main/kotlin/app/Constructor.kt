package app
import data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2015

    val jazz = Car("Honda", "Jazz")

    println(avanza.brand)
    println(avanza.year)
    println(jazz.brand)
    println(jazz.year)
}