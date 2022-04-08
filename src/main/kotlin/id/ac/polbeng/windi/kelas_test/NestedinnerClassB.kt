package id.ac.polbeng.windi.kelas_test

fun main() {
    //membuat instance dari interface
    var programmer: Human = object : Human {
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}