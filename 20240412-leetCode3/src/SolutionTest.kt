import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun empty() {
        assertEquals(0, solution.lengthOfLongestSubstring(""))
    }

    @Test
    fun `a`() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"))
    }

    @Test
    fun `aa`() {
        assertEquals(1, solution.lengthOfLongestSubstring("aa"))
    }

    @Test
    fun `abcd`() {
        assertEquals(4, solution.lengthOfLongestSubstring("abcd"))
    }

    @Test
    fun `abcabcbb`() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun `pwwkew`() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun `dvdf`() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"))
    }
}
