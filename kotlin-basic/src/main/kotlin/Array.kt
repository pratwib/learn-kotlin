fun main() {
    val names: Array<String> = arrayOf("Wibi", "Tya", "Yuda")
    names[0] = "Icih"
    println(names[0])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Wibi"
    members[1] = "Wibi"
    members[2] = null
    members[3] = "Wibi"
    members[4] = "Wibi"
    println(members[4])
    println(members.size)
}