import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `0, 0, 0`() {
        val result = solution.threeSum(intArrayOf(0, 0, 0))

        assertEquals(listOf(listOf(0, 0, 0)), result)
    }

    @Test
    fun `-1, 0, 1, 2, -1, -4`() {
        val result = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), result)
    }

    @Test
    fun `3,0,-2,-1,1,2`() {
        val result = solution.threeSum(intArrayOf(3, 0, -2, -1, 1, 2))

        assertEquals(listOf(listOf(-2, -1, 3), listOf(-2, 0, 2), listOf(-1, 0, 1)), result)
    }
}
