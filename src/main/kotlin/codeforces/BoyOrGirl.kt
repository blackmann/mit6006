package codeforces

// Problem statement: http://codeforces.com/contest/236/problem/A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val username = readLn().toSet()

    if (username.size % 2 == 0) {
        println("CHAT WITH HER!")
    } else {
        println("IGNORE HIM!")
    }
}
