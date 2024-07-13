import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val soluton = Solution()

    @Test
    fun findMaxAverage() {
        val result = soluton.findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)

        assertEquals(12.75, result)
    }

    @Test
    fun findMaxAverage_1() {
        val result = soluton.findMaxAverage(intArrayOf(-1), 1)

        assertEquals(-1.0, result)
    }
}
