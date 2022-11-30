package com.bdt.kotlin

fun main(){
    /* Kotlin collection adalah salah satu struktur data mumpuni yang banyak menyediakan fungsi untuk
    *  memudahkan kita dalam mengelola dan memanipulasi data.
    *  Pada bab ini kita akan mempelajari beberapa fungsi tingkat lanjut lainnya yang tentunya bisa kita
    *  manfaatkan untuk mengelola data seperti disebutkan di atas.
    * */

    println("===== Fold =====")
    /* Kita mulai dengan fungsi Fold, kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada
    *  di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan
    *  fungsi fuld(). Untuk contoh cara penggunaannya seperti berikut: */
    val numbers = listOf(1,2,3,4,5)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")
    /* Fungsi fold() memerlukan 2 (dua) argumen yaitu nilai awal untuk perhitungan dan lambda expression
    *  yang nilai kembaliannya digunakan untuk menentukan nilai awal selanjutnya. Nah, di dalam lambda
    *  expression nya juga terdapat 2 (dua) argumen. Yaitu, argumen current yang merepresentasikan nilai
    *  awal dan argumen item merepresentasikan masing-masing item yang berada pada numbers.*/

    /* Selain itu, terdapat juga fungsi fold lainnya yaitu foldRight(). Berbeda dengan fungsi fold(), fungsi
    *  foldRight() akan melakukan proses iterasi dari indeks terakhir dan posisi argumen pada lambda expression
    *  nya pun berbeda, di mana argumen item berada pada posisi pertama dan argumen current berada pada
    *  posisi kedua. Contoh ialah sebagai berikut: */
    val fold1 = numbers.foldRight(10){item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("fold1 result adalah: $fold1")
    println()

    println("===== Drop =====")
    /* Fungsi drop() adalah fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam
    *  sebuah objek collection berdasarkan jumlah objek yang kita tentukan. Sebagai contoh, saat kita
    *  mempunyai sebuah collection seperti berikut: */
    val number = listOf(1,2,3,4,5,6,7,8,9)
    // Kemudian kita ingin memangkas 3 (tiga) item dari collection di atas. Dengan fungsi drop(), kita bisa
    // melakukannya seperti berikut:
    val drop = number.drop(3)
    println(drop)
    /* Nilai 3 yang menjadi argumen dari fungsi drop() di atas adalah jumlah item yang akan dipangkas.
    *  Pemangkasan dimulai dari posisi indeks pertama, lalu bagaimana jika kita ingin memangkas nilai dari
    *  indeks terakhir ? Kita bisa menggunakan fungsi dropLast(). Contohnya */
    val drop1 = number.dropLast(3)
    println(drop1)
    println()

    println("===== Take =====")
    /* Jika fungsi drop() digunakan untuk memangkas, fungsi take() bisa kita manfaatkan untuk menyaring
    *  item yang berada di dalam sebuah objek collection. Pemanggilan fungsi take() sama halnya seperti
    *  fungsi drop() di mana kita perlu menentukan jumlah item yang akan disaring. Contoh: */
    val total = listOf(1,2,3,4,5,6,7)
    val take = total.take(3)
    println(take)
    // Kotlin juga menyediakan fungsi seperti dropLast() yang menjalankan operasi dari posisi indeks terakhir
    // yaitu takeLast(). Contoh:
    val take1 = total.takeLast(3)
    println(take1)
}