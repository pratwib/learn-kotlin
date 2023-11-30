package app

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }

//    TIDAK BOLEH
//    fun setData(param: T) {
//        param = data
//    }
}

fun main() {
    val covariantString = Covariant("Wibi")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())

//    covariantAny.setData(200) TIDAK BOLEH
}