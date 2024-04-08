import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun complexTest() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun simpleTest() {
        assertFalse(solution.isPalindrome("0P"))
    }
}
