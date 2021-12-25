package com.mandiri;

// Harus dibuat jadi function Extension
// Harus memiliki 1 parameter, tidak boleh default dan vararg
// Keyword infix, diletak sebelum keyword fun
// Hanya ada di kotlin

infix fun String.to(type: String):String{
    if (type == "UP"){
        return  this.toUpperCase()
    }else{
        return  this.toLowerCase()
    }
}

fun main() {
    val result = "Putri A. Windya" to "UP"
    println(result)

    val result1 = "Putri A. Windya" to "LO"
    println(result1)
}