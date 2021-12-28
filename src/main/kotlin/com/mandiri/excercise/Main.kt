package com.mandiri.excercise

import com.mandiri.excercise.entity.Customer
import com.mandiri.excercise.entity.NormalOrder
import java.time.LocalDateTime
import java.util.*

fun main() {
    val customer = Customer("Putri AW", "Jakarta")
    customer.sendOrder("Special Order")
    customer.sendOrder("Special")
    customer.receiveOrder("special")
    customer.sendOrder("normal")
    customer.receiveOrder("normal")
    customer.sendOrder("normal")
    customer.receiveOrder("normal")




}
