package com.mandiri.app

import com.mandiri.oop.Company

// Membandingkan objek dengan operasi == atau !=
// Kotlin : equals() -> di override di classnya

fun main() {
    val company1 = Company("Elang")
    val company2 = Company("Elang")

    println(company1 == company2)
    println(company1 == company2)
    println(company2 == company2)
}