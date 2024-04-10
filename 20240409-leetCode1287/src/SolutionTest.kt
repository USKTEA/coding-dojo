import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `intArray(1)`() {
        assertEquals(1, solution.findSpecialInteger(intArrayOf(1)))
    }

    @Test
    fun `intArray(1, 1)`() {
        assertEquals(1, solution.findSpecialInteger(intArrayOf(1, 1)))
    }

    @Test
    fun `intArray(1, 2, 2, 6, 6, 6, 6, 7, 10)`() {
        assertEquals(6, solution.findSpecialInteger(intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)))
    }
}
