package com.bdt.kotlin

/* Seperti namanya, jika kita akan membuat suatau objek dari sebuah class dan class tersebut memiliki
*  primary contructor di dalamnya, maka kita diharuskan mengirim nilai sesuai properti yang dibutuhkan.
*  Penulisan primary constructor mirip seperti parameter pada fungsi. Properti cukup dituliskan pada
*  header class diawalli dengan var atau val. Contoh: */
class Animal4(val name: String, val weight: Double, val age: Int, val isMamalia: Boolean)
// Pada baris kode tersebut tidak hanya membuat sebuah class, namun sekaligus menambahkan primaru constructor
// pada class tersebut. Sekarang mari kita coba membuat objek dari class tersebut:

fun main(){
    val dicodingCat = Animal4("Dicoding Miauw", 4.3,3, true)
    println("Nama: ${dicodingCat.name}, berat: ${dicodingCat.weight}, umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMamalia}")
/* Perhatikan kode di atas. Karena class Animal4 memiliki primary constructor, maka saat membuat
*  objeknya kita perlu mengirimkan beberapa nilai yaitu name, weight, age, isMamalia,
*
*  Primary constructor juga dapat memiliki nilai default, dengan begitu jika kita tidak menetapkan nilai
*  untuk parameter tersebut maka properti tersebut akan memiliki nilai default. Contohnya, kita bisa
*  memberikan nilai default terhadap properti age. Sehingga ketika pembuatan objek, pengiriman nilai age
*  pada primary constructor bersifat opsional.
*
*  Untuk membuat nilai default pada sebuah primary constructor, kita perlu menginisialisasi nilai pada
*  saat kita menuliskan properti pada class. Perhatikan kode class Animal5*/
    val dicodingCat1 = Animal5("Dicoding Miauw", 4.3)
    println("Nama: ${dicodingCat1.name}, berat: ${dicodingCat1.weight}, umur: ${dicodingCat1.age}, mamalia: ${dicodingCat1.isMamalia}")
    /* Hasil dari kode tersebut memperlihatkan bahwa properti age dan isMamalia memiliki nilai default.
    *  Sekali lagi, properti tersebut bersifat opsional, dengan begitu kita tetap dapat mengirimkan nilai
    *  pada properti walaupun telah memiliki nilai default.
    *
    *  Kita juga dapat secara ekspilisit memilih properti yang ingin kita berikan nilai dengan menambahkan
    *  nama properti dan tanda = sebelum mengisikan nilai properti.*/

    println("Init Block")
    /* Kotlin menyediakan blok ini yang memungkinkan kita untuk menuliskan properti di dalam body class
    *  ketika kita menggunakan primary contructor. Memang, memiliki kode banya di dalam body class bukanlah
    *  hal yang baik. Kotlin bertujuan agar kita dapat menuliskan kode seminimal mungkin. Tapi blok ini
    *  di sini memiliki beberapa fungsi selain menginisialisasi properti class. Satu fungsi lainnya adalah
    *  untuk membantu dalam menvalidasi sebuah nilai properti sebelum diinisialisasi. Pada class Animal5
    *  contohnya, kita dapat melakukan verifikasi bahwaw berat dan umur hewan tidak boleh bernilai kurang dari
    *  no. Untuk membuatnya, kita dapat menggunakan keyword ini kemudian inisialisasikan semua properti
    *  di dalam blok tersebut dengan parameter class. Lanjut ke class Animal6. */
    val dicodingCat2 = Animal6("Dicoding Miauw", 4.3, 4,true)
    println("Nama: ${dicodingCat2.name}, berat: ${dicodingCat2.weight}, umur: ${dicodingCat2.age}, mamalia: ${dicodingCat2.isMamalia}")
    /* Perhatikan juga penamaan antara properti pada body class dan parameter head class. Penamaan
    *  antara keduanya harus berbeda agar tidak terjadi ambiguitas. Untuk cara jika kita ingin penamaan
    *  keduanya sama, untuk menghindari ambiguitas kita dapat menggunakan keyword this dalam menginisialisasi
    *  properti tersebut dalam blok init. Lanjut ke class Animal7()*/
    val dicodingCat3 = Animal7("Dicoding Miauw", 4.3,3, true)
    println("Nama: ${dicodingCat3.name}, berat: ${dicodingCat3.weight}, umur: ${dicodingCat3.age}, mamalia: ${dicodingCat3.isMamalia}")

}
class Animal5(var name: String, var weight: Double, var age: Int = 0, var isMamalia: Boolean = true)
/* Kode tersebut menunjukkan bahwa kita membuat nilai default pada properti age yang bernilai 0 dan
*  isMamalia yang bernilai true. Sehingga pada pembuatan objek Animal, kita bisa mengirimkan nilai name
*  dan weight saja pada primary constructor. Mari kita coba membuat objeknya lanjut ke baris 24*/

class Animal6(var name: String,var weight: Double,var age: Int,var isMamalia: Boolean){
    val pName: String
    val pWeight: Double
    val pAge: Int
    val pIsMamalia: Boolean

    init {
        pWeight = if(weight < 0) 0.1 else weight
        pAge = if(age < 0) 0 else age
        pName = name
        pIsMamalia = isMamalia
    }
}/* Primary construcor dan init harus saling terhubung. Fungsi ini dijalankan ketika suatu objek dibuat
 dengan menggunakan primary constructor. Mari kita buat objeknya lanjut  ke baris 42*/

class Animal7(name: String,weight: Double,age: Int,isMamalia: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMamalia: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0 else age
        this.name = name
        this.isMamalia = isMamalia
    }
}
/* Kata kunci this tersebut merujuk kepada suatu class dimana jika kita menggunakannya diikuti dengan
*  nama properti maka kita menunjuk pada properti yang terdapat pada class tersebut. Dengan begitu, tidak
*  akan ada ambiguitas walaupun kita menggunakan penamaan yang sama antara properti dan parameter
*  primary constructor. Lanjut ke baris 48 untuk pembuatan objek.*/