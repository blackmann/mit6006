
fun Array<Int>.insertionSort(): Array<Int> {
    if (this.size <= 1) return this

    for (i in 1 until this.size) {
        var k = i

        while (k > 0 && this[k] < this[k-1]) {
            val temp = this[k]
            this[k] = this[k-1]
            this[k-1] = temp

            k -= 1
        }
    }

    return this
}

fun Array<Int>.mergeSort(): Array<Int> {
    if (this.size <= 1) {
        return this
    }

    fun merge(a: Array<Int>, b: Array<Int>): Array<Int> {
        val arr = IntArray(a.size.plus(b.size))

        var c = 0 // cursor for arr
        var i = 0 // cursor for a
        var j = 0 // cursor for b

        while (i < a.size && j < b.size) {
            if (a[i] < b[j]) {
                arr[c] = a[i]
                i++
            } else {
                arr[c] = b[j]
                j++
            }

            c++
        }

        while (i < a.size) {
            arr[c++] = a[i]
            i++
        }

        while (j < b.size) {
            arr[c++] = b[j]
            j++
        }

        return arr.toTypedArray()
    }

    val mid = this.size / 2

    return merge(this.sliceArray(0 until mid).mergeSort(),
        this.sliceArray(mid until this.size).mergeSort())
}

fun Array<Int>.bubbleSort(): Array<Int> {
    return arrayOf()
}