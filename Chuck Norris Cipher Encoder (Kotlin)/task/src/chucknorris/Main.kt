package chucknorris

fun main() {
    println("Input string:")
    val input = readln()
    input.forEach { print("$it ") }
    println()
}