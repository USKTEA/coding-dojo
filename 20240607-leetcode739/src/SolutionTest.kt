import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.dailyTemperatures(intArrayOf(1, 2, 3))

        assertArrayEquals(intArrayOf(1, 1, 0), result)
    }

    @Test
    fun test_case_2() {
        val result = solution.dailyTemperatures(intArrayOf(30, 40, 50, 60))

        assertArrayEquals(intArrayOf(1, 1, 1, 0), result)
    }

    @Test
    fun test_case_3() {
        val result = solution.dailyTemperatures(intArrayOf(30, 60, 90))

        assertArrayEquals(intArrayOf(1, 1, 0), result)
    }


    @Test
    fun test_case_4() {
        val result = solution.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))

        assertArrayEquals(intArrayOf(1, 1, 4, 2, 1, 1, 0, 0), result)
    }

    @Test
    fun test_case_5() {
        val result = solution.dailyTemperatures(intArrayOf(2, 1, 1, 3))

        assertArrayEquals(intArrayOf(3, 2, 1, 0), result)
    }
}
