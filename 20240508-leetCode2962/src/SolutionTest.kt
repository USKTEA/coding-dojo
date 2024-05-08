import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.countSubarrays(intArrayOf(1, 3, 2, 3, 3), 2)
        assertEquals(6, result)
    }
}
