package id.ac.polbeng.windi.kelas_test

data class Student(val name: String, val age: Int)
fun main() {
    //Membuat Data Class dengan menggunakan fungsi val
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    println("Student Name is: ${boni.name}")
    println("Student Age is:  ${boni.age}")
    println("Student Name is: ${meri.name}")
    println("Student Age is:  ${meri.age}")
}