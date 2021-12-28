package com.mandiri.excercise.entity

import com.mandiri.oop.Location
import java.util.*

class SpecialOrder(date: Date = Date(), number: String = " ") : Order(date, number) {
    fun dispatch(name: String, location: String){
        println("Dispatching .....")
        println("Order Number  : ${this.number} ")
        println("Order Date    : ${this.date}")
        println("Your package is on its way to $name 's location at $location")
        println("==================================================")
    }
}