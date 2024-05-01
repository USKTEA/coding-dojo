import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_nums_size_is_1() {
        val result = solution.findMaxLength(intArrayOf(0))
        assertEquals(0, result)
    }

    @Test
    fun when_nums_is_0_and_1() {
        val result = solution.findMaxLength(intArrayOf(0, 1))
        assertEquals(2, result)
    }

    @Test
    fun when_nums_is_0_and_1_and_0() {
        val result = solution.findMaxLength(intArrayOf(0, 1, 0))
        assertEquals(2, result)
    }

    @Test
    fun complex_test_case() {
        val result = solution.findMaxLength(intArrayOf(0, 0, 1, 0, 0, 0, 1, 1))
        assertEquals(6, result)
    }
}

