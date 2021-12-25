package com.mandiri

fun main() {

    // IF
    fun sayHello(name : String = ""): String{
        return if (name == ""){
            "Hello Sis"
        }else{
            "Hello $name"
        }
    }
    println(sayHello())
    println(sayHello("Putri Apriyanti Windya"))

    // When
    fun sayHelloWhen(name : String = ""): String{
        return when (name) {
            "" -> "Hello Sis"
            else -> "Hello $name"
        }
    }
    println(sayHelloWhen())
    println(sayHelloWhen("Putri Apriyanti Windya"))

}