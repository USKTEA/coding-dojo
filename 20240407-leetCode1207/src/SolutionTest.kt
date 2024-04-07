import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `intArray(1)`() {
        assertTrue(solution.uniqueOccurrences(intArrayOf(1)))
    }
}
