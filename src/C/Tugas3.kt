package C

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan bilangan: ")
    val bilangan: Int = scanner.nextInt()

    val hasil: String = cekGenapGanjil(bilangan)
    println("$bilangan merupakan bilangan $hasil")
}

fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) "Genap" else "Ganjil"
}