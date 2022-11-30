package com.bdt.kotlin

fun main (){
    val openHours = 7
    val now = 20
    val office : String
    // if else expressions adalah kode untuk menguji sebuah kondisi sebuah proses
    // isi didalam if biasa adalah boolean, jika hasil dari uji adalah true
    // maka kode dari if akan dieksekusi, tetapi jika hasilnya adalah false
    // maka kode akan dilewati.
    if (now > openHours){
        println("office already open")
    }
    // jika kondisi yang ingin kita uji, hanya satu kondisi maka cukup gunakan
    // statement if

    // jika ada dua kondisi yang ingin dilakukan pengecekan maka tambahkan kode
    // else setelah kurung kurawal dari if
    // else akan diuji jika nilai dari if tidak terpenuhi, dan kalau nilai dari else adalah true
    // maka kode dari else akan dieksekusi, jika tidak maka akan dilewati
    if (now > openHours) {
        office = "Office already open\n"
    } else {
        office = "Office is closed\n"
    }

    print(office)

    // jika memiliki lebih dari 2 kondisi yang ingin dilakukan pengujian maka
    // bisa menggabungkan else dan if seperti berikut
    if (now > openHours) {
        "Office already open\n"
    } else if (now == openHours){
        "Wait a minute, office will be open\n"
    } else {
        "Office is closed\n"
    }

    print(office)
    // peringatan penting, Kotlin tidak mendukung ternary operator
}