
//buat primary constructor
open class Binatang2(var kaki:Int, var warna:String){
    init{
        println("jumlah kaki: $kaki dan warna $warna class binatang2")
    }


    constructor(kaki2:Int, warna2:String, nama2: String):this(kaki2, warna2){
        println("jumlah kaki: $kaki2 dan warna $warna2 di class binatang2 secondary constructor")
    }

}

//agar inheritance berjalan lancar, ketikkan juga var kaki dan var
//warna pada class sapi, karena warna variabel tigdak boleh sama, berikan ovverride atau ganti
//nama variabel
class Sapi(var kaki2:Int, var warna2:String):Binatang2(kaki2, warna2, "Testing"){
    // binatang mendeklarasikan variabel di open class
    init{
        println("jumlah kaki: $kaki2 dan warna $warna2 class sapi")
    }

    // akhir: secondary constructor

    constructor(kaki2:Int, warna2:String, nama:String):this(kaki2, warna2 ) {
        println("jumlah kaki: $kaki2 warna $warna2 dan nama $nama di class secondary constructor")
    }
}


class InputList(var list:List<Int>)
{


    fun tampilList(){

        for(i in 0 until list.size)
        {
            println("$i dengan value ${list.get(i)}")
        }
    }


}

fun main(args: Array<String>) {

    var sapi=Sapi(4,"Putih", "Testing")

    var list = mutableListOf<Int>(4,5,6,7,7,8,9)
    var input = InputList(list)
    input.tampilList()
}