package com.bdt.kotlin

// Untuk mendefinisikan class dalam Kotlin, Kita cukup gunakan kata kunci class diikuti dengan nama class
// yang akan dibuat. Mari kita buat contoh kelas pada Kotlin:
// lalu tambah sebuah property dan fungsi pada class tersebut
class Animal(var name: String,
             var weight: Double,
             var age: Int,
             var isMamalia: Boolean
){
    fun eat(){
        println("$name makan!")
    }
    fun sleep(){
        println("$name tidur!")
    }
}
// Untuk membuat sebuah objek dari suatu class, Kita bisa perhatikan struktur kode berikut:
// val nameOfObject = nameOfClass([property1],[property2])
/* Sama seperti variabel, kita bisa gunakan val atau var, dilanjutkan dengan nama objek yang akan kita buat.
*  Tanda = menunjukkan bahwa kita akan menginisialisasi suatu objek, kemudian diikuti dengan nama class
*  dan tanda kurung. Tanda kurung tersebut menunjukkan bahwa kita membuat sebuah objek baru. Di dalam tanda
*  kurung kita dapat menambahkan nilai properti sesuai yang dibutuhkan pada primary constructor class.*/
// Kita coba membuat objek dari class yang sudah kita buat, kodenya akan seperti berikut:
fun main(){
    val dicodingCat = Animal("Dicoding Miauw", 3.4, 3, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMamalia}")
    dicodingCat.eat()
    dicodingCat.sleep()
}
