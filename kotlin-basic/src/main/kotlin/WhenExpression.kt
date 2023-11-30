fun main() {
    val nilai = "B"

    when (nilai){
        "A" -> {
            println("Amazing")
        }
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        "E" -> println("Coba Lagi")
        else -> println("Ups")
    }

    when (nilai){
        "A", "B", "C" -> println("Selamat Anda Lulus")
        else -> println("Maaf Coba Lagi Ya")
    }

    val nilaiLulus = arrayOf("A", "B", "C")
    when (nilai){
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("MAAF, TIDAK LULUS")
    }

    val name = "Wibi"
    when (name){
        is String -> println("Ini String")
        !is String -> println("Bukan String")
    }

    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Coba Lagi Ok")
    }
}