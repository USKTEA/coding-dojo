import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("abcde")

        assertEquals(0, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("abbaee")

        assertEquals(1, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("abbcaee")

        assertEquals(1, result)
    }
}
