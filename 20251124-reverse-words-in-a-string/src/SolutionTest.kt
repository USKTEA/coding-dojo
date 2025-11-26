import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseWords() {
        val result = solution.reverseWords("  the sky is  blue  ")

        assertEquals("blue is sky the", result)
    }

    @Test
    fun splitAndReverse() {
        val result = solution.splitAndReverse("blue is  sky the")

        assertEquals(listOf("blue", "is", "sky", "the"), result)
    }
}
