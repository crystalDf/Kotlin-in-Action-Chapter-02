fun main(args: Array<String>) {

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

    println(isLetter('q'))
    println(isNotDigit('x'))

    fun recognize(c: Char) =
            when (c) {
                in '0'..'9' -> "It's a digit!"
                in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
                else -> "I don't know..."
            }

    println(recognize('8'))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}
