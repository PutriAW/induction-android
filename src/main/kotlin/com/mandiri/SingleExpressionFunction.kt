package com.mandiri

// Single expression function : deklarasi function hanya dengan 1 baris kode
// pakai tanda = setelah deklarasi nama func

fun double(a: Int): Int = a * 5

fun hi(name: String): Unit = println("Hi $name")

fun main() {
    println(double(5))
    hi("Putri A. Windya")
}