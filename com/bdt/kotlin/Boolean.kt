package com.bdt.kotlin

fun main (){
    // Boolean adalah tipe data yang memiliki dua nilai. yaitu true dan false
    // ada tiga operator yang bisa digunakan dalam Boolean

    println("=== Conjunction atau AND (&&) ===")
    // operator AND akan menghasilkan nilai true jika semua expresi bernilai true
    // Contoh
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }
    print("Office is open : $isOpen\n")

    //bentuk kode yang lebih sederhana
    val isOpen1 = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen\n")

    println("=== Disjunction atau OR (||) ===")
    // operator ini akan menghasilkan nilai true, jika salah satu ekspresi bernilai true
    // Contoh
    val officeOpen1 = 7
    val officeClosed1 = 16
    val now1 = 20

    val isClose = now1 < officeOpen1 || now > officeClosed1

    print("Office is closed : $isClose\n")

    println("=== Negation atau NOT (!) ===")
    // Operator Negasi adalah operator yang berkebalikan
    // JIka hasil ekpresi Boolean bernilai true maka yang dihasilkan negasi adalah false
    // Contoh
    val officeOpen2 = 7
    val now2 = 10
    val isOpen2 = now2 > officeOpen2

    if (!isOpen2) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}