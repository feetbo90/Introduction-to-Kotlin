


class testDsl{

    var name: String = "Iqbal"
    var onSaved:(() -> Unit)? = null
    fun onSaved(f:() -> Unit){
        onSaved = f
    }

    fun save(){
        onSaved?.invoke()
    }



}

fun test(initDua : testDsl.() -> Unit):testDsl{

    val test = testDsl()
    test.initDua()
    return test
}

fun main(args: Array<String>) {

    var iqbal = test {
        onSaved {
            println("masuk coy")
        }


    }.save()


}