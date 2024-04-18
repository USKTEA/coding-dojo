import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_intArray_length_Is_1() {
        val nums = intArrayOf(0)
        val kth = 1

        val result = solution.findKthLargest(nums, kth)

        assertEquals(0, result)
    }

    @Test
    fun when_intArray_length_Is_2_And_kth_Is_2() {
        val nums = intArrayOf(1, 0)
        val kth = 2

        val result = solution.findKthLargest(nums, kth)

        assertEquals(1, result)
    }

    @Test
    fun when_intArray_length_Is_2_And_kth_Is_2_2() {
        val nums = intArrayOf(2, 1)
        val kth = 2

        val result = solution.findKthLargest(nums, kth)

        assertEquals(1, result)
    }
}
