package com.bdt.kotlin

fun main(){
    print("== val atau val ===")
    var company : String = "Dicoding"
    //dengan kata kunci var nilai dalam variabel masih bisa diubah
    company = "Dicoding Academy"
    // yang awalnya isi dari variabel company adalah "Dicoding" sekarang sudah
    // berubah menjadi "Dicoding Academu"

    val company1 : String = "Dicoding"
    // kata kunci val adalah deklarasi kepada variabel final dan tidak bisa diubah
    // jika diubah maka akan terjadi error

    // cara lain penulisan deklarasi varibel
    var company2 = "String"
}