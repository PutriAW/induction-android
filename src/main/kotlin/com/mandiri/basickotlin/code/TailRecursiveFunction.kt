package com.mandiri

// Apabila recursive terlalu dalam maka kemungkinan terjadi error stack overflow
// Tail Recursive Function : Mengubah recursive menjadi looping biasa ketika dijalankan
// Menggunakan tailrec dan wajib memanggil dirinya sendiri saja tanpa ada embel-embel operasi dengan data lain


fun main() {
    // Case stack overflow
//    fun display(value: Int){
//        println("Recursive $value")
//        if (value > 0){
//            display(value - 1)
//        }
//    }
//
//    display(10000)

    // Tailrec
    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0){
            display(value - 1)
        }
    }

//    display(10000)

    // Tailrec Factorial
   tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when(value){
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(10))
}