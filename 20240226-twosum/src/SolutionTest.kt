import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun example1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        val result = solution.twoSum(nums, target)

        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun example2() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6

        val result = solution.twoSum(nums, target)

        assertArrayEquals(intArrayOf(1, 2), result)
    }
}
