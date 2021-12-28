package com.mandiri.app

import com.mandiri.oop.Address

fun main() {
    val address1 = Address("Jalan A", "Jakarta")
    val address2 = Address("Jalan B", "Jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)
}