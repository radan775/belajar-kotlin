package com.bdt.kotlin

fun main (){
    println("Materi Array")
    // Array adalah tipe data yang memungkinkan untuk diisi dengan beberapa
    // objek atau tipe data lain dalam sebuah variabel
    // cara membuat Array dalam Kotlin
    val array = arrayOf(1, 3, 2, 4)
    // dalam Arrau kita bisa untuk memasukkan nilai dengan berbagai jenis
    // tipe data dalam fungsi arrayOf
    // contoh
    val arrayCampur = arrayOf(1, 1.5f, 'S', "Baparekraf", true)
    // cara menampilkan array dalam console
    for (element in arrayCampur){
        print(" "+ element)
    }
    println("\n")
    // dalam Kotlin kita bisa membuat array dengan tipe data primitif
    // dengan cara menggunakan  beberapa fungsi berikut
    println("fungsi tipe data Int       \"intArrayOf () : IntArray\"")
    println("fungsi tipe data boolean   \"booleanArrayOf () : BooleanArray\"")
    println("fungsi tipe data char      \"charArrayOf () : CharArray\"")
    println("fungsi tipe data long      \"longArrayOf () : LongArray\"")
    println("fungsi tipe data short     \"shortArrayOf () : Shortarray\"")
    println("fungsi tipe data byte      \"byteArrayOf () : ByteArray\"")
    println("fungsi tipe data float     \"floatArrayOf () : FloatArray\"\n")

    // jika kita ingin membuat Array yang hanya bisa diisi dengan nilai
    // tipe data Int. maka gunakan intArrayOf()
    // contoh
    val intArray = intArrayOf(1, 3, 5, 6)
    // kita bisa mendapatkan nilai tunggal dari array dengan memakai indexing
    println("nilai tunggal dengan cara indexing "+ intArray[1])
    // selain bisa mengambil nilai tunggal pada array dengan cara indexing
    // kita bisa juga mengubah data array dengan cara indexing
    // contoh
    intArray[3] = 18
    println("nilai array yang diubah dengan indexing " + intArray[3])
    print("\n")

    // selain menggunakan libraru function arrayOf dalam membuat objek array
    // kita juga bisa menggunakan Array() dengan membutuhkan 2 argumen
    // yaitu argumen size dan lambda
    // contoh
    val arrayBiasa = Array(5, {i -> i})
    for (element in arrayBiasa){
        println(" "+ element)
    }
}