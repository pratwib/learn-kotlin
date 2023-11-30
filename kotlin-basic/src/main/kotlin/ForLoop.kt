fun main() {
    var array = arrayOf("Wibi", "Sana", "Tya", "Asep")

    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total Perulangan = $total")

    for (i in 0..100 step 5){
        println(i)
    }

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("Index $i = ${array[i]}")
    }
}