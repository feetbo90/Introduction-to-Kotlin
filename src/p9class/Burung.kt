package p9class

class Burung : Hewan(){

    var perkutut = Hewan()

    fun bernapasBurung (){

        perkutut.bernapas()
    }

    override fun berkembangBiak(){
        super.berkembangBiak()
        println("Burung berkembang biak")
    }


}


fun main(args: Array<String>) {

    var perkutut = Burung()
    perkutut.bernapasBurung()
    perkutut.berkembangBiak()



}