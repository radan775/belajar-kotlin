package com.bdt.kotlin

fun main(){
     /* Pada bab ini kita akan mempelajari tentang bagaimana cara lambda dideklarasikan dengan receiver.
     *  Konsep ini digunakan sebagai dasar Kotlin untuk digunakan sebagai Domain Specific Languages (DSL).
     *  DSL adalah sebuah bahasa komputer yang dikhususkan untuk domain aplikasi tertentu. Ia berbeda dengan
     *  general-purpose language yang bisa diterapkan di semua domain aplikasi.
     *  Dengan DSL, kita bisa menuliskan kode lebih ringkas dan ekspresif.
     *
     *  Pada dasarnya sebuah lambda yang mempunyai receiver mirip seperti extension functions, yang memungkinkan
     *  kita untuk mengakses anggota objek receiver dari dalam extension. Pada lambda, receiver ditentukan
     *  pada saat menentukan tipe deklarasi. Contoh: lanjut ke buildString() */
    val message = buildString()
    println(message)

    val message1 = buildStringLanjut {
        append("Halo ")
        append("dari ")
        append("lambda")
    }
    println(message1)
    // Seperti yang kita lihat, kita sebagai client bisa menggunakan suatu fungsi yang kompleks cukup
    // dengan menggunakan fungsi append yang dipanggil di dalam blok buildStringLanjut(). Jadi kita tidak
    // perlu tahu bagaimana proses buildStringLanjut di baliknya, yang terpenting adalah hasilnya sesuai
    // dengan yang diharapkan/

}

fun buildString(): String{
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
    // kode di atas merupakan contoh kode StringBUilder yang digunakan untuk menambahkan kata satu per satu.
    // Jika dilihat kode ini cukup panjang tidak fleksibel. Jika kita ingin menambahkan kata baru harus di
    // di dalam kode tersebut dan mengulang-ulang kata stringBuilder. Dengan menggunakan DSL, kita dapat
    // menyingkat kode tersebut dan cukup fokus pada fungsi append saja.
    // Contoh cara membuat Lambda dengan receiver lanjut ke buildStringLanjut()
}

fun buildStringLanjut(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
    // Pada kode di atas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action.
    // Dengan bagitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder.
    // Cara memanggilnya lanjut ke baris 13
}