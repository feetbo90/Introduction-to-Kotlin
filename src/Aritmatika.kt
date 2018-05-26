class AritmatikaClass(var bilanganpertama:Int , var bilangankedua:Int){

    var bilpertama :Double = 0.0
    var bilkedua :Double = 0.0

    fun penjumlahan() :Int{
        var hasil = bilanganpertama + bilangankedua
        return hasil
    }

    fun bilanganToDouble()
    {
        bilpertama = bilanganpertama.toDouble()
        bilkedua = bilangankedua.toDouble()
    }

    fun pembagian() :Double{
        return bilpertama / bilkedua
    }

    fun pengurangan(list: List<Int>):Int{
        return bilanganpertama - bilangankedua
    }


}