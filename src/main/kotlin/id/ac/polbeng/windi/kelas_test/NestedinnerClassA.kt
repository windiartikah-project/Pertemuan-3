package id.ac.polbeng.windi.kelas_test

//Inner class adalah nested class yang memiliki kata kunci inner dalam pendeklarasiannya. Inner class berbeda dengan nested class, sebuah inner class dapat mengakses data member dari kelas luar
class OuterA{
    val a = "Outside Nested Class"
    inner class Inner {
        fun callMe() = a
    }
}

fun main(){
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callMe()}")
}