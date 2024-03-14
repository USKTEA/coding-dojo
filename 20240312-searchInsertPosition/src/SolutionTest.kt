import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenNumbersSizeIsOne() {
        assertEquals(0, solution.searchInsert(intArrayOf(1), 0))
        assertEquals(0, solution.searchInsert(intArrayOf(1), 1))
        assertEquals(1, solution.searchInsert(intArrayOf(1), 2))
    }

    @Test
    fun whenNumbersSizeIsNotOne() {
        assertEquals(2, solution.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(4, solution.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }
}
