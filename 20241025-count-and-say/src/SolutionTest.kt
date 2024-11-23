import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun countAndSay_1() {
        val result = solution.countAndSay(0)

        assertEquals("", result)
    }

    @Test
    fun countAndSay_2() {
        val result = solution.countAndSay(1)

        assertEquals("1", result)
    }

    @Test
    fun countAndSay_3() {
        val result = solution.countAndSay(2)

        assertEquals("11", result)
    }

    @Test
    fun countAndSay_4() {
        val result = solution.countAndSay(3)

        assertEquals("21", result)
    }

    @Test
    fun countAndSay_5() {
        val result = solution.countAndSay(4)

        assertEquals("1211", result)
    }

    @Test
    fun count() {
        val result = solution.count("")

        assertEquals("1", result)
    }

    @Test
    fun count_2() {
        val result = solution.count("1")

        assertEquals("11", result)
    }

    @Test
    fun count_3() {
        val result = solution.count("11")

        assertEquals("21", result)
    }
}
