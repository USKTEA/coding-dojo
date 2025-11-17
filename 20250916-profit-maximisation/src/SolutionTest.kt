import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(2, 3), 3)

        assertEquals(7, result)
    }

    @Test
    fun solve_1() {
        val result = solution.solve(arrayListOf(1, 4), 2)

        assertEquals(7, result)
    }
}
