package com.bdt.kotlin

// Interfaces
/* Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu class agar dapat memiliki
*  sifat tersebut. Interface sangat mirip dengan abstract class, namun tanpa sebuah properti deklarasi dan
*  funsi yang dideklarasikan tanpa isi. Tujuan interface ini hanya untuk diimplementasikan oleh sebuah class.
*  Kelas yang mengimplementasikan sebuah interface diharuskan melakukan override seluruh properti dan fungsi
*  sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.
*  Cara membuat sebuah interface mirip dengan membuat class. Pada umumnya penamaan sebuah interface dituliskan
*  dengan awalan huruf I kapital. Hal ini tidak diharuskan secara sintaks tapi ini merupakan penerapan terbaik
*  dalam penamaan sebuah interface. Tujuannya agar dapat mudah membedakannya dengan class. Berikut merupakan
*  contoh pembuatan sebuah interface: */
interface Ifly{
    fun fly()
    val numberOfWings: Int // sama seperti fungsi, kita harus melakukan override properti. Overriding properti
    // bisa dilakukan pada sebuah constructor class : Lanjut ke baris 21.
}
/* Cara mengimplementasikan sebuah interface pada class, sama seperti kita melakukan extends pada sebuah super
*  atau parent class. Untuk lebih jelasnya, mari kita buat sebuah class burung dengan mengimplementasikan
*  interface Ifly : */
class Bird(override val numberOfWings: Int): Ifly {
    override fun fly() {
        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I flying without wings")
    }
    // Kika kita tidak melakukan override pada fungsi interface makan akan terjadi error
}
// Untuk menambahkan sebuah properti pada interface, kita cukup menuliskannya seperti pada class namun tanpa
// melakukan inisialisasi nilai: Lanjut baris ke-15