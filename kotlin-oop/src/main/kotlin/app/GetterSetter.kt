package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Dear Diary")

    println(note.title)

    note.title = ""

    println(note.title)

    val bigNote = BigNote("Kancil dan Domba")

    println(bigNote.title)
    println(bigNote.bigTitle)
}