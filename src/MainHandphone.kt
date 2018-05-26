import p8class.Handphone

fun main(args: Array<String>) {

    var xiaomi = Handphone("Putih", "Samsung", 3, 1000000)

    xiaomi.ambilPhotoDariGallery()
    xiaomi.bukaKamera()
    xiaomi.ambilPhotoDariKamera()

    xiaomi.setMerkHandphone("Mi 4 i")
    xiaomi.getMerkHandphone()


    var ygDibayar = xiaomi.beliHandphone(2, 2000000)
    println(ygDibayar)

    panggil()

}


fun panggil()
{
    println("panggil fungsi")
}