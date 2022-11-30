package com.bdt.kotlin

fun main(){
    // masuk materi collection Set
    // set adalah sebuah collection yang dapat menyimpan data unik. Ini akan berguna ketika kita
    // menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.
    // kita bisa mendeklarasikan sebuah set dengan fungsi setOf()
    val integerSet = setOf(1,2,3,1,2,4)
    // pada kode diatas terdapat beberapa angka duplikat, yaitu 1 dan 2. mari kita coba tampilkan nilai set
    println(integerSet)
    // secara otomatis fungsi setOf() akan membuang angka yang sama, sehingga hasilnya adalah [1,2,3,4]
    // selain itu urutan nilai pada Set bukanlah sesuatu yang penting, sehingga apabila kita bandingkan dua
    // buah set yang memiliki nilai sama dan urutan berbeda, akan tetap dianggap sama.
    val intergerSet1 = setOf(4,3,2,1)
    println(integerSet == intergerSet1)

    // kita juga bisa melakukan pengecekan apakah sebuah nilai ada di dalam Set dengan menggunakan kata
    // kunci in.
    println(3 in integerSet)

    // kemudian ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan 2 buah Set
    val integerSet2 = setOf(1,3,6,7)
    val union = integerSet.union(integerSet2)
    // union adalah menggabungkan 2 buah Set
    val intersect = integerSet.intersect(integerSet2)
    // intersect adalah irisan 2 buah Set

    println(union)
    println(intersect)

    // informasi tambahan
    // Pada mutable Set kita bisa menambah dan menghapus item namun tidak bisa mengubah nilai seperti
    // pada collection List

    val mutableSet = mutableSetOf(1,2,4,7,9,2,1,4)
    // mutableSet[3] = 9 // tidak bisa mengubah nilai set mutable
    mutableSet.add(8) // menambahkan item diakhir set
    mutableSet.remove(1) // menghapus item yang memiliki nilai 1
}