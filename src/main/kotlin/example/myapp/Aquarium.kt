package example.myapp

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    var volume: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters")
    }

    // Fungsi untuk mengubah volume dari dalam kelas
    fun getVolume(newVolume: Int) {
        volume = newVolume // Valid karena di dalam kelas yang sama
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }
}

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
//    aquarium6.volume = 70
    aquarium6.getVolume(70)
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}

