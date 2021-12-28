package com.mandiri.app

import com.mandiri.oop.City
import com.mandiri.oop.Country
import com.mandiri.oop.Location

// Kelas tidak dapat dibuat obj secara langsung
// biasanya digunakan untuk diturunkan ke kelas lain
// class abstract itu defaultnya open bukan final

fun main() {
    val city = City("Bandung")
    val country = Country("Bandung")

    println(city)
}