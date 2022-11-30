package com.bdt.kotlin

/* Coroutines merupakan fitur unggulan pada KOtling yang diperkenalkan pada Kotlin versi 1.1. Saat ini coroutines
*  sudah mencapai versi 1.5.1. Coroutines adalah cara baru untuk menulis kode yang asynchronous dan non-blocking.
*  Seperti tagline-nya "Don't block, Keep moving" yang diperkenalkan pada saat rilis Kotlin versi 1.3.
*
*  Kenapa coroutines sering disebut sebagai thread yang ringan? Coroutines juga didefinisikan eksekusi dari
*  sekumpulan instruksi untuk dieksekusi oleh prosesor. Selain itu, coroutines juga memiliki life cycle yang sama
*  dengan thread.
*
*  Walaupun coroutines dan threads bekerja dengan cara yang sama, coroutines jauh lebih ringan dan efisien.
*  Jutaan coroutines dapat berjalan pada beberapa threads. Jika dibandingkan dengan threads, coroutines tidak
*  hanya mudah diterapkan, melainkan juga jauh lebih powerfull. Kelebihan tersebut terutama berlaku pada
*  lingkungan mobile, di mana setiap miliseconds kenaikan kinerja sangat diperhitungkan. Selain itu, perbedaan
*  lainnya adalah coroutines dikelola oleh pengguna, sedangkan threads dikelola oleh sistem operasi.
*
*  Coroutines dijalankan di dalam threads. Satu thread dapat memiliki banyak coroutines di dalamnya. Namun,
*  seperti yang sudah disebutkan, hanya satu instruksi yang dapat dijalankan dalam thread pada waktu tertentu.
*  Artinya, jika kita memiliki sepuluh coroutines di thread yang sama, hanya satu dari sepuluh coroutines
*  tersebut yang akan berjalan pada titik waktu tertentu.
*
*  Walaupun coroutines dijalankan dalam sebuah thread, perlu diperhatikan bahwa keduanya tidak saling terikat.
*  Menariknya, kita juga bisa menjalankan bagian dari coroutine dalam sebuah thread, menundanya, kemudian
*  melanjutkannya pada thread yang berbeda. Coroutines cukup fleksibel untuk kita menentukan- Apakah suatu
*  thread akan menjalankan sebuah coroutine atau justru menahannya? */