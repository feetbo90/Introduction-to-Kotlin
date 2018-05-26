package fakultas

open class Person(var nama : String, var umur : Int, var alamat : String){

    var jk : String = ""

    fun getInfoPerson()
    {

        println("Nama : $nama \n Umur : $umur \n Alamat : $alamat")

    }

    constructor( nama : String,  umur : Int,  alamat : String , jk : String):this(nama, umur, alamat)
    {
        this.jk = jk
    }




}