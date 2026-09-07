package B

fun main() {
    println("=== Tugas 1 : penggunaan val dan var ===")
    Tugas1()
}

fun Tugas1() {
    val nama: String = "Samuel Jeremiah HS"
    val npm: String = "235314009"
    var semester: Int = 3
    var ipk: Double = 2.9

    println("=== Before ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")

    // Memperbarui nilai var semester dan IPK
    semester = 4
    ipk = 2.9

    println("\n=== After ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
}

