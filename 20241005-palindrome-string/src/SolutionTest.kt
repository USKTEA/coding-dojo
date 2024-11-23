import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun isPalindrome() {
        val result = solution.isPalindrome("aa")

        assertEquals(1, result)
    }

    @Test
    fun isPalindrome_2() {
        val result = solution.isPalindrome("A man, a plan, a canal: Panama")

        assertEquals(1, result)
    }

    @Test
    fun isPalindrome_3() {
        val result = solution.isPalindrome("race a car")

        assertEquals(0, result)
    }

    @Test
    fun parse() {
        val parsed = solution.parse(" P;a;A;p !")

        assertEquals("paap", parsed)
    }
}
