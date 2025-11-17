import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(1, 4, 2, 3), arrayListOf(2, 5, 1, 6), 4)

        assertEquals(arrayListOf(10, 9, 9, 8), result)
    }
}
