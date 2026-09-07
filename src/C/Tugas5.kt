package C

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== KALKULATOR SEDERHANA ===")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")
    print("Pilih operasi (1-4): ")
    val pilihan = scanner.nextInt()

    print("Masukkan angka pertama (a): ")
    val a = scanner.nextDouble()
    print("Masukkan angka kedua (b): ")
    val b = scanner.nextDouble()

    val hasil = when (pilihan) {
        1 -> tambah(a, b)
        2 -> kurang(a, b)
        3 -> kali(a, b)
        4 -> {
            if (b == 0.0) {
                println("Kesalahan: Tidak dapat melakukan pembagian dengan nol!")
                return
            }
            bagi(a, b)
        }
        else -> {
            println("Pilihan menu tidak valid.")
            return
        }
    }

    println("Hasil perhitungan : $hasil")
}

fun tambah(a: Double, b: Double): Double {
    return a + b
}

fun kurang(a: Double, b: Double): Double {
    return a - b
}

fun kali(a: Double, b: Double): Double {
    return a * b
}

fun bagi(a: Double, b: Double): Double {
    return a / b
}