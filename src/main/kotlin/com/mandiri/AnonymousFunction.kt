package com.mandiri

// Mirip seperti lambda tetapi bisa return hasil dimana saja bukan hanya di baris akhir
// Lebih kompleks daripada lambda

fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()){
            return "Ups"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Putri", anonymousUpper))
    println(hello("", anonymousUpper))


}