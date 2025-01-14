import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(1, 0, 0, 1, 1, 0, 1), 1)
        assertEquals(4, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(1, 0, 0, 1, 0, 1, 0, 1, 0, 1), 2)
        assertEquals(5, result)
    }
}
