import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun countAndSay() {
        val result = solution.countAndSay(2)

        assertEquals("11", result)
    }

    @Test
    fun countAndSay_1() {
        val result = solution.countAndSay(1)

        assertEquals("1", result)
    }

    @Test
    fun countAndSay_2() {
        val result = solution.countAndSay(3)

        assertEquals("21", result)
    }

    @Test
    fun countAndSay_3() {
        val result = solution.countAndSay(4)

        assertEquals("1211", result)
    }
}
