import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun intToRoman() {
        val result = solution.intToRoman(5)

        assertEquals("V", result)
    }

    @Test
    fun intToRoman_2() {
        val result = solution.intToRoman(14)

        assertEquals("XIV", result)
    }

    @Test
    fun intToRoman_3() {
        val result = solution.intToRoman(3999)

        assertEquals("MMMCMXCIX", result)
    }
}
