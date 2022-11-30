package com.bdt.kotlin

// Concurrency vs Parallelism
/* Jika membahas concurrency, tentunya terkait dengan paralellism. Mungkin ada yang bingung mengenai perbedaan
*  antara keduanya. Bagaimanapun, concurrency dan paralellism mempunyai arti yang mirip, yaitu 2 (dua) atau
*  lebih proses yang berjalan satu waktu. Namun penting diketahui bahwa concurrency bukanlah paralellism.
*
*  Baik concurrency maupun parallelism, biasanya melibatkan pembuatan thread-thread untuk menjalankan tugas.
*  Thread-thread tersebut bisa dijalankan di satu atau lebih core. Lalu apakah perbedaan daru keduanya?
*
*  Concurrency terjadi apabila terdapat 2 (dua) atau lebih proses yang tumpang tindih dalam satu waktu. Ini bisa
*  terjadi jika ada 2 (dua) atau lebih thread yang sedang aktif. Dan jika thread tersebut dijalankan oleh
*  komputer yang hanya memiliki 1 (satu) core, semua thread tidak akan dijalankan secara paralel. Concurrency
*  memungkinkan sebuah komputer yang hanya memiliki 1 (satu) core tampak seakan mengerjakan banyak tugas sekaligus.
*  Padahal sebenarnya tugas-tugas tersebut dilakukan secara bergantian.
*
*  Sedangkan parallelism terhadi ketika 2 (dua) proses dijalankan pada titik waktu yang sama persis. Parallelism
*  bisa dilakukan jika terdapat 2 (dua) atau lebih thread dan komputer juga memiliki 2 (dua) core atau lebih.
*  Sehingga setiap core dapat menjalankan perintah masing-masing thread secara bersamaan.
*
*  Untuk ilustrasi Concurency: Bayangkan kita ada di warung kopi dan melihat antrian. Pelanggan dengan masing-
*  masing pesanannya pasti akan senang jika sang barista bisa melayani dengan tepat dan cepat. Jika pada warung
*  tersebut hanya terdapat seorang barista, otomatis sang barista harus melakukan cara untuk melayani semua
*  pelanggan sekaligus. Pada situasi ini concurency dibutuhkan.
*  Karena hanya terdapat seorang barista, maka barista tersebut akan memproses lebih dari satu pesanan secara
*  bersamaan. Hal ini sangat mungkin terjadi karena pembuatan kopi membutuhkan beberapa langkah, dan masing-
*  masing langkah memakan waktu tersendiri. Misalnya menyiapkan air panas, menakar kopi, menyiapkan mesin espresso
*  dan lain-lain. Barista akan membagi langkah-langkah tersebut sehingga seolah-olah ia bisa mengerjakan pesanan
*  secara bersamaan.
*
*  Berbeda jika sang barista punya teman kerja untuk berbagi tugas. Pada situasi ini paralellism bisa dilakukan.
*  Barista 1 hanya akan melayani beberapa pelanggan, dan sisanya akan dilayani oleh barista 2.
*  Karena kedua barista tersebut telah berbagi tugas, maka mereka akan bertindak secara paralel sehubungan
*  dengan tugas yang lebih besar dalam melayani pelanggan. Bagaimanapun, selama jumlah barista belum sama dengan
*  jumlah pelanggan, concurenncy masih tetap diperlukan pada masing-masing barista tersebut. Artinya, paralellism
*  dapat menimbulkan concurency, tetapi concurency bisa terjadi tanpa paralellism. */