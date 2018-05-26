

class Kursi(var warna: String)
{
    var kaki:Int =0

    constructor(kaki : Int, warna : String):this(warna)
    {
        this.kaki = kaki
    }





    fun panggilJumlahKaki()
    {
        println("maka jumlah kaki $kaki")
    }

    fun panggilWarna(){
        println("maka warna $warna")
    }

}






fun main(args: Array<String>) {

    var bilangan:Int = 4
    var kursi1 = Kursi(bilangan, "Putih")
    kursi1.panggilJumlahKaki()
    kursi1.panggilWarna()

}