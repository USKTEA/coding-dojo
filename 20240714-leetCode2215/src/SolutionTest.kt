import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findDifference() {
        val result = solution.findDifference(intArrayOf(1, 2, 3), intArrayOf(2, 4, 6))

        assertEquals(listOf(listOf(1, 3), listOf(4, 6)), result)
    }
}

