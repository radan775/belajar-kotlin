package com.bdt.kotlin

fun main(){
    // turunan ketiga dari Collections adalah Map, yaitu sebuah collection yang dapat menyimpan data dengan
    // format key-value.
    // Contoh
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "Beijing" to "China",
        "London" to "England",
        "New Delhi" to "India"
    )
    // String yang ada di sebelah kiri dari kata kunci to adalah sebuah key, sedangkan yang ada di
    // sebelah kanan merupakan value-nya. Cara akses Map tersebut, kita bisa menggunakan key yang sudah
    // dimasukkan. Contoh key "Beijing" untuk mendapatkan value "China"
    println(capital["Beijing"])
    // atau bisa menggunakan fungsi getValue()
    println(capital.getValue("Beijing"))
    // hasilnya sama saja. Namun sebenarnya terdapat sebuah perbedaan antara keduanya. Saat menggunakan
    // simbol [] atau yang kita kenal dengan indexing, konsol akan menampilkan hasil null saat key yang
    // dicari tidak ada di dalam Map. Sedangkan ketika kita menggunakan getValue(), konsol akan memberikan
    // sebuah error Exception
    println(capital["New York"])
    // beda dengan
    //println(capital.getValue("New York"))

    // kita dapat menampilkan key apa saja yang ada di dalam Map dengan menggunakan fungsi key()
    // fungsi ini akan mengembalikan nilai berupa Set karena key pada Map haruslah unik
    val mapKeys = capital.keys
    println(mapKeys)
    println(capital.keys)

    // sedangkan untuk mengetahui nilai apa saja yang ada di Map kita bisa menggunakan fungsi values()
    // fungsi ini akan mengembalikan collection sebagai tipe datanya
    val mapvalues = capital.values
    println(mapvalues)
    println(capital.values)

    // Catata Penting
    // untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa maps yang digunakan adalah
    // mutable. Mari kita ubah map capital yang sudah kita buat sebelumnya menjadi mutable

    val mutableMap = capital.toMutableMap()
    // selanjutnya kita bisa menambahkan key-value baru menggunakan fungsi put()
    mutableMap.put("Amsterdam", "Netherlands")
    mutableMap.put("Berlin", "Germany")
    println(mutableMap.values)

    /* Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan. Apabila
    * terdapat sebuah mutable collection yang diubah oleh lebih dari satu proses, hasilnya akan sulit
    * diprediksi. Untuk itu, sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan
    * untuk diubah, baru gunakan mutable*/
}