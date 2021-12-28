package com.mandiri

// Variable Constant
// Constant -> Immutable
// Constant digunakan untuk keperluan global. Dapat diakses dimana saja
// Biasanya pakai UPPER CASE. Biasanya diletak di luar main program

const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    // Mutable -> bisa diubah dengan tipe data yang sama(tipe datanya tidak bisa diubah). Keyword: Var
    var firstName: String = "Putri"
    var middleName: String = "Apriyanti"
    var lastName: String = "Windya"
    println(middleName)

    middleName = "Aryanti"
    println(middleName)

    // Immutable -> tidak bisa diubah variablenya. Keyword: val. Lebih aman karena datannya lebih mudah diprediksi dn tidak berubah
    val firstNameA: String = "Putri"
    val middleNameA: String = "Apriyanti"
    val  lastNameA = "Windya"

    // Error apabila diubah datanya
    // lastNameA = "Windia"

    // Sebenarnya kotlin bisa mengetahui tipe data sebuah variable tetapi apabila ingin spesifik maka harus dicantumkan tipe datanya
    val bunga = "Tulip"
    println(bunga)


    // Nullable
    // Penggunaan fitur nullable sangat tidak direkomendasikan di kotlin
    var buah: String? = null

    //error karena buah null
    //println(buah.length)

    // Agar tidak error
    println(buah)
    println(buah?.length)

    // Panggil constant
    println("$APP : $VERSION")


}