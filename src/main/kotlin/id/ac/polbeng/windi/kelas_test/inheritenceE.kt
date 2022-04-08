package id.ac.polbeng.windi.kelas_test

//Overriding Property’s Getter/Setter method
open class NewPerson {
    open var age: Int = 1
}

class CheckedPerson: NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 // Works


    val checkedPerson = CheckedPerson()
    //Perintah dibawah ini tidak bisa dijalankan, ketika dijalankan maka hasilnya akan eror ArgumentException tidak sesuai
    // checkedPerson.age = -5  // Throws IllegalArgumentException : Age can not be negative
}