package chucknorris
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Input string:")
    val input = scanner.nextLine()

    val binaryString = StringBuilder()
    for (char in input) {
        val binary = Integer.toBinaryString(char.toInt())
        val paddedBinary = String.format("%7s", binary).replace(' ', '0')
        binaryString.append(paddedBinary)
    }

    val result = StringBuilder()
    if (binaryString.isNotEmpty()) {
        var i = 0
        while (i < binaryString.length) {
            val char = binaryString[i]
            if (char == '1') {
                result.append("0 ")
            } else {
                result.append("00 ")
            }

            var count = 0
            while (i < binaryString.length && binaryString[i] == char) {
                count++
                i++
            }
            result.append("0".repeat(count))
            if (i < binaryString.length) {
                result.append(" ")
            }
        }
    }

    println("The result:")
    println(result.toString())
}