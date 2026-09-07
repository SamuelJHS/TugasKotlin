package A

fun main() {
    println("=== Tugas 4 : Luas dan Keliling Lingkaran ===")
    Tugas4()
}

fun Tugas4() {
    val r: Double = 7.5
    val PI: Double = 3.14159

    val Luas = PI * r * r
    val Keliling = 2 * PI * r

    println("Luas : $Luas")
    println("Keliling : $Keliling")
}