package peakfinder

import org.junit.Test
import kotlin.test.assertTrue


class PeakFinderTest {

    @Test
    fun `test peak find for 1 dimension`() {
        val testCases = arrayOf(
            arrayOf(2, 3, 5, 9, 3, 8, 2, 4, 1),
            arrayOf(1, 1, 1, 1, 9),
            arrayOf(1, 1, 9, 1, 1, 1),
            arrayOf(9)
        )

        val testSolutions = arrayOf(
            arrayOf(9, 8, 4),
            arrayOf(1),
            arrayOf(9),
            arrayOf(9),
        )

        testCases.zip(testSolutions).forEach {
            val peak = PeakFinder.find1d(it.first)

            assertTrue(it.second.contains(it.first[peak]),
                "Failed for ${it.first.joinToString(",")} with solution $peak")
        }
    }
}