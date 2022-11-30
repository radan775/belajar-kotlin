package com.bdt.kotlin

// Permasalah Pada Concurrency
/* Membuat concurrent program? Banyak developer mengeluhkan itu sulit. Selain kodenya bisa dibilang sulit dituliskan,
*  terdapat juga beberapa tantangan yang perlu dihadapi. Ada beberapa permasalah yang wajib bisa kita tangani pada
*  concurrenc, yaitu deadlocks, livelocks, starvation, dan juga race conditions. */

// Deadlocks
/* Untuk menjamin bahwa code concurrent bisa disinkronkan dengan benar, apa salah satu hal yang tisa bisa
*  dihindari? Kita perlu menunda/ memblokir eksekusi saat sebuah perintah diselesaikan di thread berbeda. Hal
*  tersebut disebabkan oleh deadlocks, yaitu sebuah kondisi di aman dua proses atau lebih saling menunggu
*  proses yang lain untuk melepaskan resource yang sedang digunakan.
*
*  Deadloks mengakibatkan proses-proses yang sedang dijalankan, tidak kunjung selesai. Kasus ini merupakan umum
*  terjadi ketika banyak proses yang saling berbagi sumber daya. Dalam situasi yang bisa dibilang cukup
*  kompleks itu, tak jarang salah satu proses harus terpaksa diberhentikan.
*
*  Kasus deadlocks sebenarnya bisa kita amati pada kehidupan nyata. Sebagai contoh ilustrasi antrian mobil yang
*  sama-sama akan menyeberangi sebuah jembatan. Jembatan tersebut bisa kita ananlogikan sebagai sebuah resource
*  yang dibutuhkan oleh kedua antrian kendaraan. Karena keduanya saling membutuhkan jembatan dalam waktu yang
*  sama, maka yang terjadi adalah saling menunggu. Alhasil, tak ada kemajuan pada proses antrian tersebut. Mau
*  tidak mau, salah satu kendaraan harus ada yang mengalah atau dikalahkan.
*
*  Dalam programming situasi seperi itu juga umum terjadi. Misal ada 2 (dua) proses yang sama-sama menunggu
*  proses satunya selesai, baru proses tersebut bisa selesai. Sama seperti ilustrasi mobil. Karena keduanya
*  menunggu satu sama lain, tidak ada dari kedua proses tersebut yang akan selesai. Tugas selanjutnya pun tidak
*  akan pernah bisa dijalankan.
*
*  Dalam sebuah sistem jaringan kerap jadi masalah pemicu deadlocks. Terlebih jika problem tersebut dibarengi
*  race condition. Alhasil, apa yang terjadi? Muncullah kondisi-kondisi tak terduga yang membuat deadlocks jauh
*  lebih rumit dibandingkan dengan masalah antrian proses. */

// Livelocks
/* Sama halnya dengan deadlocks, livelocks juga merupakan kondisi di mana sebuah proses tidak bisa melanjutkan
*  tugasnya. Namun yang membedakannya adalah bahwa selama livelocks terjadi, keadaan dari aplikasi tetap bisa
*  berubah. Walaupun keadaan tersebut menyebabkan proses berjalan tidak semestinya.
*
*  Pernahkah suatu ketika kita berjalan di trotoar dan secara tidak langsung berhadapan dengan orang lain yang
*  berjalan lurus tapat ke arah kita? Ya, situasi ini pasti sering terjadi dan kadang bisa menjadi awkward
*  moment. Secara spontan pasti kita dan orang tersebut akan berusaha menghindari satu sama lain dengan bergerak
*  ke satu sisi. Tak jarang, kita bergerak ke kiri sementara orang di depan kita bergerak ke kanan. Dan karena
*  sama-sama berjalan ke arah yang berlawanan, tentunya malah menghalangi jalan masing-masing. Apakah yang akan
*  terjadi selanjutnya? Bisa jadi, Kita akan bergerak ke kanan dan pada saat yang sama orang itu bergerak ke kiri.
*  Sekali lagi sama-sama tidak dapat melanjutkan perjalanan. Kejadian tersebut bisa terjadi berulang kali sampai
*  waktu yang tidak diketahui.
*
*  Livelock bisa terjadi ketika beberapa proses bisa bereaksi saat mengalami deadlock. Proses tersebut mencoba
*  keluar dari situasi deadlock, namun waktu yang tidak tepat, menghalanginya.*/

