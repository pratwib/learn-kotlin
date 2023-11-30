package app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure("Wibi")
    val dataString = data1.getData()
    println(dataString)

    val data2 = data1 as TypeErasure<Int>
    val dataInt = data2.getData() // ERROR KONVERSI
    println(dataInt)
}