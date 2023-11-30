package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee = Employee("Wibi")
    employee.sayHello("Eko")

    employee = Manager("Asep")
    employee.sayHello("Budi")

    employee = VicePresident("Dani")
    employee.sayHello("Kurnia")
}