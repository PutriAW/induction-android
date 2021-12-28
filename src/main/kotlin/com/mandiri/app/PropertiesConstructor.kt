package com.mandiri.app

import com.mandiri.oop.User

fun main() {
    val user1 = User("Putri", "rahasia")
    val user2 = User("Jerry", "xihuan11")

    user1.username = "meone"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}