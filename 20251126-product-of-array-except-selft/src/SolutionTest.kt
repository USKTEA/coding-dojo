import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun productExceptSelf_1() {
        val result = solution.productExceptSelf(intArrayOf(1, 2, 3, 4))

        assertArrayEquals(intArrayOf(24, 12, 8 ,6), result)
    }

    @Test
    fun productExceptSelf_2() {
        val result = solution.productExceptSelf(intArrayOf(1, 2, 3, 4, 5))

        assertArrayEquals(intArrayOf(120, 60, 40, 30, 24), result)
    }

    @Test
    fun multiplyDesc() {
        val result = solution.multiplyDesc(intArrayOf(1, 2, 3, 4))

        assertArrayEquals(intArrayOf(24, 24, 12 ,4), result)
    }

    @Test
    fun multiplyAsc() {
        val result = solution.multiplyAsc(intArrayOf(1, 2, 3, 4))

        assertArrayEquals(intArrayOf(1, 2, 6, 24), result)
    }
}
