package com.bdt.kotlin


fun main(){
    val rangeNilai = 1..10
    rangeNilai.forEach {
        print("$it ")
    }
    println(rangeNilai.step)
    /* kode diatas menggunakan operator .. untuk membuat Range. varibel rangNilai diatas mencakup nilai
    * 1,2,3,4,5,6,7,8,9,10. Jarak antara kedua nilai yang dicakup, ditentukan oleh step. Secara default
    * step bernilai 1. Untuk mendapatkan step kita bisa menggunakan properti step seperti contoh dibawa
    * */
    println("step secara default pada variabel rangeNilai diatas adalah "+rangeNilai.step+"\n")
    // untuk mengubah nilai dari step bisa dilakukan dengan menginisialisasi nilai yang dicakup Range itu sendiri
    // contoh
    val rangeBaru = 1..20 step 2
    rangeBaru.forEach{
        print("$it ")
    }
    println(rangeBaru.step)

    // selanjutnya adalah fungsi rangeTo()
    val rentanNilai = 1.rangeTo(10)
    // kode diatas menggantikan operator .. dengan fungsi rangrTo() untuk membuat Range
    // nilai yang dicakup sama seperti ..

    // kita juga bisa menentukan nilai yang dicakup dengan urutan terbalik
    // contoh
    val nilaiTerbalik = 10.downTo(1)
    // kode diatas akan mencakup nilai 10,9,8,7,6,5,4,3,2,1

    // kita juga bisa memeriksa apakah suatu nilai berada dalam cakupan nilai Range
    // dengan cara berikut
    val tenToOne = 10.downTo(0)
    if (7 in tenToOne){
        println("nilai 7 ada di dalam cakupan nilai")
    }
    // kode diatas ini sama seperti ketika kita menggunakan code if expressions seperti berikut
    if (1 <=7 && 7 <= 10){
        println("nilai 7 ada dalam cakupan")
    }

    // diatas kita telah mempelajari untuk memeriksa apakah ada nilai dalam sebuah cakupan Range
    // disini kita juga bisa memeriksa apakah sebuah nilai tidak ada dalam sebuah cakupan nilai
    if (11 !in tenToOne){
        println("nilai 11 tidak ada dalam cakupan nilai")
    }
    // selain menggunakan Range nilai numerik, kita juga bisa menentukan tipe Character sebagai nilai
    // yang dicakup oleh Range
    val rangeChar = 'A'.rangeTo('Z')
    rangeChar.forEach(){
        print("$it ")
    }
    println(rangeChar.step)

    // Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange, dan CharRange
}