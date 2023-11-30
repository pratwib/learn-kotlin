package app

import data.Boss

fun main() {
    val boss = Boss("Wibi")
    val employee1 = boss.Employee("Arkan")
    val employee2 = boss.Employee("Putri")

    employee1.hi()
    employee2.hi()
}