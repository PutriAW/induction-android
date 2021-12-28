package com.mandiri.oop

class Student {
    var firstName: String = ""
    var lastName: String = ""

    constructor(firstNameParam: String, lastNameParam: String){
        firstName = firstNameParam
        lastName = lastNameParam
    }

    fun sayHello(name: String){
        // this adalah keyword yang digunakan untuk mereferensikan obj saat ini
        println("Hello $name, My name is ${this.firstName} ${this.lastName}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstName $lastName"
    }

    // Overloading : nama func sama tetapi parameter atau tipe paramternya atau jumlah parameternya berbeda
    fun sayHello(firstNameParam: String, lastNameParam: String){
        println("Hello $firstNameParam $lastNameParam, My name is $firstName $lastName")
    }
}