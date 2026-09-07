package B

fun main() {
    println("=== Tugas 4 : Menghitung Gaji Bersih ===")
    Tugas4()
}

fun Tugas4() {
    val namapegawai: String = "Samuel Jeremiah Hastiawan Serang"
    val gajipokok: Int = 8000000
    val tunjangan: Int = 500000
    val uanglembur: Int = 100000
    val potongan: Int = 200000

    val gajikotor = gajipokok + tunjangan + uanglembur
    val gajibersih = gajikotor - potongan

    println("namapegawai: $namapegawai")
    println("gaji: $gajibersih")

}