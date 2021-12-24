package com.mandiri

fun main() {
    var firstName: String = "Putri"
    var middleName: String = "Apriyanti"
    var lastName: String = "Windya"
//    var fullName: String = "Putri Apriyanti Windya"
    var address: String = """
        |Street Berlian Jaya,
        |District Bener Meriah, 
        |Province Aceh,
        |Country Indonesia
        """.trimMargin()
    println(firstName)

    // Trim margin itu untuk merapihkan kalimat/marginnya berdasarkan marknya apa misalnya marknya |
    println(address)

    // String concat
//    var fullName: String = firstName+" "+middleName+" "+lastName
//    println(fullName)

    // String template : bisa akses data dari luar di dalam stringnya -> Java string builder
    // contoh simplenya bisa pakai tanda $ untuk template ekspresi sederhana

    var fullName: String = "$firstName $middleName $lastName"
    println(fullName)

    // length fullName
    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}