import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100)
        assertEquals(8, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.numSubarrayProductLessThanK(intArrayOf(1, 2, 3), 0)
        assertEquals(0, result)
    }
}
