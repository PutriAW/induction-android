package com.mandiri

// kemampuan kotlin mengubah higer-order func menjadi inline func
// code dalam higher order func akan di duplicate agar saat runtime aplikasi tidak perlu
// membuat obj lambda berulang ulang
// keyword inline

inline  fun hello(name: () -> String): String{
    return "Hello ${name()}"
}

inline  fun helloNo(firstName: () -> String,
noinline lastName: () -> String): String{
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello { "Putri" })
    println(hello { "Anis"})

    // NoInline

    println(helloNo({ "Denny" }, {"Denny"}))
    println(helloNo({ "Lala" }, {"Monika"}))
}