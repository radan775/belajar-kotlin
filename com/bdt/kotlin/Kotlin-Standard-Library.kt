package com.bdt.kotlin

fun main(){
    /* Strandard function library adalah salah satu fitur di dalam Kotlin yang akan kita pelajari.
    *  ini adalah sebuah extension functions dari sebuah objek yang menggunakan lambda sebagai argumen
    *  atau yang disebut sebagai higher-order function. */

    println("Scope Function")
    /* Kotlin standard library memiliki fungsi yang tujuan utamanya adalah bagaimnana menuliskan logika
    *  kode di dalam konteks dari sebuah objek. Dalam menggunakan fungsi tersebut kita akan memanfaatkan
    *  lambda expression yang memiliki ruang lingkupnya sendiri, dimana dalam ruang lingkup tersebut
    *  kita dapat mengakses konteks dari sebuah objek.
    *
    *  Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi yang berada di dalamnya antara
    *  lain: let, run, with, apply, dan also. Pada dasarnya beberapa fungsi tersebut melakukan tugas yang
    *  sama yaitu mengeksekusi blok kode dari dalam sebuah objek. Yang membedakannya adalah bagaimana objek
    *  tersebut tersedia dan seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.*/

    println("Context Object")
    /* Sebelum kita mengulas beberapa fungsi yang menjadi  bagian dari scope function di atas, kita perlu
    *  mengetahui terlebih dahulu bagaimana cara mengakses konteks sebuah objek dari dalam lambda yang menjadi
    *  bagian dari scope function.
    *
    *  Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this)  dan lambda argumen (it). Keduanya
    *  memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.*/

    println("Lambda receiver (this)")
    /* Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply. Ketika ingin mengakses
    *  konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this.
    *  misalnya seperti penggunaan fungsi apply pada lambda buildString() */

    println("Lambda argument (it)")
    /* Selanjutnya, fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah
    *  fungsi let dan also. Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk
    *  diproduksi atau inisialisasikan untuk variabel lain. Contoh:  */
    var text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
    // Secara default, nama dari argumen tersebut adalah it, namun kita dapat mengubahnya seperti berikut:
    var text1 = "Hello"
    text1.let{ nilai ->
        val message = "$nilai Kotlin"
        println(message)
    }
}
val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
    // cara ini memiliki kekurangan yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada
    // dari luar lingkup fungsi tersebut. Alih-alih cara ini lebih ditujukan untuk opreasi objek itu sendiri,
    // seperti memanggil fungsi dan inisialisasi nilai dari anggota yang menjadi bagian objek tersebut.
}

