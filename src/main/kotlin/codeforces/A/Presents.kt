package codeforces.A

import java.io.DataInputStream
import java.io.FileInputStream
import java.io.IOException


// Problem statement: http://codeforces.com/contest/136/problem/A
internal class Reader {
    private val BUFFER_SIZE = 1 shl 16
    private var din: DataInputStream?
    private var buffer: ByteArray
    private var bufferPointer: Int
    private var bytesRead: Int

    constructor() {
        din = DataInputStream(System.`in`)
        buffer = ByteArray(BUFFER_SIZE)
        bytesRead = 0
        bufferPointer = bytesRead
    }

    constructor(file_name: String?) {
        din = DataInputStream(FileInputStream(file_name))
        buffer = ByteArray(BUFFER_SIZE)
        bytesRead = 0
        bufferPointer = bytesRead
    }

    @Throws(IOException::class)
    fun readLine(): String {
        val buf = ByteArray(64) // line length
        var cnt = 0
        var c: Int
        while (read().toInt().also { c = it } != -1) {
            if (c == '\n'.toInt()) break
            buf[cnt++] = c.toByte()
        }
        return String(buf, 0, cnt)
    }

    @Throws(IOException::class)
    fun nextInt(): Int {
        var ret = 0
        var c = read()
        while (c <= ' '.toByte()) c = read()
        val neg = c == '-'.toByte()
        if (neg) c = read()
        do {
            ret = ret * 10 + c - '0'.toInt()
        } while (read().also { c = it } >= '0'.toByte() && c <= '9'.toByte())
        return if (neg) -ret else ret
    }

    @Throws(IOException::class)
    fun nextLong(): Long {
        var ret: Long = 0
        var c = read()
        while (c <= ' '.toByte()) c = read()
        val neg = c == '-'.toByte()
        if (neg) c = read()
        do {
            ret = ret * 10 + c - '0'.toLong()
        } while (read().also { c = it } >= '0'.toByte() && c <= '9'.toByte())
        return if (neg) -ret else ret
    }

    @Throws(IOException::class)
    fun nextDouble(): Double {
        var ret = 0.0
        var div = 1.0
        var c = read()
        while (c <= ' '.toByte()) c = read()
        val neg = c == '-'.toByte()
        if (neg) c = read()
        do {
            ret = ret * 10 + c - '0'.toDouble()
        } while (read().also { c = it } >= '0'.toByte() && c <= '9'.toByte())
        if (c == '.'.toByte()) {
            while (read().also { c = it } >= '0'.toByte() && c <= '9'.toByte()) {
                ret += (c - '0'.toByte()) / 10.let { div *= it; div }
            }
        }
        return if (neg) -ret else ret
    }

    @Throws(IOException::class)
    private fun fillBuffer() {
        bytesRead = din!!.read(buffer, 0.also { bufferPointer = it }, BUFFER_SIZE)
        if (bytesRead == -1) buffer[0] = -1
    }

    @Throws(IOException::class)
    private fun read(): Byte {
        if (bufferPointer == bytesRead) fillBuffer()
        return buffer[bufferPointer++]
    }

    @Throws(IOException::class)
    fun close() {
        if (din == null) return
        din!!.close()
    }
}

fun main() {
    val scanner = Reader()
    val n = scanner.nextInt()
    val res = arrayOfNulls<Int>(n)

    var i = 0
    while (i < n) {
        val pos = scanner.nextInt()
        res[pos - 1] = i+1

        i++
    }
    i = 0
    while (i < n) {
        print("${res[i]} ")
        i++
    }
}
