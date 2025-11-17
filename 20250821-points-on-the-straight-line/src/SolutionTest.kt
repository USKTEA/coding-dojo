import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxPoints() {
        val result = solution.maxPoints(arrayListOf(1, 2), arrayListOf(1, 2))

        assertEquals(2, result)
    }
}
