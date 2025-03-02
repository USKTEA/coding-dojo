import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxArea() {
        val result = solution.maxArea(arrayListOf(1, 5, 4, 3))

        assertEquals(6, result)
    }
}
