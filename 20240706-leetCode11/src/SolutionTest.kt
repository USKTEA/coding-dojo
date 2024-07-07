import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxArea() {
        val result = solution.maxArea(intArrayOf(1, 1))

        assertEquals(1, result)
    }
}
