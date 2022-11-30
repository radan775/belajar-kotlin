package com.bdt.kotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

// Channels
/* Kita sudah belajar bagaimana membuat dan mengelola coroutines. Seperti yang kita ketahui, sebuah program
*  dapat memiliki banyak thread dan dalam beberapa thread bisa terdapat jutaan coroutines. Lalu, bagaimana jika
*  ada 2 (dua) coroutines yang saling ingin berinteraksi satu sama lain? Channels adalah jawabannya.
*
*  Beberapa masalah yang muncul pada concurency seperti deadlock, race conditions, dan lainnya, sering kali
*  dipicu oleh satu hal, apa itu? Rupanya problem pembagian memori atau sumber daya antar thread. Untuk mengatasinya,
*  banyak programming language seperti Go, Dart, dan juga Kotlin telah menyediakan channels.
*
*  Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine.
*  Pada dasarnya, channels sangat mirip dengan BlockingQueue. Namun, alih-alih memblokir sebuah thread, channels
*  menangguhkan sebuah coroutine yang jauh lebih ringan. Untuk lebih memahaminya, mari simak kode di bawah ini: */
fun main() = runBlocking(CoroutineName("main")){
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }
    repeat(5){ println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
/* Bisa dilihat pada output, pada coroutine v1coroutine bahwa channels telah mengirimkan nilai dari hasil
*  komputasi dengan menggunakan fungsi send. Setelah itu, di coroutine lain (main) chennel menerima nilai dengan
*  menggunakan fungsi receive.
*
*  Kesimpulannya, channels memungkinkan komunikasi yang aman antar kode concurrent.Ia membuat kode concurrent
*  dapat berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli di thread mana coroutine berjalan.*/
}