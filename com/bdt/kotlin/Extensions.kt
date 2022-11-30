package com.bdt.kotlin

fun main(){
    // Extension adalah sebuah deklarasi khusus yang digunakan untuk menambahkan fungsi baru tanpa harus
    // mewarisi kelas yang kita buat.
    // Kotlin mendukung 2(dua) extension yang dapat digunakan, yaitu Extensions Functions dan Extensions
    // Propeties. Jika extension function digunakan untuk menambahkan fungsi baru, extension properties
    // digunakan untuk menambahkan sebuah properti baru.

    println("======= Extension Functions =======")
    // untuk mendeklarasikan sebuah extension function, kita perlu menentukan terlebih dahulu receiver
    // type, kemudian nama daru fungsi tersebut yang mana keduanya dipisahkan oleh titik (.)
    // Contoh ke fungsi printInt()
    10.printInt()
    // untuk memanggil extensions functions bisa dilakukan dengan kode di atas.

    // Kita juga bisa menetapkan jika extension functions tersebut dapat mengembalikan nilai,
    // deklarasinya pun sama halnya seperti fungsi pada umumnya. Contoh ke fungsi plusThree()
    println(12.plusThree())

    println("====== Extension Properties ======")
    // Kotlin juga mendukung extension properties, yaitu extension untuk menambahkan sebuah properti baru
    // pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.
    // cara deklarasinya sama seperti extensions function. Terlebih dahulu kita menentukan receiver type
    // kemudian nama dari properti tersebut. Contoh ke fungsi slice()
    println(12.slice)
    // yang perlu diketahui, extension tidak benar-benar mengubah sebuah kelas dengan menambahkan sebuah
    // fungsi atau properti baru. Ini karena extension memiliki hubungan langsung dengan kelas yang ingin
    // diperluas fungsionalitasnya. Sehingga extension properties hanya bisa dideklarasikan dengan
    // cara menyediakan getter atau setter secara ekspisit

}
fun Int.printInt(){
    println("nilai $this")
    // bisa kita perhatikan, kelas Int pada kode di atas digunakan sebagai receiver type, sedangkan
    // kata kunci this adalah receiver type yang bertindak sebagai objek. Nilai dari objek tersebut
    // bisa kita gunakan di dalam extension yang sudah dibuat. Lanjut ke baris 14
}
fun Int.plusThree(): Int{
    return this + 3
    // untuk menampilkan hasil lanjut ke baris 19
}
val Int.slice: Int
    get() = this / 2
// untuk cara menampilkan properti ini bisa lanjut ke baris 26