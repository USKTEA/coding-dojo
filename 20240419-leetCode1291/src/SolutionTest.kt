import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun sequentialDigits1() {
        val result = solution.sequentialDigits(100, 300)

        assertEquals(listOf(123, 234), result)
    }

    @Test
    fun sequentialDigits2() {
        val result = solution.sequentialDigits(1000, 13000)

        assertEquals(listOf(1234,2345,3456,4567,5678,6789,12345), result)
    }
}

