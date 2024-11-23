import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("1123", "0111")

        assertEquals("1A1B", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("1807", "7810")

        assertEquals("1A3B", result)
    }


    @Test
    fun matchBulls() {
        val result = solution.matchBulls("1", "1")

        assertEquals(Triple(1, "", ""), result)
    }

    @Test
    fun matchBulls_2() {
        val result = solution.matchBulls("101", "111")

        assertEquals(Triple(2, "0", "1"), result)
    }

    @Test
    fun matchCows() {
        val result = solution.matchCows(mutableMapOf('A' to 1), "A")

        assertEquals(1, result)
    }
}
