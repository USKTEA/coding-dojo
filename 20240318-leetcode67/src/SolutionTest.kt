import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun zeroPlusZero() {
        val result = solution.addBinary("0", "0")
        assertEquals("0", result)
    }

    @Test
    fun zeroPlusOne() {
        val result = solution.addBinary("0", "1")
        assertEquals("1", result)
    }

    @Test
    fun onePlusOne() {
        val result = solution.addBinary("1", "1")
        assertEquals("10", result)
    }

    @Test
    fun tenPlusOne() {
        val result = solution.addBinary("10", "1")
        assertEquals("11", result)
    }

    @Test
    fun elevenPlusOne() {
        val result = solution.addBinary("11", "1")
        assertEquals("100", result)
    }

    @Test
    fun complex() {
        val result = solution.addBinary("1010", "1011")
        assertEquals("10101", result)
    }
}
