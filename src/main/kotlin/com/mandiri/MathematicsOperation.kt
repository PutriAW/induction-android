package com.mandiri

fun main() {
    val result = 10/2
    println(result)

    println(10.0/3.0)

    val result2 = 10 + 10 / 2
    println(result2)

    //Augmented Assignment
    // a = a + 10 --> a+ = blabla
    // biasanya dipakai untuk update nilai
    var total: Int = 0
    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    val barang4 = 400
    total += barang4

    println("Total Barang : $total")

    //Unary operator
    total++
    total++

    println("Total Barang After : $total")

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)





}