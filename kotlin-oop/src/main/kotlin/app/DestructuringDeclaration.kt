package app

import data.Game
import data.Login
import data.MinMax
import javax.security.sasl.AuthorizeCallback

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game Dota", 100_000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game

    println(name)
    println(price)

//    val result = MinMax(23, 78)
//    val min = result.min
//    val max = result.max
    val (min, max) = MinMax(23,78)

    println(min)
    println(max)

    val login = Login("Wibi", "Rahasia")
//    login(login) {
//        login ->
//        login.user == "Wibi" && login.password == "Rahasia"
//    }

    login(login) {
        (user, password) ->
        user == "Wibi" && password == "Rahasia"
    }
}