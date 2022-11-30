package com.bdt.kotlin
import com.dicoding.oop.utils.sayHello
import com.dicoding.oop.utils.factorial
import com.dicoding.oop.utils.pow
import com.dicoding.oop.utils.PI

// Membuat package baru
/* Seperti yang diketahui sebelumnya, package merupakan pembungkus dari class(package-level class), fungsi
*  (package-level function) atau variabel (package-level variable) berfungsi serupa. Kita juda sudah mengetahui
*  cara mengimport suatu class, fungsi, atau variabel yang terdapat pada sebuah package. Namun kita belum tahu
*  bagaimana package tersebut dibuat. Jadi pada pembahasan kali ini kita akan mencoba bagaimana untuk membuat
*  package pada Kotlin.
*  Idealnya sebuah package pada Kotlin dituliskan dengan awalan nama domain perusahaan yang dibalik. Contoh,
*  com.dicoding. Kemudian diikuti dengan nama package yang akan digunakan.
*  Untuk membuat sebuah package kita perlu membuat folder package pada berkar project. Perhatikan Project Tool
*  Window yang terdapat pada Intellij Idea. Klik kanan pada folder sre kemudian arahkan pada menu New > package.
*  Setelah itu ketikkan nama package yang akan kita buat nisalnya con.dicoding.oop.utils:
*  Perlu diingat, penamaan package selalu dituliskan dengan flatcase, tanpa garis bawah dan dipisahkan dengan titik.
*  Dengan menekan tombol "OK" maka kita berhasil membuat sebuah package folder pada project aplikasi kita.
*  Selanjutnya, buat sebuah file di dalam package utils. Disini kita menamai berkas tersebut dengan nama MyMath.kt.
*  Lanjut ke file MyMath.kt*/

fun main(){
    //com.dicoding.oop.utils.sayHello()
    // atau kita dapat menggunakan fungsi tersebut dengan mengimport package-level function tersebut lihat baris ke-2
    sayHello()
    /* Untuk dapat memahami tentang package lebih lanjut, mari kita buat beberapa fungsi dan variabel pada package
    *  tersebut. Buka kembali file MyMath.kt, tambahkan beberapa fungsi dan variabel yang akan kita gunakan nantinya.*/
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
    /* Pada awal kode terlihat saat kita menggunakan suatu fungsi atau variabel yang berada pads package tertentu,
    *  kita perlu melakukan impor pada setiap fungsi atau variabelnya. Tetapi kita kita menggunakan seluruh fungsi
    *  atau variabel dalam package tertentu kita bisa menggunakan tanda bintang(*) untuk melakukan import seluruh
    *  fungsi dan variabel di package tersebut.*/
}