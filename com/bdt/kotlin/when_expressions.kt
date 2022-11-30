package com.bdt.kotlin

import kotlin.random.Random

fun main(){
    // untuk menentukan statement dan expressions selain menggunakan if expressions
    // kita bisa menggunakan when expressions
    val nilai = 9
    when (nilai){
        6 -> println("nilainya adalah 6")
        7 -> println("nilainya adalah 7")
        8 -> println("nilainya adalah 8")
        9 -> println("nilainya adalah 9")
    }
    // when akan mencocokkan semua argumen pada setiap branch secara berurutan sampai salah
    // satu kondisi terpenuhi. Di dalam when kita juga bisa menambahkan branch else
    when (nilai){
        5 -> println("nilainya adalah 6")
        7 -> println("nilainya adalah 7")
        8 -> println("nilainya adalah 8")
        else -> println("nilai tidak diketahui")
    }// else akan dieksekusi jika tidak ada satupun kondisi yang terpenuhi

    // when expression dapat mengembalikan nilai dan dapat disimpan dalam sebuah variabel
    // contoh
    var hasil = when (nilai){
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }// else adalah hal wajib jika kita menggunakan when expressions untuk mengembalikan nilai
    // jika tidak ada else maka akan terjadi error
    println(hasil)
    print("\n")
    // jika kita memiliki dua baris atau lebih yang akan dijalankan di setiap branch, kita
    // bisa memindahkan ke dalam curly braces
    val hasil2 = when (nilai){
        6 -> {
            println("Six")
            "nilainya adalah 6"
        }
        7 -> {
            println("Seven")
            "nilainya adalah 7"
        }
        8 -> {
            println("Eight")
            "nilainya adalah 8"
        }
        9 -> {
            println("Nine")
            "nilainya adalah 9"
        }
        else -> {
            println("Nilai tidak terdefinisi")
            "masukkan nilai yang benar"
        }
    }
    println(hasil2)
    print("\n")

    // when juga memungkinkan kita untuk memeriksa setiap instance dengan tipe tertentu dari
    // sebuah objek dengan menggunakan is dan !is. Contoh
    val sembarangNilai : Any = 100L
    when (sembarangNilai){
        is Int -> println("tipe data termasuk ke tipe Integer")
        is Long -> println("tipe data termasuk ke tipe Long")
        is String -> println("tipe data termasuk ke tipe String")
        else -> println("tipe data tidak terdeteksi")
    }
    print("\n")
    /* Selain itu hal yang dijelaskan diatas
    * when expressions juga bisa kita gunakan untuk memeriksa nilai yang terdapat pada
    * sebuah Range atau Collection. Range adalah tipe data yang unik dimana kita bisa
    * menentukan nilai awal dan nilai akhir*/
    // Contoh
    val nilai1 = 39
    val radius = 10..50
    when (nilai1){
        in radius -> println("nilai ada di dalam radius")
        !in radius -> println("nilai ada diluar dalam radius")
        else -> println("nilai tidak terdefinisi")
    }// branch pertama akan memeriksa apakah nilai ada di radius yang telah ditetapkan
    // branch kedua akan memeriksa apakah nilai ada di luar radius yang telah ditetapkan
    // sedangkan else akam dieksekusi jika kedua kondisi sebelumnya tidak terpenuhi
    print("\n")
    // sejak Kotlin 1.3, kita bisa menangkap subjek dari when expressions di dalam sebuah
    // variabel
    // contoh
    val subjekNilai = when (val nilai2 = getsubjekNilai()){
        in 1..50 -> 50*nilai2
        in 51..100 -> 100*nilai2
        else -> nilai2
    }// perhatikan cakupan nilai variabel yang dapat ditangkap, terbatas di dalam body when expression
    println("nilai random yang didapat saat ini $subjekNilai")
}
fun getsubjekNilai() = Random.nextInt(100)

/* KESIMPULAN
* kita melihat dari beberapa contoh diatas penggunaan when expressions memiliki kesamaan dengan
* if expressions. Lantas disituasi seperti apa kita akan menggunakannya ?
* if expressions sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari dua kondisi dan
* kondisi yang diberikan tidak terlalu rumit
* Berbeda dengan when expressions, ia bisa digunakan ketika kondisi yang diberikan lebih dari dua*/