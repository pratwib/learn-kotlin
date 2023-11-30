package app

import data.MyData

fun main() {
    val myDataString = MyData<String,Int>("Wibi", 78)
    myDataString.printData()

    val myDataInt = MyData(265, "Dani")
    myDataInt.printData()
}