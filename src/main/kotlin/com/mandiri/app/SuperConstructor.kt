package com.mandiri.app

import com.mandiri.oop.ExecutiveCustomer
import com.mandiri.oop.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Putri")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Putri", 100000000)
    println("${executiveCustomer.name} ${executiveCustomer.balance}")
}