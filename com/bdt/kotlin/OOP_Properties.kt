package com.bdt.kotlin

fun main(){
    /* Sebuah class dalam Kotlin tentu memiliki properti. Masing-masing class memiliki properti yang berbeda.
    *  Contoh sebelumnya pada class Animal. properti yang dimilikinya berupa name, weight, age, dan isMamalia.
    *  Sama seperti variabel yang sudah kita pelajari pada modul Data Types, properti dapat dideklarasikan
    *  sebagai nilai mutable dengan menggunakan var atau sebagai read-only dengan menggunakan val.*/

    println("===== Property Accessor =====")
    /* Secara standar ketika properti pada class dibuat mutable, maka Kotlin akan menghasilkan fungsi getter
    *  dan setter pada properti tersebut. Jika properti pada sebuah class dibuat read-only, Kotlin hanya akan
    *  menghasilkan fungsi getter pada properti tersebut. Namun sebenarnya Kita bisa membuat fungsi getter dan
    *  setter secara manual jika pada kasus tertentu Kita perlu untuk override fungsi tersebut.
    *  Perhatikan kode berikut: lanjut ke class Animal{}*/
    val dicodingCat = otherAnimal()
    println("Nama ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama ${dicodingCat.name}")
    /* Pada kode ${dicodingCat.name} Sebenarnya terjadi proses pemanggilan fungsi getter pada properti name.
    *  Namun kita tidak melakukan override pada fungsi getter sehingga fungsi tersebut hanya mengembalikan
    *  nilai name saja. Begitu juga pada kode dicodingCat.name = "Goose" pada kode tersebut terjadi pemanggilan
    *  fungsi setter pada properti name.
    *
    *  Tetapi jika kita melakukan override pada fungsi getter dan juga setter, maka kita dapat menambahkan
    *  kode lain pada fungsi getter sesuai dengan kebutuhan. Mari coba modifikasi kode sebelumnya:
    *  Lanjut kembali lagi ke class otherAnimal() */
}

class otherAnimal{
    var name: String = "Dicoding Miaw"
// lanjut ke baris 15
    // kode dibawah hasil modifikasi
    get() {
        println("Fungsi Getter terpanggil")
        return field
    }
    set(value) {
        println("fungsi Setter terpanggil")
        field = value
    }// Coba run ulang
}
/* Urutan pendefinisian fungsi get() dan set() tidaklah penting, kita dapat mendefinisikan fungsi get()
*  tanpa mendefinisikan fungsi set() dan juga sebaliknya. Yang terpenting pendeklarasiannya dilakukan setelah
*  mendeklarasikan properti tersebut. Pada fungsi get(), kita perlu mengembalikan nilai sesuai tipe data
*  dari propertinya atau kita dapat mengembalikan niali dari properti itu sendiri dengan menggunakan
*  keyword field. Sedangkan untuk fungsi set() kita memerlukan sebuah parameter. Ini merupakan sebuah nilai
*  baru yang nantinya akan dijadikan nilai properti. Pada kode di atas parameter tersebut ditetapkan dengan
*  menggunakan nama value.*/