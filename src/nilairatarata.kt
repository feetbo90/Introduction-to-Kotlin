import java.util.Scanner


fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    println("masukkan bilangan pertama")
    var bilanganpertama = input.nextInt()
    println("masukkan bilangan kedua")
    var bilangankedua = input.nextInt()

    var rata_rata = ((bilanganpertama + bilangankedua) / 2).toDouble()
    println(rata_rata)

}