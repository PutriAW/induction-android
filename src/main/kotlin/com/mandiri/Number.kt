package com.mandiri

fun main() {
    // Integer
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    // Floating point number
    var value: Float = 98.98F
    var radius: Double = 2342342343.54535

    println(value)
    println(radius)


    // Literals
    // warna itu hex decimal karena banyak jd bisa pakai literal
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binary: Int = 0b01010101

    println(binary)

    // Underscore itu seperator supaya gampang aja membacanya
    var price: Long = 9_000_000_000L

    println(price)

    //Conversion

    var  priceInt: Int = price.toInt()
    println(priceInt)

    //Overflow itu adalah kondisi dimana tipe data itu tidak sanggup menampung datanya
    // Karena sudah melebihi limit datanya
    // contohnya Long -> Integer, dimana Long itu lebih besar kapasitasnya daripada Int
    // sehingga hasil konversinya tidak akurat

}