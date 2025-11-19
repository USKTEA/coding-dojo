import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun canPlaceFlowers() {
        val result1 = solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)
        val result2 = solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2)

        assertEquals(true, result1)
        assertEquals(false, result2)
    }

    @Test
    fun canPlaceFlowers_1() {
        val result = solution.canPlaceFlowers(intArrayOf(1, 0, 1, 0, 1, 0, 1), 1)

        assertEquals(false, result)
    }
}
