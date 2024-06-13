import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun rob_1() {
        val result = solution.rob(intArrayOf(1))

        assertEquals(1, result)
    }

    @Test
    fun rob_2() {
        val result = solution.rob(intArrayOf(1, 2, 3))

        assertEquals(4, result)
    }

    @Test
    fun rob_3() {
        val result = solution.rob(intArrayOf(1, 2, 3, 1))

        assertEquals(4, result)
    }

    @Test
    fun rob_4() {
        val result = solution.rob(intArrayOf(2, 7, 9, 3, 1))

        assertEquals(12, result)
    }

    @Test
    fun rob_5() {
        val result = solution.rob(intArrayOf(1, 3, 1))

        assertEquals(3, result)
    }
}
