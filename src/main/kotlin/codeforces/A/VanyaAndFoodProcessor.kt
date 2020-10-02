package codeforces.A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

// Wrong answer on Test 14, will redo
fun main() {

    val (n, h, k) = readInts()

    val p = readInts()

    var (i,s,x) = arrayOf(0, 0, 0)

    while (i < n) {
        var pack = p[i]

        if (pack + x > h) {
            s++ // this part clears out the x(cess)
        } else {
            pack += x
        }

        i++

        while (pack < h && i < n && (pack + p[i] <= h)) {
            pack += p[i++]
        }

        if (pack >= k) {
            s += pack/k
        }

        x = pack%k
    }

    s += if (x>0) 1 else 0

    println(s)
}
