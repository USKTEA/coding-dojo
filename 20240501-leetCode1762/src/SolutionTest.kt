import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.findBuildings(intArrayOf(3, 2, 1))

        assertArrayEquals(intArrayOf(0, 1, 2), result)
    }

    @Test
    fun test_case_2() {
        val result = solution.findBuildings(intArrayOf(4, 2, 3, 1))

        assertArrayEquals(intArrayOf(0, 2, 3), result)
    }

    @Test
    fun test_case_3() {
        val result = solution.findBuildings(intArrayOf(2, 2, 2, 2))

        assertArrayEquals(intArrayOf(3), result)
    }
}
