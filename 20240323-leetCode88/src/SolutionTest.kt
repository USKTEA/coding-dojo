import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenNums1SizeIs1AndNums2SizeIsZero() {
        val nums2 = intArrayOf()
        val slots = IntArray(nums2.size) { 0 }
        val origin = intArrayOf(1)
        val nums1 = origin + slots

        solution.merge(nums1 + slots, nums1.size, nums2, nums2.size)

        assertArrayEquals(intArrayOf(1), nums1)
    }

    @Test
    fun whenNums1SizeIs0AndNums2SizeIsOne() {
        val origin = intArrayOf()
        val nums2 = intArrayOf(1)
        val slots = IntArray(nums2.size) { 0 }
        val nums1 = origin + slots

        solution.merge(nums1, origin.size, nums2, nums2.size)

        assertArrayEquals(intArrayOf(1), nums1)
    }

    @Test
    fun complexTest() {
        val origin = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(2, 5, 6)
        val slots = IntArray(nums2.size) { 0 }
        val nums1 = origin + slots

        solution.merge(nums1, origin.size, nums2, nums2.size)

        assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
    }
}
