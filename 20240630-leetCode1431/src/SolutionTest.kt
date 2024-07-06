import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun kidsWithCandies() {
        val result = solution.kidsWithCandies(intArrayOf(10, 1), 9)

        assertEquals(listOf(true, true), result)
    }

    @Test
    fun kidsWithCandies_2() {
        val result = solution.kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)

        assertEquals(listOf(true, true, true, false, true), result)
    }

    @Test
    fun kidsWithCandies_3() {
        val result = solution.kidsWithCandies(intArrayOf(4, 2, 1, 1, 2), 1)

        assertEquals(listOf(true, false, false, false, false), result)
    }
}
