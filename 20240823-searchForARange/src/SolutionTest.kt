import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchRange() {
        val range = solution.searchRange(
            listOf(5, 7, 7, 8, 8, 10), 8
        )

        assertEquals(arrayListOf(3, 4), range)
    }

    @Test
    fun searchRange_2() {
        val range = solution.searchRange(
            listOf(5, 17, 100, 100), 3
        )

        assertEquals(arrayListOf(-1, -1), range)
    }
}
