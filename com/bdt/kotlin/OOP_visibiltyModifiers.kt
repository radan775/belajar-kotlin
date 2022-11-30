package com.bdt.kotlin

/* Visibility Modifiers
*  Kali ini kita akan mengenal beberapa tentang visibility modifiers atau hak akses pada Kotlin. Tentunya,
*  tidak semua properti dan fungsi pada sebuah class memiliki hak akses publik. Ada beberapa yang hanya dapat
*  diakses dari dalam dan ada yang dapat diakses dari luar classnya. Dengan menentukan hak akses tersebut, kita
*  dapat membatasi akses data pada sebuah class. Berikut macam-macam hak akses dan penjelasan singkatnya yang
*  dapat digunakan pada Kotlin:
*  - Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.
*  - Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada
*    scope yang sama.
*  - Protected: Hak akses yang cakupannya terbatas pada hirarki class. Anggota hanya dapat diakses pada class
*    turunannya atau class itu sendiri.
*  - Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat
*    diakses diluar modulnya tersebut.
*  Semua modifier tersebut bisa digunakan untuk class, objek, constructor, fungsi beserta properti yang ada di
*  dalamnya. Kecuali modifier protected yang hanya bisa digunakan untuk anggota di dalam sebuah class dan
*  interface. Protected tidak bisa digunakan pada package member seperti class, objek, dan yang lainnya.
*  Selanjutnya kita akan mempelajari bagaimana menentukan hak akses public, private, protected, dan internal
*  pada Kotlin. */

//Public
/* Berbeda dengan bahasa pemrograman umumnya, default modifier pada Kotlin adalah public. Ketika sebuah anggota
*  memiliki hak akses public maka anggota tersebut dapat diakses dari luar classnya melalui sebuah objek class tersebut.
*  Pada pembahasan sebelumnya kita sudah memiliki sebuah class Animal dengan properti public seperti name, age,
*  weight, dan isMamalia. Properti tersebut dapat kita akses dari luar class Animal. Bisa kita lihat dari sebuah
*  completion suggestion.*/

// Private
/* Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya.
*  Untuk menggunakan modifier private kita perlu menambahkan keyword private seperti contoh berikut: */
class privateAnimal( private var name: String, private val weigth: Double, private val age: Int, private val isMamalia: Boolean) {
/* Dengan menggunakan hak akses private, maka kita tidak diizinkan untuk mengakses properti pada class
*  privateAnimal tersebut dari luar class-nya. Dengan kata lain ketika kita memaksa akses, maka kita akan bertemu
*  dengan error. Satu-satunya cara untuk mengakses properti private dari sebuah class adalah dengan menambahkan
*  fungsi getter dan setter secara manual. Fungsi getter dan setter sebenarnya dihasilkan secara otomatis oleh
*  Kotlin ketika properti tersebut memiliki hak akses public tetapi tidak untuk private.*/
    fun getName(): String{
        return name
    }
    fun setName(newName: String){
        name = newName
    }
}
fun main(){
    val dicodingCat = privateAnimal("Dicoding Miauw", 3.7, 3, true)
    println(dicodingCat.getName())
    dicodingCat.setName("Goose")
    println(dicodingCat.getName())
    /* Pada kode di atas, terlihat bahwa kita berhasil mengubah nilai properti name dari nilai awal yang kita
    *  inisialisasikan pada constructor. Ia menjadi nilai baru yang kita terntukan dengan menggunakan fungsi
    *  setName(). */
    val cat = cat("dicoding Miauw", 3.2)
    println("Nama kucing: ${cat.name}")
    // println("Berat kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'
}
// Protected
/* Hak akses protected mirip seperti private, namun pembatasannya lebih luas dalam sebuah hirarki class. Hak
*  akses protected digunakan ketika kita menginginkan sebuah anggota dari induk class hanya dapat diakses oleh
*  class yang merupakan turunannya. Perhatika kode berikut: */
open class protectedAnimal(var name: String, protected val weigth: Double)
class cat(pName: String, pWeight: Double): protectedAnimal(pName, pWeight)
/* Pada kode tersebut, properti weight pada class protectedAnimal memiliki hak akses protected. Kita tetap bisa
*  mengaksesnya dari class cat yang termasuk dalam hirarki class protectedAnimal. Namun kita tidak dapat
*  mengakses properti tersebut secara langsung dari luar hirarki class-nya. Error akan terjadi jika kita
*  melakukan hal tersebut. Lanjut ke baris 53 */

// Internal
/* Internal merupakan hak akses baru yang diperkenalkan pada Kotlin. Hak akses ini membatasi suatu anggota untuk
*  dapat diakses hanya pada satu modul. Berikut contoh penggunan hak akses internal: */
internal class internalAnimal(val name: String)
/* Pada contoh di atas, class internalAnimal telah ditetapkan sebagai class internal, maka class tersebut hanya
*  dapat diakses dari modul yang sama. Hak akses ini sangat berguna ketika kita mengembangkan sebuah aplikasi
*  yang memiliki beberapa modul di dalamnya. */