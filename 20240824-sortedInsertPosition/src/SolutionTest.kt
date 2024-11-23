import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchInsert() {
        val result = solution.searchInsert(
            arrayListOf(1, 3, 5, 6),
            5
        )

        assertEquals(2, result)
    }

    @Test
    fun searchInsert_2() {
        val result = solution.searchInsert(
            arrayListOf(1, 3, 5, 6),
            2
        )

        assertEquals(1, result)
    }
}
