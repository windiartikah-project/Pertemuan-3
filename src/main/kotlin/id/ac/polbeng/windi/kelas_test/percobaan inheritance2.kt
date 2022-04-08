package id.ac.polbeng.windi.kelas_test

// Kelas anak (menginisialisasi kelas induk)
class LaptopB : Computer{
    val batteryLife: Double

    //Calls super() menginisialisasi kelas induk
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }

    // Calls construktor lain (which calls super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {

    }

    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}