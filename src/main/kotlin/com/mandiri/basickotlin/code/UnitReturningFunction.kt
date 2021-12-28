package com.mandiri

// Func : Return nilai dan tidak return nilai
// Tipe data unit : tanda bahwa func tidak mengembalikan data. Penulisan unit tidak wajib
// Tetapi kalau ingin ditulis maka gunakan keyword unit

fun printHello(name : String ?): Unit{
    if (name == null){
        println("Hello Sis")
    }else{
        println("Hello $name")
    }
}

fun main() {
    printHello("Putri Apriyanti Windya")
    printHello(null)
}