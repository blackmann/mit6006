package codeforces.A

import kotlin.math.abs

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    var y = 0
    var x = -1

    while (y < 5) {
        x = readInts().indexOf(1)
        if (x > -1) break

        y++
    }

    println(abs(2 - x) + abs(2 - y))
}
