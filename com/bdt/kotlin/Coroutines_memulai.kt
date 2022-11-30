package com.bdt.kotlin
import kotlinx.coroutines.*

// Memulai Coroutines
/* Untuk lebih memahami tentang coroutines, mari kita mulai mencobanya langkah demi langkah. Hal pertama yang
*  wajib kita tahu adalah bahwa coroutines bukanlah bagian dari bahasa Kotlin. Coroutines hanya library lain
*  yang sediakan oleh JetBrains. Untuk itu, agar bisa menggunakannya Kita perlu menambahkan dependensi berikut
*  pada build.gradle.kts :

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
}
*  Dengan menambahkan dependensi di atas, kini Kita sudah siap untuk mencoba menggunakan fitur-fitur coroutines
*  dalam membuat program concurrency. Yuk kita mulai dari kode yang sangat sederhana berikut ini: */

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}
/*
*  Kode di atas menggambarkan bagaimana coroutines bekerja. Kita menggunaka fungsi runBlocking untuk memulai
*  coroutine utama dan launch untuk menjalankan coroutine baru. Jika kita menjalankan program tersebut, maka
*  konsol akan menampilkan hasil ini:
Hello,
Coroutines!

*  Kata Hello, akan ditampilkan lebih awal dan kata Coroutines! Akan ditampilkan 1 detik setelahnya. Mengapa
*  demikian? Padahal jika diperhatikan, kode untuk menmapilkan kata Coroutines! dituliskan lebih dulu.
*
*  Fungsi delay(1000L) di dalam launch digunakan untuk menunda kode berikutnya selama 1 detik. delay adalah
*  fungsi uang spesial pada coroutines. Ia merupakan sebuah suspending function yang tidak akan memblokir sebuah
*  thread.
*
*  Selama proses penundaan tersebut, main thread akan terus berjalan sehingga fungsi println("Hello") akan
*  langsung dijalankan. Sedangkan kode delay(2000L) digunakan untuk menunda selama 2 detik sebelum JVM berakhir.
*
*  Ini baru permulaan loh. Masih banyak fungsi-fungsi menarik lain pada coroutines yang dapat mempermudah kita
*  dalam membuat program concurrency. Kita bisa memanfaatkan kumpulan library yang dapat ditemukan pada repositori
*  kotlinx.coroutines. JetBrains selaku tim pengembang juga berkomitmen untuk mempertahankan backward compability
*  untuk setiap perubahan yang akan dirilis. Itulah mengapa coroutines sudah diperkanalkan sejak Kotlin
*  versi 1.1 dan dirilis resmi pada versi 1.3.*/