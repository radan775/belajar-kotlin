package com.bdt.kotlin

import java.util.StringJoiner

/* Exception Handling dapat diterapkan dengan beberapa cara. Di antaranya adalah dengan menggunakan try-catch,
*  try-catch-finally, dan multiple catch. Mari kita pelajari ketiga cara tersebut.
*  - Try-catch
*  Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch. Kode yang dapat membangkitkan
*  suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi, maka blok catch akan terpanggil.
*  Berikut cara penulisan try-catch pada Kotlin:
    try {
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: SomeException) {
        // Block catch akan terpanggil ketika exception bangkit.
    }
*  Dengan menuliskan kode dalam blok try, kode kita menjadi terproteksi dari exception. Jika terjadi exception
*  maka program tidak akan terhenti atau crash, namun akan dilempar menuju blok catch. Di sana kita dapat
*  menuliskan sebuah kode alternatif untuk menampilkan pesan error atau yang lainnya. Dalam penulisan disin akan
*  dipisah menjadi beberapa fungsi agar mudah dipahami.*/
fun trycatch(){
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception){
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }
}
fun main(){
    trycatch()
    tryCatchFinally()
    multipleCatch()
    /* Output kode pada fungsi terakhir ini menjelaskan bahwa block catch dengan parameter NullPointerException
    *  terpanggil. Sebabnya, pada variabel someStringValue kita menetapkan null sebagai nilainya.
    *  Berbeda ketika kita menginisialisasikan nilai someStringValue dengan nilai "12.0" maka exception yang
    *  akan terjadi adalah NumberFormatException dengan begitu block Catch kedua yang akan terpanggil dan akan
    *  menghasilkan output sebagai berikut:
    *  - Catch block NumberFormatException terpanggil
    *  Namun jika kedua exception tersebut tidak terjadi, dalam arti nilai someStringValue berhasil diubah dalam
    *  bentuk Integer, maka output yang dihasilkan adalah nilai dari Intergernya tersebut.
    *  Contohnya, saat nilai someStringValue diinisialisasikan dengan nilai "12".*/
}
/* Try-catcht-finally
*  Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional. finally
*  akan dieksekusi setelah program keluar dari blok try ataupun catch. Bahkan finally juga tereksekusi ketika
*  terjadi exception yang tidak terduga. Exception tidak terduga terjadi ketika kita menggunakan NullPointerException
*  pada catch namun exception yang terjadi adalah NumberFormatException.
*  Sebagai contoh, mari kita buat kode dengan menerapkan finally: */
fun tryCatchFinally(){
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception){
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}// Dengan menggunakan finally, fungsi println() cukup dituliskan pada blok finally.

/* Multiple Catch
*  Dari kode yang kita coba sebelumnya, kita menggunakan exception untuk menangani semua tipe exception yang
*  terjadi. Baik itu ketika terjadi NullPointerException atau NumberFormatExceptio. Sebenarnya pada catch
*  kita dapat secara spesifik memilih tipe exception apa yang ingin ditangai. Multiple catch memungkinkan
*  untuk penanganan exception dapat ditangani lebih dari satu exception. Hal ini sangat berguna ketika kita
*  ingin menangani setiap tipe exception dengan perlakuan berberda. Berikut contoh struktur kode dengan
*  menerapkan multiple catch:
    try{
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: NullPointerException) {
        // Block catch akan terpanggil ketika terjadi NullPointerException.
    } catch (e: NumberFormatException) {
        // Block catch akan terpanggil ketika terjadi NumberFormatException.
    } catch (e: Exception) {
        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
    }
    finally {
        // Block finally akan terpanggil setelah keluar dari block try atau catch
    }
*  Dari struktur kode di atas, kita dapat melihat terdapat 3(tida) blok catch. Block catch yang pertama
*  menggunakan parameter NullPointerException, sehingga jika terjadi NullPointerException makan blok catch
*  tersebut akan dieksekusi. Yang kedua block catch dengan parameter NumberFormatException, sehingga jika
*  terjadi NumberFormatException maka blok tersebut akan dieksekusi. Dan yang terakhir blok catch dengan
*  parameter Exception, blok ini akan menangani seluruh exception yang terjadi kecuali untuk dua exception
*  yang telah ditentukan pada blok sebelumnya.
*  Mari kita coba terapkan contoh kode yang multiple catch: */
fun multipleCatch(){
    val someString: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someIntValue!!.toInt()
    }catch (e: NullPointerException){
        someIntValue = 0
    } catch (e: NumberFormatException){
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil")
            -1 -> println("Catch block NumberFormatException terpanggil")
            else -> println(someIntValue)
        }
    }
}