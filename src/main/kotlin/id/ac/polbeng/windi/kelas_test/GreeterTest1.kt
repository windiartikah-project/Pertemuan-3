package id.ac.polbeng.windi.kelas_test

fun main() {
    val greeter = Greeter1()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}