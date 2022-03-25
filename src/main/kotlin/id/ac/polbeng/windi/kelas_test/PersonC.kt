package id.ac.polbeng.windi.kelas_test
//Untuk lebih ringkasnya lagi, deklarasi dan inisialisasi property dapat dilakukan hanya didalam parameter konstruktor utama, seperti contoh kode program berikut
class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main(){
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}