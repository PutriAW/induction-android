package com.mandiri

// Extension Func : kemampuan menambahkan function pada tipe data yang sudah ada
// kalau terlalu banyak maka program akan sulit dimengerti karena terlihat magic jadi gunakan seperlunya aja
// tambahkan tipe data pada nama funcnya diikuti dengan tanda . (titik)
// untuk akses gunakan keyword this

fun String.hello(): String{
    return "Hello $this"
}

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name: String  = "Putri Apriyanti Windya"
    val hello: String = name.hello()
    println(hello)
    "Putri A.".printHello()
}