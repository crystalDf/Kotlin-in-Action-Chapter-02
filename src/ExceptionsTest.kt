import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {

    val percentage = 5

    if (percentage !in 0..100) {
        throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $percentage")
    }

    val number = 10

    val percentage2 =
            if (number in 0..100) {
                number
            } else {
                throw IllegalArgumentException(
                        "A percentage value must be between 0 and 100: $number")
            }

    fun readNumber(reader: BufferedReader): Int? {
        return try {
            val line = reader.readLine()
            Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            null
        } finally {
            reader.close()
        }
    }

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
    val reader2 = BufferedReader(StringReader("not a number"))
    println(readNumber(reader2))
}
