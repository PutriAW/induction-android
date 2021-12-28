package com.mandiri.app

import com.mandiri.oop.Student

// Secara otomatis menjadi behaviour obj dari suatu class

fun main() {
    val putri = Student("Putri Apriyanti", "Windya")

    println("${putri.firstName} ${putri.lastName}")

    putri.sayHello("Anis")
    putri.run()
    println( putri.getFullName())
    println("=============")
    println("OVERLOADING")
    putri.sayHello("Wawa", "Gunawan")
}