import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun decodeString() {
        val result = solution.decodeString("3[a]")

        assertEquals("aaa", result)
    }
}
