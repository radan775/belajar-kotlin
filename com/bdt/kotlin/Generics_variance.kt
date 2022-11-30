package com.bdt.kotlin

import java.util.Collections

// Variance
/* Sebelumnya kita telah mempelajari bagaimana generic bekerja, bagaimana penerapannya, serta bagaimana kita bisa
*  menentukan bayasa tipe argumen yang bisa ditentukan terhadap tipe parameter. Selanjutnya kita akan belajar
*  salah satu konsep dari generic yaitu variance.
*  Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama dan tipe
*  argumen yang berbeda saling berkaitan satu sama lain. Variance dibutuhkan ketika kita ingin membuat class atau
*  fungsi generic dengan batasan yang tidak akan diganggu dalam penggunaannya. Sebagai contoh, mari kita buat
*  beberapa class seperti berikut: */
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class motorCycle(speed: Int): Vehicle(2)
// Kemudian jalankan kode seperti berikut:
fun main(){
    val car = Car(200)
    val motorCycle = motorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
    /* Bisa kita perhatikan pada kode di atas, variabel car dan motorcycle merupakan subtipe dari Vehicle
    *  sehingga kita bisa melakukan assighment antar dua variabel tersebut. Maka seharusnya kode tersebut akan
    *  berhasil dikompilasi.
    *  Selanjutnya mari kita masukkan salah satu class yang merupakan subtipe dari class Vehicle di atas
    *  ke dalam generic list: */
    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList
    /* Dari contoh di atas, kita melihat bagaimana variance menggabarkan keterkaitan antara carList dan vehicleList
    *  di mana Car merupakan subtipe dari Vehicle.
    *  Nah, itu dalah contoh sederhana bagaimana variance bekerja. Lalu bagaimana cara membuat class generic yang
    *  memiliki variance? Caranya sama seperti ketika kita membuat generic class pada umumnya. Namun untuk tipe
    *  parameternya kita membutuhkan kunci out untuk covariant atau kunci in untuk contravariant.*/
}
// Covariant
// Contoh deklarasi generic dengan covariant bisa kita lihat saat class List pada Kotlin dideklarasikan:
interface List4<out E> : Collection<E> {
    operator fun get(index: Int): E
}
/* Ketika kita menandai sebuah tipe parameter dengan kata kunci out maka nilai dari tipe parameter tersebut
*  hanya bisa diproduksi seperti menjadikannya sebagai return type. Serta tidak dapat dikomsumsi seperti
*  menjadikannya seperti menjadikannya sebagai tipe argumen untuk setiap fungsi di dalam class tersebut.*/

//Contravariant
/* Berbanding terbalik dengan saat kita menandainya dengan kata kunci out, bagaimana saat kita menandainya
*  dengan kata kunci in ? Nilai dari tipe parameter tersebut bisa dikomsumsi dengan menjadikannya sebagai
*  tipe argumen untuk setiap fungsi yang ada di dalam class tersebut dan tidak untuk diproduksi. Contoh
*  dari deklarasinya bisa kita lihat pada class Comparable pada Kotlin berikut: */
interface Comparable<in T>{
    operator fun compareTo(other: T): Int
}