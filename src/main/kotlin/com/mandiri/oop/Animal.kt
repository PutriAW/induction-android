package com.mandiri.oop

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat: Animal(){
    override val name: String
        get() = "Cat"

    override fun run() {
        println("Cat run")
    }

}

class Dog(): Animal(){
    override val name: String
        get() = "Dog"

    override fun run() {
        println("Dog Run")
    }
}