import java.util.Scanner


// operator perbandingan
// > , < , ==, >=, <= , != (tidak sama dengan)



fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    println("masukkan bilangan pertama")
    var bilanganpertama = input.nextInt()
    if(bilanganpertama % 2 == 0)
    {

        println("bilangan $bilanganpertama itu adalah genap")
    }else{
        println("bilangan $bilanganpertama itu adalah ganjil")
    }



}