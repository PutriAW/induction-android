package com.mandiri.excercise.entity

import java.util.*

class Customer(val name: String, val location: String) {
    var specialOrderCount = 0
    var normalOrderCount = 0
    val specialOrder = SpecialOrder()
    val normalOrder = NormalOrder()
    fun sendOrder(type: String){
        if (type == "Special" || type == "SPECIAL" || type == "special"){
            specialOrderCount++
            specialOrder.date = Date()
            specialOrder.number = "SOD-00$specialOrderCount"
            specialOrder.confirm()
            specialOrder.dispatch(this.name, this.location)
            specialOrder.close(this.name)
        }else if (type == "Normal" || type == "NORMAL" || type == "normal"){
            normalOrderCount++
            normalOrder.date = Date()
            normalOrder.number = "NOD-00$normalOrderCount"
            normalOrder.confirm()
            normalOrder.receive()
            normalOrder.dispatch(this.name, this.location)
        }else{
            println("Upss Wrong Order type. Please Choose Normal or Special")
            println("==================================================")
        }

    }

    fun receiveOrder(type: String){
        println("Order Received")
        if (type == "Special" || type == "SPECIAL" || type == "special"){
            specialOrder.close(this.name)
        }else if (type == "Normal" || type == "NORMAL" || type == "normal"){
            normalOrder.close(this.name)
        }else{
            println("Upss Wrong Order type. Please Choose Normal or Special")
            println("==================================================")
        }

        println()

    }
}