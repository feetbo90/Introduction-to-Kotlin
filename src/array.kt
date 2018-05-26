import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)

    var nilai = intArrayOf(4, 3, 20, 10)
    var doubleFloat = doubleArrayOf(2.3, 2.1)

    for (i in 0 until nilai.size)
    {
        println(nilai.get(i))
    }


    var arrayInt = IntArray(10)
    arrayInt[0] = 10
    arrayInt[1] = 100

    for (i in 0 until arrayInt.size)
    {
        arrayInt[i] = scanner.nextInt()
    }

    for (i in 0 until arrayInt.size)
    {
        if(arrayInt.get(i) % 2 == 0)
            println(arrayInt.get(i))
    }


}


/* sekumpulan tipe data yang sama


 */