import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun combinationSum() {
        val numbers = arrayListOf(10, 1, 2, 7, 6, 1, 5)
        val goal = 8
        val expected = arrayListOf(
            arrayListOf(1, 7),
            arrayListOf(1, 2, 5),
            arrayListOf(2, 6),
            arrayListOf(1, 1, 6),
        )

        assertEquals(expected, solution.combinationSum(numbers, goal))
    }
}
