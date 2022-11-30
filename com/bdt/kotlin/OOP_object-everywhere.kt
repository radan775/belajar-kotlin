package com.bdt.kotlin

fun main(){
    /* Object merupakan hasil realisasi dari sebuah blueprint atau class yang tentunya memiliki fungsi
    *  dan juga properti sama seperti blueprint-nya. Artinya, dengan membuat objek kita dapat mengakses fungsi
    *  dan properti yang terdapat pada kelas tersebut.
    *  Pada Kotlin, nilai primitif seperti String, Integer, Char, Boolean merupakan sebuah Object. Hal ini
    *  berbeda dengan bahasa pemrograman yang lain. Maka dari itu, terdapat sebuah istilah yang terkenal di
    *  Kotlin, yaitu "Object Everywhere". Perhatikan kode berikut: */
    val someString = "Dicoding"
    // Pada kode tersebut kita melakukan pembuatan variabel yang juga merupakan sebuah objek dengan nama
    // someString. Objek tersebut merupakan realisasi dari kelas String, maka objek someString memiliki
    // fungsi dan properti yang merupakan anggota dari kelas String.
    someString.reader()
    /* Dari completion suggestion yang tersedia pada Intellij IDEA, kita bisa melihat beberapa fungsi yang
    *  dapat digunakan oleh objek someString. Kita bisa menggunakan fungsi reversed() untuk membuat urutan
    *  huruf disusun secara terbalik, fungsi toUpperCase() yang dapat membuat huruf menjadi kapital atau
    *  fungsi toLowerCase() yang dapat membuat menjadi huruf kecil.*/
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())
    // Kita juga dapat mengubah tipe data dengan mengakses fungsi yang tersedia dari sebuah objek String.
    val anotherSomeString = "123"
    val someInt = anotherSomeString.toInt()
    val someOtherString = "12.67"
    val someDouble = someOtherString.toDouble()
    println(someInt is Int)
    println(someDouble is Double)
    /* Hasil dari output kode menunjukkan nilai true pada kedua variabel tersebut, yang artinya kita telah
    *  berhasil mengubah suatu tipe data String ke tipe data lainnya dengan menggunakan fungsi yang terdapat
    *  pada objek String.
    *  Ini adalah gambaran mengenai objek. Penting digarisbawahi bahwa objek merupakan realisasi dari sebuah
    *  blueprint yang tentunya memiliki properti dan fungsi yang sama dengan blueprint-nya. Salah satu kegunaan
    *  objek adalah untuk mengakses berbagai properti dan fungsi pada kelas.*/
}