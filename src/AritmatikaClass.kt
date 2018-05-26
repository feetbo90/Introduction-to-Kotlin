import java.util.*



fun main(args: Array<String>) {

    println("masukkan bilangan pertama")
    var input = Scanner(System.`in`)
    var bilpertama = input.nextInt()
    println("masukkan bilangan kedua")
    var bilkedua = input.nextInt()

    var aritSatu = AritmatikaClass(bilpertama, bilkedua)
    println("maka penjumlahannya adalah ${aritSatu.penjumlahan()}")
    aritSatu.bilanganToDouble()
    println("maka pembagiannya adalah ${aritSatu.pembagian()}")
}