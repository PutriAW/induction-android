package com.mandiri

fun main() {
    // operator boolean &&, ||, ! (Operator Logika)
    val finalExam = 80
    val attendant = 75
    val extra = 80

    val passFinalExam = finalExam > 75
    val passFinalAttendant = attendant > 80
    val passFinalExtra = extra > 75

    val pass = passFinalExam && passFinalAttendant && passFinalExtra

    println(pass)


}