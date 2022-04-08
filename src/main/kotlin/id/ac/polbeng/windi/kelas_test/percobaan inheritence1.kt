package id.ac.polbeng.windi.kelas_test

//Membuat kelas parent dan child
// Parent class
open class Computer(val name: String,
                    val brand: String) {
}

// Child class (initializes the parent class)
class Laptop(name: String,
             brand: String,
             val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main(){
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}