import java.util.Scanner


fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    println("masukkan nilai 1")
    var nilai = input.nextInt()
    println("masukkan nilai 2")
    var nilai2 = input.nextInt()
    println("masukkan nilai 3")
    var nilai3 = input.nextInt()
    println("masukkan nilai 4")
    var nilai4 = input.nextInt()


    var rata = (nilai + nilai2 + nilai3 + nilai4) / 4


    if(rata >= 90)
    {
        println("A")
    }
    else if(rata < 90 && rata >= 80)
    {
        println("B")
    }
    else if(rata < 80 && rata >= 70)
        println("C")

}

// < 70 rata > 60
// D
// < 60 rata > 50
// E
// kalau tidak ada dari semuanya F