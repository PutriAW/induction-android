package com.mandiri

// Lambda itu func yang tidak memiliki nama
fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    // Create lamda
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String -> // parameter
        val result = "$firstName $lastName"
        result // baris terakhir jadi return value
    }

    val result = lambdaName("Putri A.", "Windya")
    println(result)

    val lambdaNameIt: (String) -> String = { // Khusus untuk 1 parameter aja
        "Hello $it"
    }

    val result1 = lambdaNameIt("Putri A.W")
    println(result1)

    val toUpperCase : (String) -> String = ::toUpper  // function reference
    println(toUpperCase("putri apriyanti windya"))
}