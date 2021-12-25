package com.mandiri

// Func named argument umumnya digunakan untuk menyederhanakan func yang banyak parameternya
// agar ketika pemanggilan func tidak kesulitan
// Func named argument : menyebutkan nama parameter saat pemanggilan tanpa mempedulikan urutan parameternya

fun fullName(firstName : String,
            middleName : String,
            lastName : String){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName(lastName = "Windya", middleName = "Apriyanti", firstName = "Putri")
}