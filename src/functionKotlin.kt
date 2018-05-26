fun main(args: Array<String>) {


    //println("Hello world")
    hello()
    hello("Iqbal")
    hello("Hello", "World")

    println(penjumlahan(2, 3))

    var jumlah = penjumlahan(5, 5)
    println(jumlah)

    HelloTest( "Coy","Coy2")


    12.penjumlahan(5)
    var kurang = 12.pengurangan(5)
    println("maka pengurangannya : $kurang")

    var kali = 12 dikalikan 5

    20 MencariWaktu 2
    100 MencariWaktu 2
}


// deklarasi fungsi

// fungsi tanpa pengembalian


    fun hello( )
    {
        println("Hello World")
    }


    fun hello(kata1 : String)
    {
        println("Hello $kata1")
    }

    fun hello(kata1: String, kata2: String)
    {
        println("$kata1 $kata2")
    }

// fungsi dengan pengembalian nilai

fun penjumlahan (bil1 : Int, bil2 : Int):Int
{

    var hasil = bil1 + bil2
    return hasil
}



// fungsi named parameter

fun HelloTest(kata1: String = "Hello", kata2: String = "World"){

    println("$kata1 dan $kata2")
}


// extension function

fun Int.penjumlahan(bil2: Int)
{
    var hasil = this + bil2
    println(" maka penjumlahannya : $hasil")
}

fun Int.pengurangan(bil2: Int):Int
{
    var hasil = this - bil2
    return hasil
}

// infix function
infix fun Int.dikalikan(bil2: Int)
{
    var hasil = this * bil2
    println("maka perkaliannya : $hasil")
}


infix fun Int.MencariWaktu(kecepatan: Int)
{
    var waktu = 0
    for (i in 0 until this step kecepatan)
    {
        waktu++
    }
    println(waktu)
}