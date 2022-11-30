package com.bdt.kotlin

/* Kali ini kita akan mempelajari tentang Generics,yaitu sebuah konsep yang memungkinkan suatu class atau interface
*  menjadi tipe parameter yang dapat digunakan untuk berbagai macam tipe data.
*
*  // Berkenalan dengan Generics
*  Seperti yang kita ketahui, Kotlin termasuk dalam bahasa pemrograman statically types. Ketika menambahkan
*  variabel baru, maka secara otomatis tipe dari variabel tersebut dapat dikenali pada saat kompilasi.
*  Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan.
*  Pendeklarasiannya ditandai dengan tipe parameter. Kita juga bisa mengganti tipe parameter menjadi tipe yang
*  lebih spesifik dengan menentukan instance dari tipe tersebut.
*  Sebelum mempelajari bagaimana cara kita mendeklarasikan sebuah class generic, ada baiknya jika kita melihat
*  contoh bagaimana generic bekerja pada variabel dengan tipe List. Kita perlu menentukan tipe dari nilai yang
*  bisa disimpan di dalam variabel List tersebut: */
val contributor = listOf<String>("jasoet", "alfian", "nrohmen", "dimas", "widy")

/* Perhatikan kode di atas. Tipe parameter yang digunakan dalam pemanggilan fungsi listOf() adalah String, maka
*  nilai yang bisa kita masukkan adalah nilai dengan tipe String. Kita bisa menyederhanakannya dengan menghapus
*  tipe parameter tersebut. Karena kompiler akan menetapkannya secara otomatis bahwa variabel yang kita buat
*  adalah String.*/
val contributor1 = listOf<String>("jasoet", "alfian", "nrohmen", "dimas", "widy")

/* Berbeda jika kita ingin membuat variabel list tanpa langsung menambahkan nilainya. Maka list tersebut tidak
*  memiliki nilai yang bisa dijadikan acuan untuk kompiler menetukan tipe parameter. Alhasil, kita wajib
*  menentukannya secara eksplisit seperti berikut: */
val contributor2 = listOf<String>()

/* Selain itu, kita juga bisa mendeklarasikan lebih dari satu paramaeter untuk sebuah class. Contohnya adalah
*  class Map yang memiliki dua tipe parameter yang digunakan sebagai key dan value. Kita bisa menentukannya
*  dengan argumen tertentu, misalnya seperti berikut: */
val points = mapOf<String, Int>("Alfian" to 10, "dimas" to 20)