package app

class Invariant<T>(var data: T)

fun main() {
    val InvariantString = Invariant("Wibi")

//    val InvariantInt: Invariant<Any> = InvariantString ERROR
//    invariantAny.data = 100 BAHAYA
}