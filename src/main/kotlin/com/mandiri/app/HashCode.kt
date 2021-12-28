package com.mandiri.app

import com.mandiri.oop.Company

/**
* representasi angka unit untuk obj yang dibuat
 * sangat berfungsi untuk mengkonversi obj menjadi angka*/

fun main() {
    val company1 = Company("Elang")
    val company2 = Company("Elang")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
    println(company2.hashCode() == company2.hashCode())
}