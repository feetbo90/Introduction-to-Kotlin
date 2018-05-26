package fakultas

class mahasiswa(nama : String, alamat : String ,
                umur : Int, var NIM : String, var semester : Int,  jk : String) : Person(nama, umur, alamat,jk ) {

    var bidang : String = ""
    //var NIM : String = ""
    //var semester : Int = 0

    constructor(nama : String, alamat : String ,
                umur : Int,  NIM : String,  semester : Int , bidang : String, jk : String) :this(nama , alamat, umur,
            NIM, semester, jk){

    }

    fun getInfoMahasiswa()
    {

        println("NIM : $NIM \n semester : $semester ")

    }

}