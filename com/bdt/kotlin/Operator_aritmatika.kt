package com.bdt.kotlin

fun main (){
    println("========== Operator Aritmatika ==========")
    // dalam bahasa Kotlin juga ada operator matematika
    // dan semua aturan matematika sudah termasuk di dalamnya
    // Contoh
    var numberOne : Int = 3
    var numberTwo : Int = 2
    println(numberTwo + numberOne * numberOne)

    // catatan, dalam pembagian tipe data Int hasil akhir akan dibulatkan kebawah
    // Contoh
    var angka : Int = 49
    var bagi : Int = 10
    println(angka / bagi)

    // dalam bahasa Kotlin tidak bisa kita melakukan konversi secara langsung
    // jika ingin konversi dari satu tipe data ke tipe data lain bisa menggunakan
    // properti fungsi, Contoh
    var byteNumber : Byte = 10
    var intNumber : Int = byteNumber.toInt()

    // dalam bahasa Kotlin kita bisa menuliskan nilai numerik yang mudah dibaca
    // dengan menggunakan tanda underscores
    // Contoh
    var intAngka : Int = 1_000_000
    println(intAngka)
}