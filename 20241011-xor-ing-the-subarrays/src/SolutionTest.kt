import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(1, 2, 3))

        assertEquals(2, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(4, 5, 7, 5))

        assertEquals(0, result)
    }
}
