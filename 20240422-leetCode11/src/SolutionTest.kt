import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun maxArea() {
        val solution = Solution()
        val maxArea = solution.maxArea(intArrayOf(1, 1))

        assertEquals(1, maxArea)
    }

    @Test
    fun maxAreaWithZero() {
        val solution = Solution()
        val maxArea = solution.maxArea(intArrayOf(1, 0))

        assertEquals(0, maxArea)
    }

    @Test
    fun maxAreaWithThreeOne() {
        val solution = Solution()
        val maxArea = solution.maxArea(intArrayOf(1, 1, 1))

        assertEquals(2, maxArea)
    }

    @Test
    fun complexTestCase() {
        val solution = Solution()
        val maxArea = solution.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))

        assertEquals(49, maxArea)
    }
}
