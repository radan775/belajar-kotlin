package com.bdt.kotlin

fun main(){
    // sequence adalah collections yang bisa dikategirikan ke dalam lazy evaluation. Lazy evaluation
    // hanya akan mengevaluasi item jika benar-benar diperlukan.
    // Contoh
    val list = (1..1000000).toList()
    //list.filter{it % 5 == 0}.map{it * 2}.forEach{ println(it) }
    // pada kode di atas, kita memiliki data collections sejumlah 1 juta item, kemudian masing-masing
    // data akan disaring berdasarkan angka yang merupakan kelipatan 5 lalu dikalikan 2 dan akhirnya
    // akan ditampilkan dalam konsol.

    // Untuk menerapkan lazy atau vertical evaluation maka kita perlu mengubah list menjadi Sequence.
    // Caranya sangat sederhana, yaitu dengan memanggil fungsi asSequence()
    //list.asSequence().filter {it % 5 == 0}.map{it * 2}.forEach { println(it) }
    // Dengan sequence, operasi akan dilakukan secara vertical atau peritem, misalnya dimulai dari
    // angka 1. Karena tidak memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map()
    // Sampai iterasi atau perulangan ke-5 akan dilakukan mapping, angka 5 akan dikalikan 2 dan
    // ditampilkan pada konsol, setelah itu akan dilanjutkan ke iterasi berikutnya sampai dengan
    // iterasi ke-1 juta.

    // untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library
    // yaitu generateSequence().
    val sequenceNumber = generateSequence(1){ it + 1}
    // pada kode di atas kita telah membuat variabel sequenceNumber dengan menggunakan fungsi
    // generateSequence() Fungsi ini memiliki 2 parameter. Parameter pertama adalah item pertama yang
    // ada di dalam collection. Parameter kedua adalah lambda expression berisi perubahan pada
    // masing-masing item. Pada contoh kode di atas, setiap item merupakan item sebelumnya ditambah 1
    // Fungsi generateSequence() akan membuat collection sequence secara tak terbatas.
    // Jadi, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    sequenceNumber.take(8).forEach { print("$it ") }


}