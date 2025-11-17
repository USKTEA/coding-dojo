import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(5, 4, 10, 15, 7, 6), 5)

        assertEquals(1, result)
    }
}
