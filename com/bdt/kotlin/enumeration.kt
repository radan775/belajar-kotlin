package com.bdt.kotlin

fun main (){
    println("Materi Enumeration")
    /*
    * enumeration adalah salah satu fitur yang bisa digunakan untuk
    * menyimpan sebuah objek yang telah didefinisikan menjadi
    * tipe data konstanta, dan fungsi lain dari enumeration adalah
    * meminimalisir nilai tertukar pada sebuah variabel*/

    /* untuk membuat class Enum, kita bisa menggunakan kata kunci enum
    * dan setiap objek yang ada di dalamnya dipisah dengan koma.
    * catatan objek yang ada di dalam sebuah enum adalah static dam final*/

    val gender : Gender = Gender.MALE
    println(gender)
    // kode ini adalah contoh cara mengakses objek di dalam kelas enum val warna : Int = colorLain.BLUE

    // cara mendapatkan daftar objek enum dan nama dari tiap enum pakai fungsi values()
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
    println("\n")
    // untuk mendapatkan nama dari objek Enum bisa menggunakanan fungsi valueOf()
    val color : Color = Color.valueOf("RED")
    println("warna adalah $color")
    println("warna dari nilai adalah ${color.nilai.toString(16)}\n")

    // selain menggunakan funsi values() dan valueOf() kita bisa mendapatkan
    // daftar objek enum dan nilai dari objek dengan cara yang lebih umum
    // yaitu dengan menggunakan fungsi enumValue() dan enumValueOf()

    val color1 : Array<Color> = enumValues()
    color1.forEach { nilai ->
        println(nilai)
    }
    val color2 : Color = enumValueOf("BLUE")
    println("isi nilai dari BLUE adalah $color2\n")

    // konsep dari enumeration sama seperti Array, maka selain mendapatkan daftar
    // dan nama setiap objek enum, kita bisa juga bisa mendapatkan posisi objek
    // dengan menggunakan properti ordinal seperti berikut
    val color3: Color = Color.GREEN
    println("Posisi GREEN dalam index ke-${color3.ordinal}\n")

    // ingat bahwa setiap objek merupakan instance dari enum class
    // cara mengecek instance dari enum class adalah seperti berikut
    // gunakan when expression
    val color4 : Color = Color.GREEN
    when(color4){
        Color.RED -> print("warnanya adalah Merah")
        Color.GREEN -> print("warnanya adalah Hijau")
        Color.BLUE -> print("warnanya adalah Biru")
        // catatan ketika menggunakan when untuk mengecek instance dari enum, lebih baik
        // masukkan setiap objek yang kita definisikan. Jika kita melewatkan salah
        // satu objek , maka akan ada peringatan yang muncul
    }
}
// contoh paling sederhana dari Enum
enum class Gender{
    MALE,
    FEMALE
    // objek yang telah dideklarasikan di dalam class enum, maka objek tersebut
    // bisa mengakses attribute atau method yang ada dalam kelas enum
}
enum class Color(val nilai : Int){ // contructor disini adalah variabel nilai dalam class enum
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
    // red, green, blue adalah sebuah objek di dalam class enum dan nilai
    // di dalam objek adalah sebuah constructor
    // catatan, jika kita membuat contructor dalam sebuah class enum
    // maka dalam setiap objek juga harus diisi contructor
}
enum class colorLain(val value: Int){
    // kita juga bisa mendeklarasikan sebuah anonymous class dengan cara
    // seperti berikut
    RED(0xFF0000){
        override fun printNilai(){
            println("nilai dari warna Merah adalah $value")
        }
    },
    GREEN(0x00FF00){
        override fun printNilai(){
            println("nilai dari warna Hijau adalah $value")
        }
    },
    BLUE(0x0000FF){
        override fun printNilai(){
            println("nilai dari warna Biru adalah $value")
        }
    };
    abstract fun printNilai()
}