import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.longestConsecutive(intArrayOf(1, 2, 3))

        assertEquals(3, result)
    }
}
