import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findMedianSortedArrays() {
        val result = solution.findMedianSortedArrays(
            listOf(1, 4, 5), listOf(2, 3)
        )

        assertEquals(3.0, result)
    }
}
