import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun threeSumClosest() {
        val result = solution.threeSumClosest(arrayListOf(-1, 2, 1, -4), 1)

        assertEquals(2, result)
    }
}
