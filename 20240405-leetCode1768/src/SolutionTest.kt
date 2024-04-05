import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `a, b`() {
        val result = solution.mergeAlternately("a", "b")

        assertEquals("ab", result)
    }

    @Test
    fun `aa, b`() {
        val result = solution.mergeAlternately("aa", "b")

        assertEquals("aba", result)
    }

    @Test
    fun `aa, bb`() {
        val result = solution.mergeAlternately("aa", "bb")

        assertEquals("abab", result)
    }

    @Test
    fun `abc, pqrs`() {
        val result = solution.mergeAlternately("ab", "pqrs")

        assertEquals("apbqrs", result)
    }
}
