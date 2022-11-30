package com.bdt.kotlin

// Job dan Deferred
/* Secara umum, fungsi asynchronous pada coroutines terbagi menjadi 2 (dua) jenis, yaitu fungsi yang mengembalikan
*  hasil dan sebaliknya, fungsi yang tidak mengembalikan hasil. Fungsi yang mengembalikan hasil biasanya digunakan
*  jika kita menginginkan sebuah data ketika fungsi tersebut selesai dijalankan. Sebagai contoh, fungsi untuk
*  mengambil informasi dari web service yang menghasilkan respon berupa JSON atau yang lainnya. Sedangkan fungsi
*  yang tidak mengembalikan hasil biasanya digunakan untuk mengirimkan analitik, menuliskan log, atau tugas
*  sejenis lainnya.
*
*  Sebagai developer, tentunya kita menginginkan tetap bisa mengakses fungsi yang sudah dijalankan. Misalnua,
*  ketika kita ingin membatalkan tugasnya atau memberikan instruksi tambahan ketika fungsi tersebut telah
*  mencapai kondisi tertentu. Untuk bisa melakukannya, kita perlu memahami tentang Job dan Deffered pada coroutines. */

// Job
/* Job adalah sebuah hasil dari perintah asynchronous yang dijalankan. Objek dari job akan merepresentasikan
*  coroutine yang sebenarnya. Sebuah job akan memiliki 3 (tiga) properti yang nantinya bisa dipetakan ke dalam
*  setiap state atau keadaan. Berikut adalah ketiga properti tersebut:
    - isActive
    Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.
    - isCompleted
    Sebuah properti yang menunjukkan ketika sebuah job telah selesai.
    - isCancelled
    Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.
*  Pada dasarnya, job akan segera dijalankan setelah ia dibuat. Namun kita juga bisa membuat sebuah job tanpa
*  menjalankannya. Job memiliki beberapa siklus hidu0 mulai dari pertama kali ia dibuat hingga akhirnya selesai.
*
*  Dari diagram yang ada di website, kita bisa melihat bahwa job akan melewati beberapa state. Pada setiap
*  state tersebut nantinya kita bisa memberikan instruksi sesuai yang kita inginkan. Sebelum kita mengolahnya,
*  mari kita pahami terlebih dahulu semua state yang ada pada sebuah job.
   - New
    keadaan di mana sebuah job telah diinisialisasi namun belum pernah dijalankan.
    - Active
    Sebuah job akan memiliki status aktif ketika sedang berhalan. Dalam hal ini, job yang sedang ditangguhkan
    (suspended job) juga termasuk ke dalam job aktif.
    - Completed
    Ketika job sudah tidak berjalan lagi. Ini berlaku untuk job yang berakhir secara normal, dibatalkan, ataupun
    karena suatu pengecualian.
    - Cancelling
    Suatu kondisi ketika fungsi cancel() dipanggil pada job yang sedang aktif dan memerlukan waktu untuk
    pembatalan tersebut selesai.
    - Cancelled
    Keadaan yang dimiliki oleh sebuah job yang sudah berhasil dibatalkan. Perlu diketahui bahwa job yang dibatalkan
    juga dianggap sebagai completed job.*/