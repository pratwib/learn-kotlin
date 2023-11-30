package app

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, im Vice President")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
//    val data1 = Company(Manager()) ERROR CanSayHello
    val data2 = Company(VicePresident())
//    val data3 = Company(Employee()) ERROR CanSayHello
//    val data4 = Company("String") ERROR not Employee
}