package codeforces.A

// Problem statement: http://codeforces.com/contest/405/problem/A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val s = readInt()

    val h = readInts().toMutableList()

    h.sort()

    println(h.joinToString(" "))
}
