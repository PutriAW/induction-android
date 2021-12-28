package com.mandiri.excercise.entity

import java.util.*

class NormalOrder(date: Date = Date(), number: String = ""): Order(date, number) {

    fun dispatch(name: String, location: String){
        println("Dispatching .....")
        println("Order Number  : ${this.number} ")
        println("Order Date    : ${this.date}")
        println("Your package is on its way to $name 's location at $location")
        println("==================================================")
    }

    fun receive(){
        println("Receive Order .....")
        println("Order Number  : ${this.number} ")
        println("Order Date    : ${this.date}")
        println("Order Number ${this.number} already received by Merchant and ready to pack")
        println("==================================================")

    }
}