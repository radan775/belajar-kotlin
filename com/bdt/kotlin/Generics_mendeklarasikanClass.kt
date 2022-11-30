package com.bdt.kotlin

/* Setelah mengetahui contoh bagaimana generic bekerja pada sebuah class, selanjutnya kita akan mempelajari
*  bagaimana penerapan generic itu sendiri. Kita bisa menerapkannya dengan meletakkan tipe parameter ke dalam
*  angle brackets (<>) seperti berikut: */
interface interfacesList<T>{
    operator fun get(index: Int): T
}
/* Pada kode di atas, tipe parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari
*  sebuah fungsi.
*  Selanjutnya, jika kita mempunyai sebuah class yang mewarisi class atau interface generic, maka kita perlu
*  menentukan tipe argumen sebagai tipe dasar dari parameter generic class tersebut. Parameternya bisa berupa
*  tipe yang spesifik atau lainnya. Contohnya sebagai berikut: */
class LongList: interfacesList<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}
class ArrayList1<T> : interfacesList<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
/* Pada class LongList di atas, Long digunakan sebagai tipe argumen untuk List, sehingga fungsi yang berada
*  di dalamnya akan menggunakan Long sebagai tipe dasarnya. Berbeda dengan class ArrayList, di mana tipe
*  argumen untuk class List menggunakan T. Dengan demikian ketika kita menggunakan class ArrayList, kita
*  perlu menentukan tipe argumen dari class tersebut saat inisialisasi. */

fun main(){
    val longArrayList = ArrayList1<Long>()
}
/* Yang perlu diperhatikan dari class ArrayList di atas adalah deklarasi dari tipe parameter T. Tipe
*  parameter tersebut berbeda dengan yang ada pada class List, karena T adalah milik class ArrayList itu
*  sendiri. Plus sebenarnya Kita pun bisa menggunakan selain T misalnya : */
interface List2<P>{
    operator fun get(index: Int): P
}