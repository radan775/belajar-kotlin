package com.bdt.kotlin

fun main(){
    // Hal menarik, kita bisa mendeklarasikan sebuah extensiion dengan nullable receiver type. Alhasil,
    // extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.
    // Contoh ke properties slice()
    val nilai: Int? = null
    println(nilai.bagi)
    // pertanyaanya adalah kapan kita membutuhkan hal tersebut ?
    // tentunya ketika kita mempunyai sebuah object yang bernilai null.

    // Saat kita tidak menetapkan dengan nullable receiver type, maka kita perlu memeriksa apakah objek
    // tersebut bernilai null atau tidak ? Bisa juga dengan menggunakan operator safe call setiap kali
    // extension tersebut dipanggil. Contoh lanjut ke properties bagi3()
    val nilai1: Int? = null
    println(nilai1?.bagi3)

    // Kita juga bisa menentukan nilai dari receiver object jika bernilai null. Sehingga kita tidak
    // perlu lagi menggunakan operator safe call ketika ingin memanggil extension tersebut.
    // Contohnya ialah sama seperti properties slice()


}
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)
// if expression pada contoh diatas adalah untuk memeriksa apakah receiver object-nya bernilai null. JIka
// tidak bernilai null, maka receiver object tersebut akan secara otomatis di-casting menjadi tipe non-null,
// sehingga kita bisa menggunakan nilainyan.

// selain menggunakan if expression, kita juga bisa menggunakan elvis operator. Misalnya seperti berikut:
val Int?.bagi : Int
    get() = this?.div(2) ?:0
// untuk memanggillnya sama seperti extension properties sebelumnya. Lanjut ke baris 7

val Int.bagi3: Int
    get() = this.div(2)
// lanjut ke baris 15