import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenNumberLengthIsOne() {
        val result1 = solution.plusOne(intArrayOf(0))
        assertArrayEquals(intArrayOf(1), result1)

        val result2 = solution.plusOne(intArrayOf(1))
        assertArrayEquals(intArrayOf(2), result2)
    }

    @Test
    fun whenNumberLengthIsTwo() {
        val result1 = solution.plusOne(intArrayOf(1, 0))
        assertArrayEquals(intArrayOf(1, 1), result1)
    }

    @Test
    fun whenLastNumberHaveCarryAfterPlusOne() {
        val result1 = solution.plusOne(intArrayOf(9))
        assertArrayEquals(intArrayOf(1, 0), result1)

        val result2 = solution.plusOne(intArrayOf(1, 9))
        assertArrayEquals(intArrayOf(2, 0), result2)
    }
}
