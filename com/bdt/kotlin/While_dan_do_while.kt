package com.bdt.kotlin

fun main(){
    /* while loop adalah sintax kode yang memiliki sifat Extry Controlled Loop
    * Artinya kondisi yang diberikan akan dievaluasi terlebih dahulu. Jika kondisi yang diberikan
    * terpenuhi makan proses perulangan akan dijalankan, jika kondisi yang diberikan tidak terpenuhi
    * maka proses perulangan tidak akan dijalankan
    * CONTOH */
    var nilai = 1
    while (nilai <= 7){
        println("Hello Kotlin")
        nilai++
    }
    print("\n")
    /* selain ada perulangan While ada juga perulangan Do While
    * Berbeda dengan While, Do while memiliki sifat Exit Controlled Loop
    * dimana proses perulangan akan langsung dijalankan di awal minimal satu kali, barulah kondisi yang
    * diberikan akan dilakukan pengecekan
    Contoh*/
    var hitung = 1
    do {
        println("Hello World Lagi")
        hitung++
    }while (hitung < 7)
    println("sudah habis")
    /*
    * Catatan ketika menggunakan While dan Do While perhatikan infinite loop, yaitu kondisi dimana proses
    * perulangan akan terus terjadi sampai aplikasi menjadi crash
    * infinite loop terjadi karena tidak ada batas terhadap nilai varibel ataupun karena tidak ada decreement
    * dan increement yang diberikan
    *
    * While dan Do While tidak dapat digunakan untuk melakukan perulangan pada rentan nilai tertentu
    * untuk melakukannya bisa kita gunakan For Loop
    * */
}