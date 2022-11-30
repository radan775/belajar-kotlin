package com.bdt.kotlin

/* Memasuki modul terakhir ini, kita akan mempelajari dasar concorency pada Kotlin hingga alasan mengapa developer
*  wajib mencoba Kotlin Coroutines. Concurency merupakan sebuah topik yang cukup dalam. Jika dibagas secara
*  menyeluruh mungkin tidak akan cukup di akademi ini. Maka dari itu, modul ini adalah pengantarnya. Diharapkan
*  setelah memahami materi ini, pembaca dapat mengetahui gambaran apa itu concurency dan perbedaannya pada Kotlin
*  dibandingkan bahasa pemrograman lainnya. */

// Apa itu concurency
/* Concurency adalah beberapa proses yang terjadi secara bersamaan dalam suatu sistem. Concurency merupakan
*  suatu fenomena alami yang umum terjadi. Seperti hanya di dunia nyata, banyak kegiatas yang dilakukan pada
*  waktu yang bersamaan. Dengan demikian, ketika kita ingin mengembangkan sebuah sistem untuk membantu kegiatan
*  nyata, tentunya kita harus peduli dengan yang namnay concurency.
*
*  Arus lalu lintas bisa menjadi ilustrasi yang tepat untuk menggabarkan proses concurency. Lalu lintas paralel
*  di jalan yang berbeda hanya akan menimbulkan interaksi dan potensi masalah yang kecil antar kendaraan. Berbeda
*  dengan lalu lintas pada yang biasanya kita jumpai pada persimpangan. Pastinya interaksi dan potensi masalah
*  antar kendaraan akan lebiah besar dan membutuhkan koordinasi yang lebih. Begitu pula dalam sebuah sistem
*  aplikasi. Proses paralel yang tidak saling berinteraksi hanya akan menyebabkan masalah concurency yang
*  sederhana. Berbeda dengan proses yang saling berinteraksi bahkan berbagi sumber daya. Masalahnya tentu lebih
*  kompleks.
*
*  Penting untuk memperhatikan beberapa aspek saat berurusan dengan concurency pada semua sistem. Aspek terpenting
*  adalah mampu mendeteksi dan merespon peristiwa eksternal yang terjadi dalam urutan acak. Selain itu juga
*  dipastikan bahwa peristiwa tersebut dapat ditanggapi dalam interval waktu minimum yang diwajibkan.
*
*  Faktor eksternal sering jadi pendorong dibutuhkannya concurency. Dalam kehidupan sehari-hari, banyak hal yang
*  terjadi secara bersamaan dan harus ditangani secara real-time oleh sistem. Oleh karena itu sistem harus
*  "reactive" alias dituntut mananggapi proses yang dihasilkan secara ekstenal. Proses tersebut dapat terjadi
*  pada waktu dan urutan yang tidak bisa ditentukan. Membangun sistem konvensional untuk mengatasi tugas
*  tersebut, tentunya sangat rumit.
*
*  Di dinia komputer, concurrency umumnya terkait dengan banyaknya core atau inti dari prosesor (CPU). Pada
*  dasarnya, sebuah komputer memiliki mekanisme sequential atau berurutan untuk menjalankan tugas. Prosesor
*  akan menjalankan satu perintah pada satu waktu. Dengan concurency, kita bisa memanfaatkan kinerja prosesor
*  dengan lebih optimal. Concurency memungkinkan sebuah sistem untuk bisa dikendalikan dengan mudah. Sebagai
*  contoh, suatu fungsi bisa dijalankan, dihentikan, ataupun dipengaruhi oleh fungsi lain yang jalan secara
*  bersamaan. */