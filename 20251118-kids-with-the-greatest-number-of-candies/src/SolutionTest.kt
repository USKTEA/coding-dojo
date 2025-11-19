import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun kidsWithCandies() {
        val result = solution.kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)

        assertEquals(listOf(true, true, true, false, true), result)
    }

}
