package com.mandiri

// Parameter adalah data yang dikirim dari luar func
// Paramaeter tidak wajib, namun apabila menambahkan paramater di func maka apabila func dipanggil maka wajib memasukkan parameternya

fun sayHello(firstName: String, lastName: String?){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }

}

fun main() {
    sayHello("Putri A.", null)
    sayHello("Putri A.", "Windya")
}