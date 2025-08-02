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

    @Test
    fun solve_3() {
        val result = solution.solve("129814999", 4)

        assertEquals("999984211", result)
    }
}
