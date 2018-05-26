

open class Universitas(var jurusan:String) {

    var nilai :Int = 100
    init {
        this.jurusan = jurusan
    }

    open fun panggilJurusan() {
        println("maka jurusan di universitas $jurusan")
    }
}

class Mahasiswa(var nama : String, jurusan: String): Universitas(jurusan) {

    var nim:String = ""

    constructor(nama: String, nim : String, jurusan: String):this(nama, jurusan){

        this.nama = nama
        this.nim = nim
        this.jurusan = jurusan

    }

    fun panggilJurusanDiMahasiswa()
    {
        println("maka jurusan di Mahasiswa $jurusan")
    }

    override fun panggilJurusan() {
        //super.panggilJurusan()
        println("ini adalah kelas mahasiswa memanggil kelas dari Universitas")
    }

}



fun main(args: Array<String>) {
    var iqbal = Mahasiswa("iqbal", "069", "Matematika")
    iqbal.panggilJurusanDiMahasiswa()
    iqbal.panggilJurusan()
    iqbal.nilai = 200
    println("${iqbal.nilai}")
    iqbal.panggilJurusan()



    var test = Mahasiswa("testing", "IT")
    test.panggilJurusanDiMahasiswa()
    test.panggilJurusan()
}