import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.spiralOrder(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))

        assertEquals(listOf(1, 2, 3, 4), result)
    }

    @Test
    fun test_case_2() {
        val result = solution.spiralOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))

        assertEquals(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), result)
    }

    @Test
    fun start() {
        val matrix = arrayOf(intArrayOf(1, 2))
        val result = arrayOf(intArrayOf(101, 101))
        val position = Position(0, 0)
        val direction = Direction(1, 0)

        solution.start(result, matrix, position, direction, 0)

        assertArrayEquals(arrayOf(intArrayOf(1, 2)), result)
    }

    @Test
    fun checkBlocked() {
        val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val result = arrayOf(intArrayOf(1, 2), intArrayOf(101, 101))
        val position = Position(
            x = 1,
            y = 0
        )
        val direction = Direction(1, 0)

        assertTrue(solution.checkBlocked(result, matrix, position, direction))
    }
}
