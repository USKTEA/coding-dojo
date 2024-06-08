import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.largestNumber(listOf(3, 30, 34, 5, 9))

        assertEquals("9534330", result)
    }
}
