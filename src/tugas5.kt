import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    println("Masukkan Kecepatan")
    var kecepatan = input.nextInt()
    println("Masukkan Jarak")
    var jarak = input.nextInt()

    println("${kecepatan waktu jarak}")


}


infix fun Int.waktu(jarak :Int):Int{

    var jumlah:Int = 0
    for (i in 1..jarak step this)
    {
        jumlah = jumlah + 1
    }

    return jumlah
}