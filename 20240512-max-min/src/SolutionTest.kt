import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.solve(arrayListOf(1, 3, 4, 1))
        assertEquals(5, result)
    }

    @Test
    fun test_case2() {
        val  result = solution.solve(arrayListOf(-2, 1, -4, 5, 3))
        assertEquals(1, result)
    }

    @Test
    fun test_case3() {
        val  result = solution.solve(arrayListOf(68, 1))
        assertEquals(69, result)
    }
}
