package com.mandiri

fun main() {
    // Break untuk menghentikan seluruh perulangan
    // Continue untuk menghentikan perulangan yang sedang berjalan dan langsung dilanjutkan
    // ke iterasi perulangan selanjutnya

    // Break
    var i = 0;
    while (true){
        println("Break Me $i")
        i++
        if (i > 20){
            break
        }
    }
    println("END")

    println("=============")

    // Continue
    for (i in 1..100){
        if (i % 2 == 0){
            continue
        }
        print("$i ")
    }
}