import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun colorful() {
        val result = solution.colorful(3245)
        assertEquals(1, result)
    }

    @Test
    fun colorful_2() {
        val result = solution.colorful(12)
        assertEquals(0, result)
    }
}
