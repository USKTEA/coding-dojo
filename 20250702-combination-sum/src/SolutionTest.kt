import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun combinationSum() {
        val result = solution.combinationSum(arrayListOf(2, 3), 2)

        assertEquals(
            arrayListOf(
                arrayListOf(2),
            ), result
        )
    }

    @Test
    fun combinationSum_2() {
        val result = solution.combinationSum(arrayListOf(2, 3, 6, 7), 7)

        assertEquals(
            arrayListOf(
                arrayListOf(2, 2, 3),
                arrayListOf(7),
            ), result
        )
    }
}
