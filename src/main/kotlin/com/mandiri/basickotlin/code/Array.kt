package com.mandiri

fun main() {
    val members: Array<String> = arrayOf("Putri", "Apriyanti", "Windya")

    println(members) // menampilkan address dari arraynya

    // Array di representasikan menggunakan index dimulai dari 0

    // size untuk mendapatkan panjang array
    println(members.size)

    // Mengakses data pada indeks tertentu
    println(members[0])
    println(members.get(1))

    // set(index, value) mengubah isi array pada index tertentu
    members.set(1, "Aryanti")
    // members[1] = "Aryanti"
    println(members.get(1))

    // Array Nullable
    // Array di kotlin ga boleh null apabila udh ada isinya tetapi apabila ingin null
    // maka dari awal di definisikan null dahulu


    val flower: Array<String?> = arrayOfNulls(10)
    flower[0] = "Mawar"
    flower[1] = "Melati"
    flower[2] = "Tulip"
    flower[3] = "Matahari"

    println(flower.size)








}