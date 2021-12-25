package com.mandiri

// Varargs : Variable Args
// param yang berada di posisi terakhir memiliki kemampuan menjadi varargs
// Varargs bisa menerima data lebih dari satu input
// bedanya dengan array adalah kalau array wajib membuat arraynya terlebih dahulu sebelum kirim ke function
// sedangkan varargs bisa langsung. Jika lebih dari satu bisa gunakan tanda koma


fun calcTotal(values: Array<Int>): Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}

fun finalValue(name : String, vararg values: Int){
    var total = 0.0
    for (value in values){
        total += value
    }
//    total /= values.size
    println("Final Value $name = $total")
}

fun main() {
    // Contoh penggunaan array
    val values = arrayOf(10, 20, 30, 10)
    println(calcTotal(values))

    // Vararg
    val result = finalValue("Putri", 10, 10, 20, 30)
    println(result)
}