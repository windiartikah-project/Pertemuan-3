package id.ac.polbeng.windi.kelas_test

//destructing declarations menggunakan componentN() method
fun main() {
    val meri = Student("Meri", 20)
    // Destructuring Declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}