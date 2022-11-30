package com.bdt.kotlin

fun main() {
    val value = 7
    val nilai = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(nilai)
}
