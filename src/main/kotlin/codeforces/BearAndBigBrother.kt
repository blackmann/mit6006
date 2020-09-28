package codeforces

// Problem statement: http://codeforces.com/contest/791/problem/A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    var (l, b) = readInts()
    var y = 0

    while (l <= b) {
        l *= 3
        b *= 2

        y++
    }

    println(y)
}
