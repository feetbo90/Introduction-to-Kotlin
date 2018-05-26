class Person(val name: String, val surname: String, val age: Int) {
    companion object {
        class Builder {
            private var name: String = ""
            private var surname: String = ""
            private var age: Int = 0

            fun name(name: String): Builder {
                this.name = name
                return this
            }

            fun surname(surname: String): Builder {
                this.surname = surname
                return this
            }

            fun age(age: Int): Builder {
                this.age = age
                return this
            }

            fun build() = Person(name, surname, age)
        }
    }
}

fun main(args: Array<String>) {
    Person.Companion
            .Builder()
            .name("Piotr")
            .surname("Slesarew")
            .age(28)
            .build()

    var nama = Person.Companion.Builder().name("Ok").build()
    println(nama.name)
}