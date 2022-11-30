package com.bdt.kotlin

fun main(){
    /* Ketika mengembangkan sebuah proyek, kita pasti membuat beberapa fungsi tersendiri  dengan tujuan
    *  untuk memisahkan logika program dari fungsi utama. Tujuannya agar kode lebih terstruktur dan muda
    *  dibaca. Namun pada praktiknya, terkadang kode yang ada pada fungsi tersebut malah lebih panjang
    *  dan susah dibaca. Salah satu penyebabnya adalah karena penulisan kode yang berulang atau lainnya.*/

    /* Untuk mengatasinya, kita bisa memisahkan lagi menjadi sebuah fungsi lokal (inner function) dengan
    *  hak akses terbatas hanya untuk fungsi terluarnya. Ini bisa kita lakukan karena pada kotlin kita bisa
    *  mendefinisikan sebuah fungsi di mana pun, bahkan di dalam sebuah fungsi(functio inside functio).*/
    // Lanjut ke fungsi setWord() untuk contoh dari inner function.
    setWord("Halo")
    setWord1("Tes")

    /* Lalu pada kondisi seperti apa kita bisa memanfaatkan inner function ?
    *  Silahkan perhatikan fungsi sum() dibawah:*/
    println(sum(2,4, 6))
    println(sum1(2,4, 6))
    println(sum2(2,4, 6))

}
fun setWord(message: String){
    fun printMessage(text: String){
        println(text)
    }
    printMessage(message)
}
// Bisa diperhatikan bahwa fungsi printMessage() didefinisikan di dalam fungsi setWord(). Mendefinisikan
/* Sebuah inner function sama halnya seperti kita mendefinisikan sebuah fungsi seperti biasanya. Menariknya,
*  kita bisa mengakses apa yang menjadi bagian dari fungsi terluarnya. Contoh, parameter dari fungsi
*  setWord() bisa diakses dari dalam fungsi print sehingga kode di atas bisa diubah menjadi seperti berikut:
* */
fun setWord1(message: String){
    // printMessage() // Hali ini akan error
    fun printMessage(){
        println(message)
    }
    printMessage()
}
// Perlu diperhatikan, inner function hanya bisa diakses setelah fungsi tersebut didefinisikan. Jika kita
// coba mengaksesnya, maka akan tampil error, lihat pada baris ke-28
// Untuk cara pemanggilannya lanjut ke baris 13 dan baris 14
fun sum(nilai1: Int, nilai2: Int, nilai3: Int): Int{
    if (nilai1 == 0){
        throw java.lang.IllegalArgumentException("nilai1 harus lebih besar dari 0")
    }
    if (nilai2 == 0){
        throw java.lang.IllegalArgumentException("nilai2 harus lebih besar dari 0")
    }
    if (nilai3 == 0){
        throw java.lang.IllegalArgumentException("nilai3 harus lebih besar dari 0")
    }
    return nilai1 + nilai2 + nilai3
}
/* Tidak ada yang salah dengan semua fungsi di atas. Fungsi tersebut akan berjalan dengan semestinya
*  tanpa adanya error selama kondisi yang berada di dalamnya terpenuhi. Namun jika kita perhatikan,
*  terdapat pengulangan kode yang sama yaitu penggunaan if expression untuk memeriksa apakah nilai
*  dari argumen yang diberikan bernilai null.*/

// Di sinilah kita bisa memanfaatkan inner function untuk membuat kode yang ditulis berulang tersebut
// menjadi fungsi tersendiri.
fun sum1(nilai1: Int, nilai2: Int, nilai3: Int): Int{
    fun validNumber(nilai: Int){
        if (nilai == 0){
            throw IllegalArgumentException("nilai yang diinput harus lebih besar dari 0")
        }
    }
    validNumber(nilai1)
    validNumber(nilai2)
    validNumber(nilai3)

    return nilai1 + nilai2 + nilai3
}
// Setelah menjadikannya sebagai sebuah fungsi tersendiri, kode yang ada di dalam fungsi sum() tersebut
// lebih singkat dan tentunya lebih mudah dibaca dibandingkan sebelumnya.

// Selain itu, kita juga bisa menjadikan inner function sebagai extensions function. Contohmya seperti berikut:

fun sum2(nilai1: Int, nilai2: Int, nilai3: Int): Int{
    fun Int.validNumber(){
        if (this == 0){
            throw IllegalArgumentException("nilai yang diinput harus lebih besar dari 0")
        }
    }
    nilai1.validNumber()
    nilai2.validNumber()
    nilai3.validNumber()
    val hasil: Int = nilai1 + nilai2 + nilai3

    return hasil
}// Untuk cara pemanggilannya lanjut ke baris 18