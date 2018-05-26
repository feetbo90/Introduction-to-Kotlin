package p8class

class Handphone(var warna : String, var merk: String, var jumlahKamera: Int){

    // primary constructor
    init {
        println("Ini adalah constructor")

        println("Maka warna $warna dan merk $merk dan jumlah Kamera $jumlahKamera")

    }

    constructor( warna : String,  merk: String,  jumlahKamera : Int, harga: Int):this(warna, merk, jumlahKamera)
    {
        this.jumlahKamera = jumlahKamera
    }



    fun bukaKamera ()
    {
        println("Kamera terbuka")
    }

    fun ambilPhotoDariKamera(){
        println("Photo Diambil")
    }

    fun ambilPhotoDariGallery(){
        println("Photo Diambil dari Gallery")
    }

    fun setMerkHandphone(merk : String)
    {
        this.merk = merk
    }

    fun getMerkHandphone()
    {
        println(merk)
    }



    fun beliHandphone(jumlah : Int, harga: Int):Int
    {
        var ygDibayar = jumlah * harga
        return ygDibayar
    }





}
