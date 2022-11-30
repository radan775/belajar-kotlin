package com.bdt.kotlin

fun main(){
    /* Dalam mendeklarasi lambda, khususnya jika ingin ditetapkan agar dapat mengembalikan nilai.
    *  terkadang kompiler tidak dapat menentukan tipenya. Alhasil, kita perlu menuliskannya secara eksplisit
    *  Terdapat beberapa tipe deklarasi yang dapat kita gunakan untuk mendeklarasi lambda. antara lain
    *  - Lanjut ke lambda var sum()
    * */
    printHasil(10, sum)
    // atau bisa dengan cara seperti ini
    printHasil(10){value ->
        value + value
    }
    /* Konsep ini dinamakan sebagai Higher-Order function. yaitu sebuah fungsi yang menggunakan fungsi
    *  lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
    *  Catatan :
    *  jika argumen terakhir dari fungsi merupakan sebuah lambda expression, maka lambda expression
    *  tersebut ditempatkan di luar paranthesis. */

}
var sum: (Int) -> Int = { value -> value + value }
/* Tipe deklarasi pada kode di atas adalah contoh ketika kita ingin membuat lambda yang memiliki 1(satu)
*  parameter dengan tipe kembalian Int.
*  Dengan ditetapkannya tipe deklarasi pada fungsi di atas, memungkinkan kita untuk bisa menggunakannya
*  sebagai argumen untuk fungsi lainnya. Contoh
*  - lanjut ke fungsi printHasil()
* */

fun printHasil(value: Int, sum: (Int) -> Int){
    val hasil = sum(value)
    println(hasil)
    // lanjut ke baris 9
}