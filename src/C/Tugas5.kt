package B

import java.util.Scanner

fun main() {
    println("=== Tugas 5 : Menghitung Nilai Akhir Mahasiswa ===")
    Tugas5()
}

fun Tugas5() {
    val nama: String = "Samuel Jeremiah Hastiawan Serang"
    val tugas: Double = 85.0
    val kuis: Double = 80.0
    val uts: Double = 78.0
    val uas: Double = 88.0

    val nilaiAkhir: Double = (tugas * 0.25) + (kuis * 0.15) + (uts * 0.25) + (uas * 0.35)

    println("=== NILAI AKHIR MAHASISWA ===")
    println("Nama Mahasiswa : $nama")
    println("Nilai Tugas    : $tugas (25%)")
    println("Nilai Kuis     : $kuis (15%)")
    println("Nilai UTS      : $uts (25%)")
    println("Nilai UAS      : $uas (35%)")
    println("-----------------------------")
    println("Nilai Akhir    : $nilaiAkhir")
}