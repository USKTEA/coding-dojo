import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.maxSubArray(intArrayOf(1))
        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.maxSubArray(intArrayOf(1, 1))
        assertEquals(2, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.maxSubArray(intArrayOf(1, 2, -1))
        assertEquals(3, result)
    }

    @Test
    fun test_case_4() {
        val result = solution.maxSubArray(intArrayOf(1, -2, 1))
        assertEquals(1, result)
    }

    @Test
    fun test_case_5() {
        val result = solution.maxSubArray(intArrayOf(1, 2, -1, 5))
        assertEquals(7, result)
    }

    @Test
    fun test_case_6() {
        val result = solution.maxSubArray(intArrayOf(5, 4, -1, 7, 8))
        assertEquals(23, result)
    }

    @Test
    fun test_case_7() {
        val result = solution.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
        assertEquals(6, result)
    }
}
