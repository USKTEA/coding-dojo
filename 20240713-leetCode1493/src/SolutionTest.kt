import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun longestSubarray() {
        val result = solution.longestSubarray(intArrayOf(1, 1, 0, 1))

        assertEquals(3, result)
    }

    @Test
    fun longestSubarray_2() {
        val result = solution.longestSubarray(intArrayOf(1, 1, 1))

        assertEquals(2, result)
    }

    @Test
    fun longestSubarray_3() {
        val result = solution.longestSubarray(intArrayOf(1, 0, 1))

        assertEquals(2, result)
    }

    @Test
    fun longestSubarray_4() {
        val result = solution.longestSubarray(intArrayOf(1, 0, 0, 1))

        assertEquals(1, result)
    }

    @Test
    fun longestSubarray_5() {
        val result = solution.longestSubarray(intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1))

        assertEquals(5, result)
    }

    @Test
    fun longestSubarray_6() {
        val result = solution.longestSubarray(intArrayOf(0, 0, 0))

        assertEquals(0, result)
    }

    @Test
    fun longestSubarray_7() {
        val result = solution.longestSubarray(intArrayOf(1, 0, 0, 0, 0))

        assertEquals(1, result)
    }
}
