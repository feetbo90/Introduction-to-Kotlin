import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    println("masukkan nilai 1")
    var bilangan = input.nextInt()

    var jumlah : Int = 0
    for(i in 1..bilangan)
    {
        var bilangan = input.nextInt()
        jumlah = jumlah + bilangan
    }

    println(jumlah)
}