import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()


    @Test
    fun test_case_1() {
        val result = solution.maxFrequency(intArrayOf(1, 4, 8, 13), 5)
        assertEquals(2, result)
    }
}
