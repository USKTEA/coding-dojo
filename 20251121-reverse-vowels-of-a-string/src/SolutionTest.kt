import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseVowels() {
        val result = solution.reverseVowels("IceCreAm")

        assertEquals("AceCreIm", result)
    }

    @Test
    fun reverseVowels_1() {
        val result = solution.reverseVowels("leetcode")

        assertEquals("leotcede", result)
    }

    @Test
    fun reverseVowels_2() {
        val result = solution.reverseVowels(".,")

        assertEquals(".,", result)
    }

    @Test
    fun reverseVowels_3() {
        val result = solution.reverseVowels("race a car")

        assertEquals("raca e car", result)
    }
}
