package com.bdt.kotlin

fun main(){
    // selain memiliki beberapa turunan, collection juga memiliki beberapa fungsi operasi yang bisa kita
    // gunakan untuk mengakses data di dalamnya.

    println("fungsi filter() dan filterNot()")
    // kedua fungsi ini akan menghasilkan list baru dari seleksi berdasarkan kondisi yang diberikan.
    // contoh:
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val ketikaList = numberList.filter { it % 2 == 0 }
    println(ketikaList)
    // hasil kode diatas akan menyaring bilangan yang habis dibagi 2 (dua). Selain itu kita juga bisa
    // menyaring list berdasarkan hasil yang tidak sesuai.
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)
    // bisa disimpulkan bahwa filterNot() merupakan kebalikan dari filter()

    println("fungsi map()")
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)
    // it pada kode di atas akan merepresentasikan masing-masing item pada numberList

    println("fungsi count()")
    // fungsi count() dapat digunakan untuk menghitung jumlah item yang ada di dalam collection.
    // contoh kita akan menampilkan jumlah item yang ada di dalamnya.
    println(numberList.count())
    // di dalam fungsi count() kita juga bisa menambahkan sebuah parameter berupa lambda yang berisi
    // sebuah kondisi. Contoh:
    println(numberList.count{ it % 3 == 0})

    println("fungsi find(), firstOrNull(), dan lastOrNull()")
    // Kita bisa mencari item pertama yang sesuai kondisi yang kita tentukan dengan menggunakan
    // fungsi fing(). Contoh kita akan mencari angka ganjil pertama dari numberList.
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull{ it % 2 == 3}
    println(firstOddNumber)
    println(firstOrNullNumber)
    // fungsi find() memiliki cara kerja yang sama dengan fungsi firstOrNull(). Artinya, jika di dalam
    // collection tidak ditemukan data yang sesuai, maka fungsi akan mengembalikan nilai null.
    // berbeda dengan fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi
    // find() dan firstOrNull ini akan langsung mengembalikan nilai ketika kondisi terpenuhi.
    // Jika ingin mencari item terakhir, bisa gunakan fungsi lastOrNull().

    println("fungsi first() dan last()")
    // Hampir sama seperti fungsi firstOrNull() dan fungsi lastOrNull(), fungsi first() dan last()
    // digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa
    // menambahkan sebuah kondisi parameter lambda. Namun perlu diperhatikan jika kita menambahkan
    // kondisi padahal kondisi tersebut tidak terpenuhi, maka akan terjadi Exception.
    /*val moreThan10 = numberList.first{ it % 2 == 3}
    println(moreThan10)*/

    println("fungsi sum()")
    // fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka. Fungsi ini akan
    // menjumlahkan setiap data yang ada pada collection.
    val total = numberList.sum()
    println(total)

    println("fungsi sorted()")
    // fungsi sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default
    // fungsi sorted() akan mengurutkan data secara ascending.
    val kotlinChar = listOf('k','o','t','l','i','n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    // sedangkan untuk sorting secara descending, kita dapat menggunakan fungsi sortedDescending()
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}