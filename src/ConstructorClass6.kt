

// dua tipe constructor
// primary constructor

class Kapal(penumpang:Int, warna:String){
    var penumpang:Int = 0
    var warna:String =""

    init {
        this.penumpang = penumpang
        this.warna = warna
    }


    fun penumpang():Unit{
        println("penumpang ada $penumpang")
    }

    fun warna():Unit{
        println("warna kapal $warna")
    }


    fun bergerak():Unit{


        println("Kapal Bergerak")

    }

    fun berhenti():Unit{
        println("Kapal Berhenti")
    }


}



fun main(args: Array<String>) {

    var fery = Kapal(1000, "Merah")
    fery.penumpang()
    fery.warna()
    fery.bergerak()
    fery.berhenti()

}