package p9class

open class Hewan{


    var habitat : String = ""
    var nama : String = ""


    fun bernapas(){

        println("Hewan bernapas")

    }


    open fun berkembangBiak(){
        println("Hewan berkembang biak")
    }

    fun bergerak(){
        println("Hewan bergerak")
    }

}