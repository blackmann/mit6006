package codeforces

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    var t = readInt()
    var s = 0

    while (0 < t--) {
        if (readInts().sum() > 1) {
            s++
        }
    }

    println(s)
}
