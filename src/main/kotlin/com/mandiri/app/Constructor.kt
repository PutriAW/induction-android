package com.mandiri.app

import com.mandiri.oop.Car

fun main() {
    val car = Car("Honda", "Yaris", 2021)
    println("${car.brand} ${car.name} ${car.year}")

    val almaz = Car("Wuling", "Almaz")
    println("${almaz.brand} ${almaz.name} ${almaz.year}")
}