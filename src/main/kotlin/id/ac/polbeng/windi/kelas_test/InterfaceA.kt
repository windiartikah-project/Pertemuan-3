package id.ac.polbeng.windi.kelas_test

//interface tidak dapat di instansiasi karena ia tidak memiliki konstruktor.
interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Hello")
    }
}

class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo(){
        println("Demo Function")
    }

}

fun main(){
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}