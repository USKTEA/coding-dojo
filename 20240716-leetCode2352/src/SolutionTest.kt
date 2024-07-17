import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun equalPairs() {
        val result = solution.equalPairs(
            arrayOf(
                intArrayOf(3, 2, 1),
                intArrayOf(1, 7, 6),
                intArrayOf(2, 7, 7)
            )
        )

        assertEquals(1, result)
    }

    @Test
    fun equalPairs_1() {
        val result = solution.equalPairs(
            arrayOf(
                intArrayOf(3, 1, 2, 2),
                intArrayOf(1, 4, 4, 5),
                intArrayOf(2, 4, 2, 2),
                intArrayOf(2, 4, 2, 2),
            )
        )

        assertEquals(3, result)
    }

    @Test
    fun getColumns() {
        val columns = solution.getColumns(
            arrayOf(
                intArrayOf(3, 2, 1),
                intArrayOf(1, 7, 6),
                intArrayOf(2, 7, 7)
            )
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(3, 1, 2),
                intArrayOf(2, 7, 7),
                intArrayOf(1, 6, 7),
            ), columns
        )
    }
}
