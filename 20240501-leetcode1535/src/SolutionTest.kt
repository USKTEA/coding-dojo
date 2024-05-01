import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case1() {
        val result = solution.getWinner(intArrayOf(1, 2), 1)

        assertEquals(2, result)
    }

    @Test
    fun test_case2() {
        val result = solution.getWinner(intArrayOf(1, 2, 3), 2)

        assertEquals(3, result)
    }

    @Test
    fun test_case3() {
        val result = solution.getWinner(intArrayOf(2, 1, 3, 5, 4, 6, 7), 2)

        assertEquals(5, result)
    }

    @Test
    fun test_case4() {
        val result = solution.getWinner(intArrayOf(1, 11, 22, 33, 44, 55, 66, 77, 88, 99), 1000000000)

        assertEquals(99, result)
    }
}
