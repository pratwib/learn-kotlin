package data

class Address {
    var street = ""
    var city = ""
    var country = "Indonesia"

    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
        : this(paramStreet, paramCity) {
            country =paramCountry
    }
}