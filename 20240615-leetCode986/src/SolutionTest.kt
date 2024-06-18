import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun intervalIntersection() {
        val result = solution.intervalIntersection(
            firstList = arrayOf(
                intArrayOf(0, 2)
            ),
            secondList = arrayOf(
                intArrayOf(0, 2)
            )
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 2)
            ), result
        )
    }

    @Test
    fun intervalIntersection_2() {
        val result = solution.intervalIntersection(
            arrayOf(
                intArrayOf(0, 2),
                intArrayOf(5, 10),
                intArrayOf(13, 23),
                intArrayOf(24, 25),
            ),
            arrayOf(
                intArrayOf(1, 5),
                intArrayOf(8, 12),
                intArrayOf(15, 24),
                intArrayOf(25, 26),
            )
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(5, 5),
                intArrayOf(8, 10),
                intArrayOf(15, 23),
                intArrayOf(24, 24),
                intArrayOf(25, 25),
            )
            ,result
        )
    }
}
