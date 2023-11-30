fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
    ) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Pratama", "Wibi", "Sono")
    fullName(
        lastName = "Burung",
        firstName = "Asep",
        middleName = "Hartanto"
    )
}