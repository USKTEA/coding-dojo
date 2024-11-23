import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun pow() {
        val result = solution.pow(2, 3, 3)

        assertEquals(2, result)
    }

    @Test
    fun pow_big() {
        val result = solution.pow(71045970, 41535484, 64735492)

        assertEquals(20805472, result)
    }

    @Test
    fun nonNegativeMod() {
        val result = solution.nonNegativeMod(-10, 3)

        assertEquals(2, result)
    }
}
