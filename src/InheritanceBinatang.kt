

open class Binatang{

    var kaki : Int = 0
    var warna : String = ""

    open fun bergerak(){

        println("Makhluk hidup bergerak")
    }

    fun bernapas(){
        println("Makhluk hidup bernapas")
    }





}


class Merpati: Binatang() {
    fun contoh(){
        var merpati = Merpati()
        merpati.warna
    }

    override fun bergerak(){
        super.bergerak()
        println("Merpati bergerak ")
    }
}

fun main(args: Array<String>) {
    var binatang = Binatang()
    binatang.bergerak()
    binatang.bernapas()

    var merpati = Merpati()
    merpati.bernapas()
    merpati.bergerak()

    merpati.warna = "hitam"
    merpati.kaki = 9
    println("${merpati.warna}")

}

