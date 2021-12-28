package com.mandiri.app

import com.mandiri.oop.SmartPhone

// Any adalah superclass untuk semua class yang ada di kotlin sama seperti kelas object di java
// Struktur : equals, hashCode dan toString
fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android")
    println(smartPhone.toString())
    println(smartPhone.hashCode())

}