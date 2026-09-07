package B

fun main() {
    println("=== Tugas 2 : pertukaran nilai variabel ===")
    Tugas2()
}

fun Tugas2() {
    var A: Int = 10
    var B: Int = 20

    println("Sebelum di tukar")
    println("A : $A")
    println("B : $B")

    val temp: Int = A
    A = B
    B = temp

    println("\nSetelah di tukar")
    println("A : $A")
    println("B : $B")
}
