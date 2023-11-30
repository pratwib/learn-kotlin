package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Wibi")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Gian")
    baseDelegate.sayGoodbye("Ratu")
}