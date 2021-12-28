package com.mandiri

fun main() {
    // While akan diulangi terus menerus sampai kondisi whilenya bernilai false
    // Apabila kondisi berhenti perulangan tidak tercapai maka akan looping forever

    var i = 0;

    while (i < 10){
        println("While Loops $i")
        i++
    }

    println("While Loop End")

}