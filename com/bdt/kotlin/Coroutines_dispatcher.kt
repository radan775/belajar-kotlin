package com.bdt.kotlin
import kotlinx.coroutines.*

// Coroutine Dispatcher
/* Seperti yang sudah kita ketahui, coroutines berjalan di atas sebuah thread. Tentunya kita harus mengetahui
*  thread mana yang akan digunakan untuk menjalankan dan melanjutkan sebuah coroutine. Untuk menentukannya kita
*  membutuhkan sebuah base class bernama CoroutineDispacher. Di dalam class tersebut kita akan menemukan beberapa
*  objek yang nantinya bisa digunakan untuk menentukan thread yang berfungsi menjalankan coroutines. */

// Dispatcher.Default
/* Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti lauch, async, dll jika tidak
*  ada dispatcher lain yang ditentukan. Dispatcher.Default menggunakan kumpulan thread yang ada pada JVM. Pada
*  dasarnya, jumlah maksimal thread yang digunakan adalah sama dengan jumlah core dari CPU.
*  Untuk menggunakannya, Kita cukup menggunakan coroutines builder tanpa harus menuliskan dispatcher secara
*  spesifik:
launch {
    // TODO: Implement suspending lambda here
}

*  Namun kita juga tetap diperbolehkan untuk menuliskannya secara eksplisit:
launch(Dispatcher.Default){
    // TODO: Implement suspending lambda here
} */

// Dispatcher.IO
/* Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O. Ia akan menggunakan sekumpulan
*  thread yang dibuat berdasarkan permintaan. Kita bisa menerapkannya dengan menambahkan Dispatcher.IO pada
*  coroutines builder:
launch(Dispatcher.IO){
    // TODO: Implement algorithm here
} */

// Dispather.Unconfined
/* Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.
*  Setelah pengguhan, coroutines akan dilanjutkan pada thread dimana komputasi pengguhan dipanggil.
*  Sebagai contoh, ketika fungsi a memanggil fungsi b, yang dijalankan dengan dispatcher dalam thread tertentu,
*  fungsi a akan dilanjutkan dalam thread yang sama dengan fungsi b dijalankan. Perhatikan kode berikut: */
/*fun main() = runBlocking<Unit> {
    launch (Dispatchers.Unconfined){
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
} */
/* Output yang dihasilkan memiliki arti, coroutine telah dimulai dari main thread, kemudian tertunda oleh fungsi
*  delay selama 1 detik. Setelah itu, coroutine dilanjutkan kembali pada thread DefaultExecutor.
*  Bersamaan dengan objek tersebut, ada beberapa builder yang dapat digunakan untuk menentukan thread yang
*  dibutuhkan:
*
* // Single Thread Context
*  Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang kita tentukan. Untuk
*  menerapkannya, Kita bisa memanfaatkan newSingleThreadContext() seperti kode di bawah ini:
fun main() = runBlocking<Unit>{
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher){
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}
 Walaupun sudah menjalankan fungsi delay, coroutine akan tetap berjalan pada myThread.
*  // Thread Pool
*  Sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine di salah satu
*  thread yang tersedia pada kumpulan tersebut. Runtime akan menentukan thread yang mana yang tersedia dan juga
*  menentukan bagaimana proses distribusi bebannya.
*  Kita bisa menerapkan thread pool dengan fungsi newFixedThreadPoolContext() seperti berikut: */
fun main() = runBlocking<Unit>{
    val dispatcher = newFixedThreadPoolContext(3,"myPool")
    launch(dispatcher){
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
/* Pada kode di atas, kita telah menetapkan thread myPool sebanyak 3 thread. Runtime akan secara otomatis
*  menentukan pada thread mana coroutine akan dijalankan dan dilanjutkan. Hasil dari kode tersebut ada di console*/
}