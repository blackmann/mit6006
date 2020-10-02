package codeforces.A

// Problem statement: http://codeforces.com/contest/734/problem/A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    var a = 0
    var d = 0

    readInt()

    readLn().forEach {
        if (it == 'A') a++
        else d++
    }

    if (a == d) {
        println("Friendship")
    }
    else if (a > d) {
        println("Anton")
    } else {
        println("Danik")
    }
}
