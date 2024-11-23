import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("aabcd", 2)

        assertEquals("bcd", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("aabbccd", 2)

        assertEquals("d", result)
    }
}
