package com.mandiri

// Func yang memanggil dirinya sendiri

fun main() {

    // Loop Biasa
    fun factorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *= i
        }
        return result
    }

    println(factorialLoop(10))

    // Recursive
    fun factorialRecursive(value: Int): Int {
        return when(value){
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialRecursive(10))
}