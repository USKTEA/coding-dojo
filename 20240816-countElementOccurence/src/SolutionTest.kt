import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findCount() {
        val count = solution.findCount(listOf(5, 7, 7, 8, 8, 10), 8)

        assertEquals(2, count)
    }

    @Test
    fun count() {
        val count = solution.findCount(listOf(5, 7, 7, 8, 8, 10), 7)

        assertEquals(2, count)
    }
}
