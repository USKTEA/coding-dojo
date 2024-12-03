import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("the sky is blue")

        assertEquals("blue is sky the", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(" the   sky is blue ")

        assertEquals("blue is sky the", result)
    }
}
