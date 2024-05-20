import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)

        assertArrayEquals(intArrayOf(1, 2), result)
    }
}
