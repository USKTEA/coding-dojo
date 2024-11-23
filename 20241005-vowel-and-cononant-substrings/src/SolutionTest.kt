import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solve("aba")

        assertEquals(2, result)
    }
}
