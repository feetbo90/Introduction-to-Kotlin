import java.util.*

class Mamalia(var kaki :Int, var warna:String){

    // attribute variable
    /*var kaki : Int = 0
    var warna : String = ""
*/
    init {
        println("ini dari constructor kaki $kaki dan warna $warna")
    }

    // attribut function
    fun bergerak()
    {
        println("class Mamalia bergerak")
    }

    fun bernapas(){
        println("class Mamalia bernapas")
    }


    fun WarnaDanKaki(kaki :Int, warna:String)
    {
        println("jumlah kaki $kaki dan warna $warna")
    }

    fun warnaDanKakiDariCons(){
        println("kaki $kaki dan warna $warna")
    }


}

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var kaki = input.nextInt()
    var warna = input.next()
    var Kambing = Mamalia(kaki, warna)
    Kambing.warnaDanKakiDariCons()
    /*Kambing.kaki = kaki
    Kambing.warna = warna
    //Kambing.WarnaDanKaki(Kambing.kaki , Kambing.warna)


    Kambing.bernapas()
    Kambing.bergerak()
    Kambing.kaki = 4
    Kambing.warna = "hitam"
    //Kambing.WarnaDanKaki(Kambing.kaki , Kambing.warna)

*/


}


