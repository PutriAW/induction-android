package com.mandiri.app

import com.mandiri.oop.Manager
import com.mandiri.oop.VicePresident

// Kemampuan untuk membuat ulang func yang sudah ada di class parent
// ditambahin keyword open agar bisa di deklarasikan ulang

fun main() {
    val manager = Manager("Putri A.")
    println(manager.name)
    manager.sayHello("Eko")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")

}