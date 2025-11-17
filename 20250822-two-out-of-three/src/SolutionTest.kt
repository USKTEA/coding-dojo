import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve_1() {
        val result = solution.solve(arrayListOf(1, 1, 2), arrayListOf(2, 3), arrayListOf(3))

        assertEquals(arrayListOf(2, 3), result)
    }
}
