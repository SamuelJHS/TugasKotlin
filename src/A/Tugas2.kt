package A

fun main() {
    println("=== Tugas 2 : Konversi Suhu ===")
    Tugas2()
}

fun Tugas2() {
    val Celcius: Double = 25.0
    val Fahrenheit = (Celcius * 9/5) + 32
    val Kelvin = Celcius + 273.15

    println("Fahrenheit : $Fahrenheit")
    println("Kelvin : $Kelvin")
}