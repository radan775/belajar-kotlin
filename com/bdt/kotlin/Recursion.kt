package com.bdt.kotlin

fun main(){
    /* Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan
    *  pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks. Di Kotlin, recursion disebut juga
    *  dengan recursive function.
    *  Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri,
    *  Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali. Setiap pemanggilannya bisa kita atur agar
    *  dapat mengembalikan nilai dan digunakan sebagai argumen untuk pemanggilan fungsi berikutnya serta
    *  mengembalikan nilai akhir berupa perhitungan nilai kembalian dari setiap pemanggilan fungsi tersebut.
    *  Lalu penyelesaian seperti apa yang dapat kita lakukan dengan recursive ? Perhatikan kode berikut:
    *  lanjut ke fungsi factorial()*/
    println(factorial(9))
    println(faktorial(9))
    // jika kita memasukkan argumen dengan nilai besar
    // println(faktorial(999999))   // konsol akan menampilkan error java.lang.StackOverflowError
    println()

    println("===== Tail Call Recursion =====")
    /* Namun kita tidak perlu khawatir dengan masalah seperti di atas. Kotlin mendukung gaya pemrograman
    *  fungsional yang bernama tail call recursion yakni sekumpulan urutan instruksi untuk menjalankan tugas
    *  tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.
    *
    * Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive. Tail recursion akan
    * memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan. Contoh: */
    // Lanjut ke fungsi faktorialLanjut()
    println(faktorialLanjut(9))
    println(faktorialLanjut1(9))
}
fun factorial(n: Int): Int{
    return if (n == 1){
        n
    } else {
        var result = 1
        for (i in 1..n){
           result *= i
        }
        result
    }
}
/* Fungsi di atas adalah contoh bagaimana menghitung faktorial dari nilai yang kita tentukan. Tidak ada yang
*  salah denga kode tersebut dan dapat dijalankan serta mengembalikan nilai sesuai dengan yang kita ingingkan.
*  Namun jika diperhatikan, untuk menghitung nilai akhir, kode di atas menggunakan for loop yang di setiap
*  iterasinya terdapat proses perhitungan nilai yang akan dikembalikan sebagai nilai akhir. Dengan recursive
*  kita bisa menentukan nilai akhir tersebut dengan cara yang lebih sederhana. Berikut contohnya: */
fun faktorial(n: Int): Int{
    return if (n == 1){
        n
    } else {
        n * faktorial(n - 1)
    }
}
// Ketika kita menjalankan fungsi diatas, program akan menciptakan tumpukan frame dengan jumlah berdasarkan
// nilai n di mana setiap frame akan mengkonsumsi memory. ini bisa menjadi masalah dalam penerapannya. Contoh
// lanjut ke baris 13

fun faktorialLanjut(n: Int, result: Int = 1): Int{
    val newResult = n * result
    return if (n == 1){
        newResult
    }else {
        faktorialLanjut(n-1, newResult)
    }
}
/* Namun dengan kode di atas kita tidak bisa langsung menghindari penumpukan frame. Ini karena secara default
*  JVM tidak mendukung optimasi tail recursion. Untuk itu, Kotlin menyediakan modifier agar kita bisa tetap
*  menerapkannya, yaitu modifier tailrec. Caranya ialah seperti berikut: */
tailrec fun faktorialLanjut1(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        faktorialLanjut1(n - 1, newResult)
    }
}
/* Pada kode di atas, modifier tailrec ditempatkan sebelum kata kunci fun. Ketika sebuah fungsi ditandai
*  dengan modifier tailrec. maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak
*  boleh digunakan dari dalam blok try-catch-finally.*/
// Cara pemanggilan ke baris 27