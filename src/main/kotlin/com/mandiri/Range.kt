package com.mandiri

fun main() {
    // Tipe data yang mampu mengenerate data angka berurutan

    val range = 1 .. 100

    // Operasi di tipe data range
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    println("===============")

    // Down to
    val rangeDownto = 100 downTo 1

    // Operasi di tipe data range
    println(rangeDownto.count())
    println(rangeDownto.contains(50))
    println(rangeDownto.contains(200))
    println(rangeDownto.first)
    println(rangeDownto.last)
    println(rangeDownto.step)

    println("===============")
    // Step
    val rangeStep = 100 downTo  1 step 2

    // Operasi di tipe data range
    println(rangeStep.count())
    println(rangeStep.contains(50))
    println(rangeStep.contains(200))
    println(rangeStep.first)
    println(rangeStep.last)
    println(rangeStep.step)







}