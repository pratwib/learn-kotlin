package app

import data.City
import data.Country
import data.Location

fun main() {
    // val location = Location("Tembalang") ERROR
    val city = City("Semarang")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}