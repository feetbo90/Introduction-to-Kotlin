

class ListTerbesar(var list:List<Int>)
{
    var size : Int = 0

    constructor(list: List<Int>, size:Int):this(list)
    {
        this.size = size
    }



    fun listBesar():Int{

        var max = list.get(0)

        for (i in 1 until size){
            if(max < list.get(i))
            {
                max = list.get(i)
            }
        }

        return max
    }


}
//539mzn

fun main(args: Array<String>) {

    var listMax = mutableListOf<Int>(899,900,10000,11,100,7,800)
    var list = ListTerbesar(listMax, listMax.size)
    println(list.listBesar())
}