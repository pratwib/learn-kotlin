package data

class Person {
    var firstName = ""
    var middleName: String? = null
    var lastName = ""

    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.firstName}")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

    fun run() {
        println("Im Run from You")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}