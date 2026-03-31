package chucknorris
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Input string:")
    val input = scanner.nextLine()
    println("The result:")
    println(encodeChuckNorris(input))
}

fun encodeChuckNorris(input: String): String {
    val binary = input.map { it.code.toString(2).padStart(7, '0') }.joinToString("")
    val result = StringBuilder()

    var i = 0
    while (i < binary.length) {
        val bit = binary[i]
        var count = 0

        // Count consecutive bits
        while (i < binary.length && binary[i] == bit) {
            count++
            i++
        }

        // Encode: "0" for 1s, "00" for 0s, followed by count zeros
        val prefix = if (bit == '1') "0" else "00"
        val zeros = "0".repeat(count)

        if (result.isNotEmpty()) {
            result.append(" ")
        }
        result.append(prefix).append(" ").append(zeros)
    }

    return result.toString()
}