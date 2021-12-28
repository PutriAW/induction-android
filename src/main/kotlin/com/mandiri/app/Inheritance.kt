package com.mandiri.app

import com.mandiri.oop.Manager
import com.mandiri.oop.VicePresident

// 1 child hanya memiliki 1 parent, namun 1 parent boleh mimiliki banyak child
// Secara standard di kotlin class dibuat final atau tidak bisa diwariskan, sehingga harus menggunakan kata kunci open apabila ingin mewariskan

fun main() {
    val manager = Manager("Putri A. Windya")
    manager.sayHello("Eko")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")
}