import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(10, 5, 3, 4, 3, 5, 6))

        assertEquals(5, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(6, 10, 5, 4, 9, 120))

        assertEquals(-1, result)
    }
}
