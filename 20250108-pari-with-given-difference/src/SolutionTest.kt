import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(5, 10, 3, 2, 50, 80), 78)
        assertEquals(1, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(-10, 20), 30)
        assertEquals(1, result)
    }
}
