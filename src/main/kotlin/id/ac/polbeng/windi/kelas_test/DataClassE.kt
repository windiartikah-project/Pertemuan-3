package id.ac.polbeng.windi.kelas_test

fun main() {
    val meri = Student("Meri", 20)
    // Destructuring Declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
} 