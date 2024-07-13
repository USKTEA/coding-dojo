import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun largestAltitude() {
        val result = solution.largestAltitude(intArrayOf(-5, 1, 5, 0, -7))

        assertEquals(1, result)
    }
}
