package B

fun main() {
    println("=== Tugas 3 : Menghitung Total Belanja ===")
    Tugas3()
}

fun Tugas3() {

    val namabarang: String = "buku"
    val hargabarang: Double = 50.000
    val jumlahbarang: Int = 10
    val diskon: Double = 5.0

    val subtotal = hargabarang * jumlahbarang
    val potongan = subtotal * diskon / 100
    val totalbayar = subtotal - potongan

    println("Nama barang : $namabarang")
    println("harga barang : $hargabarang")
    println("jumlah barang : $jumlahbarang")
    println("diskon: $diskon")
    println("Sub total: $subtotal")
    println("Potongan: $potongan")
    println("Total bayar: $totalbayar")

}