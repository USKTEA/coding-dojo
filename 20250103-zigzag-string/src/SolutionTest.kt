import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun convert() {
        val result = solution.convert("PAYPALISHIRING", 3)
        assertEquals("PAHNAPLSIIGYIR", result)
    }

    @Test
    fun convert_2() {
        val result = solution.convert("ABCD", 2)
        assertEquals("ACBD", result)
    }
}
