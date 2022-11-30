package com.bdt.kotlin

fun main(){
    /* Seperti yang sudah kita pelajari, saat mendeklarasikan sebuah lambda dengan function type, kita bisa
    *  menggunakannya seperti berikut:
    *
    *  val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }
    *
    *  Dengan Kotlin, kita bisa memisahkan lambda expression menjadi fungsi tersendiri dan mereferensikannya
    *  langsung sebagai instance dari function type dengan cara seperti berikut:
    *
    *  val sum: (Int, Int) -> Int = ::count
    *  fun count(valueA: Int, valueB: Int): Int {
    *  return valueA + valueB }
    *
    *  kode di atas ditulis dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan library yang
    *  memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung.*/

    println("Functions References")
    // Pada suatu kondisi, terkadang kita butuh mereferensikan sebuah fungsi. Sebagai contoh, misal kita
    // memiliki fungsi seperti berikut: Lanjut ke fungsi isEvenNumber()
    val numbers = 1..10
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
    // Selain itu, kita juga bisa mereferensikan sebuah extensions function. Caranya dengan ikut menyertakan
    // objek yang menjadi receivernya sebelum operator :: seperti berikut: Lanjut ke fun isEvenNumber1()
    val evenNumbers1 = numbers.filter ( Int :: isEvenNumber1 )
    println(evenNumbers1)
    println()

    println("Property References")
    /* Selain digunakan untuk mereferensikan sebuah fungsi. Operator :: juga dapat digunakan untuk mereferensikan
    *  sebuah properti. Dengan Operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut
    *  seperti nama, fungsi setter getter, dan lain-lain. Contohnya seperti berikut: Lanjut ke property messageLain() */
    println(::messageLain.name)
    println(::messageLain.get())
    ::messageLain.set("Kotlin Academy")
    println(::messageLain.get())
    /* Ekspresi ::messageLain akan dievaluasi ke dalam objek dengan KMutableProperty yang memungkinkan kita
    *  untuk membaca nilainya dengan menggunakan get(), menetapkan nilai menggunakan set() dan mendapatkan nama
    *  dari properti tersebut menggunakan properti name.*/

    // Sedangkan untuk properti yang bersifat immutable seperti val messageLain = "Kotlin", ::messageLain akan
    // mengembalikan nilai dengan tipe Kproperty, yang mana hanya terdapat fungsi get() di dalamnya.

}
fun isEvenNumber(number: Int) = number % 2 == 0
// Fungsi di atas digunakan untuk memeriksa apakah suatu angka merupakan sebuah bilangan genap. Dengan menggunakan
// operator :: kita bisa menggunakan sebagai instances dari function type. Sebagai contoh, penggunaan fungsi
// filter() yang menjadi bagian dari kelas List berikut: Lanjut ke baris 22

fun Int.isEvenNumber1() = this % 2 == 0
// Lanjut ke baris 27

var messageLain = "Kotlin"
// lanjut ke baris 35