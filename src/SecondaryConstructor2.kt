
class rataRata(list: List<Int>)
{

    init {
        println("Ini di primary Constructor init")
        for (i in 0 until list.size)
        {
            println(list.get(i))
        }
    }

    // secondary constructor
    constructor(list: List<Int> , size : Int ) : this(list) {
        println("ini di secondary constructor")
        for (i in 0 until list.size)
        {
            println(list.get(i))
        }
    }

    fun bilanganTerbesar(){

    }

}



fun main(args: Array<String>) {


    var list = mutableListOf<Int>(3,4,5,6,7)
    var second = rataRata(list, list.size)
    var second2 = rataRata(list)

}