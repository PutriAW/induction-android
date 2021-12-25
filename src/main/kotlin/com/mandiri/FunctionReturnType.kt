package com.mandiri

// Return type : Mengembalikan data
// Wajib menuliskan tipe data kembalian
// untuk mengembalikan data maka gunakan keyword return diikuti dengan datanya apa

fun sum(a: Int, b: Int): Int{
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int{
    if (b == 0){
        return 0
    }else{
        val result = a / b
        return  result
    }
}

fun main() {
    val result = sum(10, 20)
    println("Total = $result")

    val resultBagi = bagi(100, 20)
    println("Bagi = $resultBagi")

    val resultBagiNol = bagi(100, 0)
    println("Bagi = $resultBagiNol")
}