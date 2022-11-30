package com.bdt.kotlin

import java.util.DoubleSummaryStatistics

/* Secondary constructor digunakan ketika kita ingin menginisialisasi sebuah class dengan cara yang lain.
*  Kita dapat membuat lebih dari satu secondary constructor. Sebagai contoh, kita akan menambahkan secondary
*  constructor pada class Animal7 tapi kita buat class baru dengan nama animal1 */

class animal1(name: String, weight: Double, age: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMamalia: Boolean

    init {
        this.name = name
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.isMamalia = false
    }
    constructor(name: String, weight: Double, age: Int, isMamalia: Boolean): this(name, weight, age){
        this.isMamalia = isMamalia
    }
}
fun main(){
    val dicodingCat = animal1("Dicoding Miauw", 4.3,3, true)
    println("Nama: ${dicodingCat.name}, berat: ${dicodingCat.weight}, umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMamalia}")

    val dicodingBird = animal1("Dicoding Tweet", 0.4,5)
    println("Nama: ${dicodingBird.name}, berat: ${dicodingBird.weight}, umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMamalia}")
    /* Dengan begitu, objek Animal dapat diinisialisasi dengan secondary constructor ketika nilai name,
    *  weight, age, dan isMamalia tersedia. Tetapi jika isMamalia tidak tersedia, primary constructorlah
    *  yang akan digunakan dan nilai isMamalia dapat diinisialisasi pada blok ini dengan nilai default.*/

    println("===== Default Constructor =====")
    /* Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat sebuah
    *  constructor secara manual. Perhatikan kode pada class animalLain()*/
    val anotherCat = animalLain()
    println("nama: ${anotherCat.name}, Berat: ${anotherCat.weight}, Umur: ${anotherCat.age}, Mamalia: ${anotherCat.isMamalia}")
    // Ketika kita membuat sebuah objek, default constructor akan dipanggil. Konstructor tersebut akan
    // menginisialisasi properti yang terdapat pada class dengan nilai default.
}

class animalLain{
    val name: String = "Dicoding Miauw"
    val weight: Double = 4.1
    val age: Int = 5
    val isMamalia: Boolean = true
}// lanjut ke baris 38