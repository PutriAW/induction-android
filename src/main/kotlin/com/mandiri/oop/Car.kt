package com.mandiri.oop

class Car(brandParam: String, nameParam: String, yearParam:Int) {

    // Initializer Block
    init {
        println("Car $brandParam dibuat")
    }

    constructor(brandParam: String, nameParam: String): this(brandParam, nameParam, 2020){
        println("Secondary Constructor")
    }

    constructor(brandParam: String): this(brandParam, "")

    var brand: String = brandParam
    var name: String = nameParam
    var year: Int = yearParam

}