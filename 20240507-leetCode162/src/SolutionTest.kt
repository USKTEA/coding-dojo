import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4))

        assertEquals(1, result)
    }
}
