fun main() {
    var firstName = "Pratama"
    var lastName = "Wibi"
    var address = """
        Jalan belum jadi, RT12 RW 10
        Kota Tasikmalaya
        Jawa Barat
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

    var fullName = "$firstName $lastName"

    println(fullName)

    var desc = "$fullName length = ${fullName.length}"

    println(desc)
}