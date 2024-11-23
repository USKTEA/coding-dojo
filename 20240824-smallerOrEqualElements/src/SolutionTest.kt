import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(
            arrayListOf(1, 3, 4, 4, 6), 4
        )

        assertEquals(4, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(
            arrayListOf(1, 2, 5, 5), 3
        )

        assertEquals(2, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve(
            arrayListOf(4), 2
        )

        assertEquals(0, result)
    }
}
