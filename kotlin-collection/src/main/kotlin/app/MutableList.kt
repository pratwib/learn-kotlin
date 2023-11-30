package app

fun main() {
    val mutableList = mutableListOf<String>()

    mutableList.add("Muhammad")
    mutableList.add("Pratama")
    mutableList.add("Wibawa")

    mutableList.set(0,"Haryana")
    mutableList[1] = "Kriwil"

    mutableList.remove("Wibawa")

    for (value in mutableList) {
        println(value)
    }
}