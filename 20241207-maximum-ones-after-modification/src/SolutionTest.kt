import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(1, 0, 0, 1, 1, 0, 1), 1)

        assertEquals(4, result)
    }
}
