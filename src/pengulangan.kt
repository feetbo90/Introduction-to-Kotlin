
import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    println("masukkan nilai 1")
    //var nilai = input.nextInt()
    // pengulangan for
    for(i in 1 until 10)
    {

        println("ini pengulangan pertama $i ")
    }

    var bil = 1
    for (i in 1..bil) {

        println("pengulangan 1 samapai 10 ${i}")

    }

    for(i in 1..10 step 2)
    {
        println("memakai langkah $i")
    }

    for(i in 10 downTo 1)
    {
        println("memakai down to $i")
    }

    for(i in 10 downTo 1 step 2)
    {
        println("memakai down to dan langkah $i")
    }


    for (i in 10..1 )
    {
        println("turun $i")
    }

// 20 18 16 14 .. 0



}
/*

minta input bilangan
        3
        yang diinput dibuat sebanyak pengulangan 3 kali
        100
        100
        90
        */