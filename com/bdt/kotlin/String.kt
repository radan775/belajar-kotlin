package com.bdt.kotlin

fun main(){
    // String adalah sekumpulan Array, sehingga bisa diambil nilainya
    // satu-satu dengan cara indexing
    val text  = "Kotlin"
    val firstChar = text[0]

    print("First character of $text is $firstChar\n\n")
    // $ adalah cara pemanggilan String dan char ke dalam kode output

    // String bisa dilakukan pemanggilan dengan dengan
    // caranya ialah panggil char dengan indexing isi dalam String
    val text1  = "Kotlin"
    for (char in text1){
        print("$char ")
        }
    println("\n")

    // Dalam String ada 2 tipe Literal String
    // Pertana ada Escaped String, contoh
    val statement = "Kotlin is \"Awesome!\""
    println(statement)
    // fungsi dari backslash di dalam String ini berfungsi untuk memberitahu
    // compiler dimana awal baris String dan dimana akhir baris String

    /*
    * Selain backslash diatas ada beberapa karakter lain yang dapat
    * digunakan untuk melakukan escaped dalam String
    * \t berfungsi untuk menambah tab ke dalam teks
    * \n berfungsi untuk menambah baris baru di dalam teks
    * \' berfungsi menambah karakter single quote ke dalam teks
    * \" berfungsi untuk menambah karakter double quote ke dalam teks
    * \\ berfungsii untuk menambah karakter backslash ke dalam teks*/

    // dalam String kita bisa menbahkan sebuah Unicode
    val name = "Unicode test: \u00A9 \n"
    print(name)

    // Kedua ada Raw String, contoh
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
    // pada contoh code diatas kita bisa mendefinisikan Raw String menggunakan
    // triple quote (""" """). Ram String memungkinkan kita untuk membuat beberapa
    // baris String tanpa penggabungan dan penggunaan karakter escaped
}