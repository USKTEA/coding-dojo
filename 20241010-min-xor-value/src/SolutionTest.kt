import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findMinXor() {
        val result = solution.findMinXor(arrayListOf(0, 4, 7, 9))
        assertEquals(3, result)
    }

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(4, 5, 7, 5))

        assertEquals(0, result)
    }
}
