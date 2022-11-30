package com.bdt.kotlin

fun main(){
    // tipe data char
    // hanya bisa menyimpan satu data karakter
    // jika char diisi lebih dari satu maka akan terjadi error

    var character = 'A'

    // tipe data char bisa melakukan operasi increment dan decrement
    // pada nilai variabel char

    var charr = 'A'
    println("nilai char " + charr++ +"\n" + charr)
    /*
    * Operasi increment dan decrement sendiri merupakan operasi yang bisa
    * kita gunakan pada tipe data Number. Lalu kenapa kita bisa
    * menggunakannya pada tipe Char? Karena pada dasarnya setiap
    * Characters merupakan representasi dari Unicode. Contoh Unicode A
    * adalah 0041. Ketika kita melakukan increment maka hasilnya adalah
    * 0042 yang mana merupakan Unicode dari B.*/

}