// Starvation
/* Starvation merupakan sebuah kondisi yang biasanya terjadi setelah deadlock. Kondisi deadlock sering kali
*  menyebabkan sebuah proses kekurangan sumber daya sehingga mengalami starvation atau kelaparan. Pada kondisi
*  seperti ini, thread tidak dapat akses reguler ke sumber daya bersama dan membuat proses berhenti.
*
*  Selain deadlock, hal lain yang bisa mengakibatkan starvation adalah ketika kesalahan sistem. Akibatnya, ada
*  ketimpangan dalam pembagian sumber daya. Sebagai contoh, ketika satu proses bisa mendapat sumber daya, namun
*  tidak dengan proses lain. Biasanya, kesalahan seperti ini disebabkan oleh algoritma penjadwalan (scheduling
*  algorithm) yang kurang tepat atau bisa juga karena resource leak atau kebocoran sumber daya.
*
*  Salah satu contoh kesalahan algoritma penjadwalan bisa dilihat ketika sebuah sistem multitasking dirangcang
*  dengan tidak baik. Apa akibatnya? Dua tugas pertama selalu beralih, sementara yang ketiga tidak pernah
*  berjalan. Tugas ketiga itulah yang bisa dikatakan menderita starvation.
*
*  Salah satu solusi untuk starvation adalah dengan menerapkan algoritma penjadwalan dengan antrian prioritas
*  (process priority) dan juga menerapkan teknik aging atau penuaan. Aging merupakan sebuah teknik yang secara
*  bertahap meningkatkan prioritas sebuah proses yang menunggu dalam sistem pada waktu yang cukup lama.*/

// Race conditions
/* Pada pembahasan sebelumnya, kita sudah menyinggung istilah race conditions. Kondisi seperti apakah itu?
*  Race condition merupakan masalah umum pada concurrency, yaitu kondisi di mana terdapat banyak thread yang
*  yang mengakses data yang dibagikan bersama dan mencoba mengubahnya secara bersamaan. Ini bisa terjadi ketika
*  kode concurrent yang dituliskan untuk berjalan secara sekuensial. Artinya, sebuah perintah akan selalu
*  dijalankan dalam urutan tertentu.
*
*  Ketika race condition terjadi, maka sistem bisa saja melakukan proses yang tidak semestinya. Pada saat itu
*  bug akan muncul. Race condition dikenal sebagai masalah yang sulit untuk direproduksi dan di-debug, karena
*  hasil akhirnya tidak deterministik dan tergantung pada waktu relatif dari thread yang menghalangi. Masalah
*  yang muncul pada production bisa jadi tidak ditemukan pada saat debug. Oleh karena itu, lebih baik menghindari
*  race condition dengan cara berhati-hati saat merencanakan sebuah sistem. Ini lebih baik daripada harus
*  berusaha memperbaikinya setelah itu. Lebih repot.
*
*  Contoh sederhana dari race condition bisa kita lihat pada aplikasi perbelanjaan online. Katakanlah kita
*  menemukan barang yang ingin kita beli di sebuah toko online. Pada halaman deskripsi, tampil informasi bahwa
*  stok barang hanya sisa 1 (satu). Lalu kita langsung mengambil keputusan dengan menekan tombol beli. Pada
*  saat yang sama, ada pengguna lain yang ternyata lebih dahulu membelinya. Kondisi seperti inilah yang
*  mengakibatkan sebuah state atau keadaam berubah tanpa kita sadari. Jika sistem tidak direancang sedemikian
*  rupa, maka masalah tak terduga, bisa mengemuka.*/