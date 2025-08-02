import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("254", 1)

        assertEquals("524", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("254", 2)

        assertEquals("542", result)
    }
}
