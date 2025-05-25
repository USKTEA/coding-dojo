import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testCombine() {
        val result = solution.combine(4, 2)

        assertEquals(
            arrayListOf(
                arrayListOf(1, 2),
                arrayListOf(1, 3),
                arrayListOf(1, 4),
                arrayListOf(2, 3),
                arrayListOf(2, 4),
                arrayListOf(3, 4),
            ), result
        )
    }
}
