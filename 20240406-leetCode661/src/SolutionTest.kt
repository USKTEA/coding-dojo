import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simple() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
            ), solution.imageSmoother(matrix)
        )
    }

    @Test
    fun isCorner() {
        assertTrue(solution.isCorner(0, 0))
        assertTrue(solution.isCorner(0, 2))
        assertTrue(solution.isCorner(2, 0))
        assertTrue(solution.isCorner(2, 2))
        assertFalse(solution.isCorner(2, 1))
    }

    @Test
    fun cornerSmooth() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        )

        assertEquals(0, solution.cornerSmooth(matrix))
    }

    @Test
    fun middleSmooth() {
        val matrix = arrayOf(
            intArrayOf(100, 200, 100),
            intArrayOf(200, 50, 200),
            intArrayOf(100, 200, 100),
        )

        assertEquals(138, solution.middleSmooth(matrix))
    }

    @Test
    fun otherSmooth() {
        val matrix = arrayOf(
            intArrayOf(100, 200, 100),
            intArrayOf(200, 50, 200),
            intArrayOf(100, 200, 100),
        )

        assertEquals(141, solution.otherSmooth(matrix))
    }
}
