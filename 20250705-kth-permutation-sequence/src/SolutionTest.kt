import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun getPermutation() {
        val result = solution.getPermutation(3, 4)

        assertEquals("231", result)
    }
}
