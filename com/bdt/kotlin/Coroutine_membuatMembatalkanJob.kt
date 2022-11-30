package com.bdt.kotlin
import kotlinx.coroutines.*

// Membuat job baru
/* Job dapat diinisialisasikan menggunakan fungsi launch() maupun job() seperti berikut:
menggunakan launch():
fun main() = runBlocking {
    val job = launch {
        // Do background task here
    }
}

menggunakan Job():
fun main() = runBlocking {
    val job = Job()
}
 Setelah diinisialisasikan, job akan memiliki state New dan akan langsung dijalankan. Jika kita ingin membuat
 sebuah job tanpa langsung menjalankannya, kita bisa memanfaatkan CoroutineStart.LAZY seperti berikut: */
fun main() = runBlocking{
    val job = launch(start = CoroutineStart.LAZY){
        TODO("Not implemented yet!")
    }
    // Dengan begitu job tersebut bisa dijalankan saat nanti dibutuhkan

// Menjalankan Job
/* Setelah membuat sebuah job, kini kita bisa mulai menjalankan job tersebut. Caranya pun cukup sederhana, kita
*  bisa menggunakan fungsi start() seperti berikut: */
    val job1 = launch(start = CoroutineStart.LAZY){
        delay(1000L)
        println("start new Job")
    }
    job1.start()
    println("other task")
    // atau bisa juga dengan menggunakan fungsi join() :
    job1.join()
    println("other task with join")
    /* Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut
    *  selesai, sedangkan join() akan menunda eksekusi sampai job selesai. Jika kode pertama dijalankan, maka
    *  konsol akan menampilkan hasil berikut:
        Other task
        Start new job!
    *  Sedangkan kode kedua akan menampilkan hasil:
        Start new job!
        Other task
    *  Setelah dijalankan. job akan memiliki state Active.*/
}