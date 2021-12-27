package com.mandiri

// Ruang lingkup dimana func bisa diakses
// Func ketika dibuat maka bisa diakses dimana saja
// Apabila ingin dibatasi maka buatlah function scope
// Scope itu dibatasi dengan kurung kurawal

fun satu(){
//    Error
//    contohHelloWorld()
}

fun dua(){
//    error
//    contohHelloWorld()
}

fun main() {
    fun contohHelloWorld(){
        println("Hello World!!!")
    }

    contohHelloWorld()
}