package id.ac.polbeng.windi.kelas_test

interface A {
    fun demo() {
        println("From interface A")
    }
}

interface B  {
    fun demo() {
        println("From interface B")
    }
}

// elas ini mengimplementasikan Interface X dan Y
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}


fun main() {
    val obj = MyClassB()
    obj.demo()
}