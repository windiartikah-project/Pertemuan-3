package id.ac.polbeng.windi.kelas_test

//Multiple Interface
interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y  {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

// Kelas ini mengimplementasikan Interface X dan Y
class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }
}

fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}