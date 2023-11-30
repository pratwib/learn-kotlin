package app
import data.User

fun main() {
    val user1 = User("wibi", "rahasia")
    val user2 = User("dedi", "rahasia123")

    user1.username = "icih"
    user2.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}