import org.junit.jupiter.api.Assertions.assertEquals
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

        assertEquals(0, result)
    }

    @Test
    fun when_intArray_length_Is_2_And_kth_Is_2_2() {
        val nums = intArrayOf(2, 1)
        val kth = 2

        val result = solution.findKthLargest(nums, kth)

        assertEquals(1, result)
    }

    @Test
    fun complext1() {
        val nums = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6)
        val kth = 4

        val result = solution.findKthLargest(nums, kth)

        assertEquals(4, result)
    }
}
