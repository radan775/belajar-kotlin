package com.bdt.kotlin


// fungsi dalam kotlin akan selalu mengembalikan nilai
// ada beberapa cara
fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
// posisi String di akhir kode fungsi adalah nilai kembalian
}
// atau bisa juga begini
fun setUser1(name: String, age: Int): String = "Your name is $name, and you $age years old"
// hal ini karena hanya ada satu expresi dalam fungsi yang dikembalikan
// maka bisa menggunakan = untuk isi dari fungsi tersebut

// atau bisa juga begini
fun setUser2(name: String, age: Int) = "Your name is $name, and you $age years old"
// untuk kode fungsi ini kompilerlah yang akan menentukan tipe apa yang akan
// dikembalikan tanpa kita menulis kodenya

// jika tidak ingin fungsi yang dibuat mengembalikan nilai, bisa digunakan
// "Unit" sebagai tipe yang dikembalikan, contohya sebagai berikut
fun printUser(name: String): Unit {
    print("Your name is $name")
}
fun main (){
    // untuk cara pemanggilan fungsi bisa menggunakan cara seperti ini
    val user = setUser("Radan", 22)
    println(user)

    printUser("Radan")
}