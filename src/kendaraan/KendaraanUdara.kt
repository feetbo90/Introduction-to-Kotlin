package kendaraan


class KendaraanUdara() : Kendaraan(){

    init{
        println("ini dari kelas anak")
    }


    fun Udara(type : String)
    {
        sifatInduk()
        println("berasal dari anak : $type ")

    }


}