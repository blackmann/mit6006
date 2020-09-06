import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortsTests {


    @Test
    fun `test insertion sort`() {
        val a = arrayOf(3, 1, 4, 9, 8, 10, 12, 6, 5)

        assertArrayEquals(arrayOf(1, 3, 4, 5, 6, 8, 9, 10, 12), a.insertionSort())
    }

    @Test
    fun `test merge sort`() {
        val a = arrayOf(3, 1, 4, 9, 8, 10, 12, 6, 5)

        assertArrayEquals(arrayOf(1, 3, 4, 5, 6, 8, 9, 10, 12), a.mergeSort())
    }
}