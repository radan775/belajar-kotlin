package com.bdt.kotlin

fun main(){
    // apa itu function type? seperti namanya, Kita bisa membuat sebuah fungsi menjadi tipe data.
    // Kotling menggunakan function tupe untuk deklarasi yang berhubungan dengan sebuah fungsi seperti
    // jumlah dan tipe parameter serta tipe kembalian.

    /* (Int, Int) -> String
    * Setiap function type memiliki tanda kurung. Di dalamnya terdapat sebuah parameter dan jumlah tipe
    * yang menandakan jumlah parameter dari fungsi tersebut. Pada contoh diatas, fungsi tersebut memiliki
    * 2(dua) parameter dengan tipe Int dan memiliki tipe kembalian String. Ketika kita tidak ingin fungsi
    * tersebut mengembalikan nilai, kita bisa menggunakan Unit. Berbeda dengan fungsi pada umumnya,
    * jika menggunakan tipe kembalian Unit, kita tidak wajib menuliskannya. */

    /* Ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama, kita bisa menyederhanaknnya.
    *  Dengan cara memanfaatkan kata kunci typealias untuk memberikan nama alternatif dari sebuah function
    *  type seperti berikut: lanjut ke function type Arithmetic */
    val sum: Arithmethic = {nilai1, nilai2 -> nilai1 + nilai2}
    val multiply: Arithmethic = {nilai1, nilai2 -> nilai1 * nilai2}
    val nilaiHasil = sum(10, 10)
    println(nilaiHasil)
    println(sum(10,20))

    /* typealias cocok digunakan ketika kita mempunyai sebuah function type yang panjang. Dengannya, kita
    *  bisa memberikan nama untuk sebuah function type dan menggunakannya sebagai tipe untuk fungsi lainnya.
    *
    *  Untuk membuat instance dari sebuah function type, terdapat beberapa cara. Salah satunya dengan lambda
    *  expression yang expression. Sedangkan untuk menggunakan instance-nya, kita bisa memanfaatkan operator
    *  invoke() seperti berikut: */
    val sumHasil = sum.invoke(10,40)
    val multiplyHasil = multiply.invoke(2, 4)
    // atau kita bisa menuliskannya secara langsung dengan menghilangkan operator invoke():
    val sumHasil1 = sum(10, 50)
    val multiplyHasil1 = multiply(5, 3)

    // kita juga bisa menandai function type sebagai nullable dengan menempatkannya di dalam tanda kurung
    // dan diakhiri dengan safe call seperti berikut: Lanjut ke function type Arithmetic1
    val sum1: Arithmethic1 = {nilai1, nilai2 -> nilai1 + nilai2}
    println(sum1?.invoke(10,30))

}
typealias Arithmethic = (Int, Int) -> Int
// untuk cara menggunakan dan menampilkan bisa dilihat pada baris ke 18

typealias Arithmethic1 = ((Int, Int) -> Int)?
// untuk cara pemanggilannya lanjut ke baris 38