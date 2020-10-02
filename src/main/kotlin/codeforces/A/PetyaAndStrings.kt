package codeforces.A

// Problem statement: http://codeforces.com/contest/112/problem/A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val a = readLn().toLowerCase().toCharArray().sumBy { it.toInt() }
    val b = readLn().toLowerCase().toCharArray().sumBy { it.toInt() }

    if (a > b) {
        println(1)
    } else if (b > a) {
        println(-1)
    } else {
        println(0)
    }
}
