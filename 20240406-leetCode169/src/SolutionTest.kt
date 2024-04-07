import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `intArray(1)`() {
        assertEquals(1, solution.majorityElement(intArrayOf(1)))
    }

    @Test
    fun `intArray(3, 2, 3)`() {
        assertEquals(3, solution.majorityElement(intArrayOf(3, 2, 3)))
    }

    @Test
    fun `intArray(2, 2, 1, 1, 1, 2, 2)`() {
        assertEquals(2, solution.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }
}
