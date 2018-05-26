
import java.util.Scanner

class InputRata(var list: List<Int>)
{
    var jumlah :Int = 0

    fun jumlahFunction(){

        jumlah = 0
        for (i in 0 until list.size)
        {
            jumlah = jumlah + list.get(i)
        }


    }

    fun jumlahFunction2():Int{

        jumlah = 0
        for (i in 0 until list.size)
        {
            jumlah = jumlah + list.get(i)
        }

        return jumlah
    }

    fun rataRataFunction():Double{

        var rataRata = jumlah.toDouble() / list.size.toDouble()
        return rataRata
    }

    fun rataRataFunction(nilai :Int):Double{

        var rataRata = nilai.toDouble() / list.size.toDouble()
        return rataRata
    }



}

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    // input berapa jumlah
    var jumlah = input.nextInt()
    var list = mutableListOf<Int>()

    // lakukan pengulangan yang akan diinput
    for(i in 0 until jumlah){
        var inputan = input.nextInt()
        list.add(inputan)
    }

    println("jumlah inputan : ${list.size}")
    var rata = InputRata(list)
    rata.jumlahFunction()
    println("maka rata-rata adalah ${rata.rataRataFunction()}")

    var jumlah2 = rata.jumlahFunction2()
    println("maka rata -rata adalah ${rata.rataRataFunction(jumlah2)}")
}