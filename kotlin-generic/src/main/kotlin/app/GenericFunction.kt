package app

import data.Function

fun main() {
    val function = Function("Wibi")

    function.sayHello<String>("Dani")
    function.sayHello("Dani")

    function.sayHello<Int>(11)
    function.sayHello(11)
}