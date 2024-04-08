import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `1`() {
        assertEquals(listOf(listOf(1)), solution.generate(1))
    }

    @Test
    fun `2`() {
        assertEquals(listOf(listOf(1), listOf(1, 1)), solution.generate(2))
    }

    @Test
    fun `3`() {
        assertEquals(listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1)), solution.generate(3))
    }

    @Test
    fun toRowNumbers() {
        assertEquals(listOf(1), solution.toRowNumbers(1))
        assertEquals(listOf(1, 2), solution.toRowNumbers(2))
        assertEquals(listOf(1, 2, 3), solution.toRowNumbers(3))
    }
}
