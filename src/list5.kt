
import java.util.Scanner

fun main(args: Array<String>) {

    var list = mutableListOf<Int>()

    var list2 = listOf<Int>( 2,3,4,5)



    var scanner = Scanner(System.`in`)
    for(i in 0 until 10)
    {
        if(i % 2 == 0)
        list.add(scanner.nextInt())
        else
            list.add(0)
    }


    for (i in 0 until list.size)
    {
        println(list.get(i))
    }





}


// array
// 0  1  2  3  4  5
// 1     3     6