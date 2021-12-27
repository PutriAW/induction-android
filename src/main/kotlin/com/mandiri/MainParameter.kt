package com.mandiri

// Ketika jalanin program kita butuh parameter dari luar

fun main(args: Array<String>) {
    for (value in args){
        println(value)
    }
}