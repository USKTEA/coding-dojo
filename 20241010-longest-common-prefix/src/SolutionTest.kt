import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun longestCommonPrefix() {
        val result = solution.longestCommonPrefix(arrayListOf("abcdefgh", "aefghijk", "abcefgh"))

        assertEquals("a", result)
    }

    @Test
    fun longestCommonPrefix_2() {
        val result = solution.longestCommonPrefix(arrayListOf("abab", "ab", "abcd"))

        assertEquals("ab", result)
    }
}
