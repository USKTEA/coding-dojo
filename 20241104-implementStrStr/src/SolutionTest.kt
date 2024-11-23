import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun strStr() {
        val result = solution.strStr("strstr", "str")

        assertEquals(0, result)
    }
}
