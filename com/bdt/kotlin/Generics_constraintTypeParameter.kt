package com.bdt.kotlin

// Constraint Type Parameter
/* Dalam penerapan generic, kita bisa membatasi tipe apa saja yang dapat digunakan sebagai parameter. Untuk
*  menetukan batasan tersebut, bisa dengan menambahkan tanda titik dua (:) setelah tipe parameter yang kemudian
*  diikuti oleh tipe yang akan dijadikan batasan. Contohnya seperti berikut:
class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        ....
    }
}

*  Pada kode di atas kita telah menentukan Number sebagai batasan tipe argumen. Dengan begitu, kita hanya bisa
*  memasukkan tipe argumen Number pada class ListNumber. Dan ketika kita memasukkan selain Number, maka akan
*  terjadi error seperti berikut:
fun main(){
    val numbers = ListNumber<Long>()
    val numbers = ListNumber<Int>()
    val numbers = ListNumber<String>() // ini akan error
}
*  Contoh lain dari constraint type parameter adalah seperti berikut:
fun <T : Number> List<T>.sumNumber() : T {
    return sumNumber()
}
*  Fungsi di atas merupakan extensions function dari class List yang mempunyai tipe parameter. Sama seperti
*  deklarasi generic pada sebuah fungsi, tipe parameter T pada fungsi tersebut juga akan digunakan sebagai
*  receiver dan return type. Perbedaannya terletak pada cara memanggilnya. Fungsi tersebut akan tersedia pada
*  variabel List dengan tipe argumen yang memiliki supertype Number.
fun main(){
    val numbers = listOf(1,2,3,4,5)
    numbers.sumNumber()
    val names = listOf("dicoding", "academy")
    // names.sumNumber() akan error
}
*/