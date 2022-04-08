package id.ac.polbeng.windi.kelas_test

fun main(){
    val meri = Student("Meri", 20)
    // membuat sebuah objek salinan(copy) dengan beberapa property yang berbeda menggunakan fungsi copy()
    val badu = meri.copy("Badu")
    if(meri.equals(badu))
        println("meri is equal to badu.")
    else
        println("meri is not equal to badu.")
    println("Hashcode of meri: ${meri.hashCode()}")
    println("Hashcode of badu: ${badu.hashCode()}")
}