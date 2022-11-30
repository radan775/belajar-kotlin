package com.bdt.kotlin
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

//Coroutines Builder
/* Pada sub-modul sebelumnya kita sudah mencoba menggunakan fungsi runBlocking dan lauch untuk memulai sebuah
*  coroutines. Kedua fungsi tersebut merupakan coroutines builder, yaitu sebuah fungsi yang mengambil suspending
*  lambda dan membuat coroutine untuk menjalankannya.
*
*  Kotlin menyediakan beberapa coroutine builder yang bisa disesuaikan dengan berbagai macam skenario. seperti:
*  - launch
    Seperti yang sudah kita coba sebelumnya, fungsi ini digunakan untuk memulai sebuah coroutines yang tidak akan
    mengembalikan sebuah hasil. launch akan menghasilkan Job yang bisa kita gunakan untuk membatalkan eksekusi.
   - runBlocking
    Fungsi ini dibuat untuk menjembatani blocking kode menjadi kode yang dapat ditangguhkan. runBlocking akan
    memblokir sebuah thread yang sedang berjalan hingga eksekusi coroutine selesai. Seperti contoh sebelumnya,
    kita bisa mengguankannya pada fungsi main() dan bisa juga untuk penerapan unit test.
   - async
    Kebalikan dari launch, fungsi ini digunakan untuk memulai sebuah coroutine yang akan mengembalikan sebuah hasil.
    Ketika menggunakannya, Kita harus berhati-hati karena ia akan menangkap setiap exception yang terjadi di dalam
    coroutine. Jadi async akan mengembalikan Deferred yang berisi hasil atau exception. Ketika yang dikembalikan
    adalah exception, maka kita harus siap untuk menanganinya.
*
*  Sekarang giliran kita untuk mencoba contoh penerapan coroutine dengan async. Bayangkan jika kita memiliki
*  2 (dua) suspending function seperti berikut: */

suspend fun getCapital(): Int{
    delay(1000L)
    return 50000
}
suspend fun getIncome(): Int{
    delay(1000L)
    return 75000
}
/* Anggap saja bahwa delay pada kedua fungsi tersebut adalah waktu yang dibutuhkan untuk melakukan operasi
*  sebelum hasilnya didapatkan. Selanjutnya kita ingin memanfaatkan keduanya, misalnya untuk menghitung keuntungan
*  seperti berikut: */

fun main() = runBlocking {
    val capital = getCapital()
    val income = getIncome()
    println("Your profit is ${income - capital}")
/* Pada kode di atas, kita menggunakan pendekatan sequential. Kenapa? Pada dasarnya kode di dalam coroutines
*  juga dijalankan secara berurutan seperti kode normal lain. Dalam praktiknya kita melakukan ini jika kita
*  menggunakan hasil dari fungsi pertama untuk membuat keputusan apakah kita perlu memanggil fungsi kedua.
*
*  Bagaimana jika tidak ada ketergantungan antara fungsi getCapital() dan getIncome() dan kita ingin menjalankan
*  keduanya secara bersamaan? Di sinilah async dibutuhkan. Kita bisa menuliskan kode seperti berikut: */
    val capital1 = async { getCapital() }
    val income1 = async { getIncome() }
    println("Your profit is ${income1.await() - capital1.await()}")
/* Dengan kode tersebut, kita telah memanggil fungsi getCapital() dan getIncome() di dalam async. Maka async akan
*  mengembalikan nilai dari masing-masing fungsi. Lalu untuk mengakses hasil tersebut, kita perlu menggunakan
*  fungsi await().
*
*  Wait.. adakah perbedaan dengan kode sebelumnya? Dengan async seolah-olah kedua fungsi tersebut berjalan
*  bersamaan dan membutuhkan waktu yang lebih singkat dari kode sebelumnya.
*  Untuk membuktikannya, kita coba jalankan kode berikut: */
    println()

    val timeOne = measureTimeMillis {
        val capital2 = getCapital()
        val income2 = getIncome()
        println("Your profit is ${income2 - capital2}")
    }

    val timeTwo = measureTimeMillis {
        val capital2 = async { getCapital() }
        val income2 = async { getIncome() }
        println("Your profit is ${income2.await() - capital2.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
    // Dari output kode ini bisa kita lihat bahwa kode yang dijalankan di dalam async bisa selesai hampir
    // 2 kali lipat lebih cepat dibandingkan tanpa async.
}