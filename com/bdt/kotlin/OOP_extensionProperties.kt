package com.bdt.kotlin

/* Pada materi Kotlin Functional Programming kita sudah mengenal bahwa Kotlin dapat meng-extends sebuah
*  fungsi pada class tanpa harus mewarisi class-nya. Hal ini dilakukan dengan deklarasi khusus yang disebut
*  dengan Extension
*
*  Extension properties pada Kotlin sama halnya seperti melakukannya pada Extension function. Kita dapat
*  menambahkan sebuah properti tanpa harus membuat class yang mewarisi class tersebut. Tetapi perlu diingat
*  bahwa properti yang kita buat bukan benar-benar berada pada class. Sebabnya, Extension properties
*  dilakukan di luar class. Dengan demikian, Extension properties hanya bisa didefinisikan dengan cara
*  menyediakan getter dan atau setter secara eksplisit. mari kita buat properties pada class Animal3()*/

class Animal3(val name: String,
             val weight: Double,
             val age: Int,
             val isMamalia: Boolean
)
val Animal3.getAnimalInfo: String
    get() = "Nama: ${this.name},berat: ${this.weight}, umur: ${this.age}, Mamalia: ${this.isMamalia}"

fun main(){
    val dicodingCat = Animal3("Dicoding Miauw", 5.1, 4, true)
    println(dicodingCat.getAnimalInfo)
}