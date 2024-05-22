import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.productExceptSelf(intArrayOf(1, 2, 3, 4))

        assertArrayEquals(intArrayOf(24, 12, 8, 6), result)
    }
}
