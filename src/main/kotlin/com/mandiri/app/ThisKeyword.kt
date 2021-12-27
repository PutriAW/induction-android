package com.mandiri.app

import com.mandiri.oop.Student

fun main() {
    val putri = Student("Putri Apriyanti", "Windya")
    println("${putri.firstName} ${putri.lastName}")

    putri.sayHello("Cindy", "Angrayni")
}