import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun slidingMaximum() {
        val result = solution.slidingMaximum(
            numbers = arrayListOf(1, 3, -1, -3, 5, 3, 6, 7),
            windowSize = 3
        )

        assertEquals(arrayListOf(3, 3, 5, 5, 6, 7), result)
    }
}
