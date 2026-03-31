package chucknorris

fun main() {
    println("Input string:")
    val input = readln()

    println("The result:")
    input.forEach { char ->
        val asciiValue = char.code
        val binary = asciiValue.toString(2).padStart(7, '0')
        println("$char = $binary")
    }
}