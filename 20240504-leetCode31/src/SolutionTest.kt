import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun test_case_1() {
        val solution = Solution()
        val nums = intArrayOf(1, 2, 3)
        solution.nextPermutation(nums)

        assertArrayEquals(intArrayOf(1, 3, 2), nums)
    }

    @Test
    fun test_case_2() {
        val solution = Solution()
        val nums = intArrayOf(3, 2, 1)
        solution.nextPermutation(nums)

        assertArrayEquals(intArrayOf(1, 2, 3), nums)
    }

    @Test
    fun test_case_3() {
        val solution = Solution()
        val nums = intArrayOf(1, 1, 5)
        solution.nextPermutation(nums)

        assertArrayEquals(intArrayOf(1, 5, 1), nums)
    }

    @Test
    fun test_case_4() {
        val solution = Solution()
        val nums = intArrayOf(1, 3, 2)
        solution.nextPermutation(nums)

        println(nums.toList())
        assertArrayEquals(intArrayOf(2, 1, 3), nums)
    }
}
