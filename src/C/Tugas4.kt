package C

fun main() {
    val tugas = 85.0
    val uts = 75.0
    val uas = 80.0

    val nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas)
    val grade = tentukanGrade(nilaiAkhir)

    println("Nilai Tugas : $tugas")
    println("Nilai UTS   : $uts")
    println("Nilai UAS   : $uas")
    println("Nilai Akhir : $nilaiAkhir")
    println("Grade       : $grade")
}

fun hitungNilaiAkhir(tugas: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4)
}

fun tentukanGrade(nilai: Double): String {
    return when {
        nilai >= 80.0 -> "A"
        nilai >= 70.0 -> "B"
        nilai >= 60.0 -> "C"
        nilai >= 50.0 -> "D"
        else -> "E"
    }
}