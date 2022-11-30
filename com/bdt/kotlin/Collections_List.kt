package com.bdt.kotlin

fun main(){
    /* Collections adalah sebuah objek yang bisa menyimpan kumpulan objek lain termasuk data class. Dengan
    * collection kita bisa menyimpan banyak data sekaligus. Di dalam collections terdapat beberapa objek
    * turunan, diantaranya adalah List, Set, dan Map. */

    // List sama seperti Array dalam Java, kita bisa menyimpan banyak data menjadi satu objek.
    // cara penulisannya seperti berikut
    val nomorList : List<Int> = listOf(1,2,3,4,5,6,7,8)
    for (i in nomorList){
        print(i)
    }// for loop ini adalah cara menampilkan data di dalam List

    // Karena kompiler bisa mengetahui tipe data yang ada dalam sebuah objek List, maka tak perlu kita
    // menuliskannya secara eksplisit. Ini akan menghemat kode yang kita tulis
    val numberList = listOf(1,2,3,4,5)
    val charList = listOf('a','b','c','d')
    // sedangkan untuk membuat List dengan tipe data yang berbeda, cukup masukkan saja data tersebut seperti
    // kode berikut:
    val listApapun = listOf(1,2,'a',"Halo",3,true)
    // karena setiap objek pada Kotlin merupakan turunan dari kelas Any, maka variabel anyList tersebut
    // akan memiliki tipe data List<Any>.

    // Bahkan kita bisa memasukkan data class ke dalam List tersebut
    val anyList = listOf(1,2,'a',"Halo",3,true,dataPengguna("nama",18))
    // ketika kita ingin mengakses satu data saja dari dalam List, maka kita bisa melakukannya dengan
    // mengakses nilai index dari List. Untuk melakukannya bisa menggunakan fungsi indexing.
    println(anyList[6])
    // jika kita berusaha untuk menampilkan item dari List yang berada dari luar ukurannya
    // maka hasilnya akan error, karena

    // Informasi tambahan:
    // Sejauh ini kita baru belajar mengisialisasikan atau mengakses data dari sebuah List.
    // Lantas apakah bisa kita memanipulasi data pada List tersebut, jawabannya tidak. Karena List tersebut
    // bersifat immutable alias tidak bisa diubah. Namun terdapat juga collection dengan tipe mutable.
    // Artinya kita bisa melakukan perubahan pada nilainya dengan cara menambah, menghapus, atau mengganti
    // nilai yang sudah ada. Caranya sangat mudah cukup menggunalan fungsi mutableListOf
    val anyList1 = mutableListOf(1,2,'a',"Halo",3,true)
    // dengan begini, anyList1 sekarang merupakan sebuah List yang bersifat mutable dan kita bisa mengubah
    // nilai yang ada di dalamnya.
    anyList1.add('d') // menambah item di akhir List
    anyList1.add(1,"cinta") // menambah item pada index ke-1
    anyList1[6] = false // mengubah nilai item pada index ke-6
    anyList1.removeAt(4) // menghapus item pada index ke-4
}