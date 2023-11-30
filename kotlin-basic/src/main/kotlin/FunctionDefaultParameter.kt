fun hello(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Wibi")
    hello("Wibi", "Sono")
}