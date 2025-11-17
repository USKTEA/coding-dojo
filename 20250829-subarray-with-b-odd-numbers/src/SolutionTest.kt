import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(5, 5, 1, 3, 1), 0)

        assertEquals(0, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(4, 3, 2, 3, 4), 2)

        assertEquals(4, result)
    }


    @Test
    fun solve_3() {
        val result = solution.solve(arrayListOf(5, 6, 7, 8, 9), 3)

        assertEquals(1, result)
    }
}
