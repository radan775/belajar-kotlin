package com.bdt.kotlin

fun main(){
    println("materi expression dan statement")
    // langsung kita lihat dari kode if berikut
    val openOffice = 7
    val now = 8
    if (now > openOffice){
        println("kantor telah buka")
    }else{
        println("kantor masih tutup")
    } // posisi if disini adalah statement karena tidak mengembalikan nilai, dia hanya percabangan dalam bahasa Kotlin
    print("\n")
    // if juga bisa digunakan sebagai expression, yang dimaksud expression adalah
    // statement yang dapat mengembalikan nilai dan bisa kita simpan dalam sebuah
    // variabel. Contoh
    val kantor = if (now > openOffice) "kantor telah buka" else "kantor masih tutup"
    println(kantor+"\n")
    /* pada kode diatas if akan mengembalikan nilai kedalam varibel kantor
    * jika kondisi if terpenuhi makan varibel kantor akan terisi "kantor telah buka"
    * jika tidak terpenuhi makan varibel kantor akan berisi "kantor masih tutup"*/

    //perlu diketahui bahwa di dalam expression juga bisa terdapat sebuah expression
    // contoh
    sum(1, 1*5)

    //contoh lain dari statement adalah inisialisasi sebuah variabel
    var nilai1 = 10
    var nilai2 = 20
    sum(nilai1, nilai2)
}
fun sum(nilai1: Int, nilai2: Int){
    var hasil = nilai1 + nilai2
    println("hasilnya adalah $hasil")
    // pada kode diatas 1*5 adalah sebuah expression dalam pemanggilan fungsi sum() atau fungsi yang
    // mengembalikan nilai, jadi pemanggilan sebuah fungsi adalah expression
}