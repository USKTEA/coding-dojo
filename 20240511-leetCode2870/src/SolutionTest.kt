import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.minOperations(intArrayOf(2, 2))
        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.minOperations(intArrayOf(2, 2, 2, 2, 3, 3, 3, 4, 4))
        assertEquals(4, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.minOperations(intArrayOf(2, 1, 2, 2, 3, 3))
        assertEquals(-1, result)
    }

    @Test
    fun test_case_4() {
        val result = solution.minOperations(intArrayOf(19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19))
        assertEquals(5, result)
    }

    @Test
    fun test_case_5() {
        val result = solution.minOperations(intArrayOf(2, 1, 2, 2, 3, 3))
        assertEquals(-1, result)
    }

    @Test
    fun calculateMinimumOperation_1() {
        val count = solution.calculateMinimumOperation(1, 1)

        assertEquals(Int.MAX_VALUE, count)
    }

    @Test
    fun calculateMinimumOperation_2() {
        val count = solution.calculateMinimumOperation(2, 2, 0, mutableMapOf())

        assertEquals(1, count)
    }

    @Test
    fun calculateMinimumOperation_6() {
        val count = solution.calculateMinimumOperation(6, 6)

        assertEquals(2, count)
    }

    @Test
    fun calculateMinimumOperation_12() {
        val count = solution.calculateMinimumOperation(12, 12)

        assertEquals(4, count)
    }

    @Test
    fun calculateMinimumOperation_13() {
        val count = solution.calculateMinimumOperation(13, 13)

        assertEquals(5, count)
    }
}
