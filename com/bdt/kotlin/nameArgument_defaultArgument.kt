package com.bdt.kotlin

fun main(){
    println("Named Argument")
    // named argument adalah fitur di Kotlin yang menawarkan sebuah cara kita tak perlu lagi menghafal
    // posisi dari sebuah parameter. Karena ketika sebuah fungsi dipanggil, kita bisa menentukan ergumen
    // dari parameter mana yang ingin dilampirkan dengan memanggil nama dari parameter tersebut.
    // Contoh kita mempunyai sebuah fungsi seperti berikut.

    val fullName1 = getFullName("Kotling", " is ", "Mantap")
    // kode diatas tidak memanfaatkan sebuah named Argument
    val fullName = getFullName(first = "Kotlin", middle = " is ", last = "Awesome")
    // kode diatas ini memanfaatkan named argument.
    println(fullName)
    // tidak ada perbedaan hasil yang ditampilkan, tetapi ketika kita menggunakan named argument.
    // kita bisa mengubah posisi dari argumen ketika ditampilkan. Contoh :
    var fullName2 = getFullName(middle = " is ", first = "Kotlin", last = "Awesome")
    println(fullName2)
    // dengan cara di atas, kita tidak perlu menghafal posisi dari parameter jika ingin melampirkan
    // Sebuah argumen. cukup hafalkan nama dari parameter tersebut.

    println("Default Argument")
    // Di dalam Kotlin juga memungkinkan kita untuk menentukan nilai default dari sebuah parameter
    // seperti halnya ketika kita ingin menginisialisaikan sebuah nilai untuk variabel.
    // Contoh:
    val namaLengkap = namaLengkap()
    println(namaLengkap)
    // kita bisa memanggil fungsi diatas seperti biasanya. Tetapi karena parameternya sudah memiliki
    // nilai maka argumen untuk fungsi tersebut bisa dilewatkan ketika dipanggil.
    // Kita tak perlu khawatir saat lupa melampirkan sebuah argumen. Tentunya hal ini menghindari kita
    // dari error.
    // Meskipun begitu, kita tetap bisa melampirkan sebuah argumen. Contoh:
    val namaLengkap1 = namaLengkap(first = "Dicoding" , middle = " adalah ")
    println(namaLengkap1)
}

fun getFullName(first: String, middle: String, last : String): String{
    return "$first $middle $last"
}

fun namaLengkap(
    first: String = "Kotling",
    middle: String = " is ",
    last: String = "Awasome"): String{
    return "$first $middle $last"
}