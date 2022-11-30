package com.bdt.kotlin

/* Overloading pada Kotlin merupakan bentuk penggunaan dua atau lebih fungsi dengan nama yang sama. Overloading
*  dapat dilakukan selama fungsi itu memiliki parameter yang berbeda. Berikut adalah contoh overloading fungsi
*  eat() pada sebuah class overloadingAnimal(). */
class overloadingAnimal(private var name: String){
    fun eat(){
        println("$name makan!")
    }
    fun eat(typeFood: String){
        println("$name memakan $typeFood")
    }
    fun eat(typeFood: String, banyak: Int){
        println("$name memakan $typeFood sebanyak $banyak gram")
    }
    fun sleep(){
        println("$name tidur!")
    }
}
/* Pada class overloadingAnimal() terdapat beberapa fungsi dengan penamaan yang sama, tetapi tidak menyebabkan
*  error. Sebabnya, fungsi tersebut memiliki parameter yang berbeda sehingga tidak akan terjadi ambiguitas dalam
*  penggunaan fungsi tersebut. Mari kita coba buat sebuah objek dari class tersebut dan mengakses fungsinya
*  satu-persatu. */
fun main(){
    val dicodingCat = overloadingAnimal("Dicoding Miauw")

    dicodingCat.eat()
    dicodingCat.eat("ikan tuna")
    dicodingCat.eat("Ikan tuna", 390)
    /* Fungsi eat() yang pertama dapat digunakan tanpa mengirim parameter apapun. Sedangkan fungsi eat() yang
    *  kedua kita mengirimkan sebuah parameter String sebagai nilai typeFood. Dan fungsi eat() yang terakhir
    *  membutuhkan 2 (dua) buah parameter, typeFood dan banyak. */
    val calculator = Calculator()
    println(calculator.add(2, 5))
    println(calculator.add(3.5,6.8))
    println(calculator.add(2,7,4))
    println(calculator.add(5f,8f))

    println(calculator.min(9, 4))
    println(calculator.min(4.3, 82.5))
    /* Pada contoh yang kita buat, fungsi add(2,4) memanggil fungsi add yang memiliki parameter Ineger, fungsi
    *  add(3.5, 6.8) memanggil fungsi add yang memiliki parameter Double, begitu juga dengan yang lainnya.*/
}
/* Overloading pada fungsi merupakan sebuah fitur yang sangat powerful. Untuk dapat lebih memahami berapa
*  pentingnya overloading, mari kita buat sebuah class Calculator yang di dalamnya memiliki fungsi matematika
*  dengan menerapkan overloading pada sebuah fungsi. */
class Calculator{
    fun add(nilai1: Int, nilai2: Int) = nilai1 + nilai2
    fun add(nilai1: Int, nilai2: Int, nilai3: Int) = nilai1 + nilai2 + nilai3
    fun add(nilai1: Double, nilai2: Double) = nilai1 + nilai2
    fun add(nilai1: Float, nilai2: Float) = nilai1 + nilai2

    fun min(nilai1: Int, nilai2: Int) = if (nilai1 < nilai2) nilai1 else nilai2
    fun min(nilai1: Double, nilai2: Double) = if (nilai1 < nilai2) nilai1 else nilai2
    // kemudian kita buat objek calculator pada fungsi main() dan mengakses fungsi yang berada pada class ini
    // lanjut ke baris 33
}