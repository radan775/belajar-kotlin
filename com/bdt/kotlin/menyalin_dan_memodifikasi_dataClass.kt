package com.bdt.kotlin

data class dataUser(val name: String, val age: Int)

fun main(){
    // data class juga memungkinkan kita untuk menyalin sebuah sebuah objek dengan mudah hanya dengan
    // memanfaatkan fungsi copy() di dalamnya.
    // contoh

    val dataUser = dataUser("brembo", 17)
    val dataUser1 = dataUser("brembo", 17)
    val dataUser2 = dataUser("brembo", 17)
    val dataUser3 = dataUser.copy()

    println(dataUser3)
    // hal menarik yang bisa dilakukan dengan fungsi copy() adalah kita bisa memodifikasi objek
    // tersebut dengan nilai objek yang baru
    // contoh

    val dataUser5 = dataUser.copy(age = 20)
    println(dataUser5)
    // tanpa class kita melakukan hal ini akan memerlukan sebuah instance baru untuk mengubah nilai dari
    // suatu objek.
}