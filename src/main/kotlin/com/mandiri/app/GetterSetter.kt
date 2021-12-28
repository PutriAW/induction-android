package com.mandiri.app

import com.mandiri.oop.BigNote
import com.mandiri.oop.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}