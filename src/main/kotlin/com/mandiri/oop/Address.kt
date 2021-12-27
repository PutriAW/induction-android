package com.mandiri.oop

class Address {

    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    constructor(streetParam: String, cityParam: String){
        street = streetParam
        city = cityParam
    }

    constructor(streetParam: String, cityParam: String, countryParam: String)
            : this(streetParam, cityParam){
        country = countryParam
            }
}