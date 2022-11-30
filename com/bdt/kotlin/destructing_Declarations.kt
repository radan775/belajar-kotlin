package com.bdt.kotlin

data class dataPengguna(val nama: String, val umur: Int)

fun main(){
    // destructuring declarations adalah proses memetakan objek menjadi sebuah
    // variabel. Hal ini bisa kita lakukan dengan mudah pada data class.
    // Dengan fungsi componentN() yang ada pada data class, kita bisa menguraikan
    // sebuah objek menjadi beberapa properti yang dimilikinya.
    // Contoh

    val dataUser = dataPengguna("janji", 21)

    val name = dataUser.component1()
    val age = dataUser.component2()
    println("nama saya adalah $name, saya berumur $age")
    // fungsi component1() dan component2() dihasilkan dengan jumlah properti yang ada pada data class tersebut

    // kita juga dapat membuat beberapa variabel dari objek secara langsung dengan kode berikut.
    val (nama,umur) = dataUser
    println("Nama saya adalah $nama, dan saya sekarang umur $umur")
    // hasil dari kode ini sama seperti kode sebelumnya

    /* Kesimpulannya, seperti aspek-aspek lain dari Kotlin, data class bertujuan untuk mengurangi jumlah
    * kode boilerplate yang kita tulis. Dan perlu diketahui bahwa data class tidak hanya sekedar untuk
    * mengelola properti yang ada di dalamnya. Ketika mempunyai data yang sangat kompleks, kita juga bisa
    * menerapkan sebuah behavior di dalam data class. Contoh sederhana, kita bisa membuat fungsi di dalam
    * data class seperti berikut lanjut ke baris-31*/

    // dan bisa kita akses langsung dengan fungsi main()
    val dataUser1 = dataPengguna1("joko",23)
    dataUser1.perkenalan()

}
data class dataPengguna1(val nama: String, val umur: Int){
    fun perkenalan(){
        println("nama saya adalah $nama, dan saya berumur $umur")
    }
}