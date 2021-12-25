package com.mandiri
// For loops digunakan untuk perulangan dari data iterator sprt Array, range, dll

fun main() {

    // Array
    var members: Array<String> = arrayOf("Putri", "Apriyanti", "Windya")

    var total = 0
    for (member in members){
        println(member)
        total++
    }

    println("Total Perulangan = $total")

    // Range
    for (value in 0 .. 100){
        println(value)
    }

    for (value in 1000 downTo 0 step 100){
        println(value)
    }



}