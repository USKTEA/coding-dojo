import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun diffPossible() {
        val result = solution.diffPossible(arrayListOf(1, 3, 5), 4)

        assertEquals(1, result)
    }
}
