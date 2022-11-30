package com.bdt.kotlin

fun main(){
    // Selain named dan default argument, Kotlin juga memiliki vararg (variable argument). Dengan menggunakan
    // kata kunci vararg kita juga bisa menyederhanakan beberapa parameter yang memiliki data yang sama
    // menjadi parameter tunggal.

    /* Dengan vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen yang kita
    * masukkan ketika fungsi tersebut dipanggil. Contoh lanjut ke funsi sumNumbers() */
    val number = sumNumbers(10, 20, 30, 40, 50)
    println(number)

    // Selain itu kita juga bisa menerapkan Generic untuk tipe data parameter ketika parameter tersebut
    // ditentukan dengan vararg. Contoh: lanjut ke fungsi asList()
    val test = asList(10,20,30,48)
    for (i in test)
        print("$i ")
    println()

    // Karena pada dasarnya adalah sebuah Array, maka kita bisa memanggil fungsi atau properti yang tersedia
    // pada kelas Array dari dalam fungsi tersebut. Contoh properti size --> lanjut ke fungsi getNumberSiza()
    val number1 = getNumberSize(2, 3, 10, 38)
    print("number size adalah "+ number1 + "\n")

    // Kapan kita membutuhkan vararg? Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah
    // argumen yang akan disematkan ketika fungsi tersebut dipanggil. Contoh penerapannya bisa kita lihat
    // pada fungsi String.format(), dimana fungsi tersebut terdapat beberapa parameter yang ditandai dengan
    // vararg dan dapat disematkan beberapa argumen tanpa harus tahu batasannya.

    println("===== ATURAN pada VARARG =====")
    // aturan pertama,  di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2(dua) parameter bertanda vararg.
    // Contoh:
    // fun sumNumbers(vararg number: Int, vararg number2: Int)
    // kalau kita membuat funsi seperti kode diatas, maka proses kompilasi akan gagal.

    // Aturan kedua. Jika kita ingin menambahkan parameter baru tanpa kata kunci vararg, parameter yang
    // ditandai dengan vararg sebaiknya berada pada posisi terakhir. Contoh lanjut ke fungsi sest().
    sets(10, 20, name = "Kotlin")

    // Kita bisa mendefinisikan parameter secara langsung ketika kita ingin menempatkan parameter yang
    // ditandai vararg bukan pada posisi pertama. Saat fungsi tersebut dipanggil di mana kita harus
    // menggunakan named argument saat ingin melampirkan argumen untuk parameter yang tidak ditandai
    // dengan vararg. Contoh ialah seperti pada kode di baris 38. Jika kita tidak menandai argumen
    // tersebut untuk parameter yang mana, kompiler akan menetapkan jika argumen tersebut untuk
    // parameter yang ditandai dengan vararg.
    println()

    println("======= Vararg vs Array<T> ======")
    // karena semua argumen ditampung di dalam sebuah Array, maka akan muncul pertanyaan, "Apa bedanya
    // ketika kita menggunakan Array<T> sebagai tipe parameter ?
    // Contoh kodenya
    /*
    *fun main() {
    val number = arrayOf(10, 20, 30, 40)
    sets(number)
}
    fun sets(number: Array<Int>) {
    ...
} */
    // ketika fungsi diatas dipanggil, fungsi tersebut membutuhkan argumen berupa nilai yang sudah
    // berberntuk Array (pada baris 59)

    /* Berbeda ketika kita menggunakan vararg. Kita bisa memasukkan argumen satu persatu. Dan kita
    * bisa memasukkan nilai yang sudah berbentuk Array sebagai argumen untuk parameter yang ditandai
    * vararg dengan memanfaatkan spread operator(*) seperti berikut:
    * fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
}

    fun sets(vararg number: Int): Int {
    ...
    Dalam penggunaannya, spread operator ditempatkan sebelum nama variabel yang ingin dilampirkan
}*/


}

fun sumNumbers(vararg number: Int): Int{
    return number.sum()
    // kita perhatikan pada contoh kode diatas bahwa kata kunci vararg ditempatkan sebelum nama parameter
    // Ketika ingin memanggil fungsi tersebut, kita bisa melampir beberapa argumen, misal lanjut ke baris 10
}

fun <T> asList(vararg input: T): List<T>{
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
    // Ketika sebuah parameter ditentukan dengan vararg, pada dasarnya semua argumen yang dilampirkan,
    // ditampung di dalam sebuah Array<out T>. Contoh bisa kita lihat pada kode diatas. Lanjut ke baris 15.
}

fun getNumberSize(vararg number: Int): Int{
    return number.size
    // lanjut ke baris 22
}

fun sets(vararg number: Int, name: String): Int {
    println("$number $name")
    return 0
    // lanjut baris ke 38

}