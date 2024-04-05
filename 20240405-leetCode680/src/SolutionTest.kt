import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun a() {
        assertTrue(solution.validPalindrome("a"))
    }

    @Test
    fun aa() {
        assertTrue(solution.validPalindrome("aa"))
    }

    @Test
    fun ab() {
        assertTrue(solution.validPalindrome("ab"))
    }

    @Test
    fun abc() {
        assertFalse(solution.validPalindrome("abc"))
    }

    @Test
    fun abca() {
        assertTrue(solution.validPalindrome("abca"))
    }

    @Test
    fun aabaa() {
        assertTrue(solution.validPalindrome("aabaa"))
    }

    @Test
    fun deeee() {
        assertTrue(solution.validPalindrome("deeee"))
    }
}
