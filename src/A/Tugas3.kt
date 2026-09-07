package A

fun main() {
    println("=== Tugas 3 : Konversi Tipe Data ===")
    Tugas3()
}

fun Tugas3() {
    val input = "50.8"
    val nilaiDouble: Double = input.toDouble()
    val nilaiInt: Int = nilaiDouble.toInt()
    val nilaiStringKembali: String = nilaiDouble.toString()

    println("Nilai Double : $nilaiDouble")
    println("Nilai Int    : $nilaiInt")
    println("Nilai String : $nilaiStringKembali")
}