import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun pow() {
        val result = solution.pow(2, 3, 3)

        assertEquals(2, result)
    }
}
