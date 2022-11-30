package com.bdt.kotlin
import kotlin.reflect.KProperty
/* Pengelolaan properti class baik itu memberikan atau merubah sebuah nilai dapat didelegasikan kepada
*  class lain. Dengan ini kita dapat meminimalisir boilerplate dalam penulisan getter dan setter (jika
*  properties menggunakan var) pada setiap class yang kita buat. Sebagai contoh, kita memiliki tida buah
*  class yang di dalamnya memiliki satu properti String. JIka kita ingin menerapkan getter dan setter pada
*  setiap properti classnya, maka kita perlu menuliskan getter dan setter tersebut ke seluruh class. Hal
*  tersebut daoa mengurangi efisiensi dalam menuliskan kode karena terlalu banyak kode yang harus ditulis
*  secara berulang. Solusinya, kita perlu membuat sebuah class yang memang bertugas untuk mengatur atau
*  mengelola fungsi getter dan setter untuk sebuah properti class. Teknik tersebut pada Kotlin dinamakan
*  Delegate. */

// Sebelum mendelegasikan sebuah properti kita perlu membuat class delegasi terlebih dahulu.
class delegateName{
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }
    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari value: $value akan berubah menjadi $newValue")
        value = newValue
    }
}
// Kemudian untuk mendelegasikan sebuah properti class, kita gunakan keyword by dalam menginisialisasi
// properti tersebut kemudian diikuti dengan namanya. Contoh:
class animal{
    var name: String by delegateName()
}
class person{
    var name: String by delegateName()
}
class hero{
    var name: String by delegateName()
}
// Lalu mari kita membuat sebuah objek, ubah dan akses nilai propertinya pada setiap class,
fun main(){
    val Animal = animal()
    Animal.name = "Tiger"
    println("Nama hewan: ${Animal.name}")

    val person = person()
    person.name = "Dimas"
    println("Nama orang: ${person.name}")

    val hero = hero()
    hero.name = "Gatotkaca"
    println("Nama hero: ${hero.name}")
    /* Pada contoh di atas, delegasi hanya dapat digunakan oleh properti yang memiliki tipe data String.
    *  namun kita juda dapat membuat sebuah delegasi class umum yang dapat digunakan oleh seluruh tipe
    *  data dengan memanfaatkan tipe data Any. Lanjut ke class delegateGenericClass()*/
    val otherAnimal = Animal2()
    otherAnimal.name = "Dicoding Cat"
    otherAnimal.weight = 4.1
    otherAnimal.age = 7

    println("Nama: ${otherAnimal.name}")
    println("Berat: ${otherAnimal.weight}")
    println("Umur: ${otherAnimal.age}")
    // Perhatikan kode di atas, kita telah memberikan nilai pada setiap properti dengan tipe data yang
    // berbeda. Tetapi dengan delegateGenericClass(), pengelolaan properti dapat digunakan pada seluruh tipe
    // data properti.
}
class delegateGenericClass{
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }
    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari value: $value akan berubah menjadi $newValue")
        value = newValue
    }
}
class Animal2{
    var name: Any by delegateGenericClass()
    var weight: Any by delegateGenericClass()
    var age: Any by delegateGenericClass()
}
// Lanjut ke baris 54 untuk membuat objek dari class Animal2