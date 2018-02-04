object PersonTest {

    @JvmStatic
    fun main(args: Array<String>) {

        val person = Person("Bob", true)
        println(person.name)
        println(person.isMarried)
    }
}

