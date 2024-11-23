import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchRange() {
        val result = solution.searchRange(
            numbers = listOf(5, 7, 7, 8, 8, 10),
            toFind = 8
        )

        assertEquals(
            arrayListOf(3, 4), result
        )
    }

    @Test
    fun searchRange_2() {
        val result = solution.searchRange(
            numbers = listOf(5, 17, 100, 111),
            toFind = 3
        )

        assertEquals(
            arrayListOf(-1, -1), result
        )
    }
}
