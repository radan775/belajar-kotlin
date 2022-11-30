package com.bdt.kotlin

fun main(){
    // ketika melakukan proses perulangan terkadang kita dihadapkan dengan data yang tak sesuai harapan
    // contoh
    val listOfNilai = listOf(1,2,3,null,5,6,null,8)
    for (i in listOfNilai){
        print(i)
    }
    // pada kode diatas proses perulangan menghasilkan nilai null pada output
    // lalu bagaimana kita akan bisa melewati sebuah nilai yang menghasilkan null ?
    // nah disinilah fungsi dari Break dan Continue
    println()
    // Continue digunakan untuk melewatkan proses iterasi atau perulangan dan lanjut dengan proses
    // iterasi selanjutnya. Sedangkan Break digunakan untuk menghentikan proses iterasi

    // Berikut adalah contoh proses iterasi pada kode diatas. Kita akan coba melewatkan iterasi jika nilai
    // yang dihasilkan adalah null
    for (i in listOfNilai){
        if (i == null) continue
        print("$i ")
    }// pada kode diatas kita menggunakan kata kunci continue. Jika hasil evaluasi expression yang diberikan
    // bernilai true, maka proses iterasi akan dilewatkan dan lanjut pada proses selanjutnya.
    println()

    // Berikut adalah contoh jika nilai yang dihasilkan adalah null, maka kita akan menghentikan
    // pada proses iterasi
    for (nilai in listOfNilai){
        if (nilai == null) break
        print("$nilai ")
    }
    println()

    // Break dan Continue Labels
    // Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label. Label pada Kotlin memiliki
    // sebuah identifier yang diikuti dengan tanda @. Contoh
    loop@ for (i in 1.rangeTo(14)){
        println("diluar loop")
        for (j in i.rangeTo(10)){
            println("didalam Loop")
            if (j > 5) break@loop
        }
    }
}