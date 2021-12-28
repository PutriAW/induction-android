package com.mandiri.oop

interface Interaction {
    val name: String
    fun sayHello(Name: String)
}

class Human(override val name: String): Interaction{
    override fun sayHello(Name: String) {
        println("Hello $name")
    }
}