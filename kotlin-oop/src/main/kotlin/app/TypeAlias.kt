package app

import data.Application
import java.util.function.BooleanSupplier
import java.util.function.Supplier

typealias App = Application
typealias Aplikasi = App
typealias App2 = data2.Application

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    val app2 = App2("Kotlin App v2")

    sayHello { "Wibi" }
}