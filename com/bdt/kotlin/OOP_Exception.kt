package com.bdt.kotlin

/* Kode yang baik yaitu kode yang terhindar dari segala bentuk kejadian dengan efek buruk pada aplikasi kita.
*  Kejadian tersebut pada programming disebut Exception. Hal terburuk yang disebabkan oleh exception ini adalah
*  dapat terhentinya aplikasi ketika dijalankan. Hal seperti nin seharusnya kita hindari. Nah karena itu kita
*  mengetahui cara menangani suatu exception (Exception Handlin) pada sub-modul selanjutnya.
*
*  Apa itu Exceptio ?
*  Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program. Pada Kotlin semua exception
*  bersifat Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita. Berikut ini beberapa
*  contoh Unchecked Exception yang sering menggangu jalannya program kita
*  - ArithmeticException
*  - NumberFormatExceptio
*  - NullPointerExceptio
* ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol.
    val someValue = 6
    println(someValue / 0)
* NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. Sebagai contoh, kita akan
* mengubah sebuah nilai String menjadi Integer tetapi nilai String yang akan kita ubah tidak memiliki format
* angka yang benar, sehingga dapat membangkitkan NumberFormatException
    val someStringValue = "18.0"
    println(someStringValue.toInt())
* Dan terakhir dalah NullPointerException atau NPE. Walaupun Kotlin memiliki operator Null Safety, NPE tetap
* bisa saja terjadi. NPE terjadi karena sebuah variabel atau objek memiliki nilai null, padahal seharunya
* objek atau variabel tidak boleh null. Berikut contoh kasusnya:
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
    * */