import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun a() {
        assertEquals("a", solution.longestPalindrome("a"))
    }

    @Test
    fun cbbd() {
        assertEquals("bb", solution.longestPalindrome("cbbd"))
    }

    @Test
    fun isPalindrome() {
        assertTrue(solution.isPalindrome("bb"))
        assertFalse(solution.isPalindrome("abb"))
        assertTrue(solution.isPalindrome("abcba"))
        assertTrue(solution.isPalindrome("abba"))
    }
}
