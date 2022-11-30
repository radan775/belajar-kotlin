package com.bdt.kotlin

fun main (){
    println("===== safe call operator =====")
    // safe call operator adalah operator yang akan menjamin kode yang kita
    // tulis aman dari NullPointerException.
    // Contoh
    var text : String? = null
    text?.length
    // dengan safe call, kompiler akan melewatkan proses jika objek tersebut
    // memiliki nilai null

    println("===== elvis operator =====")
    // elvis operator memungkinkan kita untuk membuat default value atau
    // nilai dasar jika objek yang ada bernilai null
    // contoh
    var text1 : String? = null
    var textLength = text1?.length ?: 4
    println(textLength)
    // kode diatas akan menampilkan nilai 4 jika tipe data String memiliki nilai null
    // cara lain menulis kode diatas bisa menggunakan percabangan if/else
    // contoh
    var textLength1 = if (text1 != null) text1.length else 4
    println(textLength1)

    // ada catatan penting untuk penanganan objek yang bernilai null (nullable)
    // perhatikan penggunaan operator non-null assertion (!!)
    // contoh
    var text2 : String? = null
    var textlength2 = text2!!.length
    // dengan menggunakan operator non-null assertion, kompiler akan mengizinkan kita
    // untuk mengakses atau mengelola nilai yang memiliki nilai null
    // tetapi penggunaan operator ini tidak disarankan karena akan memaksa sebuah
    // objek menjadi tidak null (non-null). Sehingga ketika objek tersebut bernilai
    // null, maka kita tetap akan bertemu dengan NullPointerException
}