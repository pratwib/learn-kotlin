package app

class Contravariant<in T> {
    fun sayHello(param: T) {
        println("Hello $param")
    }
}

fun main() {
    val contravariant = Contravariant<Any>()
    val contravariantString = contravariant

    contravariantString.sayHello("Wibi")
}