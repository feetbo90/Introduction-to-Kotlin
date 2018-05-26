package kendaraan


open class Kendaraan() {


    var type : String = ""

    init {

        println("ini adalah primary constructor induk ")

    }

    private fun test()
    {

    }

    protected fun sifatInduk()
    {
        println("sifat dari si induk")
    }

    public fun fungsiInduk(type : String){


        println("berasal dari induk $type")

    }



}
