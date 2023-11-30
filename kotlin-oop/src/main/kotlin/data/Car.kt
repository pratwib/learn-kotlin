package data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2022) {
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constructor 2")
    }

    var brand = paramBrand
    var name = paramName
    var year = paramYear
}