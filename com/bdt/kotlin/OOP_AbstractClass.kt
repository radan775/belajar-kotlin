package com.bdt.kotlin

/* Seperti namanya, abstract merupakan gambaran umum dari sebuah class. Ia tidak dapat direalisasikan dalam
*  sebuah objek. Pada sub-modul sebelumnya kita sudah mempunyai class allAnimal. Secara harfiah hewan
*  merupakan sebuah sifat. Kita tidak tahu bagaimana objek hewan tersebut. Kita tahu bentuk kucing, ikan, dan
*  ular seperti apa tetapi tidak untuk hewan. Maka dari itu konsep abstract class perlu diterapkan agar class
*  allAnimal tidak dapat direalisasikan dalam bentuk objek namun tetap dapat menurunkan sifatnya kepada child
*  class-nya.
*  Untuk menjadikan sebuah class abstract, kita hanya perlu menambahkan keyword abstract sebelum menuliskan
*  nama class. */
abstract class abstractAnimal(var name: String, var weight: Double, var age: Int, var isCarnivora: Boolean){
    fun eat(){
        println("$name sedang makan!")
    }
    fun sleep(){
        println("$name sedang tidur!")
    }
}
// Dengan begitu class abstractAnimal tidak dapat kita inisialisasikan menjadi sebuah objek.
fun main(){
    /* val animal = abstractAnimal("Dicoding Animal", 3.4, 5, true) */
    println("ketika kode diatas kita coba untuk dibuat maka akan muncul error seperti berikut: ")
    println("Cannot create an instance of an abstract class")
}