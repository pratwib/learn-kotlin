package app

import exception.ValidationException

fun validationAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validationAndSayHello("Wibi")
//        validationAndSayHello("")
        println("Program ga keluar")
    } catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi error ${error.message}")
    } finally {
        println("Prgram Selesai")
    }
}