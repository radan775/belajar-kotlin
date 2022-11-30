package com.bdt.kotlin

fun main (){
    println("===== NullPointerException =====")
    // NullPointerException adalah sebuah kesalahan yang terjadi ketika kita
    // ingin mengakses sebuah variabel yang belum diinisialisasi sebuah nilai
    // atau nilainya memiliki nilai null
    // Contoh
    val text : String? = null
    // secara default ketika mendlarasikan nilai tipe data seharusnya tanpa
    // tanda tanya setelah tipe data contoh disini adalah String?

    println ("===== cara akses String yang bernilai null =====")
    // tipe data atau objek yang kita buat dengan nilai null tidak bisa untuk
    // cara aksesnya tidak bisa langsung mengambil nilainya
    // cara aksesnya yang benar ialah dengan cara menggunakan logika boolean
    // yaitu negasi, contoh

    // val textLength = text.length // maka ini akan error

    if (text != null){
        val teexLength = text.length
    }
    // kode diatas akan mengakses nilai null dari sebuah objek jika objek
    // tersebut telah ada isinya
}