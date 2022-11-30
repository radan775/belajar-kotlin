package com.bdt.kotlin

fun main (){
    println("===== String Template =====")
    /*
    * string template adalah mekanisme penulisan String yang memungkinkan
    * kita untuk menyisipkan sebuah variabel ke dalam String tanpa
    * menggunakan concatenation (penggabungan string dengan menggunakan +)*/
    // contoh yang menggunakan concatenation
    var name = "Kotlin"
    println("My name is "+ name)

    // contoh string yang menggunakan string template
    println("My name is $name")

    /*
    * varibel yang dapat disisipkan tidak sebatas String. kita juga bisa
    * memasukkan tipe data lain contohnya Int atau Double */
    var old : Float = 3.0f
    println("My name is $name, im $old years old")

    /*
    * tidak hanya sampai disana, kita juga bisa menyisipkan sebuah expression
    * ke dalan sebuah template String */
    // contoh
    var hour = 7
    println("Office ${if (hour > 7) "already close" else "is open"}")
}