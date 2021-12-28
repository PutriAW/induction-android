package com.mandiri.app

import com.mandiri.oop.Television

// Buat properties tanpa harus diinisialisasi di awal
// Menggunakan keyword lateinit
// hanya bisa digunakan pada var, mutable

fun main() {

    val tv = Television()
    tv.initTelevision("Samsung")
    println(tv.brand)
}