package com.mandiri

// Di kotlin ada kemampuan untuk memasukkan nilai default untuk func parameter
// Default parameter ini cocok untuk parameter yang sekiranya tidak wajib diisi

fun hello(firstName: String, lastName: String? = ""){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Putri A.")
    hello("Wendy", null)
    hello("Putri Apriyanti", "Windya")
}