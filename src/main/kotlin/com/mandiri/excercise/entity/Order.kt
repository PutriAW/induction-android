package com.mandiri.excercise.entity

import java.util.*

open class Order (var date: Date = Date(), var number: String = ""){
    open fun confirm(){
        println("Order Confirmed .....")
        println("Order Number  : ${this.number} ")
        println("Order Date    : ${this.date}")
        println("==================================================")
    }

    open fun close(name: String){
        println("Order Number  : ${this.number} ")
        println("Order Date    : ${this.date}")
        println("Already Received by $name at ${this.date}")
        println("==Order Closed==")
        println("==================================================")
    }
}

