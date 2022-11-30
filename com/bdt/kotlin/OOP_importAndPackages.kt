package com.bdt.kotlin
import kotlin.random.Random // lanjut baris ke-21
import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

// Import dan Packages
/* Seluruh konten pada Kotlin, seperti class dan fungsi, dibungkus dalam sebuah package. Package tersebut digunakan
*  untuk mengelompokkan class, fungsi, dan variabel yang mempunyai kemiripan fungsionalitas. Untuk menggunakan
*  class, fungsi maupun variabel yang berada pada suatu package, kita harus menuliskan secara lengkap alamat
*  package tersebut. Sebagai contoh kita akan menggunakan class Random, maka kita harus menuliskannya seperti ini: */
val someInt = kotlin.random.Random(0).nextInt(1,10)
/* Kode tersebut menunjukkan bahwa class Random berada pada package kotlin.random, tetapi apakah perlu menuliskan
*  kode sepanjang itu untuk menggunakan sebuah class? Tentu tidak, untuk meminimalisir hal tersebut kita cukup
*  mengimpor package class Random. Dengan begitu kita tidak perlu menuliskan kode yang panjang berulang. */

// Importing Package
/* Untuk mengimpor suatu package class, fungsi atau variabel, kita cukup menuliskan keyword import kemudian
*  dilanjutkan dengan alamat spesifiknya seperti:
import packagename.ClassName
import packagename.fucntionName
import packagename.propertyName
* Karena class Random berada pada package kotlin.random, maka penulisannya menjadi seperti baris ke-2 */
val someInteger = Random(0).nextInt(1,10)
/* Biasanya terdapat banyak class, fungsi ataupun variabel dalam sebuah package. Contohnya kita akan menggunakan
*  beberapa fungsi dan variabel matematika pada package kotlin.math seperti berikut: */
fun main(){
    println(PI)
    // println(cos(120.0)) kode awal tanpa alias
    // println(sqrt(9.0)) kode awal tanpa alias
    // Kita juga dapat mengganti nama sebuah class, fungsi atau variabel yang kita import dengan menggunakan alias
    // yang direpresentasikan dengan kata kunci as. Lihat di baris ke-4 dan ke-5
    println(cosinus(90.0))
    println(akar(16.0))
    /* Biasanya as digunakan ketika kita menggunakan sebuah class, fungsi, maupun variabel yang memiliki nama
    *  yang sama namun berbeda package-nya. Ini bertujuan untuk menghindari ambiguitas.*/
}
/* Seperti yang kita ketahui sebelumny, pada package kotlin.math terdapat banyak fungsi dan variabel yang dapat
*  kita gunakan. Kita bisa lihat pada completion suggestion biasanya.
*  Kita dapat mengimport seluruh class, fungsi, dan variabel yang berada pada suatu package dengan menggunakan
*  tanda * pada akhir package tersebut.
import kotlin.math.*
* */