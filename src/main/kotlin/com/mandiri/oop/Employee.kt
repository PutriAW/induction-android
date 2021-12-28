package com.mandiri.oop

open class Employee (val name: String) {
    open fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String): Employee(name){
    // Final agar tidak dapat di override oleh class dibawahnya lagi
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}

class superManager(name: String): Manager(name){
//    error karena di parent final
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is Super Manager ${this.name}")
//    }
}

final class VicePresident(name: String): Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}