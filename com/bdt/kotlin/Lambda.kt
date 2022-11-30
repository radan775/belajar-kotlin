package com.bdt.kotlin

fun main(){
    /* Lambda expression, biasa disebut dengan anonymous function atau function literal adalah fitur yang
    *  cukup populer sampai sekarang dalam dunia functional programming. Bisa disebut sebagai anonymous
    *  karena lambda tidak memiliki sebuah nama seperti halnya sebuah fungsi pada umumnya. Karena merupakan
    *  sebuah fungsi, lambda juga dapat memiliki daftar parameter, body, dan return type.
    *  Istilah lambda sendiri berasal dari istilah akademis lambda calculus yang digunakan untuk menggam-
    *  barkan proses komputasi.*/

    /* Beberapa karekteristik dari lambda yaitu:
    *  - Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya.
    *    Tipe tersebut akan ditentukan oleh kompiler secara otomatis.
    *  - Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier
    *    saar dideklarasikan, karena lambda bersifat anonymous.
    *  - Parameter yang akan ditetapkan berada dala kurung kurawal {}.
    *  - Ketika ingin mengembalikan nilai. kata kunci return tidak diperlukan lagi karena kompiler akan
    *    secara otomatis mengembalikan nilai dari dalam body.
    *  - Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam
    *    sebuah variabel.*/

    println("Menggunakan lambda expression")
    // perhatikan contoh berikut lanjut ke lambda message
    message()

    // jika kita ingin menambahkan sebuah parameter pada fungsi lambda, kita bisa menuliskannya seperti
    // lanjut ke lambda printMessage()
    printMessage("Halo dari lambda")

    // Untuk cara mendeklarasi lambda agar dapat mengembalikan nilai ialah seperti berikut
    // lanjut ke lambda messageLength()
    val panjang = messageLength("String length lambda")
    println(panjang)
    printMessage("$panjang")

}

val message = { println("Hello from Lambda") }
// kode diatas adalah contoh deklarasi dari lambda, di mana fungsi lambda di atas ditandai dengan sepasang
// kurung kurawal. Di dalamnya terdapat fungsi untuk mencetak teks pada konsol. Ketika ingin menggunakannya.
// kita bisa memanggilanya seperti halnya kita memanggil sebuah fungsi pada umumnya lihat pada baris 24

val printMessage = { message: String -> println(message) }
// seperti yang sudah dijelaskan sebelummnya, parameter dari sebuah lambda berada di dalam kurung kurawal.
// Untuk membedakannya dengan body, daftar parameter yang ada dipisahkan dengan tanda ->. Kemudian,
// lanjut ke baris 28

val messageLength = { message: String -> message.length}
// bisa kita perhatikan, kita tidak membutuhkan tipe kembalian dan kata kunci return untuk mengembalikan
// sebuah nilai. Pada dasarnya, kompiler akan mengembalikan nilai berdasarkan expression atau statement
// di baris akhir body.
// Lanjut ke baris 32