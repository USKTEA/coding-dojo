import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun countAndSay() {
        val result = solution.countAndSay(0)

        assertEquals("", result)
    }

    @Test
    fun countAndSay_2() {
        val result = solution.countAndSay(2)

        assertEquals("11", result)
    }

    @Test
    fun countNumber() {
        val result = solution.countNumber("1")

        assertEquals("11", result)
    }

    @Test
    fun countNumber_2() {
        val result = solution.countNumber("11")

        assertEquals("21", result)
    }

    @Test
    fun countNumber_3() {
        val result = solution.countNumber("21")

        assertEquals("1211", result)
    }
}
