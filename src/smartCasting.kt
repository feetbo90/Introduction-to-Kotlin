
class Cat{
    fun HelloCat(){
        print("hello cat")
    }
}

class Dog{
    fun HelloDog(){
    print("Hello Dog")
    }
}


fun main(args: Array<String>) {

    val animal : Any? = Dog()
    when (animal){
        is Dog -> animal.HelloDog()
        is Cat -> animal.HelloCat()
    }
}