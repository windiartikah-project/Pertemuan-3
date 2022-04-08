package id.ac.polbeng.windi.kelas_test
//Secara default kode  ter-generate secara otomatis
class Employee(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        //Getter
        get() = field
        //Setter
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val emp = Employee(1101, "Nia", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}