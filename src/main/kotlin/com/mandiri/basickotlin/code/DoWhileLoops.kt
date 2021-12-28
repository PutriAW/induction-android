package com.mandiri

fun main() {
    // Do while, bloknya dijalankan lebih dahulu barulah pengecekan dilakukan diakhir

    var i = 0;
    do{
        println("Do While Loop $i")
        i++ // Increment i
    }while (i < 10)

    println("Do While Loop End")
}