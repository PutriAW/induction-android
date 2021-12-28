package com.mandiri.app

import com.mandiri.oop.Rectangle
import com.mandiri.oop.Shape
import com.mandiri.oop.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape1 = Rectangle()
    println(shape1.corner)

    val shape2 = Triangle()
    println(shape2.corner)

}