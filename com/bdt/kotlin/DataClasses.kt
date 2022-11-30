package com.bdt.kotlin

class User(val nama : String, val age : Int)

data class DataUser(val name: String, val age: Int)
// di materi ini kita akan fokus pada penggunaan data Class

fun main (){
    val user = User("rohman", 18)
    val dataUser = DataUser("rohman", 18)
    val User1 = User1("rohman",18)
    // meskipun class yang dibentuk hampir memiliki kesamaan, tetapi fungsi
    // kodenya berberda. Fokus pada output yang dihasilkan.
    println(user)
    // untuk class pada User tanpa keyword data, hal ini akan menampilkan output
    // pada memoru address yang ditempati.
    println(dataUser)
    // sedangkan pada class yang dibentuk dengan keyword Data akan menghasilkan teks
    // berupa data sesuai parameternya

    // Anda bisa langsung mengetahui semua informasi dari dataUser hanya dengan melihat
    // value dari properti yang ada, karena sebuah data class akan secara otomatis
    // menghasilkan fungsi toString() di dalamnya.

    // jika kita ingin membuat class tanpa keyword data dan kita ingin menampilkan properti dan value
    // yang ada di dalam class, maka kita bisa membuat secara manual.
    println(User1)
    // kelebihan lain dari data class adalah ia sudah memiliki fungsi equals() secara otomatis.
    // maka jika kita ingin  melakukan komparasi konten antara 2 buah objek, maka mudah untuk kita lakukan
    val dataUser1 = DataUser("rohmen", 19)
    val dataUser2 = DataUser("rohmen", 19)
    val dataUser3 = DataUser("tuga", 20)

    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))

    // berbeda dengan komparasi pada 2 buah objek yang bukan data class. Kita tidak bisa mendapatkan
    // hasil akurat, karena konsol akan selalu bernilai false
    val user1 = User ("rohman", 17)
    val user2 = User ("rohman", 17)
    val user3 = User ("rohim", 19)
    println(user1.equals(user2))
    println(user1.equals(user3))
    // pada komparasi kode yang bukan data class, dia akan mengkomparasi pada nilai memory address.
    // Dia tidak melakukan komparasi pada konten yang ada di dalam properti --> lanjut ke baris 52
    val user4 = User2 ("rohman", 17)
    val user5 = User2 ("rohman", 17)
    val user6 = User2 ("rohim", 19)
    println(user4.equals(user5))
    println(user4.equals(user6))
    // kita masih perlu menusliskan beberapa boilerplate code untuk menampilkan output diatas ini agar
    // agar sesuai. Belum lagi akan menambahkan fungsi equals(), masih juga perlu menambah fungs hashCode()
}
class User1 (val name: String, val age: Int){
    override fun toString(): String {
        return "User1(name=$name, age=$age)"
    }
}
// jika kita ingin hasil yang akurat seperti pada data class, maka kita perlu membuat fungsi equals()
// secara manual
class User2 (val name: String, val age: Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User2

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var hasil = name.hashCode()
        hasil = 31 * hasil + age
        return hasil
    }
}