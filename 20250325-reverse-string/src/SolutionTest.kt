import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverse() {
        val result = solution.reverseString("abc")

        assertEquals("cba", result)
    }
}
