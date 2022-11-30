package com.bdt.kotlin

fun main (){
    // Tipe data dalam Kotlin
    // Integer
    var intNumber : Int = 10
    // Long, ada dua cara penulisan tipe data Long
    var longNumber : Long = 100
    var longNumber1 = 100L
    // Short
    var shortNumber : Short = 10
    // Short, biasanya digunakan untuk keperluan proses membaca dan menulis data
    // dari sebuah stream file atau jaringa
    val byteNumber = 0b11010010
    println(byteNumber)
    // Double, besar data yang dapat disimpan sama dengan Long
    // perbedaannya Double bisa menyimpan data berupa nilai desimal hingga 15-16
    // angka di belakang koma
    var doubleNumber : Double = 1.4
    // Float, fungsinya sama dengan tipe data Double namun float memiliki
    // ukuran yang lebih kecil yaitu 6-7 angka di belakang koma
    // catatan untuk nilai float di belakang nilai ditambah "f"
    var floatNumber : Float = 1.5f

    // jika kita ingin mengetahui jumlah maksimal data yang dapat disimpan oleh
    // sebuah tipe data, kita bisa menggunakan properti MAX.VALUE dan MIN_VALUE
    // Contoh
    var maxInt = Int.MAX_VALUE
    var minInt = Int.MIN_VALUE
    println("nilai minimal dalam tipe data Integer adalah $minInt")
    println("nilai maksimal dalam tipe data Integer adalah " +maxInt)

    // jika kita ingin memasukkan nilai yang lebih dari isi maksimal data yang disimpan
    // oleh sebuah tipe data, maka akan terjadi overflow. Artinya nilai yang
    // ditampilkan akan kembali ke nilai minimal
    // Contoh
    var maxInt1 = Int.MAX_VALUE
    val nilaiLebih = maxInt1 + 1
    println("Nilai maksimal dari Integer adalah "+maxInt1)
    println("contoh nilai yang lebih dari batas $nilaiLebih")
}