interface Hewan {
    fun bergerak();
    fun bernapas();
}


class Kuda(): Hewan{
    override fun bergerak() {
        print(" Kuda bergerak  " )
    }

    override fun bernapas() {
        print(" Kuda bernapas ")
    }

}

class Kambing(): Hewan{
    override fun bergerak() {
        print(" Kambing  bergerak" )
    }

    override fun bernapas() {
        print("Kambing bernapas ")
    }

}

class Pilih(b : Hewan) : Hewan by b


fun main(args: Array<String>) {

    val b = Kuda()
    val hewan = Pilih(b)
    hewan.bergerak();

    val kambing = Kambing()
    val hewan2 = Pilih(kambing)
    hewan2.bernapas()

}