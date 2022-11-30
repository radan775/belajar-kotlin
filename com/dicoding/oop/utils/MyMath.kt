package com.dicoding.oop.utils

fun sayHello() = println("Hello from com.dicoding.oop.utils")
/* Kita sudah membuat fungsi sayHello() pada package-level. Untuk mengakses fungsi tersebut kita dapat menuliskan
*  secara eksplisit alamat package. Kembali ke file OOP_membuatPackageBaru */
const val PI = 3.1415926535 // package level variable

fun pow(number: Double, power: Double): Double {
    var result = 1.0
    var counter = power
    while (counter > 0){
        result *= number
        counter--
    }
    return result
}
fun factorial(number: Double): Double{
    var result = 1.0
    var counter = 1.0
    while (counter <= number){
        result *= counter
        counter++
    }
    return result
}
fun areaOfCycle(radius: Double): Double{
    return PI * 2 * radius
}
// Kembali ke file OOP_membuatPackageBaru.kt dan panggil beberapa fungsi yang sudah ditambahkan