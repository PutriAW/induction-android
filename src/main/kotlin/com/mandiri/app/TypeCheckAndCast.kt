package com.mandiri.app

import com.mandiri.oop.HandPhone
import com.mandiri.oop.Laptop

fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop with name ${any.name}")
    }else if(any is HandPhone){
        println("Handphone with name ${any.name}")
    }else{
        println(any)
    }

}

fun printObjectWithWhen(any: Any){
    when (any) {
        is Laptop -> {
            println("Laptop with name ${any.name}")
        }
        is HandPhone -> {
            println("Handphone with name ${any.name}")
        }
        else -> {
            println(any)
        }
    }

}

fun printString(any: Any){
    val value: String = any as String
    println(value)
}

fun printStringNull(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Putri")
    printObject(Laptop("Asus"))

    // When cast
    printObjectWithWhen("Wawan")
    printObjectWithWhen(HandPhone("Samsung"))

    // Unsafe Cast
    printString("Berlian") // Success
//    printString(1) // ClassCastException

    // Nullable Cast
    printStringNull(1)

}