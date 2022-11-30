package com.bdt.kotlin

fun main(){
    // For loop sama seperti while dan do while, sebuah konsep perulangan pada blok yang sama
    // selama hasil evaluasi kondisi yang diberikan terpenuhi atau bernilai true
    // contoh sederhana
    var rentang = 1..5
    for (i in rentang){
        println("nilai adalah $i")
    }
    println()
    // kita bisa juga menggunakan Range expression seperti ini
    var rentang1 = 1.rangeTo(7)
    for (i in rentang1){
        println("nilai dari proses looping adalah $i")
    }
    println()
    // selain hal diatas kita juga bisa menggunakan Range expression pada loop dengan ekstensi Step
    var rentang2 = 1.rangeTo(11) step 3
    for (i in rentang2){
        println("nilai dengan step $i")
    }
    println()
    // kita juga bisa mengakses setiap elemen pada Ranges dengan memanfaatkan fungsi withIndex()
    // contoh
    val ranges = 1..15 step 3
    for ((i, nilai) in ranges.withIndex()){
        println("nilai $nilai dengan index $i")
    }
    println()
    // selain hanya menggunakan kata kunci for dalam memulai proses perulangan, dengan tujuan yang sama
    // kita bisa menggunakan salah satu ekstensi dalam Kotlin yaitu forEach.
    // Contoh
    ranges.forEach{ nilai ->
        println("nilai adalah $nilai")
    }// kode ini hanya mencakup satu nilai yaitu hanya nilai tunggal dalam ranges
    println()
    // kita bisa menndapatkan nilai index dari tiap nilai yang dicakup dengan menggunakan
    // ekstensi forEachIndexed, seperti berikut:
    rentang2.forEachIndexed {index, nilai ->
        println("nilai dari $nilai memiliki index $index")
    }// forEachIndexed memiliki dua argumen. Pertama adalah index yang merupakan penangkap dari index
    // setiap nilai. Kedua adalah nilai yang merupakan nilai tunggal yang dicakup oleh rentang2.
    println()
    // jika kita hanya ingin menampilkan argumen index dalam sebuah perulangan dari ranges, maka kita
    // bisa mengubah argumen nilai menjadi _ (underscore)
    // contoh
    rentang2.forEachIndexed{index, _ ->
        println("nilai index yang dimiliki nilai tunggal dalam range2 adalah $index")
    }// Catatan
    // sebenarnya ini adalah sebuah aturan dimana ketika argumen dari sebuah lambda expression tidak
    // digunakan, maka kita disarankan untuk mengubahnya menjadi _ underscore
}