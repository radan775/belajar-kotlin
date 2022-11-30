package com.bdt.kotlin


//Process, Thread, I/O-Bound
/* Saat kita mulai menjalankan sebuah aplikasi, sebenarnya sistem operasi akan membuat sebuah proses, kemudian
*  kemudian melampirkan sebuah thread kepadanya, dan setelah itu mulai menjalankan thread tersebut. Semua aktivitas
*  tersebut akan bergantung pada perangkat yang digunakan, terutama perangkat-perangkat input dan output (I/O).
*
*  Untuk bisa memahami dan juga menerapkan concurenncy dengan benar, developer perlu mempelajari beberapa konsep
*  dasar seperti Process, Thread, dan I/O bound. Ketiga konsep tersebut saling berhubungan. Oleh karena itu, kita
*  akan mencoba mengulas semua konsep tersebut. */

// Process
/* Sebuah proses (process) merupakan bagian dari aplikasi yang sedang dijalankan. Setiap aplikasi dijalankan,
*  maka saat itu juga proses dijalankan. Tergantung pada sistem operasi yang digunakan, suatu proses dapat
*  terdiri dari beberapa thread yang menjalankan instruksi secara bersamaan.
*
*  Proses sering dianggap identik dengan program atau aplikasi. Namun, sebenarnya sebuah aplikasi adalah
*  serangkaian proses yang saling bekerja sama. Untuk memfasilitasi komunikasi antar proses, sebagian besar
*  sistem operasi mendukung sumber daya Inter Process Communication (IPC), seperti pipes dan soket. Biasanya
*  sistem operasi modern sudah mendukung IPC. IPC digunakan tidak hanya untuk komunikasi antar proses pada sistem
*  yang sama, melainkan juga untuk proses pada sistem yang berbeda.
*
*  Kita pasti mengenal dengan sebuah konsep yang bernama multitasking atau melakukan banyak tugas secara bersamaan.
*  Saat multitasking, sebenarnya sistem operasi hanya beralih di antara berbagai proses dengan sangat cepat
*  untuk memberikan kesan bahwa proses ini sedang dijalankan bersamaan. Sebaliknya, multiprocessing adalah
*  metode untuk menggunaka lebih dari satu CPU dalam menjalankan tugas.
*
*  Dalam concurency dan paralellism, multiprocessing mengacu pada pelaksanaan berbagai proses bersamaan dalam
*  suatu sistem operasi, di mana setiap proses dieksekusi pada CPU terpisah. Oleh karena itu, multiprocessing
*  merupakan tantangan tersendiri bagi developer dalam mengembangkan sebuah aplikasi. */

//Thread
/* Thread biasa dikenal dengan proses yang ringan. Membuat thread baru membutuhkan lebih sedikut sumber daya
*  daripada membuat proses baru. Sebuah thread mencakup serangkaian instruksi untuk dijalankan oleh processor.
*  Sehingga suatu proses akan memiliki setidaknya satu thread, yang dibuat untuk mengeksekusi fungsi utama dari
*  sebuah aplikasi. Secara umum, thread tersebut disebut dengan main thread, dan life cycle dari sebuah proses
*  akan terikat padanya.
*
*  Lebih dari satu thread dapat diimplementasikan dalam proses yang sama, dan dapat dieksekusi secara bersamaan.
*  Perbedaan utama antara proses dan thread adalah bahwa thread biasanya merupakan komponen dari suatu proses.
*  Selain itu, thread biasanya memungkinakan untuk berbagi sumber daya seperti memori dan data. Dimana 2 (dua)
*  hal tersebut jarang dilakukan untuk sebuah proses.
*
*  Setiap thread dapat mengakses dan memodifikasi sumber daya yang terkandung dalam proses yang dilampirkan,
* tetapi juga memiliki penyimpanan lokal sendiri, yang biasa disebut dengan thread-local storage.
*
*  Hanya satu dari instruksi dalam sebuah thread yang dapat dijalankan pada waktu tertentu. Jadi, jika sebuah
*  thread terblokir, instruksi lain dalam thread yang sama tidak akan dijalankan sampai pemblokiran tersebut
*  berakhir. Namun demikian, banyak thread dapat dibuat untuk proses yang sama, dab mereka dapat berkomunikasi
*  satu sama lain. Jadi diharapkan aplikasi tidak akan pernah memblokir thread yang dapat mempengaruhi pengalaman
*  pengguna secara negatif.
*
*  Selain main thread, terdapat juga thread lain yang dikenal dengan UI thread. Thread ini berfungsi untuk
*  memperbarui user interface (antarmuka) dan juga merespon aksi yang diberikan pada aplikasi. Jika thread ini
*  diblokir, maka semua tugasnya akan terhalangi. Oleh karena itu, jangan sampai memblokir IU thread agar aplikasi
*  tetap berjalan dengan semestinya. */

// I/O Bound
/* Bottlenecks atau kemacetan adalah suatu hal yang penting untuk ditangani demi mengoptimalkan kinerja aplikasi.
*  Bayangkan saja ketika kita menggunakan sebuah aplikasi dan terjadi bottleneck di dalamnnya, kesal sendiri kan?
*  Perangkat input dan output biasanya sering mempengaruhi sebuah aplikasi mengalami bottlenecks. Sebagai contoh,
*  memori yang terbatas, kecepatan procesor, dan sebagainya. Lalu bagaimanakah cara untuk mengatasinya?
*
*  I/O Bound merupaka sebuah algorima yang bergantung pada perangkat input atau output. Waktu untuk mengeksekusi
*  sebuah I/O-bound tergantung pada kecepatan perangkat yang digunakan. Sebagai contoh, suatu algoritma untuk
*  membaca dan menulis sebuah dokumen. Ini adalah operasi I/O yang akan tergantung pada kecepatan di mana berkas
*  tersebut dapat diakses. Berkas yang disimpan pada SSD akan lebih cepat diakses dibandingkan berkas yang
*  disimpan pada HDD.
*
*  Algoritma I/O-bound akan selalu menunggu sesuatu yang lain. Penantian terus-menerus ini memungkinkan perangkat
*  yang hanya memiliki satu core untuk menggunakan processor demi tugas-tugas bermanfaat lainnya sambil menunggu.
*  Jadi algoritma concurrent yang terikat dengan I/O akan melakukan hal yang sama, terlepas dari eksekusi yang
*  terjadi -apakah paralel atau dalam satu core?
*
*  Seperti yang telah disebutkan sebelumnya, sangat penting untuk tidak memblokir UI thread dalam sebuah aplikasi.
*  Oleh karena itu. saran kami terapkanlah concurrency jika aplikasi yang kita kembangkan punya ketergantungan
*  dengan perangkat I/O.*/