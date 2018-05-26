
import java.util.Scanner

fun main(args: Array<String>) {


    println("Masukkan jumlah bilangan : ")
    var scanner = Scanner(System.`in`)
    var jumlah = scanner.nextInt()

    var temp = 0
    for(i in 1..jumlah)
    {
        println("Masukkan bilangan ke : $i")
        temp = temp + scanner.nextInt()
    }

    println(temp / jumlah)









}