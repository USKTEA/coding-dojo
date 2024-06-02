
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.solve(arrayListOf(0, 0, 1))

        assertEquals(arrayListOf(1, 0, 0), result)
    }

    @Test
    fun test_case_2() {
        val result = solution.solve(arrayListOf(0, 1, 0, 3, 12))

        assertEquals(arrayListOf(1, 3, 12, 0, 0), result)
    }

    @Test
    fun test_case_3() {
        val result = solution.solve(arrayListOf(0, 1, 1))

        assertEquals(arrayListOf(1, 1, 0), result)
    }
}
