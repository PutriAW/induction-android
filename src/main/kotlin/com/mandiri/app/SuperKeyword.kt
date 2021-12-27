package com.mandiri.app

import com.mandiri.oop.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")
    rectangle.printName()

}