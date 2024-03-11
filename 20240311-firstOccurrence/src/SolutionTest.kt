import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simpleTests() {
        assertEquals(0, solution.strStr("a", "a"))
        assertEquals(-1, solution.strStr("a", "b"))
        assertEquals(-1, solution.strStr("a", "ab"))
        assertEquals(0, solution.strStr("ab", "a"))
    }

    @Test
    fun notSimpleTests() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"))
        assertEquals(-1, solution.strStr("leetcode", "leeto"))
    }

    @Test
    fun testHello() {
        assertEquals(2, solution.strStr("hello", "ll"))
    }
}
