package peakfinder

object PeakFinder {

    /**
     * Given a 1-dimensional array A[0..n-1], A[i] is a peak if its
     * neighbors are smaller or equal than it.
     */
    fun find1d(A: Array<Int>, start: Int = 0, end: Int? = null): Int {
        if (A.size == 1 || A.isEmpty()) {
            return 0
        }

        val tEnd = (end ?: A.size - 1)
        val mid = start + ((tEnd - start) / 2)

        if (A[mid-1] > A[mid]) {
            return find1d(A, 0, mid-1)
        } else if (A[mid+1] > A[mid]) {
            return find1d(A, mid+1, tEnd)
        }

        return mid
    }
}