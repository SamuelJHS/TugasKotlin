package A

import java.util.Scanner

fun main() {
    println("=== Tugas 5 : Analisis Karakter ===")
    Tugas5()
}

fun Tugas5() {
    val scanner = Scanner(System.`in`)

    print("Masukkan karakter: ")
    val inputStr: String = scanner.next()
    val karakter: Char = inputStr[0]

    val kodeKarakter: Int = karakter.code
    val termasukHuruf: Boolean = karakter.isLetter()
    val termasukAngka: Boolean = karakter.isDigit()

    println("Karakter       : $karakter")
    println("Kode karakter  : $kodeKarakter")
    println("Termasuk huruf : $termasukHuruf")
    println("Termasuk angka : $termasukAngka")
}