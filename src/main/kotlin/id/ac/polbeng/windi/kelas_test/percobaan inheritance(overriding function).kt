package id.ac.polbeng.windi.kelas_test

open class Teacher {
    //Harus menggunakan modifier "open" untuk mengizinkan kelas anak menimpanya
    open fun teach() {
        println("Teaching...")
    }

    fun info(){
        println("I'am a Teacher.")
    }
}

class MathsTeacher : Teacher() {
    //Harus menggunakan modifier "override" untuk mengganti fungsi kelas dasar
    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}