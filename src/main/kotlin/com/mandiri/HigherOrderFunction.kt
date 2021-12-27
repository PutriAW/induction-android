package com.mandiri

// Menggunakan function sbg parameter atau mengembalikan function
// berguna ketika ingin buat func yang general dan ingin mendapatkan input yang flexible berupa lambda

fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    val upperTransformer = {value: String -> value.toUpperCase()}
    println(hello("Putri", upperTransformer))

    println(hello("Dian", {value: String -> value.toLowerCase()}))

    // Trailing lambda. Biasanya digunakan kalo parameternya di akhir

    val result1 = hello("Putri AW"){
        it.toLowerCase()
    }

    val result2 = hello("Anis"){
        it.toUpperCase()
    }

    println(result1)
    println(result2)
}