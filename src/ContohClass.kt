
class Mobil{

    var ban:Int = 0
    var warna:String =""


    fun bergerak():Unit{


        println("Mobil Bergerak")

    }

    fun berhenti():Unit{
        println("Mobil Berhenti")
    }


}

fun main(args: Array<String>) {

    var mobil = Mobil()
    mobil.bergerak()
    mobil.berhenti()
    mobil.ban = 4
    mobil.warna = "Merah"
    println("Mobil mempunyai warna : ${mobil.warna}")

}


