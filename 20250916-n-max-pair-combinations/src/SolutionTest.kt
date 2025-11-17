import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(1, 4, 2, 3), arrayListOf(2, 5, 1, 6))

        assertEquals(arrayListOf(10, 9, 9, 8), result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(2, 4, 1, 1), arrayListOf(-2, -3, 2, 4))

        assertEquals(arrayListOf(8, 6, 6, 5), result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve(arrayListOf(3, 1, 3, 1), arrayListOf(1, 4, 1, 4))

        assertEquals(arrayListOf(7, 7, 7, 7), result)
    }
}
