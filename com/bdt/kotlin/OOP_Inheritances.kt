package com.bdt.kotlin

import java.util.DoubleSummaryStatistics

// Inheritances
/* Dalam gambaran dunia nyata, banyak objek yang berbeda tetapi punya kesamaan atau kemiripan tertentu. Contohnya
*  Kucing dan Kambing memiliki banyak kesamaan karena objek tersebut merupakan hewan. Kucing merupakan hewan
*  mamalia, bagitu juda dengan Kambing. Mungkin yang membedakan objek tersebut adalah cara mereka mencara makanan
*  dan jenis makanan yang dimakan. Sama halnya pada OOP, beberapa objek yang berbeda bisa saja memiliki kesamaan
*  dalam hal tertentu. Di situlah konsep inheritance atau pewarisan harus ditetapkan. Pewarisan dapat mencegah
*  kita melakukan perulangan kode. Untuk lebih memahaminya lihatlah contoh bagan sebuah class berikut:
* ----------------------------------------------------------------------------
*  Cat                      Fish                        Snake                 |
* ----------------------------------------------------------------------------
*  +name: String          | +name: String             | +name: String         |
*  +furColor: String      | +scaleColor: String       | +skinColor: String    |
*  +weight: Double        | +weight: Double           | +weight: Double       |
*  +age: Integer          | +age: Integer             | +age: Integer         |
*  +numberOfFeet: Integer | +numberOfFin: Integer     | +isToxic: Boolean     |
*  +isCarnivora: Boolean  | +isCarnivora: Boolean*    | +isCarnivora: Boolean |
* ----------------------------------------------------------------------------
*  - eat()                | - eat()                   | - eat()               |
*  - sleep()              | - sleep()                 | - sleep()             |
*  - playWithHuman()      | - swim()                  | - bite()              |
* -----------------------------------------------------------------------------
*  Pada bagan tersebut dapat kita lihatpada class Cat, Fish, dan Snake memiliki beberapa properti yang sama
*  seperti name, weight, age, isCarnivora dan juga memiliki beberapa fungsi yang sama seperti eat() dan sleep().
*  Jika kita ubah diagram kelas Kucing menjadi sebuah kode maka akan menjadi seperti ini: */
class Kucing(val nama: String, val furColor: String, val weight: Double, val age: Integer, val numberOfFeet: Integer, val isCarnivora: Boolean){
    fun eat(){
        println("$nama sedang makan!")
    }
    fun sleep(){
        println("$nama sedang tidur")
    }
    fun playWithHuman(){
        println("$nama bermain dengan manusia")
    }
}
/* Tidak ada masalah dengan kode tersebut, tetapi ketika kita akan membuat class dari diagram lainnya contoh
*  Fish maka kita harus menuliskan ulang properti seperti name, weight, age, dan properti atau fungsi yang sama
*  lainnya. Hal ini dapat mengurangi efisiensi dalam menuliskan kode.
*  Dengan teknik inheritance, kita bisa mengelompokkan properti atau fungsi yang sama. Caranya, buat sebuah class
*  baru yang nantinya akan diturunkan sifatnya pada sebuah class.
* --------------------------------------------------
*  Animal                                          |
* --------------------------------------------------
* + name: String                                   |
* + weight: Double                                 |
* + age: Integer                                   |
* + isCarnivora: Boolean                           |
* --------------------------------------------------
* - eat()                                          |
* - sleep()                                        |
* --------------------------------------------------
* ----------------------------------------------------------------------------
*  Cat                      Fish                        Snake                 |
* ----------------------------------------------------------------------------
* + furColor: String      | + scaleColor: String      | + skinColor: String   |
* + numberOfFeet: Integer | + numberOfFin: Integer    | + isToxic: Boolean    |
* ----------------------------------------------------------------------------
* playWithHuman()         | swim()                    | bite()                |
* ----------------------------------------------------------------------------
* Ketika class Animal telah dibuat, class lainnya dapat melakukan extends pada class tersebut. Dalam pewarisan,
* class Anima (main class) dapat disebut sebagai super atau parent class. Class yang melakukan extends pada
* class tersebut disebut child class. Dalam Kotlin untuk melakukan extends pada sebuah class dapat dilakukan
* dengan tanda : seperti contoh berikut:

  class ChildClass: ParentClass{
  }

* Mari kita buat class Animal yang akan berperan sebagai parent class seperti berikut:  */
open class allAnimal(var name: String, var weight: Double, var age: Int, var isCarnivora: Boolean){
    open fun eat(){
        println("$name sedang makan!")
    }
    open fun sleep(){
        println("$name sedang tidur")
    }
}
/* Untuk membuat super atau parent class kita akan membutuhkan open class. Kelas pada Kotlin secara default
*  bersifat final, oleh karena itu kita harus mengubahnya menjadi open class sebelum melakukan extends kelas
*  tersebut.
*  Sekarang kita akan melakukan extends class Cat pada class allAnimal() seperti berikut: */
class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivora: Boolean, val furColor: String, val numberOfFeet: Int): allAnimal(pName, pWeight, pAge, pIsCarnivora){
   fun playWithHuman(){
       println("$name bermain bersama Manusia!")
   }

    override fun eat() {
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}
// Dengan begitu, selain fungsi yang terdapat di dalamnya, kelas Cat juga dapat mengakses seluruh fungsi dan
// properti yang terdapat pada class allAnimal().

fun main(){
    val dicodingCat = Cat("Dicoding Miauw", 4.7, 3, true, "White and Black", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}