package com.mandiri
// When bisa dijadikan pengganti if else


fun main() {
    val finalExam = 'B'
//    when (finalExam){
//        'A' -> println("Amazing")
//        'B' -> println("Good")
//        'C' -> println("Not Bad")
//        'D' -> println("Bad")
//        'E' -> println("Try Again Next year")
//        else -> println("Ups")
//    }

    // When expression Multiple Option
//    when (finalExam) {
//        'A', 'B', 'C' -> println("Pass")
//        else -> {
//            println("Not Pass")
//        }
//    }

    // When expression In
    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam){
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }

    val name = "Putri"
    when (name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }


}