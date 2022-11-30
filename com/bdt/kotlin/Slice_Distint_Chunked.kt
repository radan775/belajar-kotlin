package com.bdt.kotlin

fun main(){
    // Materi ini adalah lanjutan dari Fold, Drop, Take
    println("===== Slice =====")
    /* Fungsi slice() adalah fungsi yang digunakan untuk menyaring sebuah item dari posisi tertentu.
    *  Dalam penggunaannya, fungsi slice() membutuhkan sebuah argumen berupa range yang digunakan untuk
    *  menentukan posisi pertama dan terakhir yang akan disaring. Berikut contohnya: */
    val total = listOf(0,1,2,3,4,5,6,7,8,9)
    val slice = total.slice(3..6)

    println(slice)
    // Karena menggunakan Range, kita juga bisa menggunakan operator step ketika argumennya disematkan.
    val slice1 = total.slice(3..6 step 2)

    println(slice1)
    // Kemudian jika kita ingin menentukan posisi lebih spesifik, kita bisa mendefinisikannya di dalam
    // sebuah collection, kemudian disematkan sebagai argumen. Misal seperti berikut:
    val index = listOf(3,1,5,2)
    val slice2 = total.slice(index)
    println(slice2)
    // Kita harus hati-hati dalam menentukan cakupan index untuk mendapatkan data. Karena menyebabkan
    // terjadinya ArrayIndexOutOfBoundsException jika posisi yang ditentukan tidak terdapat pada objek collection
    println()

    println("===== Distinct =====")
    /* Saat berurusan dengan item yang sama di dalam sebuah collection, untuk menyaring item yang sama
    *  tersebut kita akan melakukan iterasi dan membandingkan setiap itemnya. Namun dengan Kotlin
    *  kita tidak perlu melakukannya secara manual, karena Kotlin Collection menyediakan fungsi untuk
    *  melakukannya dengan mudah yaitu fungsi distinct(). Cohtoh: */
    val sebuahList = listOf(1,2,1,3,5,4,2,6,3,4)
    val distinct = sebuahList.distinct()

    println(distinct)
    // sama seperti beberapa fungsi sebelumnya, fungsi distinct() bisa langsung dipanggil dari objek
    // collecton. Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class
    // Contoh:
    data class Item(val key: String, val value: Any)
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "Is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach{
        println("${it.key} with value ${it.value}")
    }
    /* Hal menarik lainnya ialah kita bisa juga menentukan proses penyaringan item yang sama seperti apa
    *  yang akan dijalankan dengan menggunakan fungsi distinctBy(). Misa kita ingin menyaring item yang
    *  memiliki panjang yang sama, kita bisa melakukannya seperti berikut: */
    val text = listOf("A","B","CC","DD","EEE","F","GGGG")
    val distinct1 = text.distinctBy {
        it.length
    }
    println(distinct1)
    // catatan! fungsi distinct tidak dapat digunakan pada object Map Collection.
    println()

    println("===== Chunked =====")
    /* Sama seperti fungsi split(), fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi
    *  beberapa bagian kecil dalam bentuk Array. Namun untuk penerapannya sedikit berbeda, di mana fungsi
    *  split() membutuhkan argumen berupa RegEx sebagai parameter sedangkan chunked() membutuhkan nilai
    *  yang akan digunakan sebagai jumlah indeks untuk pemisah. Contoh penggunaannya: */
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)
    /* Selain itu, kita juga bisa menggunakannya untuk memodifikasi setiap nilai yang sudah dipecah.
    *  Contoh, hasil dari nilai yang sudah dipecah ingin kita buat menjadi huruf kecil, maka kita bisa
    *  menggunakan fungsi chunked() seperti berikut: */
    val chunkedTranform = word.chunked(3){
        it.toString().toLowerCase()
    }
    println(chunkedTranform)
    // argumen yang berada pada lambda expression di atas akan merepresentasikan setiap nilai yang sudah
    // dipecah
}
