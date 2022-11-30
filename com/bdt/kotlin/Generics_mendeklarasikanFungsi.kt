package com.bdt.kotlin

//Mendeklarasikan Fungsi Generic
/* Setelah mendeklarasi generic pada sebuah class, apa berikutnya? Kita akan belajar bagaimana mendeklarasikan
*  generic pada sebuah fungsi. Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang
*  berhubungan dengan List. Misalnya, list yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada
*  tipe tertentu.
*  Fungsi generic memiliki tipe parameternya sendiri. Tipe argumen dari parameternya ditentukan ketika fungsi
*  tersebut dipanggil. Cara mendeklarasikannya sedikit berbeda dengan class generic, Tipe parameter yang berada
*  di dalam angle bracket harus ditempatkan sebelum nama dari fungsi yang kita tentukan. Sebagai contoh:
    fun <T> run(): T {

    }
*  Contoh penerapan fungsi generic bisa kita lihat pada deklarasi fungsi slice yang merupakan extensions function
*  dari class Lis berikut:
    public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {

    }
*  Tipe parameter pada fungsi slice() di atas digunakan sebagai receiver dan return type. Ketika fungsi tersebut
*  dipanggil dari sebuah List dengan tipe tertentu, kita bisa menentukan tipe argumennya secara spesifik seperti
*  berikut: */

fun main(){
    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10))
    /* Seperti yang telah disebutkan sebelumnya, jika semua nilai yang berada di dalamnya memiliki tipe yang sama,
    *  kita bisa menyederhanakan. Caranya, hapus tipe parameter tersebut.*/
    println(numbers.slice(1..10))
}
