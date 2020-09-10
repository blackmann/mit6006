package codeforces

import java.util.*

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

// AC
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val (_, h) = readInts()
    val heights = readInts()
    val s = heights.map { if (it > h) 2 else 1 }.sum()
    println(s)
}
