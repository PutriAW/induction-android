package com.mandiri.oop

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String): this(name, type, 0)
    constructor(name: String): this(name, "Standard")
}

// Apabila class jadi menjadi primary constructor maka secondarynya harus panggil primary constructor dulu
// Kemudian tidak boleh pakai keyword super tetapi langsung saja panggil dan isi sesuai parameter yang diminta

class PremiumCustomer: Customer{
    constructor(name: String): super(name, "Premium")
    constructor(name: String, balance: Long): super(name, "premium", balance)
}

class ExecutiveCustomer(name: String, balance: Long): Customer(name, "Executive", balance){
    constructor(name: String): this(name, 0)
}



