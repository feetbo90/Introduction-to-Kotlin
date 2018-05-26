import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
/*    tanpaPengembalianNilai()
    println(denganPengembalianNilai())
    var pengembalianNilai = denganPengembalianNilai()
    println(pengembalianNilai)
    var input2 = input.next()
    var next = denganParameter(input2)
    println("Hasil Input adalah $next")
  */
    println("masukkan bilangan pertama")
    var nilai = input.nextInt()
    println("masukkan bilangan kedua")
    var nilai2 = input.nextInt()
    var hasil =  pengurangan( nilai2 = nilai)
    println("maka pengurannya adalah $hasil")

    println(tambah(nilai, nilai2))
    println("${nilai dikali nilai2}")
}

// ada 2 tipe
// tipe pengembalian nilai dan tanpa pengembalian nilai

fun tanpaPengembalianNilai()
{
    println("fungsi tanpa pengembalian nilai")
}

fun denganPengembalianNilai():String
{
    var nilai:String = "Ok"
    return nilai
}

fun denganParameter(nilai : String):String{

    return nilai
}

// fungsi named parameter

fun pengurangan(nilai: Int= 11, nilai2:Int = 10):Int{

    var hasil = nilai - nilai2

    return hasil
}

// fungsi expression
// pengembalian nilai
//fun perbandingan(bil1 : Int, bil2: Int) :Unit= if(bil1 > bil2)println("${bil1}") else println("${bil2}")

fun tambah(a : Int = 1, b : Int = 0) = if(a>b) println(a) else println("ini b $b")

// infix function
infix fun Int.dikali(bil2 : Int):Int
{
    var hasil = this * bil2
    return hasil
}