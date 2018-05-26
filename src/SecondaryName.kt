import java.util.*

class firstLast(var gabungan :String)
{

    constructor(firstName :String, lastName:String):this(firstName + " " + lastName){
        println("ini firstName : $firstName dan $lastName")
    }

    fun printNamaGabungan()
    {
        print("Ini nama gabungan : $gabungan")
    }



}


fun main(args: Array<String>) {

    var Test = Scanner(System.`in`)
    var first = Test.next()
    var last = Test.next()
    var firstlast = firstLast(first, last)
}


// Muhammad Iqbal
// Ahmad Bukhori
// secondary constractor
// 2 (first Name, last Name)
// primary
// gabungan first Name, dengan last Name