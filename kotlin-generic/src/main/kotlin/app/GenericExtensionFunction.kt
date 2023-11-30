package app

class Data<T>(val data: T)

fun Data<String>.print() {
    val data = this.data
    println(data)
}

fun main() {
    val data1 = Data(23)
    val data2 = Data("Eko")

//    data1.print() ERROR KARENA INT
    data2.print()
}