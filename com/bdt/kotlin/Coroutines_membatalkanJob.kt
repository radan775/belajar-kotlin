package com.bdt.kotlin
import kotlinx.coroutines.*

// Membatalkan Job
/* Ibarat pekerjaan di dunia nyata, sebuah job seharusnya bisa dibatalkan. Hanya job yang sedang aktif yang dapat
*  dibatalkan. Kita bisa melakukannya dengan memanggil fungsi cancel() seperti berikut: */

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }
/* Kode di atas menggambarkan sebuah job membutuhkan waktu 5 detik untuk dijalankan. Namun ketika mencapai
*  2 detik, job tersebut telah dibatalkan. Saat fungsi cancel() dipanggil, job akan memasuki state Cancelling
*  sampai pembatalan tersebut berhasil. Kemudian setelah pembatalan berhasil, job akan memiliki state Cancelled
*  dan Completed.
*
*  Perlu diketahui bahwa jika cancel() dipanggil dalam job baru yang belum dijalankan, job tersebut tidak akan
*  memalui state Cancelling, melainkan akan langsung memasuki state Cancelled.
*
*  Kita juga bisa menambahkan parameter terhadap fungsi cancel(), yaitu parameter cause yang bisa digunakan
*  untuk memberitahu kenapa sebuah job dibatalkan.
job.cancel(cause = CancellationException("Time is up!))

*  CancellationException akan mengirimkan nilainya sebagai pengecualian dari job tersebut. Kitapun bisa mengakses
*  nilai tersebut dengan fungsi getCancellationException. Karena getCancellationException masih tahap eksperimen,
*  Kita perlu manambahkan anotasi @InternalCoroutinesApi.*/
    delay(2000)
    job.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}