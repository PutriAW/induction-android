package com.mandiri

// Penanda pakai keyword @ -> labelnya@
// Bisa untuk penanda break, continue dan return

fun test(name: String, param:(String) -> Unit ): Unit = param(name)

fun main() {
//   Break
//    loopI@ for (i in  1 .. 10){
//        loopJ@ for (j in 1 .. 10){
//            if (j > 5){
//                break@loopI
//            }
//            println("$i x $j = ${i * j}")
//
//        }
//    }

//    Continue
//    loopI@ for (i in  1 .. 10){
//        loopJ@ for (j in 1 .. 10){
//            if (j == 5){
//                continue@loopI
//            }
//            println("$i x $j = ${i * j}")
//        }
//    }

//    Return
    test("") test@{
        if (it == ""){
            return@test
        }else{
            println("Putri")
        }
    }



}