package com.bdt.kotlin

fun main(){
    println("Materi ini adalah lanjutan dari Kotlin Standard Library")

    // yang pertama adalah penjelasan mengenai fungsi run
    println("fungsi (run) dalam scope function with lambda")
    /* Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda. Untuk
    *  mengakses konteks dari objek, ia akan menggunakan receiver (this). Fungsi run akan sangat berguna
    *  jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.
    *  Contoh cara pemakaiannya seperti berikut: */
    val text = "Hello"
    val result = text.run{
        val from = this
        val to = this.replace("Hello","Kotlin")
        "replace text from $from to $to"
    }
    println("hasilnya : $result\n")

    println("fungsi (with) dalam scope function with lambda")
    /* selanjutnya fungsi with. Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah
    *  fungsi biasa. Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai
    *  receiver. Contohnya ialah seperti berikut: */
    val message = "Hello Kotlin!"
    val resultWith = with(message){
        println("value is $this")
        println("with length ${this.length}")
    }
    // Nilai yang akan dikembalikan adalah berdasarkan expression yang berada di dalam blok lambda.
    // Misalnya seperti berikut:
    val resultWith1 = with(message) {
        "Fist character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultWith1)
    // fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan
    // nilai kembalian.
    println()

    println("fungsi (apply) dalam scope function with lambda")
    /* Berbeda dengan fungsi-fungsi sebelumnya. nilai yang dikembalikan dari fungsi apply adalah nilai dari
    *  konteks objeknya dan objek konteksnya tersedia sebagai receiver (this). Baiknya fungsi apply dapat
    *  melakukan inisialisasi atau konfigurasi dari receiver-nya. Perhatikan kode berikut: */
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())
    // dengan fungsi apply kita bisa menuliskannya seperti berikut:
    val pesan = StringBuilder().apply{
        append("Halo ")
        append("Kotlin")
    }
    println(pesan.toString())
    println(pesan)
    println()

    println("fungsi (let) dalam scope function with lambda")
    /* Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek. Penggunaan fungsi
    *  let akan banyak kita temukan pada objek yang bertipe non-null. Contohnya seperti berikut: */
    val message1: String? = null
    message1?.let{
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
    // Dengan menggunakan fungsi let seperti kode di atas, kita bisa mengurangi penggunaan operator safe call
    // seperti berikut:
    val length = message1?.length ?: 0 * 2
    val text1 = "text length $length"
    println(text1)
    // Lalu bagaimana jika kita ingin menjalankan logika kode lain jika objeknya null? Di sini kita akan
    // memanfaatkan fungsi lainnya yaitu run dan elvis operator yang sudah kita pelajari.
    // Contoh:
    val message2: String? = null
    message2?.let{
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message2 is null"
        println(text)
    }
    /* Sedangkan untuk nilai kembalian, ia bergantung pada expression yang berada di dalam blok lambda seperti
    *  contoh di atas. Karena pada baris terakhir dari blok lambda tersebut adalah fungsi println(), maka
    *  nilai yang akan dikembalikan adalah Unit. Ini dikarenakan fungsi println() sendiri mengembalikan nilai Unit. */
    println()

    println("fungsi (also) dalam scope function with lambda")
    /* Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks
    *  objek. Namun untuk konteks objeknya tersedia argumen (it). Fungsi also sebaiknya digunakan ketika
    *  kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.*/
    val text2 = "Hello Kotlin!"
    val hasilText2 = text2.also{
        println("value length -> ${it.length}")
    }
    println("hasil output -> $hasilText2")
}